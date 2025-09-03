import java.io.*;

public class SimplDotCom {

	private int numOfHits;
	private int numOfGuesses;
	private int [] locationCells;

	public void setLocationCells (int [] loc) {
		locationCells = loc;
	}

	public String CheckGuess (String myGuess) {

		int guess = Integer.parseInt(myGuess);
		String result = "miss";
		numOfGuesses++;

		for (int cell:locationCells){
			if (cell == guess){
				numOfHits++;
				if (numOfHits == locationCells.length) {
					result = "kill";
				} else {
					result = "hit";
				}
			}			
		}

		System.out.println(result);
		return result;
	}
			

	public static void main (String [] args) {
		
		GameHelper start = new GameHelper();
		SimplDotCom game = new SimplDotCom();

		int [] cells = {0, 1, 2, 3, 4, 5, 6};
		int loc = (int) (Math.random() * cells.length);
		int [] locationCells = {loc, loc + 1, loc + 2};

		game.setLocationCells(locationCells);

		String guess = start.getUserInput("Enter a number: ");
		String result = game.CheckGuess(guess);

	}
}

	class GameHelper {
		public String getUserInput(String prompt) {
			
			String inputLine = null;
			System.out.print(prompt + " ");
			
			try {
				BufferedReader is = new BufferedReader(
				new InputStreamReader(System.in));
				inputLine = is.readLine();

				if (inputLine.length() == 0 ) return null;
			} catch (IOException e) {
				System.out.println("IOException: " + e);
			}

			return inputLine;
		}
}
