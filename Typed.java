import java.util.ArrayList;

public class Typed {

	Messages messages = new Messages();

	/*
	 * Vou criar uma lista de caracteres digitados porque percebi que se eu digitar
	 * uma letra que já digitei e está certa o programa decrementa a variável
	 * "tries".
	 */

	private ArrayList<Character> typedLetters = new ArrayList<Character>();//hangman

	private ArrayList<String> typedWords = new ArrayList<String>();//Sporcle

	//Hangman
	public boolean verifyTypedLetters(char guess) {

		// Desconsiderar letras já digitadas anteriormente
		if (typedLetters.contains(guess)) {
			return true;
		} else {
			typedLetters.add(guess);
			return false;
		}


	}
	//Sporcle
	public boolean verifyTypedWords(String guess) {
		//Desconsiderar se a palavra já tiver sido digitada
		if (typedWords.contains(guess)) {
			return true;
		} else {
			typedWords.add(guess);
			return false;
		}
	}

	public ArrayList<Character> getTypedLetters(){
		return typedLetters;
	}

	public void setTypedLetters(ArrayList<Character> typedLetters) {
		this.typedLetters = typedLetters;
	}

	public ArrayList<String> getTypedWords() {
		return typedWords;
	}

	public void setTypedWords(ArrayList<String> typedWords) {
		this.typedWords = typedWords;
	}

}
