package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.exception.DaoException;
import com.techelevator.projects.model.Department;

public class JdbcDepartmentDao implements DepartmentDao {

	private final String DEPARTMENT_SELECT = "SELECT d.department_id, d.name FROM department d ";
	
	private final JdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartmentById(int id) {
		Department department = null;
		String sql = DEPARTMENT_SELECT +
				" WHERE d.department_id=?";

		try {
			SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
			if (results.next()) {
				department = mapRowToDepartment(results);
			}
		}catch(CannotGetJdbcConnectionException e){
			throw new DaoException("Unable to connect to server or database", e);
		}
		return department;
	}

	@Override
	public List<Department> getDepartments() {
		List<Department> departments = new ArrayList<>();
		String sql = DEPARTMENT_SELECT;

		try {
			SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
			while (results.next()) {
				departments.add(mapRowToDepartment(results));
			}
		}catch(CannotGetJdbcConnectionException e){
			throw new DaoException("Unable to connect to server or database", e);
		}
		return departments;
	}

	@Override
	public Department createDepartment(Department department) {
		Department newDepartment;

		String sql = "insert into department (name) values (?) returning department_id;";
		try {
			int departmentId = jdbcTemplate.queryForObject(sql, int.class, department.getName());

			newDepartment = getDepartmentById(departmentId);

		}catch (CannotGetJdbcConnectionException e) {
			throw new DaoException("Unable to connect to server or database", e);
		} catch (DataIntegrityViolationException e) {
			throw new DaoException("Data integrity violation", e);
		}

		return newDepartment;
	}

	@Override
	public Department updateDepartment(Department department) {

		String sql = "update department set name = ? where department_id = ?";

		try {
			int numberOfRowsAffected = jdbcTemplate.update(sql, department.getName(), department.getId());

			if (numberOfRowsAffected == 0) {
				throw new DaoException("Zero rows affected, expected at least one");
			}
			int departmentId = department.getId();

			return getDepartmentById(departmentId);

		}catch (CannotGetJdbcConnectionException e) {
			throw new DaoException("Unable to connect to server or database", e);
		} catch (DataIntegrityViolationException e) {
			throw new DaoException("Data integrity violation", e);
		}

	}

	@Override
	public int deleteDepartmentById(int id) {

		String employeeDepartmentSql = "update employee " +
				"set department_id = (select department_id from department where name = 'Unassigned') " +
				"where department_id = ?;";

		String departmentSql = "delete from department where department_id = ?;";

		try {
			jdbcTemplate.update(employeeDepartmentSql, id);
			return jdbcTemplate.update(departmentSql, id);

		} catch (CannotGetJdbcConnectionException e) {
			throw new DaoException("Unable to connect to server or database", e);
		} catch (DataIntegrityViolationException e) {
			throw new DaoException("Data integrity violation", e);
		}
	}

	private Department mapRowToDepartment(SqlRowSet results) {
		Department department = new Department();
		department.setId(results.getInt("department_id"));
		department.setName(results.getString("name"));
		return department;
	}

}
