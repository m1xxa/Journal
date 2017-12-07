package com.intita.a17.efremov;

public class Student {
    private String firstName;
    private String secondName;
    private Team team;

    Student(String firstName, String secondName, Team team){
        this.firstName = firstName;
        this.secondName = secondName;
        this.team = team;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
