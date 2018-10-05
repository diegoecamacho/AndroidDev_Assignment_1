
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
