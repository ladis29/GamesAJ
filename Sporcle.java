import java.util.ArrayList;
import java.util.Scanner;

public class Sporcle {

	Leveler leveler = new Leveler();
	Typed typed = new Typed();
	Screen screen = new Screen();
	Messages messages = new Messages();
	Guessed guessed = new Guessed();

	Scanner sc = new Scanner(System.in);

	private boolean wordsWereDiscovered;
	private String guess;// variável para armazenar o palpite do jogador
	private int level = 1;// Nível inicial
	private String[] list;// Lista de Palavras a serem descobertas


	public Sporcle(String name, char gender) {

		Messages namedMessages = new Messages(name);

		while (!leveler.getFinished()) {
			wordsWereDiscovered = false;
			Chronometer chrono = new Chronometer(level);
			typed.setTypedWords(new ArrayList<String>());
			leveler.leveler(level);
			list = leveler.getLevelWords();
			screen.listMap(list);

			while (!wordsWereDiscovered && chrono.getSecondsAvailable() > 0) {

				// As próximas 3 linhas montam a tela do jogo
				screen.clearScreen();
				System.out.println(messages.getTimeRemaining() + (chrono.getSecondsAvailable()/60) + ":" + (chrono.getSecondsAvailable()%60));
				screen.printArray(screen.getShowedWords(), level);

				// As próximas 3 linhas captam a tentativa do usuário e chamam a classe Typed
				// para verificar se a tentativa não é repetida
				System.out.print(messages.getCommandToTypeSporcle());
				guess = sc.next().toLowerCase();
				if (typed.verifyTypedWords(guess)) {

					System.out.println(namedMessages.getAlreadyTypedSporcle());
					sc.nextLine();
				} // fim do if que verifica se a palavra já havia sido digitada
				else if (guess.equals("_")) {
					leveler.setFinished(true);
					break;
				} // fim do if que encerra o Jogo
				else {
					// Enquanto houver palavras para testar
					for (int i = 0; i < list.length; i++) {
						if (list[i].equals(guess)) {
							screen.getShowedWords()[i] = guess;
						} // fim do if que escreverá o palpite certo na tela

					} // fim do for que faz o teste recursivo do palpite na lista de palavras a ser
						// descoberta

					if (guessed.verifyGuessed(screen.getShowedWords())) {

						wordsWereDiscovered = true;
						System.out.println();
						System.out.println(namedMessages.getCongratsSporcle());
						System.out.println();

						if (level == 1) {
							System.out.println(messages.getLabelSporcleLevel2());
							System.out.println(messages.getKeepGoing());
							sc.nextLine();
							level++;
						} // fim do if que verifica se é passagem de nível
							// Se não for passagem de nível o jogo acaba
						else
							leveler.setFinished(true);

					} // fim do if que verifica se todas as palavras foram descobertas

				} // fim do else de que testa o palpite do usuário

				sc.nextLine();

			} // fim do While interno

			if (!wordsWereDiscovered) {
				screen.clearScreen();
				System.out.println(namedMessages.getFailedSporcle());
				System.out.println();
				screen.printArray(list, level);
				System.out.println();
				leveler.setFinished(true);
			} // fim do if que encerra o jogo caso o jogador não acerte as palavras

		} // fim do while externo

		System.out.println(messages.getGameOver());
		leveler.setFinished(true);

	}// fim do construtor Sporcle

}// fim da classe Sporcle
