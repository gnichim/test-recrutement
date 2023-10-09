package com.sfeir.baseball;

import java.util.Objects;

public class Player {

    private String firstName;
    private String name;
    private Team currentTeam;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getCurrentTeam() {
        return currentTeam;
    }

    public void setCurrentTeam(Team currentTeam) {
        this.currentTeam = currentTeam;
    }

    @Override
    public String toString() {
        return "\nPlayer [name=" + getName() + ", firstName=" + firstName + ", currentTeam="
                + getCurrentTeam() + ", position=" + position + "]";
    }

    String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(firstName, player.firstName) && Objects.equals(name, player.name) && Objects.equals(currentTeam, player.currentTeam) && Objects.equals(position, player.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, name, currentTeam, position);
    }
}
