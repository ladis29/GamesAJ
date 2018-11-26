import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	Guessed guessed = new Guessed();
	Leveler leveler = new Leveler();
	Screen screen = new Screen();
	Typed typed = new Typed();
	Player player = new Player();
	Messages messages = new Messages();

	Scanner sc = new Scanner(System.in);

	private boolean wordWasDiscovered;
	private char guess;
	private int level = 1;
	private int lostGuess;
	private int played;
	private char[] wordToGuess;
	private int firstloop;// Essa variável foi criada porque quando uma palavra tinha letras repetidas o
							// jogo decrementava a variável "lostGuess" 2x gerando vida extra

	public Hangman(String name, char gender) {

		Messages namedMessages = new Messages(name);

		// Enquanto o status do jogo não for "Finished"
		while (!leveler.getFinished()) {
			// As variáveis a seguir serão setadas com os valores necessários para o início
			// de cada rodada
			wordWasDiscovered = false;
			lostGuess = 0;
			played = 1;
			typed.setTypedLetters(new ArrayList<Character>());
			leveler.leveler(level);

			// Cria uma variável randômica que será usada para armazenar a palavra escolhida
			Random choosedWord = new Random();
			// Escolher uma palavra aleatoriamente e transformar em um array de caracteres
			wordToGuess = leveler.getLevelWords()[choosedWord.nextInt(leveler.getLevelWords().length)].toCharArray();

			screen.wordMap(wordToGuess);

			// Após preparar as variáveis para o início da rodada vamos começar a rodada
			while (!wordWasDiscovered && lostGuess != leveler.getLevelMaxGuesses()) {
				/*
				 * A variável wordWasDiscovered está como condição para esse laço pq se a
				 * palavra do level 1 for descoberta ele sai do loop para entrar no level 2 ou
				 * finalizar o Jogo enquanto o lostGuess é para verificar se o jogador não
				 * excedeu a quantidade máxima de tentativas. Qualquer uma das duas ocorrências
				 * interrompe o loop.
				 */

				// As próximas 6 linhas montam a tela de jogo
				screen.clearScreen();
				screen.gibbet(lostGuess, level);
				System.out.println(messages.getPlayed() + played);
				System.out.printf(messages.getLifeRemaining(), leveler.getLevelMaxGuesses() - lostGuess);
				System.out.println();
				screen.printArray(screen.getShowedSpaces());

				// As próximas 3 linhas captam a tentativa do usuário e chamam a classe Typed
				// para verificar se a tentativa não é repetida
				System.out.print(messages.getCommandToTypeHang());
				guess = sc.next().toLowerCase().charAt(0);
				if (typed.verifyTypedLetters(guess)) {
					//Se a letra for repetida vou incrementar a jogada mas não vou incrementar a variável lostGuess
					played++;
					System.out.println(namedMessages.getAlreadyTypedHang());
					sc.nextLine();

				} else {
					lostGuess++;
					played++;
					firstloop = 0;
					// Após verificar se o caractere já foi digitado ele volta para o jogo e
					// verifica se o usuário deseja encerrar o jogo sumariamente.
					// Escolhi o caractere underscore porque para digitá-lo o jogador precisa
					// apertar duas teclas, tornando a possibilidade de digitação acidental mais
					// difícil
					if (guess == '_') {
						leveler.setFinished(true);
						break;
					} // fim do if que encerra o Jogo
					else {
						// Enquanto houver caractere para testar...
						for (int i = 0; i < wordToGuess.length; i++) {

							/*
							 * Se algum caractere da palavra a ser descoberta for igual ao palpite o espaço
							 * do caractere na tela será preenchido pela letra informada.
							 */
							if (wordToGuess[i] == guess) {
								screen.getShowedSpaces()[i] = guess;
								firstloop += 1;// Criei a variável firstloop porque quando eu acertava uma letra que se
												// repetia
								// ele decrementava a variável lostGuess a cada repetição
								if (firstloop == 1)
									lostGuess--;

							} // fim do if que escreverá o palpite certo na tela

						} // fim do for que faz o teste recursivo do palpite na palavra a ser descoberta

						// Após verificar o caractere, vamos verificar se a palavra foi totlamente
						// descoberta
						if (guessed.verifyGuessed(screen.getShowedSpaces())) {
							wordWasDiscovered = true;
							System.out.println(namedMessages.getCongratsHang());
							screen.printArray(wordToGuess);
							System.out.println();
							// A palavra foi descoberta, portanto vamos verificar se é fim de jogo ou
							// passagem de nível
							if (level == 1) {
								System.out.println(messages.getLabelHangLevel2());
								System.out.println(messages.getKeepGoing());
								sc.nextLine();
								level++;
							} // fim di if que verifica se é passagem de nível
								// Se não for passagem de nível o jogo acaba
							else
								leveler.setFinished(true);

						} // fim do if que verifica se a palavra foi descoberta

					} // fim do else de que testa o palpite do usuário

				} // Fim do else que executa a lógica se o palpite não for repetido

				sc.nextLine();

			} // fim while interno

			// Se a palavra não for descoberta dentro da quantidade certa de possíveis
			// palpites
			if (!wordWasDiscovered) {
				screen.clearScreen();
				screen.gibbet(lostGuess, level);
				System.out.print(namedMessages.getFailedHang());
				screen.printArray(wordToGuess);
				System.out.println();
				leveler.setFinished(true);
			} // fim do if que termina o jogo se a palavra não for descoberta dentro das
				// possibilidades

		} // fim while externo

		System.out.println(messages.getGameOver());
		leveler.setFinished(true);

	}// fim do construtor do Hangman

}
