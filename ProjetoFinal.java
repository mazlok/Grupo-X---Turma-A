import java.util.Scanner;
class ProjetoFinal
{	 
	
	static int narrador = 0; //ATRASO NAS FALAS DO NARRADOR, 0 PARA TESTES R�PIDOS - 50 PARA JOGAR.
	
	//inicio	
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		
	//tela de in�cio ##tela inicial##
		
		int escolha = 1;
			
	Narrar("________________| OniricMancer |__________________\r\n"
			+ "\r\n"
			+ "Ei..........Voc� est� a�?.......\r\n"
			+ "Consegue me ouvir?..... Abra os olhos.......");
	do {
		
	Narrar("\n1 - Abrir | 2 - Esperar um pouco e abrir | 3 - N�o\n");
	escolha = input.nextInt();
	
	if (escolha == 1) {
		Narrar("\nObrigada. � que voc� precisa sair daqui... Hmmm... U R G E N T E. Vamos l�!"); 
	}
		else if (escolha == 2) {
			pause(100);
			Narrar("\nObrigada. � que voc� precisa sair daqui... Hmmm... U R G E N T E. Vamos l�! \n");
		}
			else if (escolha == 3) {
				Narrar("\nVoc� precisa da minha ajuda... Confie em mim!"); }	
		
	}while (escolha != 1 && escolha != 2 && escolha != 3);
	
	menu();
	}
	
	//menu principal ##tela do menu##
	
	public static void menu() throws InterruptedException {
		Scanner input = new Scanner(System.in);   
	    int opMenu;
	    	do{
	    		System.out.println("\n1 - INSTRU��ES \n2 - JOGAR \n3 - CR�DITOS\n4 - SAIR");	    		
	    		opMenu = input.nextInt();
	    		switch(opMenu){
	    		case 1:	    		
	    			instrucoes(); break; //IR PARA O M�TODO instrucoes()
	    		case 2:	    		
	    			game(); break; //IR PARA O M�TODO game()
	    		case 3:
	    			credits(); break; //IR PARA O M�TODO credits()
	    		case 4:
	    			System.out.println("Obrigado por jogar, at� a pr�xima!");
	    			System.exit(0); break; //ENCERRAR A EXECU��O
	    		default:
	    			Narrar("\nOp��o inv�lida, digite novamente: ");}
	    	}while(opMenu !=1 && opMenu !=2 && opMenu !=3); input.close();
	}
	
	//game ##fluxo do jogo##
	
	public static void game() throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		
		int escolha1, escolha2, escolha3, cont = 1;
		String resposta;
		
	Narrar("Cap�tulo I - OniricMancer - O mundo do Sonho Paradoxal\r\n"
			+ "												\r\n"
			+ "Tente lembrar o seu nome pelo menos, qual era mesmo?\r\n"
			+ "\r\n");
	do {
	Narrar("1. Nome\n");
	escolha1 = input.nextInt();
	
	if (escolha1 == 1) {
		Narrar("Ok, [Nome], vamos l�. Ainda bem que voc� acordou. Quer saber o que est� acontecendo ou \r\n"
				+ "quer fugir na escurid�o? \r\n"
				+ "\r\n");
	}
	else {
		Narrar("Escolha uma op��o v�lida!\n");
	}
	} while(escolha1 != 1);
	
	
	do {
		
		Narrar("1 - Eu n�o estou entendendo nada. Porque a sua voz � igual a minha e n�o consigo te ver? Que lugar � esse?\n");
		escolha2 = input.nextInt();
	
	if (escolha2 == 1) {
		Narrar(" [Nome]... Voc� precisa sair daqui pois n�o pertence a este lugar. N�o posso dar muitos detalhes mas � \r\n"
				+ "como se voc� estivesse em um sonho REM. Mas n�o s� a sua imagina��o, entende? ... Uma c�pia do seu f�sico T A M B � M! \r\n"
				+ "Aqui se chama OniricMancer, um mundo secund�rio. Esse lugar s� sobrevive porque pessoas como voc� n�o conseguem achar a sa�da. Saiba que \r\n"
				+ "provavelmente n�o ir� se lembrar de muito al�m do pr�prio nome e de mim, sua consci�ncia que est� t�o confusa quanto voc�. Consegue ver \r\n"
				+ "aquela torre brilhante e neon no horizonte? Voc� precisa chegar at� l� e recuperar suas lembran�as, est�o todas criptografadas em uma pasta! \n\n");
	}
	else {
		Narrar("Escolha uma op��o v�lida! \n");
	}
	} while(escolha2 != 1);
	
	do {
		Narrar("1 - Como farei isso? O que encontrarei no caminho? | 2 - Eu n�o sei se consigo!\n");
		escolha3= input.nextInt();
		
	if (escolha3 == 1) {
		Narrar("Encontrar�s inimigos que tentar�o te atrasar. Suas emo��es e medos criam vida cibern�tica aqui. Tentar�o te hackear\n"
			+ "modificar suas lembran�as, apagar os dados do seu subconsciente! Vem, tenho um lugar pra te mostrar que vai te\n"
			+ "ajudar a se proteger.\n\n");
	}
	else if (escolha3 == 2) {
		Narrar("[Nome], quer ficar presa com entidades cibern�ticas que apagar�o qualquer resqu�cio de dados do seu ser e nunca mais voltar \r\n"
				+ "para o seu mundo prim�rio? Vem logo! Tenho um lugar pra te mostrar que vai te ajudar a se proteger.\n\n");
	}
	else {
		Narrar("Escolha uma op��o v�lida!\n");
	}
	} while (escolha3 != 1 && escolha3 != 2);
	
	Narrar("\n\"Voc� e sua consci�ncia passam por uma rua muito familiar de sua inf�ncia mas bastante alterada, como se fossem hologramas falhando.\n" 
		+ "� um beco escuro e com luzes coloridas piscando. Uma estranha sensa��o de que aquilo respira tamb�m... Ao chegar numa portinha pequena\n" 
		+ "e cheia de fios conectados a uma tela, um homem com uma cicatriz que cobria toda a sua careca, olhos de led vermelho e corpo multilado\n"
		+ "por pe�as de cibertecnologia, apareceu.\"\n\n"
		+ "Vexon: \"Ol�... quanto tempo n�o recebemos uma visita aqui! Meu nome � Vexon, muito prazer. Veja bem...por seguran�a preciso que voc� resolva\n" 
		+ "um desafio para descobrir a senha que abre esta porta. Sabe como �... muitos androids tentam acabar com o meu com�rcio... Eu s� quero\n"
		+ "ajudar quem vem aqui perdido e sem lembran�as, entende? E eles querem impedir isso, se alimentam dos que aqui ficam presos.\n\"");
	Narrar("Vexon: \"Resolva o seguinte puzzle e o resultado, se correto, abrir� a porta a sua frente!\"\n");
	do {
		Narrar("Escreva um comando que imprima \"Abrir porta a frente!\"\nR: ");
		resposta = input.nextLine();
		
		if (resposta.equals("System.out.print(\"Abrir porta a frente!\");") || resposta.equals("System.out.println(\"Abrir porta a frente!\");")) {
			Narrar("Vexon: \"� isso! Eu sabia que voc� era apenas uma alma perdida neste universo! Pode passar, venha. Escolha suas armas, [Nome]!\"");
		}
		else {
			do {
			Narrar("Vexon: \"Sinto muito querida...\"");
			cont++; 
			} while(cont != 3);
			System.out.println("FIM DE JOGO");
		}
		
	}while(!(resposta.equals("System.out.print(\"Abrir porta a frente!\");") || resposta.equals("System.out.println(\"Abrir porta a frente!\");")));
	
