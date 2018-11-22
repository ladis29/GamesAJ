public class Leveler {

	//Classe responsável por selecionar o nível do jogo

	Level1 level1 = new Level1();
	Level2 level2 = new Level2();

	private String[] levelWords;
	private int levelMaxGuesses;
	private boolean finished;

	public void leveler(int level) {

		if (level == 1) {
			levelMaxGuesses = level1.getMaxGuesses();
			levelWords = level1.getWords();
		} else if (level == 2) {
			levelMaxGuesses = level2.getMaxGuesses();
			levelWords = level2.getWords();
		} else {
			finished = true;
		}

	}

	public String[] getLevelWords() {
		return levelWords;
	}

	public int getLevelMaxGuesses() {
		return levelMaxGuesses;
	}

	public boolean getFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

}
