package com.intita.a17.efremov;

public class Team {
    private int idTeam;
    private String teamName;

    Team(int idTeam, String teamName){
        this.idTeam = idTeam;
        this.teamName = teamName;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }


    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
