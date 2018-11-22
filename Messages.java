public class Messages {

	// Declaração das variáveis
	private String askName = "Informe seu nome: ";

	private String askGender = "Informe o seu sexo(M ou F): ";

	private String askGame;

	private String wrongAnswer = "Resposta incorreta, por favor tente novamente";

	private String labelHangLevel1 = "No primeiro voce tera que tentar acertar uma entre as 50 palavras reservadas do java,\n"
			+ "Podera errar ate 5 letras, no sexto erro o personagem e enforcado e o jogo acaba.";

	private String labelHangLevel2 = "No segundo nivel voce tera que acertar uma entre as 10 palavras reservadas do java relacionadas a tipos,\n"
			+ "Voce podera errar ate 4 letras, no quinto erro o personagem e enforcado e o jogo acaba.";

	private String labelSporcleLevel1 = "No primeiro nivel você terá 5 minutos para acertar todas as 50 palavras reservadas do java";

	private String labelSporcleLevel2 = "No segundo nivel você terá 3 minutos para acertar todas as 10 palavras reservadas do java relacionadas a tipos";

	private String optionOut = "A qualquer momento voce pode sair do jogo digitando o caractere '_'(underscore)";

	private String letsGoM = "Assim que estiver pronto aperte enter e vamos ao jogo";

	private String letsGoF = "Assim que estiver pronta aperte enter e vamos ao jogo";

	private String labelIntroHangM = "Bem vindo ao Hangman Game!!!\n"
			+ "O objetivo do jogo e acertar a palavra sorteada no minimo de tentativas possiveis.\n\n"
			+ "A cada acerto a letra aparecera no console e voce podera tentar a proxima letra,\n"
			+ "A cada erro uma parte da forca e criada.";

	private String labelIntroHangF = "Bem vinda ao Hangman Game!!!\n"
			+ "O objetivo do jogo e acertar a palavra sorteada no minimo de tentativas possiveis.\n\n"
			+ "A cada acerto a letra aparecera no console e voce podera tentar a proxima letra,\n"
			+ "A cada erro uma parte da forca e criada.";

	private String labelIntroSporcleM = "Bem vindo ao Sporcle!!!\n"
			+ "O objetivo do jogo e acertar as palavras reservadas do JAVA no mínimo de tempo possível.\n\n"
			+ "Não existe limite de tentativas neste jogo, você pode tentar quantas vezes conseguir dentro do tempo estipulado,\n"
			+ "Ao final do tempo o jogo acaba e exibe o resultado";

	private String labelIntroSporcleF = "Bem vinda ao Sporcle!!!\n"
			+ "O objetivo do jogo e acertar as palavras reservadas do JAVA no mínimo de tempo possível.\n\n"
			+ "Não existe limite de tentativas neste jogo, você pode tentar quantas vezes conseguir dentro do tempo estipulado,\n"
			+ "Ao final do tempo o jogo acaba e exibe o resultado";

	private String played = "Jogada: ";

	private String lifeRemaining = "Restam %d chances!!";

	private String timeRemaining = "O tempo restante é de ";

	private String commandToTypeHang = "Digite uma Letra: ";

	private String commandToTypeSporcle = "Tente uma palavra: ";

	private String alreadyTypedHang;

	private String alreadyTypedSporcle;

	private String congratsHang;

	private String congratsSporcle;

	private String keepGoing = "Aperte enter e vamos continuar!!!";

	private String failedHang;

	private String failedSporcle;

	private String gameOver = "Fim de Jogo!!!";

	// Vou criar um construtor vazio para poder chamar as variáveis que não precisam
	// de passagem de parâmetros
	public Messages() {

	}

	// Este construtor é para as variáveis que usam o nome do jogador
	public Messages(String name) {

		askGame = "Ola " + name + " qual jogo você gostaria de jogar?\n\n" + "digite:\n" + "'1' para jogar Hangman\n"
				+ "ou\n" + "'2' para jogar Sporcle";

		congratsHang = "Parabens " + name + " você acertou a palavra";

		congratsSporcle = "Parabens " + name + " você acertou todas as palavras reservadas deste nível";

		alreadyTypedHang = name + " você já digitou essa letra anteriormente, tente novamente";

		alreadyTypedSporcle = name + " você já digitou essa palavra anteriormente, tente novamente";

		failedHang = "Que pena " + name + ", acabaram as suas chances, a palavra era: ";

		failedSporcle = "Que pena " + name + ", acabou o seu tempo, as palavras eram: ";

	}

	// Encapsulamento das variáveis

	public String getAskName() {
		return askName;
	}

	public String getAskGender() {
		return askGender;
	}

	public String getWrongAnswer() {
		return wrongAnswer;
	}

	public String getAskGame() {
		return askGame;
	}

	public String getLabelHangLevel1() {
		return labelHangLevel1;
	}

	public String getLabelHangLevel2() {
		return labelHangLevel2;
	}

	public String getLabelSporcleLevel1() {
		return labelSporcleLevel1;
	}

	public String getLabelSporcleLevel2() {
		return labelSporcleLevel2;
	}

	public String getOptionOut() {
		return optionOut;
	}

	public String getLetsGoM() {
		return letsGoM;
	}

	public String getLetsGoF() {
		return letsGoF;
	}

	public String getLabelIntroHangM() {
		return labelIntroHangM;
	}

	public String getLabelIntroHangF() {
		return labelIntroHangF;
	}

	public String getLabelIntroSporcleM() {
		return labelIntroSporcleM;
	}

	public String getLabelIntroSporcleF() {
		return labelIntroSporcleF;
	}

	public String getPlayed() {
		return played;
	}

	public String getLifeRemaining() {
		return lifeRemaining;
	}

	public String getTimeRemaining() {
		return timeRemaining;
	}

	public String getCommandToTypeHang() {
		return commandToTypeHang;
	}

	public String getCommandToTypeSporcle() {
		return commandToTypeSporcle;
	}

	public String getAlreadyTypedHang() {
		return alreadyTypedHang;
	}

	public String getAlreadyTypedSporcle() {
		return alreadyTypedSporcle;
	}

	public String getCongratsHang() {
		return congratsHang;
	}

	public String getCongratsSporcle() {
		return congratsSporcle;
	}

	public String getKeepGoing() {
		return keepGoing;
	}

	public String getFailedHang() {
		return failedHang;
	}

	public String getFailedSporcle() {
		return failedSporcle;
	}

	public String getGameOver() {
		return gameOver;
	}

}
