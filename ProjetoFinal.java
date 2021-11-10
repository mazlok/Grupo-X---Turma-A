package ProjetoFinal;

import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

class ProjetoFinal {

	
	//VARIAVEIS GLOBAIS
	static int narrador = 0; // ATRASO NAS FALAS DO NARRADOR, 0 PARA TESTES R�PIDOS - 35 PARA JOGAR.
	static int arma = 0; // 1 = SHOTGUN // 2 = KATANA.	
	static int hp = 100; //VIDA DA PERSONAGEM, PARA REDUZIR EM DESAFIOS 
	
	public static void main(String[] args) throws InterruptedException {
	//TELA INICIAL ******************************************************************************************************************************************************
		
		// VARIAVEIS
		int escolha = 1;
		
		//TELA INICIAL
		Narrar("________________| OniricMancer |__________________\r\n" + "\r\n"
				+ "Ei..........Voc� est� a�?.......\r\n" + "Consegue me ouvir?..... Abra os olhos.......");
		do {

			Narrar("\n1 - Abrir | 2 - Esperar um pouco e abrir | 3 - N�o\n");
			escolha = entradaDados();

			if (escolha == 1) {
				Narrar("\nObrigada. � que voc� precisa sair daqui... Hmmm... U R G E N T E. Vamos l�!\n");
			} else if (escolha == 2) {
				pause(100);
				Narrar("\nObrigada. � que voc� precisa sair daqui... Hmmm... U R G E N T E. Vamos l�! \n");
			} else if (escolha == 3) {
				Narrar("\nVoc� precisa da minha ajuda... Confie em mim!\n");
			}

		} while (escolha != 1 && escolha != 2 && escolha != 3);

		menu();
	}

	//MENU PRINCIPAL ******************************************************************************************************************************************************

	public static void menu() throws InterruptedException {
		
		// VARIAVEIS
		int opMenu;
		
		// MENU
		do {
			System.out.println("\n1 - INSTRU��ES \n2 - JOGAR \n3 - CR�DITOS\n4 - SAIR");
			opMenu = entradaDados();
			switch (opMenu) {
			case 1:
				instrucoes();
				break; // IR PARA O M�TODO instrucoes()
			case 2:
				cap1();
				break; // IR PARA O M�TODO cap1()
			case 3:
				credits(); // IR PARA O M�TODO credits()
				break; 
			case 4:
				System.out.println("Obrigado por jogar, at� a pr�xima!");
				System.exit(0); // ENCERRAR A EXECU��O
				break; 
			default:
				Narrar("\nOp��o inv�lida, digite novamente: ");
			}
		} while (opMenu != 1 && opMenu != 2 && opMenu != 3);
	}

	//INICIO CAPITULO 1 ******************************************************************************************************************************************************