System.out.println("jkasd");
	
	
	
	
	
	
	}

	
	//credits ##tela de cr�ditos##
	
	public static void credits() throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		int voltar;
	Narrar("Desenvolvido por: \n- Bruna Gomes\n- Lucas Oliveira\n- Mateus Brito\n- Ramon Nogueira\n- William Mazotti\n\n");
	Narrar("Agradecimentos: \n- Professor Takeo, por todo o apoio durante o projeto.\n- Colegas de classe, pela contribui��o com d�vidas e conte�do.\n- SENAC, pela estrutura.");
	System.out.println("\n\nDeseja voltar ao menu? \n 1 - Sim | 2 - N�o");
	voltar = input.nextInt();
	
	if (voltar == 1) {
		menu(); 
	}
	else {
		System.exit(0);
	}
		
	}
	
	
	//Instru��es #como jogar#
	
	public static void instrucoes() throws InterruptedException {
		Scanner input = new Scanner(System.in);
		
		int voltar;
		
		Narrar("As op��es de escolha ser�o sempre identificadas em '1', '2' ou '3'.");
		System.out.println("\n\nDeseja voltar ao menu? \n 1 - Sim | 2 - N�o");
		voltar = input.nextInt();
		
		if (voltar == 1) {
			menu(); 
		}
		else {
			System.exit(0);
		}
			
	}
	
	//m�todos auxiliares ##ferramentas internas##	
	public static void pause(int ms) {
	try{Thread.sleep(ms);}catch(InterruptedException e)
		{System.err.format("IOException: %s%n", e);}
	}
	public static void Narrar(String mensagem) throws InterruptedException {
    for (char caractere : mensagem.toCharArray()) {
    System.out.print(caractere);
    pause(narrador);}   
	}
}