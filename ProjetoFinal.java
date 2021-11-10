import java.util.Scanner;
class ProjetoFinal
{	 
	
	static int narrador = 0; //ATRASO NAS FALAS DO NARRADOR, 0 PARA TESTES RÁPIDOS - 50 PARA JOGAR.
	
	static int arma = 0; 	// 1 = Shotgun // 2 = Katana
	
	
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
		
		int escolha1, escolha2, escolha3, escolha4, escolha5, escolha6, cont = 3;
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
			Narrar("\nVexon: \"É isso! Eu sabia que você era apenas uma alma perdida neste universo! Pode passar, venha. Escolha suas armas, Ellora!\"");
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
		
	do {
		Narrar("\n\n1. Uma alma o que?... Eu sou o que??????\n");
		escolha4 = entradaDados();
		
		if (escolha4 == 1) {
		Narrar("\nVexon: \"Nada, entra logo!\"\n");
		}
		
		else {
			Narrar("\nEntrada inválida, acho que você deveria prestar mais atenção....");
		}
	}	
	while (!(escolha4 == 1));
	
	Narrar("\nVexon: \"Aqui, essas são as que mais gosto. Guardei para quando alguém especial como você chegasse! Como prefere buscar sua liberdade? "
			+ "\nCom uma Shotgun Hacker 88 ou uma Katana 60?\"");
	
	do {
		Narrar("\n1. Hmm... escolho a Shotgun? | 2. Er... pode ser a Katana, eu acho\n");
		escolha5 = entradaDados();
		
		if (escolha5 == 1) {
			arma = 1;
		}
		
		else if (escolha5 == 2) {
			arma = 2;
		}
		
		else  {
			Narrar("\nEntrada inválida, acho que você deveria prestar mais atenção....");
		}
	}
	
	while ( (escolha5 != 1) && (escolha5 != 2) );	
	
	Narrar("\nVexon: \"Bom... é... você parece saber usar essas coisas, não sabe?\"\n" + "Não responde, vamos sair logo daqui!\n");
	Narrar("\nVexon: \"Espere! Um momento. Onde será que deixei?... AH! Aqui está! Pegue esta capa de chuva, acredite, vai precisar neste mundo! "
			+ "\nHá duas Adagas capazes de hackear sistemas no bolso da capa, use somente em casos de extrema necessidade. Pode salvar a sua vida.");
	
	do {
		Narrar("\n\n1. Obrigada, Vexon. Tenha um bom dia amanhã.\n");
		escolha6 = entradaDados();
		if (escolha6 == 1) {
	Narrar("\nVexon: \"Aqui só há noite, minha cara... Os melhores sonhos acontecem depois que o sol se põe, lembra?\"");
		}
		
		else {
			Narrar("\nEntrada inválida, acho que você deveria prestar mais atenção....");
		}
	}
	
	while (escolha6 != 1);
	
