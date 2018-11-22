public class Screen {

	// Essa classe é responsável pela tela de jogo

	// Hangman
	private int amountOfChars;
	private char[] showedSpaces;

	// Sporcle
	private int amountOfWords;
	private String[] showedWords;

	public Screen() {
	}

//Hangman
	public void wordMap(char[] wordToGuess) {

		// Verifica o numero de caracteres da palavra e imprime "_" na tela
		amountOfChars = wordToGuess.length;
		showedSpaces = new char[amountOfChars];
		for (int i = 0; i < showedSpaces.length; i++) {
			showedSpaces[i] = '_';
		}

	}

//Sporcle
	public void listMap(String[] list) {
		amountOfWords = list.length;
		showedWords = new String[amountOfWords];
		for (int i = 0; i < showedWords.length; i++) {
			showedWords[i] = "_____";
		}

	}

	public char[] getShowedSpaces() {
		return showedSpaces;
	}

	public String[] getShowedWords() {
		return showedWords;
	}

	// Este método lê um array de caracteres e imprime
	public void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
	}

	// Este método lê um array de String e imprime
	public void printArray(String[] array, int level) {
		for (int i = 0; i <= 9; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();

		if (level == 1) {
			for (int i = 10; i <= 19; i++) {
				System.out.print(array[i] + ", ");
			}
			System.out.println();

			for (int i = 20; i <= 29; i++) {
				System.out.print(array[i] + ", ");
			}
			System.out.println();

			for (int i = 30; i <= 39; i++) {
				System.out.print(array[i] + ", ");
			}
			System.out.println();

			for (int i = 40; i <= 49; i++) {
				System.out.print(array[i] + ", ");
			}
			System.out.println();
		}
	}

	// Método criado para limpar a tela após cada rodada
	public void clearScreen() {
		for (int i = 0; i < 100; ++i)
			System.out.println();
	}

	// Método para imprimir o desenho da forca
	public void gibbet(int lostGuess, int level) {
		if (level == 2) {
			lostGuess += 1;
		}
		switch (lostGuess) {
		case 0:
			System.out.println("Nivel " + level);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
			break;

		case 1:
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
			break;

		case 2:
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
			break;

		case 3:
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
			break;

		case 4:
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
			break;

		case 5:
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			break;

		case 6:
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			break;
		}

	}

}
