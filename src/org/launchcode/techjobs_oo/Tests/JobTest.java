package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;

import org.launchcode.techjobs_oo.*;

import static java.lang.Character.isWhitespace;
import static org.junit.Assert.*;

public class JobTest {

    Job test_job_one;
    Job test_job_two;

    @Before
    public void createJobObject() {

        test_job_one = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job_two = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }


    @Test
    public void testSettingJob() {
        assertEquals(test_job_two.getId() - test_job_one.getId(), 1, 0);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(test_job_one.getName() != "");
        assertTrue(test_job_one.getId() != 0);
        assertTrue(test_job_one.getEmployer() instanceof Employer);
        assertTrue(test_job_one.getLocation() instanceof Location);
        assertTrue(test_job_one.getPositionType() instanceof PositionType);
        assertTrue(test_job_one.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_job_one == test_job_two);

    }

    @Test
    public void returnsString() {
        int stringLength = test_job_one.toString().length();
        assertTrue(isWhitespace(test_job_one.toString().charAt(0)));
        assertTrue(isWhitespace(test_job_one.toString().charAt(stringLength-1)));
    }

}

