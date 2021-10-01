import java.util.Scanner;
class ProjetoFinal
{	 
	static int narrador = 0; //ATRASO NAS FALAS DO NARRADOR, 0 PARA TESTES RÁPIDOS - 50 PARA JOGAR.
	
	//inicio	
	
	public static void main(String[] args) throws InterruptedException {
		
	//tela de início ##tela inicial##
		
	System.out.println("joguinho.exe\n\n");		
	menu();
	}
	
	//menu principal ##tela do menu##
	
	public static void menu() throws InterruptedException {
		Scanner input = new Scanner(System.in);   
	    int opMenu;
	    	do{
	    		System.out.println("\n\nMENU PRINCIPAL\n\n1 - NOVO JOGO \n2 - SAIR \n3 - CRÉDITOS\n");	    		
	    		opMenu = input.nextInt();
	    		switch(opMenu){
	    		case 1:	    		
	    			game(); break; //IR PARA O MÉTODO game()
	    		case 3:	    		
	    			credits(); break; //IR PARA O MÉTODO credits()
	    		case 2:
	    			System.out.println("Obrigado por jogar, até a próxima!");
	    			System.exit(0); break; //ENCERRAR A EXECUÇÃO
	    		default:
	    			Narrar("\nOpção inválida, digite novamente: ");}
	    	}while(opMenu !=1 && opMenu !=2 && opMenu !=3); input.close();
	}
	
	//game ##fluxo do jogo##
	
	public static void game() throws InterruptedException {
	Narrar("Fazer a instrução de comandos (tutorial de como jogar),\nintrodução da história do jogo e apresentação do personagem.");
	}
	
	//credits ##tela de créditos##
	
	public static void credits() throws InterruptedException {
	Narrar("Desenvolvido por: \n- Bruna Gomes\n- Lucas Oliveira\n- Mateus Brito\n- Ramon Nogueira\n- William Mazotti\n\n");
	Narrar("Agradecimentos: \n- Professor Takeo, por todo o apoio durante o projeto.\n- Colegas de classe, pela contribuição com dúvidas e conteúdo.\n- SENAC, pela estrutura.");
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
}