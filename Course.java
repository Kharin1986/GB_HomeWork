package ru.geekbrains.classes;

import ru.geekbrains.classes.obstacles.Obstacle;


public class Course {
    private String name;
    private Team team;
    private Obstacle[] obstacles;


    public Course(String name, Team team,Obstacle[] obstacles) {
        this.name = name;
        this.team = team;
        this.obstacles=obstacles;
    }

    public void doIt(Team team){
        for (Participant participant:team.getParticipants()) {
            for (Obstacle obstacle : obstacles) {
                obstacle.doIt(participant);
                if (!participant.isOnDistance()) {
                    break;
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public Team getTeam() {
        return team;
    }

    public Obstacle[] getObstacles() {
        return obstacles;
    }
}