	public static void cap1() throws InterruptedException {

		// VARIAVEIS
		
		Scanner input = new Scanner(System.in);
		
		int escolha1, escolha2, escolha3, escolha4, escolha5, escolha6, cont = 3;
		
		String resposta;
		
		//HISTORIA
		
		Narrar("Cap�tulo I - OniricMancer - O mundo do Sonho Paradoxal\r\n"
				+ "												\r\n"
				+ "Tente lembrar o seu nome pelo menos, qual era mesmo?\r\n" + "\r\n");
		do {
			Narrar("1. Ellora\n");
			escolha1 = entradaDados();

			if (escolha1 == 1) {
				Narrar("Ok, Ellora, vamos l�. Ainda bem que voc� acordou. Quer saber o que est� acontecendo ou \r\n"
						+ "quer fugir na escurid�o? \r\n" + "\r\n");
			} else {
				Narrar("Escolha uma op��o v�lida!\n");
			}
		} while (escolha1 != 1);

		do {

			Narrar("1 - Eu n�o estou entendendo nada. Porque a sua voz � igual a minha e n�o consigo te ver? Que lugar � esse?\n");
			escolha2 = entradaDados();

			if (escolha2 == 1) {
				Narrar("Ellora... Voc� precisa sair daqui pois n�o pertence a este lugar. N�o posso dar muitos detalhes mas � \r\n"
						+ "como se voc� estivesse em um sonho REM. Mas n�o s� a sua imagina��o, entende? ... Uma c�pia do seu f�sico T A M B � M! \r\n"
						+ "Aqui � OniricMancer, um mundo secund�rio. Esse lugar s� sobrevive porque pessoas como voc� n�o conseguem achar a sa�da.\n\n Saiba que "
						+ "provavelmente n�o ir� se lembrar de muito al�m do pr�prio nome e de mim, sua consci�ncia, que estou t�o confusa quanto voc�.\n\nConsegue ver "
						+ "aquela torre brilhante e neon no horizonte?\nVoc� precisa chegar at� l� e recuperar suas lembran�as, est�o todas criptografadas em uma pasta! \n\n");
			} else {
				Narrar("Escolha uma op��o v�lida! \n");
			}
		} while (escolha2 != 1);

		do {
			Narrar("Minha consci�ncia? Ok n�...\n\n1 - Como farei isso? O que encontrarei no caminho? | 2 - Eu n�o sei se consigo!\n");
			escolha3 = entradaDados();

			if (escolha3 == 1) {
				Narrar("Encontrar� inimigos que tentar�o te atrasar. Suas emo��es e medos criam vida cibern�tica aqui. Tentar�o te hackear\n"
						+ "modificar suas lembran�as, apagar os dados do seu subconsciente! Vem, tenho um lugar pra te mostrar que vai te\n"
						+ "ajudar a se proteger.\n\n");
			} else if (escolha3 == 2) {
				Narrar("Ellora, quer ficar presa com entidades cibern�ticas que apagar�o qualquer resqu�cio de dados do seu ser e nunca mais voltar \r\n"
						+ "para o seu mundo prim�rio? Vem logo! Tenho um lugar pra te mostrar que vai te ajudar a se proteger.\n\n");
			} else {
				Narrar("Escolha uma op��o v�lida!\n");
			}
		} while (escolha3 != 1 && escolha3 != 2);

		Narrar("\n*Voc� e sua consci�ncia passam por uma rua muito familiar de sua inf�ncia mas bastante alterada, como se fossem hologramas falhando.\n"
				+ "� um beco escuro e com luzes coloridas piscando. Uma estranha sensa��o de que aquilo respira tamb�m... Ao chegar numa portinha pequena\n"
				+ "e cheia de fios conectados a uma tela, um homem com uma cicatriz que cobria toda a sua careca, olhos de led vermelho e corpo multilado\n"
				+ "por pe�as de cibertecnologia, apareceu.*\n\n"
				+ "Vexon: \"Ol�... quanto tempo n�o recebemos uma visita aqui! Meu nome � Vexon, muito prazer. Veja bem...por seguran�a preciso que voc� resolva\n"
				+ "um desafio para descobrir a senha que abre esta porta. Sabe como �... muitos androids tentam acabar com o meu com�rcio... Eu s� quero\n"
				+ "ajudar quem vem aqui perdido e sem lembran�as, entende? E eles querem impedir isso, se alimentam dos que aqui ficam presos.\n");
		Narrar("Vexon: \"Resolva o seguinte puzzle e o resultado, se correto, abrir� a porta a sua frente!\"\n");
		do {
			Narrar("\nEscreva um comando em linguagem Java que imprima a frase \"Abrir porta a frente\"\nR: ");
			resposta = input.nextLine();

			if (resposta.equalsIgnoreCase("System.out.print(\"Abrir porta a frente\");")
					|| resposta.equalsIgnoreCase("System.out.println(\"Abrir porta a frente\");")) {
				Narrar("\nVexon: \"� isso! Eu sabia que voc� era apenas uma alma perdida neste universo! Pode passar, venha. Escolha suas armas, Ellora!\"");
			} else {
				Narrar("Vexon: \"Sinto muito querida...\"");
				cont--;
				System.out.println("\nTentativas restantes: " + cont);
			}

			if (cont == 0) {
				Narrar("*Voc� n�o conseguiu provar sua inoc�ncia para Vexon, logo, n�o poder� sair deste mundo.*\n");
				System.out.println("\nFIM DE JOGO");
				Narrar("\nRedirecionando ao menu................\n");
				menu();
			}

		} while (!(resposta.equalsIgnoreCase("System.out.print(\"Abrir porta a frente\");") || resposta.equalsIgnoreCase("System.out.println(\"Abrir porta a frente\");")
				|| cont==0));

		do {
			Narrar("\n\n1. Uma alma o que?... Eu sou o que??????\n");
			escolha4 = entradaDados();

			if (escolha4 == 1) {
				Narrar("\nVexon: \"Nada, entra logo!\"\n");
			}

			else {
				Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o....");
			}
		} while (!(escolha4 == 1));

		Narrar("\nVexon: \"Aqui, essas s�o as que mais gosto. Guardei para quando algu�m especial como voc� chegasse! Como prefere buscar sua liberdade? "
				+ "\nCom uma Shotgun Hacker 88 ou uma Katana 60?\"");

		do {
			Narrar("\n\n1. Hmm... escolho a Shotgun? | 2. Er... pode ser a Katana, eu acho\n");
			escolha5 = entradaDados();

			if (escolha5 == 1) {
				arma = 1;
			}

			else if (escolha5 == 2) {
				arma = 2;
			}

			else {
				Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o....");
			}
		}

		while ((escolha5 != 1) && (escolha5 != 2));

		Narrar("\nVexon: \"Bom... �... voc� n�o parece saber usar essas coisas, voc� sabe n�?\n"
				+ "N�o responde, vamos sair logo daqui!\"\n");
		Narrar("\nVexon: \"Espere! Um momento. Onde ser� que deixei?... AH! Aqui est�! Pegue esta capa de chuva, acredite, vai precisar neste mundo! "
				+ "\nH� duas Adagas capazes de hackear sistemas no bolso da capa, use somente em casos de extrema necessidade. Podem salvar a sua vida.\"");

		do {
			Narrar("\n\n1. Obrigada, Vexon. Tenha um bom dia amanh�.\n");
			escolha6 = entradaDados();
			if (escolha6 == 1) {
				Narrar("\nVexon: \"Aqui s� h� noite, minha querida... Os melhores sonhos acontecem depois que o sol se p�e...\"");
			}

			else {
				Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o....");
			}
		}

		while (escolha6 != 1);

		cap2();

	}
	
	
	////////////////////////////////////////////////////////////
	//INICIO CAPITULO 2******************************************************************************************************************************************************
	///////////////////////////////////////////////////////////
	
	
	public static void cap2() throws InterruptedException { 
		
		//VARIAVEIS
		
		Scanner input = new Scanner(System.in);
		
		int escolha1, escolha2, escolha3, escolha4, escolha5, escolha6,
			escolha7, escolha8, escolha9, escolha10,
			escolha11, escolha12, cont = 3, cont2 = 3;
		
		String resposta;
		
		//HISTORIA
		
		Narrar("\n\nCap�tulo II - OniricMancer - Escolhas\n");

		Narrar("\n*Ap�s uma longa caminhada por OniricMancer e seus estranhos, por�m familiares para Vexon, labirintos: algo suspeito parece\n"
				+ "se aproximar. O c�u escuro como de costume, agora est� envolto num quadriculado verde neon. A torre brilhante que � o destino final,\n"
				+ "sumiu no horizonte, foi coberta pela pesada chuva que despencava. Seria at� bonito admirar algo t�o diferente se n�o fossem os...*\n");

		Narrar("\nEi..." + "\nEI!" + "\nCUIDADO!\n");

		Narrar("\n*Sua consci�ncia te alertou e agora voc�s se encontram rodeadas de criaturas bizarras. Um ex�rcito de Caveiras ciborgues de olhos azuis e "
				+ "\nsurpreendentemente brilhantes! Algumas est�o armadas com tridentes el�tricos e outras carregam fuzis de energia.*\n");

		Narrar("\nA gente � uma s� mas eu sou a parte mais importante do seu ser, v� se me protege, viu? Eles est�o aqui pra nos levar e me apagar por "
				+ "\ncompleto, s� querem sua consci�ncia. OniricMancer s� funciona porque os que vem parar aqui e n�o conseguem sair tem sua consci�ncia\n"
				+ "reduzida a meros kbytes de dados e eu j� te expliquei isso.\nAgora vamos tentar pensar em uma rota de fuga! Olha em volta DEVAGAR e n�o se mexe!\n");

		do {
			Narrar("\n1. Parar | 2. Correr\r\n");
			escolha1 = entradaDados();

			if (escolha1 != 1 && escolha1 != 2) {
				Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o...\n");
			}
		} while ((escolha1 != 1) && (escolha1 != 2));

		if (escolha1 == 2) {
			Narrar("*Por ter corrido sem uma estrat�gia, voc� foi capturada pelo ex�rcito e agora precisa rapidamente escapar no momento\n"
					+ "em que as caveiras est�o registrando seus dados em uma das diversas salas de servidores de OniricMancer. Para conseguir \n"
					+ "fugir voc� ter� que passar por um desafio. Se errar a resposta nunca mais acordar� em seu mundo prim�rio.*\r\n");

			Narrar("\nMeu deus eu te avisei, Ellora. Agora estamos aqui e sem sa�da, parab�ns!\r\n"
					+ "\n*Escolha, usando a l�gica, a sequ�ncia de passos a seguir para sair da sala de servidores sem ser impedida por \n"
					+ "nenhuma caveira rob�.*\r\n");

			Narrar("> Na sala em que voc� est� h� 3 Caveiras Ciborgues.\n"
					+ "> � sua esquerda h� uma escada que leva a uma outra sala vigiada por um dos inimigos que de l� n�o tem vis�o sobre voc� e nem voc� sobre ele. \n"
					+ "> �s suas costas h� uma Caveira Ciborgue concentrada na programa��o em um dos computadores da sala de servidores. Voc� consegue ver que est�\n "
					+ "perto do termostato que controla a temperatura da sala. Consegue ver tamb�m que a Caveira est� digitando algo como 'Captura do Prototype-305'\n"
					+ "> � sua direita h� uma porta vigiada por uma Caveira Ciborgue armada com um tridente mas que est� cochilando. Ela est� com a sua arma.\n"
					+ "> Acima de voc�, h� uma c�mera no teto.\n");

			do {
				Narrar("\nObs 1: Se for vista pela c�mera tentando fugir, alertar� as outras salas com diversos inimigos."
						+ "\nObs 2: O termostato previne que o calor superaque�a as m�quinas (incluindo as caveiras).\n\nO que voc� ir� fazer ?\r\n" + "\nVoc� tem 4 sa�das, escolha uma, mas escolha com sabedoria.\n");
				if (arma == 1) {
					Narrar("\n[1] SA�DA 1: Correr at� o inimigo que est� cochilando, pegar sua arma rapidamente, tentar abrir a porta e fugir.\r\n"
							+ "\n[2] SA�DA 2: Andar devagar at� a porta em que se encontra o inimigo cochilando, pegar sua Shotgun cuidadosamente, atirar\r\n"
							+ "no termostato. Assim, a bala de sua Shotgun Hack ir� alterar a temperatura para uma bem mais elevada,\nsuperaquecendo todas as m�quinas da sala,"
							+ "depois fugir.\n"
							+ "\n[3] SA�DA 3: Andar devagar at� a porta em que se encontra o inimigo cochilando, pegar sua Shotgun, atirar \r\n"
							+ "na c�mera e em seguida no termostato. Assim, a bala de sua Shotgun Hack ir� alterar a temperatura para uma bem mais elevada,\nsuperaquecendo"
							+ "todas as m�quinas da sala. Depois fugir.\n"
							+ "\n[4] SA�DA 4: Correr at� o inimigo que est� cochilando, pegar sua arma, atirar em todos as Caveiras Rob�s, na c�mera e em seguida, no Termostato.\r\n"
							+ "Assim, a bala de sua Shotgun Hack ir� alterar a temperatura para uma bem mais elevada, superaquecendo todas as m�quinas da sala. Depois fugir.");
				} else if (arma == 2) {
					Narrar("\n[1] SA�DA 1: Correr at� o inimigo que est� cochilando, pegar sua arma rapidamente, tentar abrir a porta e fugir.\r\n"
							+ "\n[2] SA�DA 2: Pegar a Kunai Hacker do bolso de sua capa de chuva e lan��-la no termostato. Assim, ir� alterar a temperatura"
							+ "\npara uma bem mais elevada, superaquecendo todas as m�quinas da sala. Depois tentar fugir.\n"
							+ "\n[3] SA�DA 3: Andar devagar at� a porta em que se encontra o inimigo cochilando, pegar sua Katana cuidadosamente, lan�ar a l�mina"
							+ "\nna c�mera e em seguida a Adaga Hacker no termostato. Assim, ir� alterar a temperatura para uma bem mais elevada, superaquecendo."
							+ "\ntodas as m�quinas da sala. Depois tentar fugir.\n"
							+ "\n[4] SA�DA 4: Correr at� o inimigo que est� cochilando, pegar sua Katana, atacar todas as Caveiras Rob�s, e em seguida, mirar uma Adaga Hacker"
							+ "\nna c�mera e outra no termostato.\nAssim, ir� alterar a temperatura para uma bem mais elevada, superaquecendo todas as m�quinas da sala. Depois fugir.\n");
				}
				Narrar("\n\nQual sa�da voc� deve escolher para sair viva?\n");
				escolha3 = entradaDados();
				switch (escolha3) {
				case 1:
					Narrar("Ao pegar sua arma e tentar abrir a porta, voc� percebe que a mesma est� travada por algum sistema. Infelizmente voc� est�\n"
							+ "presa e agora OniricMancer sabe qual era o seu objetivo, voc� agora � uma presa f�cil pra eles e nunca mais voltar� a sua vida normal, em seu mundo\n"
							+ "prim�rio..." + "\nFIM DE JOGO");
					menu();
					break;
				case 2:
					Narrar("Ao acertar o termostato, hackeando-o para aumentar sua temperatura e danificar os servidores, voc� se esqueceu de um detalhe\n"
							+ "importante. A c�mera acima de voc� continua intacta, e enviou um alerta para que mais Caveiras Rob�s chegasse ao local para impedir sua fuga."
							+ "E OniricMancer sabe qual era o seu objetivo, voc� agora � uma presa f�cil pra eles e nunca mais voltar� a sua vida normal, em seu mundo"
							+ "prim�rio..." + "\nFIM DE JOGO");
					menu();
					break;
				case 3:
					Narrar("Os dois inimigos na sala se distrairam com os estragos para tentar consertar e dando assim, uma passagem para sua\r\n"
							+ "fuga... Por�m... A Caveira Ciborgue que estava na sala a cima conseguiu te alcan�ar. E OniricMancer sabe qual era o seu objetivo, voc� agora \r\n"
							+ "� uma presa f�cil pra eles e nunca mais voltar� a sua vida normal, em seu mundo prim�rio...\r\n\n"
							+ "FIM DE JOGO");
					menu();
					break;
				case 4:
					Narrar("*Voc� conseguiu! Pensou em uma sa�da l�gica e pode retornar para seu objetivo principal. Danificou o servidor e todos os sistemas, liberando a porta\n"
							+ "e ganhando tempo para chegar at� a Torre Neon, recuperar suas lembran�as e sair de OniricMancer.*\n\n"
							+ "Caveira Ciborgue: \"Parab�ns, saiu e DESTRUIU nossa sala de servidores. Agora, aonde pensa que vai?\"\n\n");
					break;
				default:
					Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o...\n");
				}
			} while ((escolha3 != 1) && (escolha3 != 2) && (escolha3 != 3) && (escolha3 != 4));
		} else if (escolha1 == 1) {
			Narrar("Caveira Ciborgue Major: \"Se renda, n�o h� mais para onde ir e voc� sabe que sua vida j� chegou ao fim. Voc� sabe o que te aconteceu em "
					+ "seu mundo prim�rio\"\r\n");
			Narrar("\nN�o, n�o vamos dar ouvidos a ele. N�o � verdade!\r\n");
		}

		do {
			Narrar("\n1. O que aconteceu comigo? Eu n�o consigo lembrar, eu... eu preciso ir at� aquela Torre resgatar minhas lembran�as!\r\n");
			escolha2 = entradaDados();
			if (escolha2 != 1) {
				Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o...\n");
			}
		} while (escolha2 != 1);

		Narrar("Caveira Ciborgue General: \"Se voc� veio parar aqui, � porque n�o h� mais nada para voc� l� fora. Aceite seu destino.\"\r\n"
				+ "\nN�o, n�o e N�O! Ir�o te destruir, Ellora. Precisam te destruir para criar novas vari�veis e continuar alimentando \n"
				+ "todas essas realidades doentias do universo. L� fora n�o � o melhor lugar, mas quando voc� recuperar \n"
				+ "suas lembran�as, vai ver que vale a pena viver.\r\n");
		do {
			Narrar("\n1. N�o quero contribuir para voc�s continuarem brincando de marionete com nossas vidas!\n2. N�o vejo outra op��o a n�o ser destruir voc�s!\n");
			escolha4 = entradaDados();
		} while (escolha4 != 1 && escolha4 != 2);

		Narrar("\nCaveira Ciborgue Major: \"Voc� fez uma p�ssima escolha, Prototype-305. Desfrute de seu requiem aeternam. ATACAR!\"\n"
				+ "\nMeu deus, o que foi que ele falou????\n");
		do {
			Narrar("\n*Use sua arma e tente se proteger!*\n" + "\n1. Atacar | 2. A T A C A R!\n");
			escolha5 = entradaDados();
		} while (escolha5 != 1 && escolha5 != 2);

		if (escolha5 == 1 || escolha5 == 2) {
			if (arma == 1) {
				Narrar("*Voc� mirou sua Shotgun no brilhante olho azul da Caveira Ciborgue Major e puxou o gatilho! Viu seus miolos explodirem algo "
						+ "entre fuma�a, pe�as de tecnologia e sangue humano e repetiu o mesmo com aqueles que se aproximavam para te golpear*");
			} else if (arma == 2) {
				Narrar("*Voc� notou que o pesco�o � uma das �nicas partes sem pe�as de cibertecnologia cobrindo o corpo desses inimigos\ne em um �nico golpe decapitou"
						+ " a Caveira Ciborgue Major. Quanto mais se aproximavam, mais cabe�as rolavam!*\n");
			} else {
				Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o...");
			}
		}
		Narrar("\nEscuta, Ellora, eu tive uma ideia. Eu n�o sei se voc� aguenta continuar lutando, eles n�o parecem com vontade de desistir! "
				+ "\nEst�o determinados a impedir que voc� chegue na Torre e recupere sua mem�ria.\r\n");

		Narrar("\n*Enquanto luta pela sua vida, mais e mais inimigos chegam para te capturar e a chuva fica mais forte.\nVoc� dificilmente conseguir� "
				+ "aniquilar todos com apenas as armas que possui.\nEnt�o, voc� percebe que o quadriculado verde no c�u � um campo de for�a quando "
				+ "\nalguns tiros acabam por ating�-lo mas n�o conseguem ultrapass�-lo, formando apenas ondas com a for�a da repuls�o.*");

		do {
			Narrar("\n\nVamos, se esconde aqui!\n" + "\n1. Se esconder no lixo | 2. Continuar lutando\n");
			escolha6 = entradaDados();

			if (escolha6 == 2) {
				Narrar("*Voc� lutou at� esgotar suas for�as e morreu, eram muitos Ciborgues e voc� n�o tinha recursos.*");
				menu();
			} else if (escolha6 == 1) {
				Narrar("\nVoc� viu o campo de for�a? Se a gente conseguisse pensar em um jeito de destru�-lo..."
						+ "\nMeu deus, � o Vexon ali?!\r\n");
			} else {
				Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o...\n");
			}

		} while ((escolha6 != 1) && (escolha6 != 2));

		do {
			Narrar("\n1. Ei! Vexon, psiu!\n");
			escolha7 = entradaDados();

			if (escolha7 == 1) {
				Narrar("Vexon: \"Ora, mas eu achava que voc� n�o sabia usar essas armas. Agora tenho certeza!\"\n"
						+ "\nA GENTE SABE SIM, viu ?\r\n"
						+ "\nVexon: \"Olha, o �nico jeito de voc� sair dessa emboscada, � destruindo o campo de for�a. Aquele quadriculado.\n"
						+ "Olha pra cima, est� vendo? Esse mesmo. Tenho aqui um arco com flechas feitas de um material extremamente condutor.\n"
						+ "Entende o que digo? S�o de prata. Voc� precisa ir para um lugar alto, muito alto, onde os raios da chuva possam alcan�ar.\"\r\n");
			} else {
				Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o...");
			}
		} while (escolha7 != 1);

		do {
			Narrar("\n1. Voc� quer que eu seja atingida por um raio pra conduzir eletricidade pela flecha, atir�-la no campo de for�a e depois MORRER?!\r\n");
			escolha8 = entradaDados();

			if (escolha8 == 1) {
				Narrar("Vexon: \"HAHAHA! Voc� n�o vai morrer, s� vai sentir uma for�a de impacto muito grande! Essa capa de chuva que te dei\n"
						+ "te protege de coisas inimagin�veis, Ellora.\"\r\n");
			} else {
				Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o...\n");
			}
		} while (escolha8 != 1);

		do {
			Narrar("\n1. Ok, eu vou subir at� o topo daquela torre de vidro e de l� tento alguma coisa. Me passa o arco.\n");
			escolha9 = entradaDados();

			if (escolha9 == 1) {
				Narrar("*Voc� percebe que a voz de Vexon ficou diferente assim como sua postura*\r\n"
						+ "\nVexon: \"VoC� PrEcIsa CoNfIrMaR SuA iDeNtIdAdE\"\n"
						+ "\nO que h� de errado com ele? A gente j� fez isso antes!\r\n"
						+ "\n*Para conseguir o arco de flechas prateadas de Vexon voc� precisa confirmar sua identidade\n"
						+ "Resolva o desafio a seguir para liberar sua arma!*\n");
			} else {
				Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o...");
			}
		} while (escolha9 != 1);
		
		// DESAFIO DE L�GICA
		
		Narrar("\nVexon: \"Vamos l�, uma mulher est� prestes a ter um beb�. Se ele for menino, ficar� faltando apenas mais um filho para que o n�mero\n"
				+ "de meninos seja igual ao de meninas. No entanto, se o beb� for uma menina, o n�mero de filhas da mulher ser� o dobro\n"
				+ "do n�mero de meninos. Quantos filhos ela tem atualmente e qual o sexo deles?\"");
		do {
			
			System.out.println("\n\nDigite a quantidade de meninos: "); //RESPOSTA CORRETA: 3
			escolha11 = entradaDados();
			System.out.println("Digite a quantidade de meninas: "); //RESPOSTA CORRETA: 5
			escolha12 = entradaDados();
			
			if (escolha11==3 && escolha12==5) {
				Narrar("\n*Voc� decifrou com sucesso a charada de Vexon e recebeu o arco*");
			} else {
				Narrar("\nVexon: \"tEnTe nOvAmEnTe... tEnTaTiVaS ReStAnTeS: " + cont2);
				cont2--;				
			}
			
			if (cont2==0) {
				Narrar("*Voc� n�o conseguiu comprovar sua identidade para Vexon e ele parou de responder."
						+ "\nAgora n�o h� como prosseguir com seu objetivo. \n\n FIM DE JOGO. \nRetornando ao menu......");
				menu();
			}
		} while ((escolha11 !=3 && escolha12!=5));
		
		// SE O DESAFIO DE LOGICA ESTIVER CORRETO:
		
		Narrar("\n\nVexon: \"Aqui est�, boa sorte. Tenha cuidado, Ellora\"\r\n"
				+ "\n*Voc� percebeu que os olhos vermelhos de Vexon escureceram e ficou dif�cil distingu�-los da noite."
				+ "\nVexon ficou estranho, tinha algo de errado com ele.* \r\n" + "\nEle s� sumiu, pra onde ele foi?\n"
				+ "Bom, sobe naquele pr�dio!\n");

		Narrar("\n*Ellora foi at� o pr�dio em que decidiria sua vida. Usou caminhos escuros e sombras para se esconder e passar\n"
				+ "desapercebida pelos inimigos. Ao chegar ao imenso pr�dio de vidro, viu que o mesmo se encontrava abandonado \n"
				+ "e cheio de res�duos eletr�nicos: cabos, monitores, armas e mais equipamentos de tecnologia\n"
				+ "nunca vistos em seu mundo prim�rio. Era um cemit�rio de tudo o que OniricMancer j� usou para tirar a vida de outros...*\r\n");

		Narrar("\n*Ao chegar no terra�o e se deparar com a vista daquele mundo estranho e apenas conhecido h� 3 horas atr�s, Ellora\n"
				+ "sentiu coragem para acabar com isso e ir atr�s do que lhe foi tirado: suas lembran�as.*\r\n");

		Narrar("\nCaveira Ciborgue: \"Oniric Ciborgue, c�mbio. Envie um chamado atr�s do Prototype-305, codinome: Ellora.\n"
				+ "� urgente. Ela tem um arco, vigie o campo de for�a. C�mbio, desligo.\"\r\n"
				+ "\n*Ellora posicionou a flecha no arco e aguardou ansiosamente por um raio ating�-la. Ela n�o sabia se sobreviveria,\n"
				+ "mas o desejo de trazer mais problemas para esse mundo maluco j� fazia valer a pena estar ali.\nSeus olhos se concentravam no campo "
				+ "de for�a a frente do c�u e nada mais.*\r\n");
		do {
			Narrar("\n1\r\n" + "2\r\n" + "3\r\n" + "AGORA!\n" + "\n1. Atirar a flecha!!!\r\n");
			escolha10 = entradaDados();

			if (escolha10 == 1) {
				Narrar("*A destrui��o causada no campo de for�a estilha�ou o arranha-c�u de vidro e uma luz intensa iluminou OniricMancer\n"
						+ "talvez pela primeira vez. Mesmo que s� por alguns segundos...*\r\n"
						+ "\n*...Enquanto ca�a em dire��o ao ch�o e a cama de cacos de vidro que a aguardavam, Ellora sentiu algo lhe puxando\n"
						+ "pra cima. Uma corda? Uma corda saindo de algum carro voador*\n");
			} else {
				Narrar("\nEntrada inv�lida, acho que voc� deveria prestar mais aten��o...");
			}
		} while (escolha10 != 1);
		
		cap3();
	}
	
		
	////////////////////////////////////////////////////////////
	//IN�CIO CAP�TULO 3 ******************************************************************************************************************************************************
	///////////////////////////////////////////////////////////
	
	
	public static void cap3() throws InterruptedException { 
		
		// VARIAVEIS
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> embaralhar = new ArrayList<String>();	
		
		int escolha1, escolha2, escolha3, escolha4, escolha5, escolha6, escolha7, escolha8, resposta;
		String login, senha, user = "Prototype-305";
		boolean teste = false;
		
		// HIST�RIA
		
		Narrar("\nCap�tulo III - OniricMancer - O final\n");
		
		Narrar("\nMeu Deus, n�s chegamos! ACORDA, [Nome]. N�s chegamos!!!!!!\n");

		Narrar("\n*Voc� se encontra agora numa masmorra da Torre Neon de OniricMancer.\nTente achar a sa�da correta para procurar pelos corredores, a sala em que suas"
				+ " mem�rias est�o criptografadas.\nEscolha cuidadosamente uma das quatro portas pois este lugar muda a posi��o da correta quando voc� escolhe a errada.*\n");
		Narrar("\nEllora, sej� l� o que estiver atr�s dessas portas parece perigoso, est� vendo o s�mbolo de perigo em cada uma delas?"
				+ "\nAcho melhor tomar cuidado para n�o errar muitas vezes...");
		//DESAFIO DAS PORTAS (ARRAYLIST E COLLECTIONS)
		
		embaralhar.add("Porta incorreta...");
		embaralhar.add("Porta incorreta...");
		embaralhar.add("Porta incorreta...");
		embaralhar.add("Porta correta!");		
		
		
			do {
				Narrar("\n\n1- Porta a sua esquerda.\n2- Porta do meio.\n3- Porta a sua direita.\n4- Porta atr�s de voc�.\n");
				Collections.shuffle(embaralhar);
				
				escolha1 = input.nextInt();
				
					switch (escolha1) {
					
					case 1 : 
						if (embaralhar.get(0).equals("Porta correta!")) {
						Narrar("\nEscolheu bem, prossiga!");
							teste = true;
							break;
						} else {
							Narrar("\n*Voc� escolheu uma porta incorreta, atr�s dela havia uma armadilha que te eletrocutou*\n");
							hp = hp-49;
							System.out.println("Sofreu 49 de dano. HP: " + hp);
							break;							
						}
						
					case 2 : 
						if (embaralhar.get(1).equals("Porta correta!")) {
							Narrar("\nEscolheu bem, prossiga!");
							teste = true;
							break;
						} else {
							Narrar("\n*Voc� escolheu uma porta incorreta, atr�s dela havia uma armadilha que te queimou*\n");
							hp = hp-49;
							System.out.println("Sofreu 49 de dano. HP: " + hp);
							break;
						}	
						
					case 3 : 
						if (embaralhar.get(2).equals("Porta correta!")) {
							Narrar("\nEscolheu bem, prossiga!");
							teste = true;
							break;
						} else {
							Narrar("\n*Voc� escolheu uma porta incorreta, atr�s dela havia uma armadilha que te queimou*\n");
							hp = hp-49;
							System.out.println("Sofreu 49 de dano. HP: " + hp);
							break;		
						} 
						
					case 4 : 
						if (embaralhar.get(3).equals("Porta correta!")) {
							Narrar("\nEscolheu bem, prossiga!");
							teste = true;
							break;
						} else {
							Narrar("\n*Voc� escolheu uma porta incorreta, atr�s dela havia uma armadilha que te perfurou*\n");
							hp = hp-49;
							System.out.println("Sofreu 49 de dano. HP: " + hp);
							break;							
						}
					}
					
					if (hp<10) {
						
						do {
						Narrar("\n1- Porta a sua esquerda.\n2- Porta do meio.\n3- Porta a sua direita.\n4- Porta atr�s de voc�.\n5- Observar atentamente...\n");
						resposta = entradaDados();
						} while (resposta!=5 && resposta!=1 && resposta!=2 && resposta!=3 && resposta !=4);
						
						if (resposta==5) {
							Narrar("\n*Voc� identifica pelo v�o de uma das portas que ela n�o tem os sensores lazer que ativam as armadilhas...\n"
									+ "Voc� atravessa a porta com sucesso e encontra Vexon.*\n");
							teste = true;
							break;
							
						}	
					}	
			} while (!teste && hp>0);	
		
			if (hp<=0) {
				Narrar("\nVoc� morreu...\nRetornando ao menu...\n");
				menu();				
			}
						
			
		//AP�S PASSAR DO DESAFIO DAS PORTAS
		Narrar("\n\nVexon: \"Voc� conseguiu, Ellora. Passou por tudo aquilo para chegar at� aqui.\n"
				+ "Se me permite, quero te apresentar OniricMancer daqui da Torre. Venha comigo.\n");
		
		Narrar("De onde ele surgiu??\n");
		Narrar("1. Eu acho que dispenso um passeio, Vexon. Eu realmente preciso achar a sala em que minhas memórias estão o mais rápido possível, sabe...\n");
	    Narrar("2. Eu não tenho tempo para isso.\n");
	    escolha2 = entradaDados();
		
	    if(escolha2 ==1) {
	           Narrar("Vexon: \"Querida... não há tempo perdido aqui. Não se preocupe, a sala com suas lembranças também anseia a sua chegada haha!\n");
	    }
	    else if(escolha2 == 2) {
	    	   Narrar("Vexon: \"E eu tentaria colaborar com quem me ajudou em OniricMancer, [N O M E].\n");
	    }
	    
	    Narrar("Só segue ele logo. Vai!\n");
	    Narrar("*[Nome] é levada por corredores que parecem infinitos e cheios de luzes que confudem as direções. Ela definitivamente precisa do Vexon pra achar a sala.*\n");
	    Narrar("Vexon: \"Aqui, leitura de biometria. A sua não vai passar, na verdade a sua vai emitir um chamado pela cidade toda sobre a sua localização."
	    		+ " Não queremos isso certo [Nome]?\n"
	    		  + "Por que ele tem acesso bem aqui na Torre Neon de OniricMance? Achei que só era um comerciante.\n");
	    
	    do {
	           Narrar("1. Como entro com vc aí?\n");
	           escolha3 = entradaDados();
	           
	           if (escolha3 == 1) {
	        	   Narrar("Vexon: \"Você sabe, [Nome]. Confirmando sua identidade novamente. Vai ter que usar a entrada de segurança que normalmente é pra quando um dos funcionários \r\n"
	        	   		+ "perde os membros da mão em alguma batalha e não se regenerou ainda, aí não pode fazer a leitura da digital e blá blá blá. Algo assim!\"\r\n"                          //////ajustar texto/////////////////
	        	   		+ "\r\n"
	        	   		+ "QUE??????\n");
	           }
	           else {
	        		   Narrar("Entrada inv�lida, acho que voc� deveria prestar mais aten��o...\n");
	           }
	    
	    
	     } while (escolha3 != 1);
	    
	    
	    Narrar("Vexon: \"Voilà! Entre.\n"
	    		+"*Vexon fechou com força a porta daquela sala e deu um sorrisinho satisfeito com o barulho que isso fez. [Nome] não tinha nenhuma saída agora.*\n");
	    Narrar("\r\n"
	    		+ "*Ao olhar para dentro da sala, algo surpreendente foi visto. Colunas infinitamente altas e extensas ocupavam todos os cantos. As colunas estavam preenchidas \r\n"
	    		+ "por cubos de algo que parecia ser o que? Cristais? Não se sabe, [Nome] definitivamente nunca tinha visto nada igual. Enquanto isso robôs de formatos muito bizarros \r\n"
	    		+ "trocavam os cubos por outros o tempo todo.\n*");
	    
	    Narrar("Vexon: Bem vinda ao coração de OniricMancer. Você ainda irá conhecer o cérebro daqui, é o seu destino final. Mas aqui com certeza é o coração.\n");
	    
	    do {
	            Narrar(" 1. É lindo, eu não sei o que são essas coisas mas... é lindo!\n");
	            escolha4 = entradaDados();
	    
	            if(escolha4 == 1) {
	                	Narrar("Vexon: \"Essas coisas são as memórias de pessoas como você. Nosso combustível, [Nome]. Sabe, memórias são como variáveis em um programa. Espaços preenchidos \r\n"
	    		      	+ "a todo momento por valores. Por novas lembranças. Exatamente do que OniricMancer precisa.\"\r\n"
	    		     	+ "\r\n"
	    		    	+ "Muito legal uhum, agora a gente precisa achar a sala.\n");
	           }else {
	    	         Narrar("Entrada inv�lida, acho que voc� deveria prestar mais aten��o...\n");
	          }
	    } while (escolha4 != 1);
	    
	    
	    Narrar("Vexon: Essas coisas são as memórias de pessoas como você. Nosso combustível, [Nome].\n"
	    		+ "Sabe, memórias são como variáveis em um programa. Espaços preenchidos a todo momento por valores.\n"
	    		+ "Por novas lembranças. Exatamente do que OniricMancer precisa.\n\n"
	    		+ "Muito legal uhum, agora a gente precisa achar a sala.\n");
	    
	    do {
	    	Narrar("1. Hm, interessante. Eu espero que as minhas memórias não tenham virado isso aí ainda ha ha ha. Não é?!");
	    	escolha5 = entradaDados();
	    	if(escolha5 == 1) {
	    		Narrar("Vexon: VoCê nÃo PoDe sAiR dE oNiRiCmAnCeR\"\r\n"
	    				+ "\r\n"
	    				+ "Ah não... ");
	    		}else {
	    			Narrar("Entrada inv�lida, acho que voc� deveria prestar mais aten��o...\n");
	    		}
	    } while(escolha5 !=1);
	    
	    Narrar("Ah não... \n");
	    
	    
	    
	    do {
	    	escolha6=0;
	    	
	    	if(arma ==1) {
	    		Narrar(" 1. Atirar em Vexon | 2. Não fazer nada\n");
	    		escolha6 = entradaDados();                                          
	    		
	    	}
	    	else if(arma==2) {
	    		
	    			Narrar("1. Atacar Vexon com a Katana | 2. Não fazer nada\n");
	    			escolha6 = entradaDados();
	    		
	    	}else {
    			Narrar("Entrada inv�lida, acho que voc� deveria prestar mais aten��o...\n");
	    		
	    	}
	    } while (escolha6 !=1 || escolha6 !=2);
	    
	    if(escolha6 == 1) {
	    	 Narrar("Vamos, tem uma passagem por aqui!\r\n"
	  		+ "\r\n"
	  		+ "*Vexon só era mais um para impedir [Nome] de voltar ao seu mundo primário... Agora o cérebro de OniricMancer é o destino final.*\r\n"
	  		+ "\r\n"
	  		+ "*A passagem dava direto para a sala onde com certeza estaria o que ela precisa. Uma tela gigante que ocupava as quatro paredes do\r\n"
	  		+ "ambiente é a tela do computador principal desse lugar.*\n"); 
	    }
	    else if (escolha6 == 2) {
	    	Narrar("*Vexon mirou em seu ombro mas a bala passou de raspão.*\n");
	    }
	    
	    Narrar("[Nome], tem um teclado ali.\r\n"
	    		+ "\r\n");
	    Narrar("Aperte uma tecla qualquer do alfabeto:");
	    
	    Narrar("usuário deve digitar a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y ou z\n");
	    escolha7 = entradaDados();
	    ////////////////////////////////////////////////////////////////////////////////////////////////teste//////////////////////////////////////////////////////////////////////////////////////
	    Narrar("*A tela ligou e iluminou todo o local, cercando [Nome]. Apareceu \"usuário: e senha: \n");
	    
	    Narrar("Ai isso era óbvio né?\r\n"
	    		+"O seu usuário deve ser aquilo que a Caveira ciborgue te chamou: Prototype - alguma coisa...\n");
	    Narrar("*Digite o nome de usuário de [Nome]: *\n");
	    
	     
	    
		String password = "123456";
	    
	    
		do { 
				Narrar("*Digite o nome de usuário de [Nome]: *\n");
				login = input.next();
			
			if (login.equalsIgnoreCase(user) )
				Narrar("Ok, agora a senha... \n");
				teste = true;
		
		
		} while (!teste);
		
		
		Narrar("*Assim que [Nome] tentou digitar algo em \"Senha\" um holograma azul de uma mulher apareceu*\r\n"
				+ "\r\n"
				+ "Cortana: Oi! Meu nome é Cortana. Sim, eu já sei o que você quer e sinceramente? Vou agilizar pra você. Eu sei pelo que você passou. \r\n"
				+ "É na verdade a segunda pessoa que vejo conseguir chegar até aqui, parabéns.\r\n"
				+ "\r\n"
				+ "Cortana: Eu não posso deixar tão fácil mas você vai precisar resolver um desafio e aí sim eu te passo sua senha, ok? Vai, vai ser \r\n"
				+ "legal! Aproveite seus últimos momentos aqui. ");
		
	   
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////(colocar um desafio de campo minado aqui (?) ou qlqr outro que o enunciado peça de conteúdo)////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		
		do {
			Narrar("Cortana: [Nome], é isso! Eu acho que você não suportaria passar mais cinco minutos em OniricMancer, não é? Haha. Esse lugar também tem me \r\n"
					+ "torrado a paciência, sabe? É todo mundo tão chato!\r\n"
					+ "\r\n"
					+ "1. Obrigada, Cortana.");
			escolha8 = entradaDados();
	    	if(escolha8 == 1) {
	    			Narrar("Cortana: Imagina. Quando você se for não vai se lembrar que esteve aqui e é bem melhor assim. Hm, tchau!\n");
	    		}else {
	    			Narrar("Entrada inv�lida, acho que voc� deveria prestar mais aten��o...\n");
	    		}
	    } while(escolha8 !=1);
		
		Narrar("Adeus, OniricMancer\n");
		
	}
		//////////////////////////////////////////////////Epílogo////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		public static void Epílogo() throws InterruptedException { 
	    Scanner input = new Scanner(System.in);
		int escolha1, escolha2;	
		
