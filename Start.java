import java.util.Scanner;

public class Start {

	static Scanner sc = new Scanner(System.in);

	private static String playerName;
	private static char playerGender;
	private static int choice;

	public static void main(String[] args) {

		Messages messages = new Messages();
		Player player = new Player();

		System.out.print(messages.getAskName());
		player.setName(sc.next());
		playerName = player.getName();

		Messages namedMessages = new Messages(playerName);

		System.out.print(messages.getAskGender());
		player.setGender(sc.next().charAt(0));
		playerGender = player.getGender();

			while (playerGender != 'm' && playerGender != 'M' && playerGender != 'f' && playerGender != 'F') {
				System.out.println(messages.getWrongAnswer());
				System.out.print(messages.getAskGender());
				player.setGender(sc.next().charAt(0));
				playerGender = player.getGender();
			}

			System.out.println(namedMessages.getAskGame());
			choice = sc.nextInt();

			if (choice == 1) {

			if (playerGender == 'm' || playerGender == 'M') {
				System.out.println(messages.getLabelIntroHangM());
			} else if (playerGender == 'f' || playerGender == 'F') {
				System.out.println(messages.getLabelIntroHangF());
			} else {

			}

			System.out.println();

			System.out.println(messages.getLabelHangLevel1());
			System.out.println();
			System.out.println(messages.getOptionOut());
			System.out.println();

			if (playerGender == 'm' || playerGender == 'M') {
				System.out.println(messages.getLetsGoM());
				sc.nextLine();
			} else if (playerGender == 'f' || playerGender == 'F') {
				System.out.println(messages.getLetsGoF());
				sc.nextLine();
			}
			sc.nextLine();

			new Hangman(playerName, playerGender);

		} else if (choice == 2) {

			if (playerGender == 'm' || playerGender == 'M') {
				System.out.println(messages.getLabelIntroSporcleM());
			} else if (playerGender == 'f' || playerGender == 'F') {
				System.out.println(messages.getLabelIntroSporcleF());
			} else {

			}

			System.out.println();

			System.out.println(messages.getLabelSporcleLevel1());
			System.out.println();
			System.out.println(messages.getOptionOut());
			System.out.println();

			if (playerGender == 'm' || playerGender == 'M') {
				System.out.println(messages.getLetsGoM());
				sc.nextLine();
			} else if (playerGender == 'f' || playerGender == 'F') {
				System.out.println(messages.getLetsGoF());
				sc.nextLine();
			}
			sc.nextLine();

			new Sporcle(playerName, playerGender);

		} else System.out.println(messages.getWrongAnswer());

	}

}
