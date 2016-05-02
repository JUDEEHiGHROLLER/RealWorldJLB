package edu.saintjoe.cs.brianc.realworld;

public class GamesDriver {

	public static void main(String[] args) {
		int gameCount = 0;
		
		Games nextGame = new Games("Far Cry Primal", "Xbox One");
		Collection myCollection = new Collection("My Collection","My dorm");
		myCollection.setGames(nextGame, (gameCount++));
		nextGame = new Games("Rainbow Six Siege", "Xbox One");
		myCollection.setGames(nextGame, gameCount++);
		nextGame = new Games("Age of Empires III", "PC");
		System.out.println(myCollection.toString());
		
		
		
	}
}
