package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");

    private JdbcTimesheetDao dao;


    @Before
    public void setup() {
        dao = new JdbcTimesheetDao(dataSource);
    }

    @Test
    public void getTimesheetById_with_valid_id_returns_correct_timesheet() {

        Timesheet timesheet1 = dao.getTimesheetById(1);

        assertTimesheetsMatch(TIMESHEET_1, timesheet1);

        Timesheet timesheet2 = dao.getTimesheetById(2);
        assertTimesheetsMatch(TIMESHEET_2, timesheet2);

    }

    @Test
    public void getTimesheetById_with_invalid_id_returns_null_timesheet() {

        Timesheet timesheet1 = dao.getTimesheetById(99);

        Assert.assertNull(timesheet1);


    }

    @Test
    public void getTimesheetsByEmployeeId_with_valid_employee_id_returns_list_of_timesheets_for_employee() {

        List<Timesheet> timesheetsList1 = dao.getTimesheetsByEmployeeId(1);

        Assert.assertEquals(2, timesheetsList1.size());
        assertTimesheetsMatch(TIMESHEET_1, timesheetsList1.get(0));
        assertTimesheetsMatch(TIMESHEET_2, timesheetsList1.get(1));

        timesheetsList1 = dao.getTimesheetsByEmployeeId(2);
        Assert.assertEquals(2, timesheetsList1.size());
        assertTimesheetsMatch(TIMESHEET_3, timesheetsList1.get(0));
        assertTimesheetsMatch(TIMESHEET_4, timesheetsList1.get(1));

    }

    @Test
    public void getTimesheetsByProjectId_with_valid_id_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> timesheets = dao.getTimesheetsByProjectId(1);

        Assert.assertEquals(3,timesheets.size());
        assertTimesheetsMatch(TIMESHEET_1,timesheets.get(0));
        assertTimesheetsMatch(TIMESHEET_2,timesheets.get(1));
        assertTimesheetsMatch(TIMESHEET_3, timesheets.get(2));

        timesheets = dao.getTimesheetsByProjectId(2);
        assertTimesheetsMatch(TIMESHEET_4, timesheets.get(0));
    }


    @Test
    public void createTimesheet_creates_timesheet() {
        Timesheet createdTimesheet = new Timesheet(1,1,1,LocalDate.of(2021,01,01),1.0,true,"Timesheet 1");
        Assert.assertNotNull(createdTimesheet);

        int newId = createdTimesheet.getTimesheetId();
        Assert.assertTrue(newId > 0);

        Timesheet retrievedCity = dao.getTimesheetById(newId);
        assertTimesheetsMatch(createdTimesheet, retrievedCity);

    }

    @Test
    public void updateTimesheet_updates_timesheet() {

        Timesheet timesheetToUpdate = dao.getTimesheetById(1);

        timesheetToUpdate.setProjectId(timesheetToUpdate.getTimesheetId() + 1);
        timesheetToUpdate.setEmployeeId(timesheetToUpdate.getEmployeeId() + 1);
        timesheetToUpdate.setDateWorked(timesheetToUpdate.getDateWorked().plusYears(11));
        timesheetToUpdate.setHoursWorked(timesheetToUpdate.getHoursWorked() + 1.5);
        timesheetToUpdate.setBillable(!timesheetToUpdate.isBillable());
        timesheetToUpdate.setDescription(timesheetToUpdate.getDescription() + "T");

        Timesheet updatedTimesheet = dao.updateTimesheet(timesheetToUpdate);
        Assert.assertNotNull(updatedTimesheet);

        assertTimesheetsMatch(timesheetToUpdate, updatedTimesheet);
        Timesheet retrievedTimesheet = dao.getTimesheetById(1);
        assertTimesheetsMatch(updatedTimesheet,retrievedTimesheet);
    }

    @Test
    public void deleteTimesheetById_deletes_timesheet() {
        int rowAffected = dao.deleteTimesheetById(1);
        Assert.assertEquals(1, rowAffected);

        Timesheet timesheet = dao.getTimesheetById(1);
        Assert.assertNull(timesheet);

    }

    @Test
    public void getBillableHours_returns_correct_total() {

        double billableHours = dao.getBillableHours(1, 1);
        Assert.assertEquals(2.5, billableHours,0.00);

        billableHours = dao.getBillableHours(2,2);
        Assert.assertEquals(0.0,billableHours, 0.00);

    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
