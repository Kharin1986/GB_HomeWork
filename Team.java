package ru.geekbrains.classes;



public class Team {
    private String name;
    private Participant[] participants;

    public Team(String name,Participant[] participants) {
        this.name = name;
        this.participants=participants;
    }

    public Participant[] getParticipants() {
        return participants;
    }

    public String getName() {
        return name;
    }

    public void showResults(){
        System.out.println("Итоги команды "+ name);
        for (Participant participant : participants) {
            System.out.println(participant);
        }
    }
    public void showWinnerResults(){
        System.out.println("Победители:");
        for (Participant participant : participants) {
            if (participant.isOnDistance()) {
                System.out.println(participant);
            }
        }
    }
}
