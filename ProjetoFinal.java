import java.util.Scanner;
class ProjetoFinal
{	 
	
	static int narrador = 0; //ATRASO NAS FALAS DO NARRADOR, 0 PARA TESTES R�PIDOS - 50 PARA JOGAR.
	
	static int arma = 0; 	// 1 = Shotgun // 2 = Katana
	
	
	//inicio	
	
	public static void main(String[] args) throws InterruptedException {
		
		
	//tela de in�cio ##tela inicial##
		
		int escolha = 1;
			
	Narrar("________________| OniricMancer |__________________\r\n"
			+ "\r\n"
			+ "Ei..........Voc� est� a�?.......\r\n"
			+ "Consegue me ouvir?..... Abra os olhos.......");
	do {
		
	Narrar("\n1 - Abrir | 2 - Esperar um pouco e abrir | 3 - N�o\n");
	escolha = entradaDados();
	
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
	    int opMenu;
	    	do{
	    		System.out.println("\n1 - INSTRU��ES \n2 - JOGAR \n3 - CR�DITOS\n4 - SAIR");	    		
	    		opMenu = entradaDados();
	    		switch(opMenu){
	    		case 1:	    		
	    			instrucoes(); break; //IR PARA O M�TODO instrucoes()
	    		case 2:	    		
	    			cap1(); break; //IR PARA O M�TODO cap1()
	    		case 3:
	    			credits(); break; //IR PARA O M�TODO credits()
	    		case 4:
	    			System.out.println("Obrigado por jogar, at� a pr�xima!");
	    			System.exit(0); break; //ENCERRAR A EXECU��O
	    		default:
	    			Narrar("\nOp��o inv�lida, digite novamente: ");}
	    	}while(opMenu !=1 && opMenu !=2 && opMenu !=3);
	}
	
	//game ##fluxo do jogo##
	
	public static void cap1() throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		
		int escolha1, escolha2, escolha3, escolha4, escolha5, escolha6, cont = 3;
		String resposta;
		
	Narrar("Cap�tulo I - OniricMancer - O mundo do Sonho Paradoxal\r\n"
			+ "												\r\n"
			+ "Tente lembrar o seu nome pelo menos, qual era mesmo?\r\n"
			+ "\r\n");
	do {
	Narrar("1. Ellora\n");
	escolha1 = entradaDados();
	
	if (escolha1 == 1) {
		Narrar("Ok, Ellora, vamos l�. Ainda bem que voc� acordou. Quer saber o que est� acontecendo ou \r\n"
				+ "quer fugir na escurid�o? \r\n"
				+ "\r\n");
	}
	else {
		Narrar("Escolha uma op��o v�lida!\n");
	}
	} while(escolha1 != 1);
	
	
	do {
		
		Narrar("1 - Eu n�o estou entendendo nada. Porque a sua voz � igual a minha e n�o consigo te ver? Que lugar � esse?\n");
		escolha2 = entradaDados();
	
	if (escolha2 == 1) {
		Narrar(" Ellora... Voc� precisa sair daqui pois n�o pertence a este lugar. N�o posso dar muitos detalhes mas � \r\n"
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
		escolha3= entradaDados();
		
	if (escolha3 == 1) {
		Narrar("Encontrar�s inimigos que tentar�o te atrasar. Suas emo��es e medos criam vida cibern�tica aqui. Tentar�o te hackear\n"
			+ "modificar suas lembran�as, apagar os dados do seu subconsciente! Vem, tenho um lugar pra te mostrar que vai te\n"
			+ "ajudar a se proteger.\n\n");
	}
	else if (escolha3 == 2) {
		Narrar("Ellora, quer ficar presa com entidades cibern�ticas que apagar�o qualquer resqu�cio de dados do seu ser e nunca mais voltar \r\n"
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
			Narrar("\nVexon: \"� isso! Eu sabia que voc� era apenas uma alma perdida neste universo! Pode passar, venha. Escolha suas armas, Ellora!\"");
		}
		else {			
			Narrar("Vexon: \"Sinto muito querida...\"");
			cont--;
			System.out.println("\nTentativas restantes: " + cont);
		}
		
		if (cont == 0) {
			Narrar("Voc� n�o conseguiu provar sua inoc�ncia para Vexon, logo, n�o poder� sair deste mundo.\n");
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
			Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o....");
		}
	}	
	while (!(escolha4 == 1));
	
	Narrar("\nVexon: \"Aqui, essas s�o as que mais gosto. Guardei para quando algu�m especial como voc� chegasse! Como prefere buscar sua liberdade? "
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
			Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o....");
		}
	}
	
	while ( (escolha5 != 1) && (escolha5 != 2) );	
	
	Narrar("\nVexon: \"Bom... �... voc� parece saber usar essas coisas, n�o sabe?\"\n" + "N�o responde, vamos sair logo daqui!\n");
	Narrar("\nVexon: \"Espere! Um momento. Onde ser� que deixei?... AH! Aqui est�! Pegue esta capa de chuva, acredite, vai precisar neste mundo! "
			+ "\nH� duas Adagas capazes de hackear sistemas no bolso da capa, use somente em casos de extrema necessidade. Pode salvar a sua vida.");
	
	do {
		Narrar("\n\n1. Obrigada, Vexon. Tenha um bom dia amanh�.\n");
		escolha6 = entradaDados();
		if (escolha6 == 1) {
	Narrar("\nVexon: \"Aqui s� h� noite, minha cara... Os melhores sonhos acontecem depois que o sol se p�e, lembra?\"");
		}
		
		else {
			Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o....");
		}
	}
	
	while (escolha6 != 1);
	
	cap2();
	
	}
	
	public static void cap2() throws InterruptedException {             //cap�tulo 2
		Scanner input = new Scanner(System.in); 
		int escolha1, escolha2, escolha3, escolha4, escolha5, escolha6, escolha7, escolha8, escolha9, escolha10, escolha11, cont = 3;
		String resposta;
		Narrar("\n\nCap�tulo II - OniricMancer - ");
	
		Narrar("\nAp�s uma longa caminhada por OniricMancer e seus estranhos, por�m familiares para Vexon, labirintos: algo suspeito parece\n"
				+"se aproximar. O c�u escuro como de costume, agora est� envolto num quadriculado verde neon. A torre brilhante que � o destino final,\n"
				+"sumiu no horizonte, foi coberta pela pesada chuva que despencava. Seria at� bonito admirar algo t�o diferente se n�o fossem os...\n");
		
		Narrar("\nEi..."
				+"\nEI!"
				+"\nCUIDADO!");
		
		Narrar("\nSua consci�ncia te alertou e agora voc�s se encontram rodeadas de criaturas bizarras. Um ex�rcito de Caveiras, ciborgue de olhos "
				+"\nsurpreendentemente brilhantes e azuis! Algumas est�o armadas com tridentes e outros carregam fuzis de energia.\n");
		
		Narrar("\nA gente � uma s� mas eu sou a parte mais importante do seu ser, v� se me protege, viu? Eles est�o aqui pra nos levar e me apagar por "
				+"\ncompleto, s� querem sua consci�ncia. OniricMancer s� funciona porque os que vem parar aqui e n�o conseguem sair tem sua consci�ncia\n"
				+"reduzida a meros kbytes de dados e eu j� te expliquei isso. Agora vamos tentar pensar em uma rota de fuga! Olha em volta DEVAGAR e n�o se mexe!\n");
		
		do {
			Narrar("1. Parar | 2. Correr\r\n");
			escolha1 = entradaDados(); 
			
			if(escolha1 != 1 && escolha1 != 2) {
				Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o...\n");
			}
		} while ((escolha1 != 1) && (escolha1 != 2));
		
		if (escolha1 == 2) {
			Narrar("*Por ter corrido sem uma estrat�gia, voc� foi capturada pelo ex�rcito e agora precisa rapidamente escapar no momento\n"
					+"em que as caveiras est�o registrando seus dados em uma das diversas salas de servidores de OniricMancer. Para conseguir \n"
					+"fugir voc� ter� que passar por um desafio. Se errar a resposta nunca mais acordar� em seu mundo prim�rio.*\r\n");
			
			Narrar("\nMeu deus eu te avisei, [Nome]. Agora estamos aqui e sem sa�da, parab�ns!\r\n"
					+ "\n*Escolha, usando a l�gica, a sequ�ncia de passos a seguir para sair da sala de servidores sem ser impedida por \n"
					+ "nenhuma caveira rob�.\r\n");
			
			Narrar("> Na sala em que voc� est� h� 3 Caveiras Ciborgues.\n"
				 +"> � sua esquerda h� uma escada que leva a uma outra sala vigiada por um dos inimigos que de l� n�o tem vis�o sobre voc� e nem voc� sobre ele. \n"
				 +"> �s suas costas h� uma Caveira Ciborgue concentrada na programa��o em um dos computadores da sala de servidores. Voc� consegue ver que est�\n "
				 +"perto do termostato que controla a temperatura da sala. Consegue ver tamb�m que a Caveira est� digitando algo como 'Captura do Prototype-305'\n"
				 +"> � sua direita h� uma porta vigiada por uma Caveira Ciborgue armada com um tridente mas que est� cochilando. Ela est� com a sua arma.\n"
				 +"> Acima de voc�, h� uma c�mera no teto.\n");
			
			do {
				Narrar("O que voc� ir� fazer ?\r\n"
						+ "Voc� tem 4 sa�das, escolha uma, mas escolha com sabedoria.\n");
				if(arma == 1) {
					Narrar("[1] SA�DA 1: Correr at� o inimigo que est� cochilando, pegar sua arma rapidamente, abrir a porta e fugir.\r\n\""
						+ "\n[2] SA�DA 2: Andar devagar at� a porta em que se encontra o inimigo cochilando, pegar sua Shotgun cuidadosamente, atirar\r\n"
						+ "\nno termostato. Assim, a bala de sua Shotgun Hack ir� alterar a temperatura para uma bem mais elevada, superaquecendo todas as m�quinas. \r\n"
						+ "\nDepois, fugir."
						+ "\n[3] SA�DA 3: Andar devagar at� a porta em que se encontra o inimigo cochilando, pegar sua Shotgun, atirar \r\n"
						+ "\nna c�mera e em seguida no termostato. Assim, a bala de sua Shotgun Hack ir� alterar a temperatura para uma bem mais elevada, superaquecendo \r\n"
						+ "\ntodas as m�quinas. Depois, fugir."
						+ "\n[4] SA�DA 4: Correr at� o inimigo que est� cochilando, pegar sua arma, atirar em todos as Caveiras Rob�s, na c�mera e em seguida, no Termostato.\r\n"
						+ "\nAssim, a bala de sua Shotgun Hack ir� alterar a temperatura para uma bem mais elevada, superaquecendo todas as m�quinas. Depois, fugir.");
					}
				else if (arma == 2){
					Narrar("\n[1] SA�DA 1: Correr at� o inimigo que est� cochilando, pegar sua arma rapidamente, abrir a porta e fugir.\r\n"
							+ "\n[2] SA�DA 2: Pegar a Kunai Hacker do bolso de sua capa de chuva e lan��-la no termostato. Assim, ir� alterar a temperatura"
							+ "\npara uma bem mais elevada, superaquecendo todas as m�quinas. Depois, fugir.\n"
							+ "\n[3] SA�DA 3: Andar devagar at� a porta em que se encontra o inimigo cochilando, pegar sua Katana cuidadosamente, lan�ar a l�mina"
							+ "\nna c�mera e em seguida, a Adaga Hacker no termostato. Assim, ir� alterar a temperatura para uma bem mais elevada, superaquecendo."
							+ "\ntodas as m�quinas. Depois, fugir.\n"
							+ "\n[4] SA�DA 4: Correr at� o inimigo que est� cochilando, pegar sua Katana, atacar todas as Caveiras Rob�s, e em seguida, mirar uma Adaga Hacker"
							+ "\nna c�mera e outra no termostato. Assim, ir� alterar a temperatura para uma bem mais elevada, superaquecendo todas as m�quinas. Depois, fugir.\n"); 
					}
			Narrar("\nQual sa�da voc� deve escolher?\n");
			escolha3 = entradaDados();
				switch (escolha3) {
				case 1: 
					Narrar("Ao pegar sua arma e tentar abrir a porta, voc� percebe que a mesma est� travada por algum servidor. Infelizmente voc� est�\n"
							+ "presa. E OniricMancer sabe qual era o seu objetivo, voc� agora � uma presa f�cil pra eles e nunca mais voltar� a sua vida normal, em seu mundo\n"
							+ "prim�rio..."
							+ "FIM DE JOGO");
					menu();
					break;
				case 2:
					Narrar("Ao acertar o termostato, hackeando-o para aumentar sua temperatura e danificar os servidores, voc� se esqueceu de um detalhe\n"
							+ "importante. A c�mera acima de voc� continua intacta, e enviou um alerta para que mais Caveiras Rob�s chegasse ao local para impedir sua fuga."
							+ "E OniricMancer sabe qual era o seu objetivo, voc� agora � uma presa f�cil pra eles e nunca mais voltar� a sua vida normal, em seu mundo"
							+ "prim�rio..."
							+ "FIM DE JOGO");
					menu();
					break;
				case 3: 
					Narrar("Os dois inimigos na sala se distrairam com os estragos para tentar consertar e dando assim, uma passagem para sua\r\n"
							+ "fuga... Por�m... A Caveira Ciborgue que estava na sala a cima conseguiu te alcan�ar. E OniricMancer sabe qual era o seu objetivo, voc� agora \r\n"
							+ "� uma presa f�cil pra eles e nunca mais voltar� a sua vida normal, em seu mundo prim�rio...\r\n"
							+ "FIM DE JOGO");
					menu();
					break;
				case 4:
					Narrar("Voc� conseguiu! Pensou em uma sa�da l�gica e ganhou tempo para o seu objetivo principal. Danificou o servidor, liberando a porta\n"
							+"e ganhou tempo para chegar at� a Torre Neon para recuperar suas lembran�as e sair de OniricMancer.\n\n"
							+"Caveira Ciborgue: \"Parab�ns, saiu e DESTRUIU nossa sala de servidores. Agora, aonde pensa que vai?\"\n\n");
					break;
				default:
					Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o...\n");
				}
			}while((escolha3 != 1) && (escolha3 != 2) && (escolha3 != 3) && (escolha3 != 4));
		}
		else if (escolha1 == 1) {
		Narrar("Caveira Ciborgue Major: \"Se renda, n�o h� mais para onde ir e voc� sabe que sua vida j� chegou ao fim. Voc� sabe o que te aconteceu em "
				+ "seu mundo prim�rio\r\n");
		Narrar("N�o, n�o vamos dar ouvidos a ele. N�o � verdade!\r\n");
	}
		
		do {
			Narrar("1. O que aconteceu comigo? Eu n�o consigo lembrar, eu... eu preciso ir at� aquela Torre resgatar minhas lembran�as!\r\n"); 
			escolha2 = entradaDados(); 
				if (escolha2 != 1) {
					Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o...\n");
				}
		} while(escolha2 != 1);
		
			Narrar("Caveira Ciborgue General: Se voc� veio parar aqui, � porque n�o h� mais nada para voc� l� fora. Aceite seu destino. \r\n"
					+ "\nN�o, n�o e N�O! Ir�o te destruir, Ellora. Precisam te destruir para criar novas vari�veis e continuar alimentando \n"
					+ "todas essas realidades doentias do universo. universo. L� fora n�o � o melhor lugar, mas quando voc� recuperar \n"
					+ "suas lembran�as, vai ver que vale a pena viver.\r\n");
			do {
			Narrar("\n1. N�o quero contribuir para voc�s continuarem brincando de marionete com nossas vidas! | 2. N�o vejo outra op��o a n�o ser destruir voc�s!\n"); 
			escolha4 = entradaDados(); 
			} while (escolha4 != 1 && escolha4 != 2);
			
			Narrar("\nCaveira Ciborgue Major: \"Voc� fez uma p�ssima escolha, Prototype-305. Desfrute de seu requiem aeternam. ATACAR!\n"
					+ "Meu deus, o que foi que ele falou????\n");
			do {
			Narrar("*Use sua arma e tente se proteger!*\n"
					+"1. Atacar | 2. A T A C A R!\n");
			escolha5 = entradaDados();
			} while(escolha5 != 1 && escolha5 != 2);
			
			if (escolha5 == 1 || escolha5 == 2) {
				if(arma == 1) {
					Narrar("*Voc� mirou sua Shotgun no brilhante olho azul da Caveira Ciborgue Major e puxou o gatilho! Viu seus miolos explodirem algo "
							+ "entre fuma�a, pe�as de tecnologia e sangue humano e repetiu o mesmo com aqueles que se aproximavam para te golpear*");
					}
				else if(arma == 2) {
					Narrar("Voc� notou que o pesco�o � uma das �nicas partes sem pe�as de cibertecnologia cobrindo o corpo desses inimigos. E em um �nico golpe decapitou"
							+ "a Caveira Ciborgue Major. Quanto mais se aproximavam, mais cabe�as rolavam!*\n"); 
				}
			else {
					Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o...");
				}
			}
				Narrar("\nEscuta, Ellora: eu tive uma ideia. Eu n�o sei se voc� aguenta continuar lutando, eles n�o parecem com vontade de desistir! "
						+"Est�o determinados a impedir que voc� chegue na Torre e recupere sua mem�ria.\r\n");
				
				Narrar("*Enquanto luta pela sua vida, mais e mais inimigos chegam para te capturar e a chuva fica mais forte. Voc� dificilmente conseguir� "
						+ "aniquilar todos com apenas as armas que possui. Ent�o, voc� percebe que o quadriculado verde no c�u � um campo de for�a quando "
						+ "uns dos tiros acabam por ating�-lo, por ating�-lo, mas n�o consegue ultrapass�-lo, formando apenas uma onda com a for�a da repuls�o.*");
				
				do {
					Narrar("Vamos, se esconde aqui!\n"
							+"1. Se esconder no lixo | 2. Continuar lutando\n");
					escolha6 = entradaDados();
					
					if (escolha6 == 2) {
						Narrar("*Voc� morreu, eram muitos Ciborgues e voc� foi avisada.*"); 
						menu();
					}
					else if (escolha6 == 1) {
							Narrar("\nVoc� viu o campo de for�a? Se a gente conseguisse pensar em um jeito de destru�-lo..."
									+ "\nMeu deus, � o Vexon ali?!\r\n"); 
							}
					else {
						Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o...\n"); 
						}
				
				} while ((escolha6 != 1) && (escolha6 !=2)); 
				
				do {
				Narrar("1. Ei! Vexon, psiu!\n");
				escolha7 = entradaDados();
				
				if (escolha7 == 1) {
					Narrar("Vexon: \"Ora, mas eu achava que voc� n�o sabia usar essas armas. Agora tenho certeza!\"\n"
							+ "\nA GENTE SABE SIM, viu ?\r\n"
							+ "Vexon: \"Olha, o �nico jeito de voc� sair dessa emboscada, � destruindo o campo de for�a. Aquele quadriculado.\n"
							+ "Olha pra cima, est� vendo? Esse mesmo. Tenho aqui um arco com flechas feitas de um material extremamente condutor.\n"
							+ "Entende o que digo? S�o de prata. Voc� precisa ir para um lugar alto, muito alto, onde os raios da chuva possam alcan�ar.\"\r\n");
				}
				else {
					Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o..."); 
				}
				}while(escolha7 != 1);
				
				
				do {
				Narrar("1. Voc� quer que eu seja atingida por um raio pra conduzir eletricidade pela flecha, atir�-la no campo de for�a e depois MORRER?!\r\n");
				escolha8 = entradaDados();
				
				if (escolha8 == 1) {
					Narrar("Vexon:HAHAHA! Voc� n�o vai morrer, s� vai sentir uma for�a de impacto muito grande! Essa capa de chuva que te dei\n"
							+ "te protege de coisas inimagin�veis, Ellora\r\n");
				}
				else {
					Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o...\n"); 
				}
				}while(escolha8 != 1);
				
				do {
				Narrar("\n1. Ok, eu vou subir at� o topo daquela torre de vidro e de l� tento alguma coisa. Me passa o arco.\n");
				escolha9 = entradaDados();
				
				if (escolha9 == 1) {
					Narrar("*Voc� percebe que a voz de Vexon ficou diferente assim como sua postura*\r\n"
							+ "Vexon: \"VoC� PrEcIsa CoNfIrMaR SuA iDeNtIdAdE\"\n"
							+ "\nO que h� de errado com ele? A gente j� fez isso antes!\r\n"
							+ "\nPara conseguir o arco de flechas prateadas de Vexon voc� precisa confirmar sua identidade\n"
							+ "Resolva o desafio a seguir para liberar sua arma!\n"); 
				}
				else {
					Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o..."); 
				}
				}while(escolha9 != 1);
				
				
				//COLOCAR DESAFIO DE L�GICA AQUI
				
				//Se o desafio de l�gica estiver correto:
				
				Narrar("\nVexon: \"Aqui est�, boa sorte. Tenha cuidado, Ellora\"\r\n"
						+ "\n*Voc� percebeu que os olhos vermelhos de Vexon escureceram e ficou dif�cil distingu�-los da noite."
						+ "\nVexon ficou estranho, tinha algo de errado com ele.* \r\n"
						+"Ele s� sumiu, pra onde ele foi?\n"
						+ "Bom, sobe naquele pr�dio!\n");
				
				Narrar("\n*Ellora foi at� o pr�dio em que decidiria sua vida. Usou caminhos escuros e sombras para se esconder e passar\n"
						+ "desapercebida pelos inimigos  Ao chegar ao imenso pr�dio de vidro, viu que o mesmo se encontrava abandonado \n"
						+ "encontrava abandonado e cheio de res�duos eletr�nicos: cabos, monitores, armas e mais equipamentos de tecnologia\n"
						+ "nunca vistos em seu mundo prim�rio. Era um cemit�rio de tudo o que OniricMancer j� usou para tirar a vida de outros...*\r\n");
				
				Narrar("\n*Ao chegar no terra�o e se deparar com a vista daquele mundo estranho e apenas conhecido h� 3 horas atr�s, Ellora\n"
						+ "sentiu coragem para acabar com isso e ir atr�s do que lhe foi tirado: suas lembran�as.*\r\n");
				
				Narrar("\nCaveira Ciborgue: \"Oniric Ciborgue, c�mbio. Envie um chamado atr�s do Prototype-305, codinome: Ellora.\"\n"
						+ "\"� urgente. Ela tem um arco, vigie o campo de for�a. C�mbio, desligo.\"\r\n"
						+ "\n*Ellora posicionou a flecha no arco e aguardou ansiosamente por um raio ating�-la. Ela n�o sabia se sobreviveria,\n"
						+ "mas o desejo de trazer mais problemas para esse mundo maluco j� valeu a pena estar ali. Seus olhos se concentravam no campo "
						+ "de for�a a frente do c�u e nada mais.*\r\n");
				do {
				Narrar("\n1\r\n"
						+ "2\r\n"
						+ "3\r\n"
						+ "AGORA!\n"
						+ "1. Atirar a flecha!!!\r\n");
						escolha10 = entradaDados();
						
						if (escolha10 == 1) {
							Narrar("*A destrui��o causada no campo de for�a estilha�ou o arranha-c�u de vidro e uma luz intensa iluminou OniricMancer\n"
									+ "talvez pela primeira vez. Mesmo que s� por alguns segundos...*\r\n"
									+ "*...Enquanto ca�a em dire��o ao ch�o e a cama de cacos de vidro que a aguardavam, Ellora sentiu algo lhe puxando\n"
									+ "pra cima. Uma corda? Uma corda saindo de algum carro voador?*\n"); 
						}
						else {
							Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o..."); 
						}
				}while(escolha10 != 1);
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
	
	public static int entradaDados() {
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	return n;
	}
}