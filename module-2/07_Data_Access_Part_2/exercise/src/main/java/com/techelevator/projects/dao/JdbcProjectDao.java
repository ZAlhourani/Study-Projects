package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.exception.DaoException;
import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final String PROJECT_SELECT = "SELECT p.project_id, p.name, p.from_date, p.to_date FROM project p";

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProjectById(int projectId) {
		Project project = null;
		String sql = PROJECT_SELECT +
				" WHERE p.project_id=?";

		try {
			SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
			if (results.next()) {
				project = mapRowToProject(results);
			}
		}catch(CannotGetJdbcConnectionException e){
			throw new DaoException("Unable to connect to server or database", e);
		}

		return project;
	}

	@Override
	public List<Project> getProjects() {
		List<Project> allProjects = new ArrayList<>();
		String sql = PROJECT_SELECT;

		try {
			SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
			while (results.next()) {
				Project projectResult = mapRowToProject(results);
				allProjects.add(projectResult);
			}
		}catch(CannotGetJdbcConnectionException e){
			throw new DaoException("Unable to connect to server or database", e);
		}

		return allProjects;
	}

	@Override
	public Project createProject(Project newProject) {

		Project project;

		String sql = "insert into project (name, from_date, to_date) " +
				"values(?,?,?) returning project_id;";

		try {
			int projectId = jdbcTemplate.queryForObject(sql, int.class,
					newProject.getName(),
					newProject.getFromDate(),
					newProject.getToDate());

			project = getProjectById(projectId);

		} catch (CannotGetJdbcConnectionException e) {
			throw new DaoException("Unable to connect to server or database", e);
		} catch (DataIntegrityViolationException e) {
			throw new DaoException("Data integrity violation", e);
		}
		return project;
	}
	
	@Override
	public void linkProjectEmployee(int projectId, int employeeId) {

		String sql = "insert into project_employee (project_id, employee_id) values (?,?);";

		try {

			jdbcTemplate.update(sql, projectId, employeeId);

		}catch (CannotGetJdbcConnectionException e) {
			throw new DaoException("Unable to connect to server or database", e);
		} catch (DataIntegrityViolationException e) {
			throw new DaoException("Data integrity violation", e);
		}

	}

	@Override
	public void unlinkProjectEmployee(int projectId, int employeeId) {

		String sql = "delete from project_employee where project_id = ? and employee_id = ?;";

		try {

			jdbcTemplate.update(sql, projectId, employeeId);

		}catch (CannotGetJdbcConnectionException e) {
			throw new DaoException("Unable to connect to server or database", e);
		} catch (DataIntegrityViolationException e) {
			throw new DaoException("Data integrity violation", e);
		}

	}

	@Override
	public Project updateProject(Project project) {

		String sql = "update project " +
				"set name = ?, " +
				"from_date = ?, " +
				"to_date = ? " +
				"where project_id = ?;";

		try {
			int numberOfRowsAffected = jdbcTemplate.update(sql, project.getName(),
					project.getFromDate(),
					project.getToDate(),
					project.getId());

			if (numberOfRowsAffected == 0) {
				throw new DaoException("Zero rows affected, expected at least one");
			}
			int departmentId = project.getId();

			return getProjectById(departmentId);

		}catch (CannotGetJdbcConnectionException e) {
			throw new DaoException("Unable to connect to server or database", e);
		} catch (DataIntegrityViolationException e) {
			throw new DaoException("Data integrity violation", e);
		}

	}
	@Override
	public int deleteProjectById(int projectId) {

		String projectEmployeeSql = "delete from project_employee where project_id = ?;";

		String projectSql = "delete from project where project_id = ?;";

		try {
			jdbcTemplate.update(projectEmployeeSql, projectId);
			return jdbcTemplate.update(projectSql, projectId);

		} catch (CannotGetJdbcConnectionException e) {
			throw new DaoException("Unable to connect to server or database", e);
		} catch (DataIntegrityViolationException e) {
			throw new DaoException("Data integrity violation", e);
		}

	}
	
	private Project mapRowToProject(SqlRowSet results) {
		Project project = new Project();
		project.setId(results.getInt("project_id"));
		project.setName(results.getString("name"));
		if (results.getDate("from_date") != null) {
			project.setFromDate(results.getDate("from_date").toLocalDate());
		}
		if (results.getDate("to_date") != null) {
			project.setToDate(results.getDate("to_date").toLocalDate());
		}
		return project;
	}

}
