package com.sfeir.baseball;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Team {

	private String name;
	private String cityLocation;
	private String stadiumName;
	private Boolean isMajorLeagueTeam;
	private HashSet<Player> players;

	public Team(String name, String cityLocation, String stadiumName, Boolean isMajorLeagueTeam) {
		this.name = name;
		this.cityLocation = cityLocation;
		this.stadiumName = stadiumName;
		this.isMajorLeagueTeam = isMajorLeagueTeam;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCityLocation() {
		return cityLocation;
	}

	public void setCityLocation(String cityLocation) {
		this.cityLocation = cityLocation;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public Boolean getIsMajorLeagueTeam() {
		return isMajorLeagueTeam;
	}

	public void setIsMajorLeagueTeam(Boolean isMajorLeagueTeam) {
		this.isMajorLeagueTeam = isMajorLeagueTeam;
	}

	public void addAPlayerToATeam(Player playerToAdd) {
		if (players == null){
			players = new HashSet<>();
		}
		players.add(playerToAdd);
		// set team
		playerToAdd.setCurrentTeam(this);
	}

	@Override
	public String toString() {
		return "Team [name=" + getName() + ", cityLocation=" + getCityLocation() + ", statiumName=" + getStadiumName()
				+ ", isMajorLeagueTeam=" + getIsMajorLeagueTeam() + ", players=" + getPlayers().size() + " \n]";
	}
	
	public HashSet getPitchers(){
		return getPlayersByPositions("pitcher");

	}
	
	public HashSet getCatchers(){
		return getPlayersByPositions("catcher");

	}

	private HashSet getPlayersByPositions(String position) {
		return (HashSet) this.players.stream().filter(player -> player.getPosition().toLowerCase().equals(position)).collect(Collectors.toSet());
	}


	public HashSet getInfields(){
		return (HashSet) getPlayersByPositions("infields");
	}
	
	public HashSet getOutfields(){
		return (HashSet) getPlayersByPositions("outfields");
	}

	public HashSet getDesignatedHitters(){
		return (HashSet) getPlayersByPositions("designated hitter");

	}

	public Boolean getMajorLeagueTeam() {
		return isMajorLeagueTeam;
	}

	public void setMajorLeagueTeam(Boolean majorLeagueTeam) {
		isMajorLeagueTeam = majorLeagueTeam;
	}

	public HashSet<Player> getPlayers() {
		return players;
	}

	public void setPlayers(HashSet<Player> players) {
		this.players = players;
	}

}
