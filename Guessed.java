public class Guessed {

	//Método que verifica se todas as letras foram descobertas no Hangman
	public boolean verifyGuessed(char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '_')
				return false;
		}
		return true;
	}

	//Método que verifica se todas as palavras foram descobertas no Sporcle
	public boolean verifyGuessed(String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == "_____")
				return false;
		}
		return true;
	}

}
