package edu.saintjoe.cs.brianc.realworld;

public class Collection {

	public static final int MAXGAMES = 25;
	
	private String title;
	private String type;
	private Games[] games;
	
	
	public Collection (String newTitle, String newType) {
		games = new Games[MAXGAMES];
		title = newTitle;
		type = newType;
		
		}
	
public String toString() {
		
		String output = "";
	
		for (Games oneGames: games) {
			if (oneGames == null)
				break;
			output += oneGames.getName() + " " + oneGames.getConsole() + " ";
			}
		return output;
}

public void setGames(Games nextGames, int location) {

	
}
}
