/**
 * <p>Score Class
 * Keeps track of Current and High Score in Game
 * </p>
 * @author Diego Camacho 
 */
public class ScoreClass {
	
	int Score;
	int highScore;
	
	ScoreClass(){
		Score = 0;
		highScore = 0;
	}
	
	public void IncreaseScore() {
		Score++;
	}
	
	public int GetScore() {
		return Score;
	}
	
	public int GetHighScore() {
		return highScore;
	}
	
	public void EndGame() {
		if(Score > highScore) {
			highScore = Score;
			Score = 0;
		}
		
	}

}
