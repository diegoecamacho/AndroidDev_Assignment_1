public class MainApp {
	
	static Dictionary dictionary = new Dictionary();
	static ScanText scanner = new ScanText();
	
	static boolean Continue = true;
	static boolean GameOver = false;
	
	static ScoreClass playerScore = new ScoreClass();

	
	public static void  PrintRules() {
		System.out.println("-----------------");
		System.out.println("Match the word to its definition to earn points!\n"
				+ "But watch out! Get the word wrong and your points are deducted.");
		
		System.out.println("-----------------");
		System.out.println("High Score: " + playerScore.GetHighScore());
		System.out.println("-----------------\n");
	}

	public static void main(String[] args) {
		
		
		while(Continue) {
			System.out.println("Would you like to play Random Word?(Y/N)");
			String In = scanner.GetLine();
			if(In.toLowerCase() .equals("yes") || In.toLowerCase().equals("y")) {
				GameOver = false;
				PrintRules();
				PlayGame();
			}
			else if(In.toLowerCase().equals("no") || In.toLowerCase().equals("n")) {
				Continue = false;
				return;
			}
		}
		
		scanner.CloseScanner();
		
	}
	
	static void  PlayGame() {
		while(!GameOver) {
			try {
				System.out.println("Word Definition: ");
				dictionary.GetRandomDefinition();
				String Word = dictionary.GetWord().toLowerCase();
				
				System.out.println("Guess: ");
				String stringInput = scanner.GetLine().toLowerCase();	
				
				if(Word.equals(stringInput)) {
					System.out.println("Correct!");
					playerScore.IncreaseScore();
					System.out.println("the Current Score is: " + playerScore.GetScore());
					CheckGameOver();
				}
				else {
					System.out.println("Wrong Word!");
					CheckGameOver();
				}
			}
			
			catch(Exception e) {
				System.out.println("FAILED");
			}
			
		}
		
	}
		
		
	
	static void CheckGameOver() {
		
		boolean isInputValid = false;
		while(!isInputValid) {
			System.out.println("Would you like to play again?(Y/N)");
			String stringInput = scanner.GetLine();
			if(stringInput.toLowerCase() .equals("yes") || stringInput.toLowerCase().equals("y")) {
				System.out.println("Yes");
				GameOver = false;
				isInputValid = true;
			}
			else {
				if(stringInput.toLowerCase().equals("no") || stringInput.toLowerCase().equals("n")) {
					System.out.println("No");
					playerScore.EndGame();
					GameOver = true;
					isInputValid = true;
				}
				else 
				{
					System.out.println("Please Enter Valid Input! \n");
			
				}
			}
		}
	}
}
