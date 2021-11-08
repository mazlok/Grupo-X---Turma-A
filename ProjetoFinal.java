import java.util.Scanner;
class ProjetoFinal
{	 
	
	static int narrador = 0; //ATRASO NAS FALAS DO NARRADOR, 0 PARA TESTES RÁPIDOS - 50 PARA JOGAR.
	
	//inicio	
	
	public static void main(String[] args) throws InterruptedException {
		
		
	//tela de início ##tela inicial##
		
		int escolha = 1;
			
	Narrar("________________| OniricMancer |__________________\r\n"
			+ "\r\n"
			+ "Ei..........Você está aí?.......\r\n"
			+ "Consegue me ouvir?..... Abra os olhos.......");
	do {
		
	Narrar("\n1 - Abrir | 2 - Esperar um pouco e abrir | 3 - Não\n");
	escolha = entradaDados();
	
	if (escolha == 1) {
		Narrar("\nObrigada. É que você precisa sair daqui... Hmmm... U R G E N T E. Vamos lá!"); 
	}
		else if (escolha == 2) {
			pause(100);
			Narrar("\nObrigada. É que você precisa sair daqui... Hmmm... U R G E N T E. Vamos lá! \n");
		}
			else if (escolha == 3) {
				Narrar("\nVocê precisa da minha ajuda... Confie em mim!"); }	
		
	}while (escolha != 1 && escolha != 2 && escolha != 3);
	
	menu();
	}
	
	//menu principal ##tela do menu##
	
	public static void menu() throws InterruptedException { 
	    int opMenu;
	    	do{
	    		System.out.println("\n1 - INSTRUÇÕES \n2 - JOGAR \n3 - CRÉDITOS\n4 - SAIR");	    		
	    		opMenu = entradaDados();
	    		switch(opMenu){
	    		case 1:	    		
	    			instrucoes(); break; //IR PARA O MÉTODO instrucoes()
	    		case 2:	    		
	    			cap1(); break; //IR PARA O MÉTODO cap1()
	    		case 3:
	    			credits(); break; //IR PARA O MÉTODO credits()
	    		case 4:
	    			System.out.println("Obrigado por jogar, até a próxima!");
	    			System.exit(0); break; //ENCERRAR A EXECUÇÃO
	    		default:
	    			Narrar("\nOpção inválida, digite novamente: ");}
	    	}while(opMenu !=1 && opMenu !=2 && opMenu !=3);
	}
	
	//game ##fluxo do jogo##
	
	public static void cap1() throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		
		int escolha1, escolha2, escolha3, cont = 3;
		String resposta;
		
	Narrar("Capítulo I - OniricMancer - O mundo do Sonho Paradoxal\r\n"
			+ "												\r\n"
			+ "Tente lembrar o seu nome pelo menos, qual era mesmo?\r\n"
			+ "\r\n");
	do {
	Narrar("1. Ellora\n");
	escolha1 = entradaDados();
	
	if (escolha1 == 1) {
		Narrar("Ok, Ellora, vamos lá. Ainda bem que você acordou. Quer saber o que está acontecendo ou \r\n"
				+ "quer fugir na escuridão? \r\n"
				+ "\r\n");
	}
	else {
		Narrar("Escolha uma opção válida!\n");
	}
	} while(escolha1 != 1);
	
	
	do {
		
		Narrar("1 - Eu não estou entendendo nada. Porque a sua voz é igual a minha e não consigo te ver? Que lugar é esse?\n");
		escolha2 = entradaDados();
	
	if (escolha2 == 1) {
		Narrar(" Ellora... Você precisa sair daqui pois não pertence a este lugar. Não posso dar muitos detalhes mas é \r\n"
				+ "como se você estivesse em um sonho REM. Mas não só a sua imaginação, entende? ... Uma cópia do seu físico T A M B É M! \r\n"
				+ "Aqui se chama OniricMancer, um mundo secundário. Esse lugar só sobrevive porque pessoas como você não conseguem achar a saída. Saiba que \r\n"
				+ "provavelmente não irá se lembrar de muito além do próprio nome e de mim, sua consciência que está tão confusa quanto você. Consegue ver \r\n"
				+ "aquela torre brilhante e neon no horizonte? Você precisa chegar até lá e recuperar suas lembranças, estão todas criptografadas em uma pasta! \n\n");
	}
	else {
		Narrar("Escolha uma opção válida! \n");
	}
	} while(escolha2 != 1);
	
