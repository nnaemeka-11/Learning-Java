class SimpleDotCom {
	private int [] locationCells;
	private int numOfHits;

	public String checkYourself (String userGuess) {

		int guess = Integer.parseInt(userGuess);
		String result = "miss";

		for (int cell : locationCells){
			if (cell == guess) {
				result = "hit";
			//	cell = 7;
				numOfHits++;
				break;
			}
		}
		
		if (numOfHits == locationCells.length) {
				result = "kill";
			}
		System.out.println(result);
		return result;
	}

	public void setLocationCells (int [] loc) {
		locationCells = loc;
	}
}

public class SimpleDotComGame {
	public static void main (String [] args) {

		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();

		SimpleDotCom dot = new SimpleDotCom();
		int randNum = (int) (Math.random() * 5);

		int [] loc = {randNum, randNum + 1, randNum + 2};
		dot.setLocationCells(loc);

		boolean isAlive = true;

		while (isAlive == true) {
			String guess = helper.getUserInput("enter a number:");

			//System.out.print("Progress");
			String result = dot.checkYourself(guess);

			numOfGuesses++;

			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}
}