		// HIST�RIA
		
		Narrar("EPÍLOGO - Mundo primário\n");
		do{
			Narrar("1. Abrir os olhos\n");
			escolha1 = entradaDados();
			if(escolha1 == 1) {
				Narrar("Vozes ao fundo: Ela acordou!\n");
		
			}else {
					Narrar("Entrada inv�lida, acho que voc� deveria prestar mais aten��o...\n");
		}
		
		}while(escolha1 !=1);
		

		Narrar("*A luz da janela ao lado irritou os olhos. O tanto de fios ligados ao seu braço e o cheiro de hospital também estava desconfortável. Mas,\r\n "
		+"aquilo era melhor do que o sonho esquisito que [Nome] teve por tanto tempo.*\n");

		Narrar("*FIM*");

		//_________________________|OniricMancer|_________________________
			
	}
	
		
		
		
		
	
	//CR�DITOS ******************************************************************************************************************************************************	
	public static void credits() throws InterruptedException {
		
		//VARIAVEIS
		
		Scanner input = new Scanner(System.in);
		
		int voltar;
		
		//CREDITOS
		
		Narrar("Desenvolvido por: \n- Bruna Gomes\n- Lucas Oliveira\n- Mateus Brito\n- Ramon Nogueira\n- William Mazotti\n\n");
		Narrar("Agradecimentos: \n- Professor Takeo, por todo o apoio durante o projeto.\n- Colegas de classe, pela contribui��o com d�vidas e conte�do.\n- SENAC, pela estrutura.");
		System.out.println("\n\nDeseja voltar ao menu? \n 1 - Sim | 2 - N�o");
		voltar = input.nextInt();

		if (voltar == 1) {
			menu();
		} else {
			System.exit(0);
		}

	}
	
	//INSTRU��ES ******************************************************************************************************************************************************

	public static void instrucoes() throws InterruptedException {
		
		//VARIAVEIS
		
		Scanner input = new Scanner(System.in);
		
		int voltar;
		
		//INSTRUCOES
		
		Narrar("As op��es de escolha ser�o sempre identificadas em '1', '2' ou '3'. Digite a op��o desejada para prosseguir.");
		System.out.println("\n\nDeseja voltar ao menu? \n 1 - Sim | 2 - N�o");
		voltar = input.nextInt();

		if (voltar == 1) {
			menu();
		} else {
			System.out.println("\nAt� logo!");
			System.exit(0);
		}

	}

	// FUN��ES AUXILIARES **********************************************************************************************************************************************
	
	//FUN��O DE ATRASO NAS SA�DAS
	
	public static void pause(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			System.err.format("IOException: %s%n", e);
		}
	}
	
	//FUN��O PARA TRANSFORMAR STRINGS EM CADEIA DE CARACTERES E EXIBIR UM A UM.
	
	public static void Narrar(String mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			pause(narrador);
		}
	}
	
	//FUN��O PARA ENTRADA DE DADOS (INT)
	
	public static int entradaDados() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		return n;
	}
	
}