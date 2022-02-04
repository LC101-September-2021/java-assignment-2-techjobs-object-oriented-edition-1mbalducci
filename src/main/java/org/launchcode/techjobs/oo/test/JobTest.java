package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    Job j1,j2;
    @Before
    public void createJobObjects(){
        j1 = new Job ("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        j2 = new Job ("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
//        System.out.println(j1.getId());
    }

    @Test
    public void testSettingJobId(){
        assertEquals(j1.getId()+1, j2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job aJob =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        assertTrue(aJob.getId() instanceof Integer);
        assertTrue(aJob.getName() instanceof String);
        assertTrue(aJob.getEmployer() instanceof Employer);
        assertTrue(aJob.getLocation() instanceof Location);
        assertTrue(aJob.getPositionType() instanceof PositionType);
        assertTrue(aJob.getCoreCompetency() instanceof CoreCompetency);

    }
    @Test
    public void testJobsForEquality(){
        Job bJob =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job cJob =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(!bJob.equals(cJob) );
    }
    @Test
    public void testToStringStartsAndEndsWithABlackLine(){
        Job job1 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(job1.toString());
        assertTrue(job1.toString().endsWith("\n"));
        assertTrue(job1.toString().startsWith("\n"));
    }
    @Test
    public void testToStringContainsAllFieldsAndData() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job1.toString(),"\n"+ "ID: "+ job1.getId() + "\n"+ "Name: "+ job1.getName()+ "\n"+ "Employer: "+ job1.getEmployer()+ "\n"+ "Location: "+ job1.getLocation()+ "\n"+ "Position: " + job1.getPositionType()+ "\n"+ "Core Competency: " + job1.getCoreCompetency()+"\n");
    }

//    @Test
//    public void ifAFieldIsEmptyThrowsAMessage(){
//        Job job1 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        assertEquals("Data not Available", job1.getEmployer());
//    }



    }
