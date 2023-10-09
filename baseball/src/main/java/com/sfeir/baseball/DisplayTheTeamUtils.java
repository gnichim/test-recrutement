package com.sfeir.baseball;

import java.time.LocalDate;
import java.util.Date;

public class DisplayTheTeamUtils {

	/**
	 * Display my favorite team!
	 * 
	 * @param teamToDisplay
	 */
	public static void displayTheTeam(final Team teamToDisplay) {
		System.out.println("\t\t ===== " + teamToDisplay.getName().toUpperCase() + " =====");
		System.out.println(" ");
		System.out
				.println("I have " + teamToDisplay.getPlayers().size() + " players in my team " + teamToDisplay.getName().toUpperCase());

		System.out.println(" ");
		System.out.println(" == Pitchers == ");
		System.out.println("" + teamToDisplay.getPitchers());

		System.out.println(" ");
		System.out.println(" == Catchers == ");
		System.out.println(teamToDisplay.getCatchers());

		System.out.println(" ");
		System.out.println(" == Infields == ");
		System.out.println(teamToDisplay.getInfields());

		System.out.println(" ");
		System.out.println(" == Outfields == ");
		System.out.println(teamToDisplay.getOutfields());

		System.out.println(" ");
		System.out.println(" == Designated Hitters == ");
		System.out.println(teamToDisplay.getDesignatedHitters());

		System.out.println(" ");
		System.out.println("The hole team is composed of : " + teamToDisplay);

		System.out.println(" ");
		System.out.println(" ===== We will win the season : " + extractYear() + " ===== ");
	}

	/**
	 * Extract the year.
	 * 
	 * @return
	 */
	private static Integer extractYear() {
		return LocalDate.now().getYear();
	}
}