	cap2();
	
	}
	
	public static void cap2() throws InterruptedException {             //capítulo 2
		Scanner input = new Scanner(System.in); 
		int escolha1, escolha2 = 0 , escolha3, escolha4, escolha5, escolha6 = 0, cont = 3;
		String resposta;
		Narrar("\n\nCapítulo II - OniricMancer - ");
	
		Narrar("\nApós uma longa caminhada por OniricMancer e seus estranhos, porém familiares para Vexon, labirintos: algo suspeito parece\n"
				+ 	"se aproximar. O céu escuro como de costume, agora está envolto num quadriculado verde neon. A torre brilhante que é o destino final,\n"
				+ 		"sumiu no horizonte, foi coberta pela pesada chuva que despencava. Seria até bonito admirar algo tão diferente se não fossem os...\n");
		
		Narrar("\nEi..."
				+ 	"\nEI!"
				+ 		"\nCUIDADO!");
		
		Narrar("\nSua consciência te alertou e agora vocês se encontram rodeadas de criaturas bizarras\n"
				+ 	"Um exército de Caveiras, ciborgue de olhos surpreendentemente brilhantes e azuis!\n"
				+ 		"Algumas estão armadas com tridentes e outros carregam fuzis de energia.\n");
		
		Narrar("\nA gente é uma só mas eu sou a parte mais importante do seu ser, vê se me protege, viu?\n"
				+ "Eles estão aqui pra nos levar e me apagar por completo, só querem sua consciência. \n"
				+ 	"OniricMancer só funciona porque os que vem parar aqui e não conseguem sair tem sua consciência\n"
				+ 		"reduzida a meros kbytes de dados e eu já te expliquei isso. Agora vamos tentar pensar em uma rota de fuga! Olha em volta DEVAGAR e não se mexe!\n");
		
		do {
			Narrar("1. Parar | 2. Correr\r\n");
		escolha1 = entradaDados(); 
		
		if (escolha1 == 1) {
			Narrar("Caveira Ciborgue Major: \"Se renda, não há mais para onde ir e você sabe que sua vida já chegou ao fim.\n"
					+	 "Você sabe o que te aconteceu em seu mundo primário\r\n");
			
			Narrar("Não, não vamos dar ouvidos a ele. Não é verdade!\r\n");
					 	
			Narrar("1. O que aconteceu comigo? Eu não consigo lembrar, eu... eu preciso ir\n"
					+ 	"até aquela Torre resgatar minhas lembranças!\r\n"); 
					escolha1 = entradaDados(); }
		
		else if (escolha2 == 2); {
			Narrar("*Por ter corrido sem uma estratégia, você foi capturada pelo exército e agora precisa rapidamente escapar no momento\n"
					+ "em que as caveiras estão registrando seus dados em uma das diversas salas de servidores de OniricMancer. Para conseguir \n"
					+ 	"fugir você terá que passar por um desafio. Se errar a resposta nunca mais acordará em seu mundo primário.*\r\n");
			
			Narrar("Meu deus eu te avisei, [Nome]. Agora estamos aqui e sem saída, parabéns!\r\n"
					+ "*Escolha, usando a lógica, a sequência de passos a seguir para sair da sala de servidores sem ser impedida por \n"
					+ 	"nenhuma caveira robô.\r\n");
			
			Narrar("> Na sala em que você está há 3 Caveiras Ciborgues.\n"
					+ "> À sua esquerda há uma escada que leva a uma outra sala vigiada por um dos inimigos que de lá não tem visão sobre \n"
					+ 	"você e nem você sobre ele \n"
					+		"Às suas costas há uma Caveira Ciborgue concentrada na programação em um dos computadores da sala de servidores.\n"
					+ 			"Você consegue ver que está perto do termostato que controla a temperatura da sala. Consegue ver também que a \n"
					+ 				"Caveira está digitando algo como 'Captura do Prototype-305'"
					+ 					"> Acima de você, há uma câmera no teto."
					+ 						" À sua direita há uma porta vigiada por uma Caveira Ciborgue armada com um tridente mas que está cochilando. \n"
					+ 							"Ela está com a sua\n\n" + arma);
					
			
			Narrar("*O que você irá fazer ?*\r\n"
					+ "Você tem 4 saídas, escolha uma, mas escolha sabiamente.");
			
			
			Narrar("Saída 1: Correr até o inimigo que está cochilando, pegar sua arma rapidamente, abrir a porta e fugir.\r\n");
					 
			Narrar("Saída 2: Se a arma for a Shotgun: andar devagar até a porta em que se encontra o inimigo cochilando, pegar sua \n"
					+ 	"shotgun cuidadosamente, atirar no termostato. Assim, a bala de sua Shotgun Hack irá alterar a temperatura para \n"
					+ 		"para uma bem mais elevada, superaquecendo todas as máquinas (Depois, fugir).(Se a arma for a Katana [+ kunai que o Vexon \n"
					+ 			"deixou no bolso da capa de chuva]: pegar a Kunai Hacker do bolso de sua capa de chuva e lançá-la no termostato\n"
					+ 				" Assim, irá alterar a temperatura para uma bem mais elevada, superaquecendo todas as máquinas.(Depois, fugir)\r\n");
	
			Narrar("Saída 3: Se a arma for a Shotgun: andar devagar até a porta em que se encontra o inimigo cochilando, pegar sua shotgun\n"
					+ "atirar na câmera e em seguida no termostato. Assim, a bala de sua Shotgun Hack irá alterar a temperatura para uma \n"
					+ 	"bem mais elevada, superaquecendo todas as máquinas. (Depois, fugir.) // (Se a arma for a Katana [+ kunai que o \n"
					+ 		"Vexon deixou no bolso da capa de chuva]: andar devagar até a porta em que se encontra o inimigo cochilando, \n"
					+ 			"pegar sua Katana cuidadosamente, lançar a lâmina na câmera e em seguida, a Adaga Hacker no termostato. \n"
					+ 				"Assim, irá alterar a temperatura para uma bem mais elevada, superaquecendo todas as máquinas. Depois, fugir.)\r\n");
			
			Narrar("Saída 4: Correr até o inimigo que está cochilando, pegar sua arma, atirar em todos as Caveiras Robôs, na câmera e em seguida,\n"
					+ "no Termostato. Assim, a bala de sua Shotgun Hack irá alterar a temperatura para uma bem mais elevada, superaquecendo todas \n"
					+ 	"máquinas. Depois, fugir // (Se a arma for a Katana [+ Adaga que o Vexon deixou no bolso da capa de chuva]: Correr até o \n"
					+ 		"inimigo que está cochilando, pegar sua katana, atacar todas as Caveiras Robôs, e em seguida, mirar uma Adaga Hacker \n"
					+ 			"na câmera e outra no termostato. Assim, irá alterar a temperatura para uma bem mais elevada, superaquecendo todas as máquinas. \n"
					+ 				"Depois, fugir. \r\n"); 
			
			if (escolha1 == 1) {
				Narrar("Ao pegar sua arma e tentar abrir a porta, você percebe que a mesma está travada por algum servidor. Infelizmente você está presa. \n"
						+ "E OniricMancer sabe qual era o seu objetivo, você agora é uma presa fácil pra eles e nunca mais voltará a sua vida normal, em seu \n"
						+ 	"mundo primário.\n\n"
						+ 		"FIM DE JOGO!\n");
						Narrar ("Redirecionando você ao menu principal...\n");
						menu (); 
		
			}
			else if (escolha1 == 2) {
				Narrar("Ao acertar o termostato, hackeando-o para aumentar sua temperatura e danificar os servidores, você se esqueceu de um detalhe \n"
						+ "importante. A câmera acima de você continua intacta, e enviou um alerta para que mais Caveiras Robôs chegasse ao local para \n"
							+ "impedir sua fuga. E OniricMancer sabe qual era seu objetivo, você agora é uma presa fácil pra eles e nunca mais voltará \n"
							+ 	"a sua vida normal, em seu mundo primário...\n\n"
							+ 		"FIM DE JOGO! \n");
						Narrar ("Redirecionando você ao menu principal...\n");
						menu (); 
			}
				
			else if	(escolha1 == 3) {
				Narrar("Os dois inimigos na sala se distrairam com os estragos para tentar consertar e dando assim, uma passagem para sua \n"
						+ "fuga... Porém... A Caveira Ciborgue que estava na sala a cima conseguiu te alcançar. E OniricMancer sabe qual \n"
						+ 	"era o seu objetivo, você agora é uma presa fácil pra eles e nunca mais voltará a sua vida normal, em seu mundo primário...\r\n"
						+ 		"FIM DE JOGO!\n \n");
						Narrar ("Redirecionando você ao menu principal...\n");
					menu (); 
			}
			
			else if (escolha1 == 4) {
				Narrar (" Você conseguiu! Pensou em uma saída lógica e ganhou tempo para o seu objetivo principal. Danificou o servidor, liberando a porta \n"
						+ "e ganhou tempo para chegar até a Torre neon para recuperar suas lembranças e sair de OniricMancer.\n\n");
			}
					
		
	
		 	else { 
		 		Narrar  ("\nEntrada inválida, você deveria prestar mais atenção");	 
		 	} }
				   
				   
		
		}	while ((escolha1 != 1) && (escolha1 != 2));	
				   
				   Narrar("Caveira Ciborgue General: Se você veio parar aqui, é porque não há mais nada para você lá fora. Aceite seu destino. \r\n"
					+ 	"Não, não e NÃO! Irão te destruir, Ellora. Precisam te destruir para criar novas variáveis e continuar alimentando \n"
					+ 		"todas essas realidades doentias do universo. universo. Lá fora não é o melhor lugar, mas quando você recuperar \n"
					+ 			"suas lembranças, vai ver que vale a pena viver.\r\n");
			
			Narrar("1. Não quero contribuir para vocês continuarem brincando de marionete com nossas vidas! | \n"
					+ 	"2. Não vejo outra opção a não ser destruir vocês!"); 
			escolha2 = entradaDados(); 
			
			Narrar("\nCaveira Ciborgue Major: \"Você fez uma péssima escolha, Prototype-305. Desfrute de seu requiem aeternam. ATACAR!\n"
					+ 	"Meu deus, o que foi que ele falou????\n");
			
			Narrar("*Use sua arma e tente se proteger!\n"
					+ 	"1. Atacar | 2. A T A C A R!");
			escolha2 = entradaDados();
			
			
			if (escolha2 == 1) {
				arma = 1;
				
				Narrar("*Você mirou sua Shotgun no brilhante olho azul da Caveira Ciborgue Major e puxou o gatilho!\n"
						+ 	"Viu seus miolos explodirem algo entre fumaça, peças de tecnologia e sangue humano e repetiu\n"
						+ "		o mesmo com aqueles que se aproximavam para te golpear*"); }
			
			else if (escolha2 == 2) {
				arma = 2;
				Narrar("Você notou que o pescoço é uma das únicas partes sem peças de cibertecnologia cobrindo o corpo desses inimigos\n"
						+ 	"um único golpe decapitou a Caveira Ciborgue Major. Quanto mais se aproximavam, mais cabeças rolavam!*"); }
			
			else {
				Narrar("\nEntrada inválida, acho que você deveria prestar mais atenção...\n"); 
			}
			
				Narrar("Escuta, [Nome]: eu tive uma ideia. Eu não sei se você aguenta continuar lutando,\n"
						+ 	"eles não parecem com vontade de desistir! Estão determinados a impedir que\n"
						+ 		"você chegue na Torre e recupere sua memória.\r\n");
				
				Narrar("*Enquanto luta pela sua vida, mais e mais inimigos chegam para te capturar e a chuva fica mais forte\n"
						+ 	"Você dificilmente conseguirá aniquilar todos com apenas as armas que possui. Então, você percebe\n"
						+ 		"que o quadriculado verde no céu é um campo de força quando uns dos tiros acabam por atingí-lo,\n"
						+ 			"por atingí-lo, mas não consegue ultrapassá-lo, formando apenas uma onda com a força da repulsão.*");
				
				Narrar("Vamos, se esconde aqui!\n"
						+	"1. Se esconder no lixo | 2. Continuar lutando");
				escolha3 = entradaDados();
				
				do {
					if (escolha3 == 2) {
						Narrar("*Você morreu, eram muitos Ciborgues e você foi avisada.*"); }
						
						else if (escolha3 == 1) {
							Narrar("Você viu o campo de força? Se a gente conseguisse pensar em um jeito de destruí-lo...\r\n"
									+ 	"Meu deus, é o Vexon ali?!\r\n"); }
							
							else {
								Narrar("\nEntrada inválida, acho que você deveria prestar mais atenção..."); }
				
				}
				while ((escolha3 != 1) && (escolha3 !=2)); 
				
				Narrar("1. Ei! Vexon, psiu!");
				escolha4 = entradaDados();
				
				Narrar("Vexon: \"Ora, mas eu achava que você não sabia usar essas armas. Agora tenho certeza!\n"
						+ "A GENTE SABE SIM, viu ?\r\n");
				
				Narrar("Vexon: Olha, o único jeito de você sair dessa emboscada, é destruindo o campo de força. Aquele quadriculado.\n"
						+ "Olha pra cima, está vendo? Esse mesmo. Tenho aqui um arco com flechas feitas de um material extremamente condutor.\n"
						+ 	"Entende o que digo? São de prata. Você precisa ir para um lugar alto, muito alto, onde os raios da chuva possam alcançar.\r\n");

				Narrar("1. Você quer que eu seja atingida por um raio pra conduzir eletricidade pela flecha, atirá-la no campo de força"
						+ "e depois MORRER?!\r\n");
				escolha5 = entradaDados();
				
				Narrar("Vexon:HAHAHA! Você não vai morrer, só vai sentir uma força de impacto muito grande! Essa capa de chuva que te dei\n"
						+ "te protege de coisas inimagináveis, [Nome]\r\n");
				
				Narrar("1. Ok, eu vou subir até o topo daquela torre de vidro e de lá tento alguma coisa. Me passa o arco.");
				escolha5 = entradaDados();
				
				Narrar("*Você percebe que a voz de Vexon ficou diferente assim como sua postura*\r\n"
						+ "Vexon: \"VoCê PrEcIsa CoNfIrMaR SuA iDeNtIdAdE\n"
						+ 	"O que há de errado com ele? A gente já fez isso antes!\r\n"
						+ 		"Para conseguir o arco de flechas prateadas de Vexon você precisa confirmar sua identidade\n"
						+ 			". Resolva o desafio a seguir para liberar sua arma!\n"); 
				
				//COLOCAR DESAFIO DE LÓGICA AQUI
				
				//Se o desafio de lógica estiver correto:
				
				Narrar("Vexon:Aqui está, boa sorte. Tenha cuidado, [Nome]\r\n"
						+ "*Você percebeu que os olhos vermelhos de Vexon escureceram e ficou difícil distinguí-los da noite."
						+ 	"Vexon ficou estranho, tinha algo de errado com ele \r\n"
						+		"Ele só sumiu, pra onde ele foi? Bom, sobe naquele prédio!");
				
				Narrar("*[Nome] foi até o prédio em que decidiria sua vida. Usou caminhos escuros e sombras para se esconder e passar\n"
						+ "desapercebida pelos inimigos  Ao chegar ao imenso prédio de vidro, viu que o mesmo se encontrava abandonado \n"
						+ 	"encontrava abandonado e cheio de resíduos eletrônicos: cabos, monitores, armas e mais equipamentos de tecnologia\n"
						+ 		"nunca vistos em seu mundo primário. Era um cemitério de tudo o que OniricMancer já usou para tirar a vida de outros...*\r\n");
				
				Narrar("*Ao chegar no terraço e se deparar com a vista daquele mundo estranho e apenas conhecido há 3 horas atrás, [Nome]\n"
						+ "sentiu coragem para acabar com isso e ir atrás do que lhe foi tirado: suas lembranças.*\r\n");
				
				Narrar("Caveira Ciborgue: \"Oniric Ciborgue, câmbio. Envie um chamado atrás do Prototype-305, codinome: [Nome].\n"
						+ "É urgente. Ela tem um arco, vigie o campo de força. Câmbio, desligo.\r\n"
						+ 	"*[Nome] posicionou a flecha no arco e aguardou ansiosamente por um raio atingí-la. Ela não sabia se sobreviveria\n"
						+ 		"mas o desejo de trazer mais problemas para esse mundo maluco  já valeu a pena por estar ali. Seus olhos \n"
						+ 			"se concentravam no campo de força a frente do céu e nada mais.*\n\n");
				
				Narrar("1\r\n"
						+ "2\r\n"
						+ 	"3\r\n"
						+ 		" AGORA [Nome]!\n"
						+ 			" 1. Atirar a flecha!!!\r\n");
									escolha5 = entradaDados();
									
				Narrar("*A destruição causada no campo de força estilhaçou o arranha-céu de vidro e uma luz intensa iluminou OniricMancer\n"
						+ "talvez pela primeira vez. Mesmo que só por alguns segundos...*\r\n"
						+ 	"*...Enquanto caía em direção ao chão e a cama de cacos de vidro que a aguardavam, [Nome] sentiu algo lhe puxando\n"
						+ 		"pra cima. Uma corda? Uma corda saindo de algum carro voador ?\n"); 
		
						
					


						
				
				
						
						
						
				
				
				
				
					
				
				
						
	
	
	
	
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
