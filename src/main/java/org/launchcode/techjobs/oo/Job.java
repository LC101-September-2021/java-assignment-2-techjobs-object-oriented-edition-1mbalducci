package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id=nextId;
        nextId++;}

    public Job(String name,Employer employer,Location location,PositionType positionType,CoreCompetancy coreCompetancy){
        this();
        this.name= name;
        this.employer=employer;
        this.location=location;
        this.positionType=positionType;
        this.coreCompetency=coreCompetancy;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
@   @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Job job = (Job) object;
        return id == job.id && java.util.Objects.equals(name, job.name) && java.util.Objects.equals(employer, job.employer) && java.util.Objects.equals(location, job.location) && java.util.Objects.equals(positionType, job.positionType) && java.util.Objects.equals(coreCompetency, job.coreCompetency);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, name, employer, location, positionType, coreCompetency);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
