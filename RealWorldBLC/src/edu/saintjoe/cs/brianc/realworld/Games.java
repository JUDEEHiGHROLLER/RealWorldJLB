package edu.saintjoe.cs.brianc.realworld;

public class Games {
		private String name;
		private String console;
		
		public Games(String newName, String newConsole) {
			name = newName;
			console = newConsole;
			}
			
			public void setName(String newName) {
				name = newName;
			}
			public String getName() {
				return name;
			}
			
			public void setConsole(String newConsole) {
				console = newConsole;
			}
			public String getConsole() {
				return console;
			
			}
			public String toString() {
				return ("Game: " + name + " Console: " + console );
			}
}