	do {
		Narrar("1 - Como farei isso? O que encontrarei no caminho? | 2 - Eu não sei se consigo!\n");
		escolha3= entradaDados();
		
	if (escolha3 == 1) {
		Narrar("Encontrarás inimigos que tentarão te atrasar. Suas emoções e medos criam vida cibernética aqui. Tentarão te hackear\n"
			+ "modificar suas lembranças, apagar os dados do seu subconsciente! Vem, tenho um lugar pra te mostrar que vai te\n"
			+ "ajudar a se proteger.\n\n");
	}
	else if (escolha3 == 2) {
		Narrar("Ellora, quer ficar presa com entidades cibernéticas que apagarão qualquer resquício de dados do seu ser e nunca mais voltar \r\n"
				+ "para o seu mundo primário? Vem logo! Tenho um lugar pra te mostrar que vai te ajudar a se proteger.\n\n");
	}
	else {
		Narrar("Escolha uma opção válida!\n");
	}
	} while (escolha3 != 1 && escolha3 != 2);
	
	Narrar("\n\"Você e sua consciência passam por uma rua muito familiar de sua infância mas bastante alterada, como se fossem hologramas falhando.\n" 
		+ "É um beco escuro e com luzes coloridas piscando. Uma estranha sensação de que aquilo respira também... Ao chegar numa portinha pequena\n" 
		+ "e cheia de fios conectados a uma tela, um homem com uma cicatriz que cobria toda a sua careca, olhos de led vermelho e corpo multilado\n"
		+ "por peças de cibertecnologia, apareceu.\"\n\n"
		+ "Vexon: \"Olá... quanto tempo não recebemos uma visita aqui! Meu nome é Vexon, muito prazer. Veja bem...por segurança preciso que você resolva\n" 
		+ "um desafio para descobrir a senha que abre esta porta. Sabe como é... muitos androids tentam acabar com o meu comércio... Eu só quero\n"
		+ "ajudar quem vem aqui perdido e sem lembranças, entende? E eles querem impedir isso, se alimentam dos que aqui ficam presos.\n\"");
	Narrar("Vexon: \"Resolva o seguinte puzzle e o resultado, se correto, abrirá a porta a sua frente!\"\n");
	do {
		Narrar("Escreva um comando que imprima \"Abrir porta a frente!\"\nR: ");
		resposta = input.nextLine();
		
		if (resposta.equals("System.out.print(\"Abrir porta a frente!\");") || resposta.equals("System.out.println(\"Abrir porta a frente!\");")) {
			Narrar("Vexon: \"É isso! Eu sabia que você era apenas uma alma perdida neste universo! Pode passar, venha. Escolha suas armas, Ellora!\"");
		}
		else {			
			Narrar("Vexon: \"Sinto muito querida...\"");
			cont--;
			System.out.println("\nTentativas restantes: " + cont);
		}
		
		if (cont == 0) {
			Narrar("Você não conseguiu provar sua inocência para Vexon, logo, não poderá sair deste mundo.\n");
			System.out.println("\nFIM DE JOGO");
			Narrar("\nRedirecionando ao menu................\n");
			menu();	
		}
		
	}while(!(resposta.equals("System.out.print(\"Abrir porta a frente!\");") || resposta.equals("System.out.println(\"Abrir porta a frente!\");") || (cont == 0)));
	
System.out.println("jkasd");
	
	
	
	
	
	
	}

	
	//credits ##tela de créditos##
	
	public static void credits() throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		int voltar;
	Narrar("Desenvolvido por: \n- Bruna Gomes\n- Lucas Oliveira\n- Mateus Brito\n- Ramon Nogueira\n- William Mazotti\n\n");
	Narrar("Agradecimentos: \n- Professor Takeo, por todo o apoio durante o projeto.\n- Colegas de classe, pela contribuição com dúvidas e conteúdo.\n- SENAC, pela estrutura.");
	System.out.println("\n\nDeseja voltar ao menu? \n 1 - Sim | 2 - Não");
	voltar = input.nextInt();
	
	if (voltar == 1) {
		menu(); 
	}
	else {
		System.exit(0);
	}
		
	}
	
	
	//Instruções #como jogar#
	
	public static void instrucoes() throws InterruptedException {
		Scanner input = new Scanner(System.in);
		
		int voltar;
		
		Narrar("As opções de escolha serão sempre identificadas em '1', '2' ou '3'.");
		System.out.println("\n\nDeseja voltar ao menu? \n 1 - Sim | 2 - Não");
		voltar = input.nextInt();
		
		if (voltar == 1) {
			menu(); 
		}
		else {
			System.exit(0);
		}
			
	}
	
	//métodos auxiliares ##ferramentas internas##	
	public static void pause(int ms) {
	try{Thread.sleep(ms);}catch(InterruptedException e)
		{System.err.format("IOException: %s%n", e);}
	}
	public static void Narrar(String mensagem) throws InterruptedException {
    for (char caractere : mensagem.toCharArray()) {
    System.out.print(caractere);
    pause(narrador);}   
	}
	
	public static int entradaDados() {
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	return n;
	}
}