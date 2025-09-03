import java.util.*;

public class SimpleGuessingGame {
	public static void main (String [] args) {
	
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int compGuess = random.nextInt(1, 7);
		int numOfGuesses = 0;
		boolean answer = false;

		while (answer == false) {

		System.out.print("Enter your guess: ");
		int guess = scanner.nextInt();
		numOfGuesses += 1;

		if(compGuess == guess){
			System.out.println("Correct!");
			System.out.println("Computer number = " + compGuess + ", Your guess = " + guess);
			answer = true;
		} else {
			System.out.println("Wrong\nTry Again!");
			System.out.println("Computer number = " + compGuess + ", Your guess = " + guess);
			answer = false;
		}
		}
			
		System.out.println("Your total number of guesses = " + numOfGuesses);
		scanner.close();
	}
}

