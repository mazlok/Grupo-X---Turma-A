
//public class ProjetoFinal {

//}

import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

class ProjetoFinal {

	// VARIAVEIS GLOBAIS
	static int narrador = 0; // ATRASO NAS FALAS DO NARRADOR, 0 PARA TESTES RÁPIDOS - 35 PARA JOGAR.
	static int arma = 0; // 1 = SHOTGUN // 2 = KATANA.
	static int hp = 100; // VIDA DA PERSONAGEM, PARA REDUZIR EM DESAFIOS

	public static void main(String[] args) throws InterruptedException {
		// TELA INICIAL
		// ******************************************************************************************************************************************************

		// VARIAVEIS
		int escolha = 1;

		// TELA INICIAL
		Narrar("________________| OniricMancer |__________________\r\n" + "\r\n"
				+ "Ei..........Você está aí?.......\r\n" + "Consegue me ouvir?..... Abra os olhos.......");
		do {

			Narrar("\n1 - Abrir | 2 - Esperar um pouco e abrir | 3 - Não\n");
			escolha = entradaDados();

			if (escolha == 1) {
				Narrar("\nObrigada. É que você precisa sair daqui... Hmmm... U R G E N T E. Vamos lá!\n");
			} else if (escolha == 2) {
				pause(100);
				Narrar("\nObrigada. É que você precisa sair daqui... Hmmm... U R G E N T E. Vamos lá! \n");
			} else if (escolha == 3) {
				Narrar("\nVocê precisa da minha ajuda... Confie em mim!\n");
			}

		} while (escolha != 1 && escolha != 2 && escolha != 3);

		menu();
	}

	// MENU PRINCIPAL
	// ******************************************************************************************************************************************************

	public static void menu() throws InterruptedException {

		// VARIAVEIS
		int opMenu;

		// MENU
		do {
			System.out.println("\n1 - INSTRUÇÕES \n2 - JOGAR \n3 - CRÉDITOS\n4 - SAIR");
			opMenu = entradaDados();
			switch (opMenu) {
			case 1:
				instrucoes();
				break; // IR PARA O MÉTODO instrucoes()
			case 2:
				cap1();
				break; // IR PARA O MÉTODO cap1()
			case 3:
				credits(); // IR PARA O MÉTODO credits()
				break;
			case 4:
				System.out.println("Obrigado por jogar, até a próxima!");
				System.exit(0); // ENCERRAR A EXECUÇÃO
				break;
			default:
				Narrar("\nOpção inválida, digite novamente: ");
			}
		} while (opMenu != 1 && opMenu != 2 && opMenu != 3);
	}

	// INICIO CAPITULO 1
	// ******************************************************************************************************************************************************

	public static void cap1() throws InterruptedException {

		// VARIAVEIS

		Scanner input = new Scanner(System.in);

		int escolha1, escolha2, escolha3, escolha4, escolha5, escolha6, cont = 3;

		String resposta;

		// HISTORIA

		Narrar("Capítulo I - OniricMancer - O mundo do Sonho Paradoxal\r\n"
				+ "												\r\n"
				+ "Tente lembrar o seu nome pelo menos, qual era mesmo?\r\n" + "\r\n");
		do {
			Narrar("1. Ellora\n");
			escolha1 = entradaDados();

			if (escolha1 == 1) {
				Narrar("Ok, Ellora, vamos lá. Ainda bem que você acordou. Quer saber o que está acontecendo ou \r\n"
						+ "quer fugir na escuridão? \r\n" + "\r\n");
			} else {
				Narrar("Escolha uma opção válida!\n");
			}
		} while (escolha1 != 1);

		do {

			Narrar("1 - Eu não estou entendendo nada. Porque a sua voz é igual a minha e não consigo te ver? Que lugar é esse?\n");
			escolha2 = entradaDados();

			if (escolha2 == 1) {
				Narrar("Ellora... Você precisa sair daqui pois não pertence a este lugar. Não posso dar muitos detalhes mas é \r\n"
						+ "como se você estivesse em um sonho REM. Mas não só a sua imaginação, entende? ... Uma cópia do seu físico T A M B É M! \r\n"
						+ "Aqui é OniricMancer, um mundo secundário. Esse lugar só sobrevive porque pessoas como você não conseguem achar a saída.\n\nSaiba que "
						+ "provavelmente não irá se lembrar de muito além do próprio nome e de mim, sua consciência, que estou tão confusa quanto você.\n\nConsegue ver "
						+ "aquela torre brilhante e neon no horizonte?\nVocê precisa chegar até lá e recuperar suas lembranças, estão todas criptografadas em uma pasta! \n\n");
			} else {
				Narrar("Escolha uma opção válida! \n");
			}
		} while (escolha2 != 1);

		do {
			Narrar("1 - Minha consciência? Ok né... Como farei isso? O que encontrarei no caminho? | 2 - Eu não sei se consigo!\n");
			escolha3 = entradaDados();

			if (escolha3 == 1) {
				Narrar("Encontrará inimigos que tentarão te atrasar. Suas emoções e medos criam vida cibernética aqui. Tentarão te hackear\n"
						+ "modificar suas lembranças, apagar os dados do seu subconsciente! Vem, tenho um lugar pra te mostrar que vai te\n"
						+ "ajudar a se proteger.\n\n");
			} else if (escolha3 == 2) {
				Narrar("Ellora, quer ficar presa com entidades cibernéticas que apagarão qualquer resquício de dados do seu ser e nunca mais voltar \r\n"
						+ "para o seu mundo primário? Vem logo! Tenho um lugar pra te mostrar que vai te ajudar a se proteger.\n\n");
			} else {
				Narrar("Escolha uma opção válida!\n");
			}
		} while (escolha3 != 1 && escolha3 != 2);

		Narrar("\n*Você e sua consciência passam por uma rua muito familiar de sua infância mas bastante alterada, como se fossem hologramas falhando.\n"
				+ "É um beco escuro e com luzes coloridas piscando. Uma estranha sensação de que aquilo respira também... Ao chegar numa portinha pequena\n"
				+ "e cheia de fios conectados a uma tela, um homem com uma cicatriz que cobria toda a sua careca, olhos de led vermelho e corpo multilado\n"
				+ "por peças de cibertecnologia, apareceu.*\n\n"
				+ "Vexon: \"Olá... quanto tempo não recebemos uma visita aqui! Meu nome é Vexon, muito prazer. Veja bem...por segurança preciso que você resolva\n"
				+ "um desafio para descobrir a senha que abre esta porta. Sabe como é... muitos androids tentam acabar com o meu comércio... Eu só quero\n"
				+ "ajudar quem vem aqui perdido e sem lembranças, entende? E eles querem impedir isso, se alimentam dos que aqui ficam presos.\n");
		Narrar("Vexon: \"Resolva o seguinte puzzle e o resultado, se correto, abrirá a porta a sua frente!\"\n");
		do {
			Narrar("\nEscreva um comando em linguagem Java que imprima a frase \"Abrir porta a frente\"\nR: ");
			resposta = input.nextLine();

			if (resposta.contains("System.out.print(\"Abrir porta a frente\");")
					|| resposta.contains("System.out.println(\"Abrir porta a frente\");")) {
				Narrar("\nVexon: \"É isso! Eu sabia que você era apenas uma alma perdida neste universo! Pode passar, venha. Escolha suas armas, Ellora!\"");
			} else {
				Narrar("Vexon: \"Sinto muito querida...\"");
				cont--;
				System.out.println("\nTentativas restantes: " + cont);
			}

			if (cont == 0) {
				Narrar("*Você não conseguiu provar sua inocência para Vexon, logo, não poderá sair deste mundo.*\n");
				System.out.println("\nFIM DE JOGO");
				Narrar("\nRedirecionando ao menu................\n");
				menu();
			}

		} while (!(resposta.contains("System.out.print(\"Abrir porta a frente\");")
				|| resposta.contains("System.out.println(\"Abrir porta a frente\");") || cont == 0));

		do {
			Narrar("\n\n1. Uma alma o que?... Eu sou o que??????\n");
			escolha4 = entradaDados();

			if (escolha4 == 1) {
				Narrar("\nVexon: \"Nada, entra logo!\"\n");
			}

			else {
				Narrar("\nEntrada inválida, acho que você deveria prestar mais atenção....");
			}
		} while (!(escolha4 == 1));

		Narrar("\nVexon: \"Aqui, essas são as que mais gosto. Guardei para quando alguém especial como você chegasse! Como prefere buscar sua liberdade? "
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
				Narrar("\nEntrada inválida, acho que você deveria prestar mais atenção....");
			}
		}

		while ((escolha5 != 1) && (escolha5 != 2));

		Narrar("\nVexon: \"Bom... é... você não parece saber usar essas coisas, você sabe né?\n"
				+ "Não responde, vamos sair logo daqui!\"\n");
		Narrar("\nVexon: \"Espere! Um momento. Onde será que deixei?... AH! Aqui está! Pegue esta capa de chuva, acredite, vai precisar neste mundo! "
				+ "\nHá duas Adagas capazes de hackear sistemas no bolso da capa, use somente em casos de extrema necessidade. Podem salvar a sua vida.\"");

		do {
			Narrar("\n\n1. Obrigada, Vexon. Tenha um bom dia amanhã.\n");
			escolha6 = entradaDados();
			if (escolha6 == 1) {
				Narrar("\nVexon: \"Aqui só há noite, minha querida... Os melhores sonhos acontecem depois que o sol se põe...\"");
			}

			else {
				Narrar("\nEntrada inválida, acho que você deveria prestar mais atenção....");
			}
		}

		while (escolha6 != 1);

		cap2();

	}

	////////////////////////////////////////////////////////////
	// INICIO CAPITULO
	//////////////////////////////////////////////////////////// 2******************************************************************************************************************************************************
	///////////////////////////////////////////////////////////

	public static void cap2() throws InterruptedException {

		// VARIAVEIS

		Scanner input = new Scanner(System.in);

		int escolha1, escolha2, escolha3, escolha4, escolha5, escolha6, escolha7, escolha8, escolha9, escolha10,
				escolha11, escolha12, cont = 3, cont2 = 3;

		String resposta;

		// HISTORIA

		Narrar("\n\nCapítulo II - OniricMancer - Escolhas\n");

		Narrar("\n*Após uma longa caminhada por OniricMancer e seus estranhos, porém familiares para Vexon, labirintos: algo suspeito parece\n"
				+ "se aproximar. O céu escuro como de costume, agora está envolto num quadriculado verde neon. A torre brilhante que é o destino final,\n"
				+ "sumiu no horizonte, foi coberta pela pesada chuva que despencava. Seria até bonito admirar algo tão diferente se não fossem os...*\n");

		Narrar("\nEi..." + "\nEI!" + "\nCUIDADO!\n");

		Narrar("\n*Sua consciência te alertou e agora vocês se encontram rodeadas de criaturas bizarras. Um exército de Caveiras ciborgues de olhos azuis e "
				+ "\nsurpreendentemente brilhantes! Algumas estão armadas com tridentes elétricos e outras carregam fuzis de energia.*\n");

		Narrar("\nA gente é uma só mas eu sou a parte mais importante do seu ser, vê se me protege, viu? Eles estão aqui pra nos levar e me apagar por "
				+ "\ncompleto, só querem sua consciência. OniricMancer só funciona porque os que vem parar aqui e não conseguem sair tem sua consciência\n"
				+ "reduzida a meros kbytes de dados e eu já te expliquei isso.\nAgora vamos tentar pensar em uma rota de fuga! Olha em volta DEVAGAR e não se mexe!\n");

		do {
			Narrar("\n1. Parar | 2. Correr\r\n");
			escolha1 = entradaDados();

			if (escolha1 != 1 && escolha1 != 2) {
				Narrar("\nEntrada inválida, acho que você deveria prestar mais atenção...\n");
			}
		} while ((escolha1 != 1) && (escolha1 != 2));

		if (escolha1 == 2) {
			Narrar("*Por ter corrido sem uma estratégia, você foi capturada pelo exército e agora precisa rapidamente escapar no momento\n"
					+ "em que as caveiras estão registrando seus dados em uma das diversas salas de servidores de OniricMancer. Para conseguir \n"
					+ "fugir você terá que passar por um desafio. Se errar a resposta nunca mais acordará em seu mundo primário.*\r\n");

			Narrar("\nMeu deus eu te avisei, Ellora. Agora estamos aqui e sem saída, parabéns!\r\n"
					+ "\n*Escolha, usando a lógica, a sequência de passos a seguir para sair da sala de servidores sem ser impedida por \n"
					+ "nenhuma caveira robô.*\r\n");

			Narrar("> Na sala em que você está há 3 Caveiras Ciborgues.\n"
					+ "> À sua esquerda há uma escada que leva a uma outra sala vigiada por um dos inimigos que de lá não tem visão sobre você e nem você sobre ele. \n"
					+ "> Às suas costas há uma Caveira Ciborgue concentrada na programação em um dos computadores da sala de servidores. Você consegue ver que está\n "
					+ "perto do termostato que controla a temperatura da sala. Consegue ver também que a Caveira está digitando algo como 'Captura do Prototype-305'\n"
					+ "> À sua direita há uma porta vigiada por uma Caveira Ciborgue armada com um tridente mas que está cochilando. Ela está com a sua arma.\n"
					+ "> Acima de você, há uma câmera no teto.\n");

			do {
				Narrar("\nObs 1: Se for vista pela câmera tentando fugir, alertará as outras salas com diversos inimigos."
						+ "\nObs 2: O termostato previne que o calor superaqueça as máquinas (incluindo as caveiras).\n\nO que você irá fazer ?\r\n"
						+ "\nVocê tem 4 saídas, escolha uma, mas escolha com sabedoria.\n");
				if (arma == 1) {
					Narrar("\n[1] SAÍDA 1: Correr até o inimigo que está cochilando, pegar sua arma rapidamente, tentar abrir a porta e fugir.\r\n"
							+ "\n[2] SAÍDA 2: Andar devagar até a porta em que se encontra o inimigo cochilando, pegar sua Shotgun cuidadosamente, atirar\r\n"
							+ "no termostato. Assim, a bala de sua Shotgun Hack irá alterar a temperatura para uma bem mais elevada,\nsuperaquecendo todas as máquinas da sala,"
							+ "depois fugir.\n"
							+ "\n[3] SAÍDA 3: Andar devagar até a porta em que se encontra o inimigo cochilando, pegar sua Shotgun, atirar \r\n"
							+ "na câmera e em seguida no termostato. Assim, a bala de sua Shotgun Hack irá alterar a temperatura para uma bem mais elevada,\nsuperaquecendo"
							+ "todas as máquinas da sala. Depois fugir.\n"
							+ "\n[4] SAÍDA 4: Correr até o inimigo que está cochilando, pegar sua arma, atirar em todos as Caveiras Robôs, na câmera e em seguida, no Termostato.\r\n"
							+ "Assim, a bala de sua Shotgun Hack irá alterar a temperatura para uma bem mais elevada, superaquecendo todas as máquinas da sala. Depois fugir.");
				} else if (arma == 2) {
					Narrar("\n[1] SAÍDA 1: Correr até o inimigo que está cochilando, pegar sua arma rapidamente, tentar abrir a porta e fugir.\r\n"
							+ "\n[2] SAÍDA 2: Pegar a Kunai Hacker do bolso de sua capa de chuva e lançá-la no termostato. Assim, irá alterar a temperatura"
							+ "\npara uma bem mais elevada, superaquecendo todas as máquinas da sala. Depois tentar fugir.\n"
							+ "\n[3] SAÍDA 3: Andar devagar até a porta em que se encontra o inimigo cochilando, pegar sua Katana cuidadosamente, lançar a lâmina"
							+ "\nna câmera e em seguida a Adaga Hacker no termostato. Assim, irá alterar a temperatura para uma bem mais elevada, superaquecendo."
							+ "\ntodas as máquinas da sala. Depois tentar fugir.\n"
							+ "\n[4] SAÍDA 4: Correr até o inimigo que está cochilando, pegar sua Katana, atacar todas as Caveiras Robôs, e em seguida, mirar uma Adaga Hacker"
							+ "\nna câmera e outra no termostato.\nAssim, irá alterar a temperatura para uma bem mais elevada, superaquecendo todas as máquinas da sala. Depois fugir.\n");
				}
				Narrar("\n\nQual saída você deve escolher para sair viva?\n");
				escolha3 = entradaDados();
				switch (escolha3) {
				case 1:
					Narrar("Ao pegar sua arma e tentar abrir a porta, você percebe que a mesma está travada por algum sistema. Infelizmente você está\n"
							+ "presa e agora OniricMancer sabe qual era o seu objetivo, você agora é uma presa fácil pra eles e nunca mais voltará a sua vida normal, em seu mundo\n"
							+ "primário..." + "\nFIM DE JOGO");
					menu();
					break;
				case 2:
					Narrar("Ao acertar o termostato, hackeando-o para aumentar sua temperatura e danificar os servidores, você se esqueceu de um detalhe\n"
							+ "importante. A câmera acima de você continua intacta, e enviou um alerta para que mais Caveiras Robôs chegasse ao local para impedir sua fuga."
							+ "E OniricMancer sabe qual era o seu objetivo, você agora é uma presa fácil pra eles e nunca mais voltará a sua vida normal, em seu mundo"
							+ "primário..." + "\nFIM DE JOGO");
					menu();
					break;
				case 3:
					Narrar("Os dois inimigos na sala se distrairam com os estragos para tentar consertar e dando assim, uma passagem para sua\r\n"
							+ "fuga... Porém... A Caveira Ciborgue que estava na sala a cima conseguiu te alcançar. E OniricMancer sabe qual era o seu objetivo, você agora \r\n"
							+ "é uma presa fácil pra eles e nunca mais voltará a sua vida normal, em seu mundo primário...\r\n\n"
							+ "FIM DE JOGO");
					menu();
					break;
				case 4:
					Narrar("*Você conseguiu! Pensou em uma saída lógica e pode retornar para seu objetivo principal. Danificou o servidor e todos os sistemas, liberando a porta\n"
							+ "e ganhando tempo para chegar até a Torre Neon, recuperar suas lembranças e sair de OniricMancer.*\n\n"
							+ "Caveira Ciborgue: \"Parabéns, saiu e DESTRUIU nossa sala de servidores. Agora, aonde pensa que vai?\"\n\n");
					break;
				default:
					Narrar("\nEntrada inválida, acho que você deveria prestar mais atenção...\n");
				}
			} while ((escolha3 != 1) && (escolha3 != 2) && (escolha3 != 3) && (escolha3 != 4));
		} else if (escolha1 == 1) {
			Narrar("Caveira Ciborgue Major: \"Se renda, não há mais para onde ir e você sabe que sua vida já chegou ao fim. Você sabe o que te aconteceu em "
					+ "seu mundo primário\"\r\n");
			Narrar("\nNão, não vamos dar ouvidos a ele. Não é verdade!\r\n");
		}

		do {
			Narrar("\n1. O que aconteceu comigo? Eu não consigo lembrar, eu... eu preciso ir até aquela Torre resgatar minhas lembranças!\r\n");
			escolha2 = entradaDados();
			if (escolha2 != 1) {
				Narrar("\nEntrada inválida, acho que você deveria prestar mais atenção...\n");
			}
		} while (escolha2 != 1);

		Narrar("Caveira Ciborgue General: \"Se você veio parar aqui, é porque não há mais nada para você lá fora. Aceite seu destino.\"\r\n"
				+ "\nNão, não e NÃO! Irão te destruir, Ellora. Precisam te destruir para criar novas variáveis e continuar alimentando \n"
				+ "todas essas realidades doentias do universo. Lá fora não é o melhor lugar, mas quando você recuperar \n"
				+ "suas lembranças, vai ver que vale a pena viver.\r\n");
		do {
			Narrar("\n1. Não quero contribuir para vocês continuarem brincando de marionete com nossas vidas!\n2. Não vejo outra opção a não ser destruir vocês!\n");
			escolha4 = entradaDados();
		} while (escolha4 != 1 && escolha4 != 2);

		Narrar("\nCaveira Ciborgue Major: \"Você fez uma péssima escolha, Prototype-305. Desfrute de seu requiem aeternam. ATACAR!\"\n"
				+ "\nMeu deus, o que foi que ele falou????\n");
		do {
			Narrar("\n*Use sua arma e tente se proteger!*\n" + "\n1. Atacar | 2. A T A C A R!\n");
			escolha5 = entradaDados();
		} while (escolha5 != 1 && escolha5 != 2);

		if (escolha5 == 1 || escolha5 == 2) {
			if (arma == 1) {
				Narrar("*Você mirou sua Shotgun no brilhante olho azul da Caveira Ciborgue Major e puxou o gatilho!\nViu seus miolos explodirem algo "
						+ "entre fumaça, peças de tecnologia e sangue humano e repetiu o mesmo com aqueles que se aproximavam para te golpear*");
			} else if (arma == 2) {
				Narrar("*Você notou que o pescoço é uma das únicas partes sem peças de cibertecnologia cobrindo o corpo desses inimigos\ne em um único golpe decapitou"
						+ " a Caveira Ciborgue Major. Quanto mais se aproximavam, mais cabeças rolavam!*\n");
			} else {
				Narrar("\nEntrada inválida, acho que você deveria prestar mais atenção...");
			}
		}
		Narrar("\n\nEscuta, Ellora, eu tive uma ideia. Eu não sei se você aguenta continuar lutando, eles não parecem com vontade de desistir! "
				+ "\nEstão determinados a impedir que você chegue na Torre e recupere sua memória.\r\n");

		Narrar("\n*Enquanto luta pela sua vida, mais e mais inimigos chegam para te capturar e a chuva fica mais forte.\nVocê dificilmente conseguirá "
				+ "aniquilar todos com apenas as armas que possui.\nEntão, você percebe que o quadriculado verde no céu é um campo de força quando "
				+ "\nalguns tiros acabam por atingí-lo mas não conseguem ultrapassá-lo, formando apenas ondas com a força da repulsão.*");

		do {
			Narrar("\n\nVamos, se esconde aqui!\n" + "\n1. Se esconder no lixo | 2. Continuar lutando\n");
			escolha6 = entradaDados();

			if (escolha6 == 2) {
				Narrar("*Você lutou até esgotar suas forças e escapou por pouco, eram muitos Ciborgues e você foi avisada.*\n");
				hp = hp - 20;
				Narrar("\nSofreu 20 de dano. HP: " + hp + "/100");
			} else if (escolha6 == 1) {
				Narrar("\nVocê viu o campo de força? Se a gente conseguisse pensar em um jeito de destruí-lo..."
						+ "\nMeu deus, é o Vexon ali?!\r\n");
			} else {
				Narrar("\nEntrada inválida, acho que você deveria prestar mais atenção...\n");
			}

		} while ((escolha6 != 1) && (escolha6 != 2));

		do {
			Narrar("\n\n1. Ei! Vexon, psiu!\n");
			escolha7 = entradaDados();

			if (escolha7 == 1 && escolha6 == 1) {
				Narrar("Vexon: \"Ora, mas eu achava que você não sabia usar essas armas. Agora tenho certeza!\"\n"
						+ "\nA GENTE SABE SIM, viu ?\r\n"
						+ "\nVexon: \"Olha, o único jeito de você sair dessa emboscada, é destruindo o campo de força. Aquele quadriculado.\n"
						+ "Olha pra cima, está vendo? Esse mesmo. Tenho aqui um arco com flechas feitas de um material extremamente condutor.\n"
						+ "Entende o que digo? São de prata. Você precisa ir para um lugar alto, muito alto, onde os raios da chuva possam alcançar.\"\r\n");
			} else if (escolha7 == 1 && escolha6 == 2) {
				Narrar("Vexon: \"Ora, até que você sabe se virar, mas comprou uma briga muito grande!\"\n"
						+ "\nA gente SABE MESMO, viu ?\r\n" + "\nSó nos empolgamos um pouco e deu meio ruim...\n"
						+ "\nVexon: \"Olha, o único jeito de você sair dessa emboscada, é destruindo o campo de força. Aquele quadriculado.\n"
						+ "Olha pra cima, está vendo? Esse mesmo. Tenho aqui um arco com flechas feitas de um material extremamente condutor.\n"
						+ "Entende o que digo? São de prata. Você precisa ir para um lugar alto, muito alto, onde os raios da chuva possam alcançar.\"\r\n");
			} else {
				Narrar("\nEntrada inválida, acho que você deveria prestar mais atenção...\n");
			}

		} while (escolha7 != 1);

		do {
			Narrar("\n1. Você quer que eu seja atingida por um raio pra conduzir eletricidade pela flecha, atirá-la no campo de força e depois MORRER?!\r\n");
			escolha8 = entradaDados();

			if (escolha8 == 1) {
				Narrar("Vexon: \"HAHAHA! Você não vai morrer, só vai sentir uma força de impacto muito grande! Essa capa de chuva que te dei\n"
						+ "te protege de coisas inimagináveis, Ellora.\"\r\n");
			} else {
				Narrar("\nEntrada inválida, acho que você deveria prestar mais atenção...\n");
			}
		} while (escolha8 != 1);

		do {
			Narrar("\n1. Ok, eu vou subir até o topo daquela torre de vidro e de lá tento alguma coisa. Me passa o arco.\n");
			escolha9 = entradaDados();

			if (escolha9 == 1) {
				Narrar("*Você percebe que a voz de Vexon ficou diferente assim como sua postura*\r\n"
						+ "\nVexon: \"VoCê PrEcIsa CoNfIrMaR SuA iDeNtIdAdE\"\n"
						+ "\nO que há de errado com ele? A gente já fez isso antes!\r\n"
						+ "\n*Para conseguir o arco de flechas prateadas de Vexon você precisa confirmar sua identidade\n"
						+ "Resolva o desafio a seguir para liberar sua arma!*\n");
			} else {
				Narrar("\nEntrada inválida, acho que você deveria prestar mais atenção...");
			}
		} while (escolha9 != 1);

		// DESAFIO DE LÓGICA

		Narrar("\nVexon: \"Vamos lá, uma mulher está prestes a ter um bebê. Se ele for menino, ficará faltando apenas mais um filho para que o número\n"
				+ "de meninos seja igual ao de meninas. No entanto, se o bebê for uma menina, o número de filhas da mulher será o dobro\n"
				+ "do número de meninos. Quantos filhos ela tem atualmente e qual o sexo deles?\"");
		do {

			System.out.println("\n\nDigite a quantidade de meninos: "); // RESPOSTA CORRETA: 3
			escolha11 = entradaDados();
			System.out.println("Digite a quantidade de meninas: "); // RESPOSTA CORRETA: 5
			escolha12 = entradaDados();

			if (escolha11 == 3 && escolha12 == 5) {
				Narrar("\n*Você decifrou com sucesso a charada de Vexon e recebeu o arco*");
			} else {
				Narrar("\nVexon: \"tEnTe nOvAmEnTe... tEnTaTiVaS ReStAnTeS: " + cont2);
				cont2--;
			}

			if (cont2 == 0) {
				Narrar("*Você não conseguiu comprovar sua identidade para Vexon e ele parou de responder."
						+ "\nAgora não há como prosseguir com seu objetivo. \n\n FIM DE JOGO. \nRetornando ao menu......");
				menu();
			}
		} while ((escolha11 != 3 && escolha12 != 5));

		// SE O DESAFIO DE LOGICA ESTIVER CORRETO:

		Narrar("\n\nVexon: \"Aqui está, boa sorte. Tenha cuidado, Ellora\"\r\n"
				+ "\n*Você percebeu que os olhos vermelhos de Vexon escureceram e ficou difícil distinguí-los da noite."
				+ "\nVexon ficou estranho, tinha algo de errado com ele.* \r\n" + "\nEle só sumiu, pra onde ele foi?\n"
				+ "Bom, sobe naquele prédio!\n");

		Narrar("\n*Ellora foi até o prédio em que decidiria sua vida. Usou caminhos escuros e sombras para se esconder e passar\n"
				+ "desapercebida pelos inimigos. Ao chegar ao imenso prédio de vidro, viu que o mesmo se encontrava abandonado \n"
				+ "e cheio de resíduos eletrônicos: cabos, monitores, armas e mais equipamentos de tecnologia\n"
				+ "nunca vistos em seu mundo primário. Era um cemitério de tudo o que OniricMancer já usou para tirar a vida de outros...*\r\n");

		Narrar("\n*Ao chegar no terraço e se deparar com a vista daquele mundo estranho e apenas conhecido há 3 horas atrás, Ellora\n"
				+ "sentiu coragem para acabar com isso e ir atrás do que lhe foi tirado: suas lembranças.*\r\n");

		Narrar("\nCaveira Ciborgue: \"Oniric Ciborgue, câmbio. Envie um chamado atrás do Prototype-305, codinome: Ellora.\n"
				+ "É urgente. Ela tem um arco, vigie o campo de força. Câmbio, desligo.\"\r\n"
				+ "\n*Ellora posicionou a flecha no arco e aguardou ansiosamente por um raio atingí-la. Ela não sabia se sobreviveria,\n"
				+ "mas o desejo de trazer mais problemas para esse mundo maluco já fazia valer a pena estar ali.\nSeus olhos se concentravam no campo "
				+ "de força a frente do céu e nada mais.*\r\n");
		do {
			Narrar("\n1\r\n" + "2\r\n" + "3\r\n" + "AGORA!\n" + "\n1. Atirar a flecha!!!\r\n");
			escolha10 = entradaDados();

			if (escolha10 == 1) {
				Narrar("*A destruição causada no campo de força estilhaçou o arranha-céu de vidro e uma luz intensa iluminou OniricMancer\n"
						+ "talvez pela primeira vez. Mesmo que só por alguns segundos...*\r\n"
						+ "\n*...Enquanto caía em direção ao chão e a cama de cacos de vidro que a aguardavam, Ellora sentiu algo lhe puxando\n"
						+ "pra cima. Uma corda? Uma corda saindo de algum carro voador*\n");
			} else {
				Narrar("\nEntrada inválida, acho que você deveria prestar mais atenção...");
			}
		} while (escolha10 != 1);

		cap3();
	}

	////////////////////////////////////////////////////////////
	// INÍCIO CAPÍTULO 3
	//////////////////////////////////////////////////////////// ******************************************************************************************************************************************************
	///////////////////////////////////////////////////////////

	public static void cap3() throws InterruptedException {

		// VARIAVEIS

		Scanner input = new Scanner(System.in);

		ArrayList<String> embaralhar = new ArrayList<String>();

		int escolha1, escolha2, escolha3, escolha4, escolha5, escolha6 = 0, escolha7, escolha8, resposta;
		String login, user = "prototype-305", desafioCores;
		boolean teste = false;

		// HISTÓRIA

		Narrar("\nCapítulo III - OniricMancer - O final\n");

		Narrar("\nMeu Deus, nós chegamos! ACORDA, Ellora. Nós chegamos!!!!!!\n");

		Narrar("\n*Você se encontra agora numa masmorra da Torre Neon de OniricMancer.\nTente achar a saída correta para procurar pelos corredores, a sala em que suas"
				+ " memórias estão criptografadas.\nEscolha cuidadosamente uma das quatro portas pois este lugar muda a posição da correta quando você escolhe a errada.*\n");
		Narrar("\nEllora, sejá lá o que estiver atrás dessas portas parece perigoso, está vendo o símbolo de perigo em cada uma delas?"
				+ "\nAcho melhor tomar cuidado para não errar muitas vezes...");

		if (hp < 100) {
			Narrar("\nComo ainda estamos machucadas daquela luta com os Ciborgues é pior...\n"
					+ "agora dependemos muito da nossa sorte!");
		}

		// DESAFIO DAS PORTAS (ARRAYLIST E COLLECTIONS)

		embaralhar.add("Porta incorreta...");
		embaralhar.add("Porta incorreta...");
		embaralhar.add("Porta incorreta...");
		embaralhar.add("Porta correta!");

		do {
			Narrar("\n\n1- Porta a sua esquerda.\n2- Porta do meio.\n3- Porta a sua direita.\n4- Porta atrás de você.\n");
			Collections.shuffle(embaralhar);

			escolha1 = input.nextInt();

			switch (escolha1) {

			case 1:
				if (embaralhar.get(0).equals("Porta correta!")) {
					Narrar("\nEscolheu bem, prossiga!");
					teste = true;
					break;
				} else {
					Narrar("\n*Você escolheu uma porta incorreta, atrás dela havia uma armadilha que te eletrocutou*\n");
					hp = hp - 49;
					System.out.println("Sofreu 49 de dano. HP: " + hp);
					if (hp <= 0) {
						Narrar("\nVocê morreu...\n\nRetornando ao menu...\n\n");
						menu();
					}
					break;
				}

			case 2:
				if (embaralhar.get(1).equals("Porta correta!")) {
					Narrar("\nEscolheu bem, prossiga!");
					teste = true;
					break;
				} else {
					Narrar("\n*Você escolheu uma porta incorreta, atrás dela havia uma armadilha que te queimou*\n");
					hp = hp - 49;
					System.out.println("Sofreu 49 de dano. HP: " + hp);
					if (hp <= 0) {
						Narrar("\nVocê morreu...\n\nRetornando ao menu...\n\n");
						menu();
					}
					break;
				}

			case 3:
				if (embaralhar.get(2).equals("Porta correta!")) {
					Narrar("\nEscolheu bem, prossiga!");
					teste = true;
					break;
				} else {
					Narrar("\n*Você escolheu uma porta incorreta, atrás dela havia uma armadilha que te cortou*\n");
					hp = hp - 49;
					System.out.println("Sofreu 49 de dano. HP: " + hp);
					if (hp <= 0) {
						Narrar("\nVocê morreu...\n\nRetornando ao menu...\n\n");
						menu();
					}
					break;
				}

			case 4:
				if (embaralhar.get(3).equals("Porta correta!")) {
					Narrar("\nEscolheu bem, prossiga!");
					teste = true;
					break;
				} else {
					Narrar("\n*Você escolheu uma porta incorreta, atrás dela havia uma armadilha que te perfurou*\n");
					hp = hp - 49;
					System.out.println("Sofreu 49 de dano. HP: " + hp);
					if (hp <= 0) {
						Narrar("\nVocê morreu...\n\nRetornando ao menu...\n\n");
						menu();
					}
					break;
				}
			}

			if (hp < 10) {

				do {
					Narrar("\n1- Porta a sua esquerda.\n2- Porta do meio.\n3- Porta a sua direita.\n4- Porta atrás de você.\n5- Observar atentamente...\n");
					resposta = entradaDados();
				} while (resposta != 5 && resposta != 1 && resposta != 2 && resposta != 3 && resposta != 4);

				if (resposta == 5) {
					Narrar("\n*Você identifica pelo vão de uma das portas que ela não tem os sensores lazer que ativam as armadilhas...\n"
							+ "Você atravessa a porta com sucesso e encontra Vexon.*\n");
					teste = true;
					break;

				}
			}

		} while (!teste && hp > 0);

		// APÓS PASSAR DO DESAFIO DAS PORTAS

		Narrar("\n\nVexon: \"Você conseguiu, Ellora. Passou por tudo aquilo para chegar até aqui.\n"
				+ "Se me permite, quero te apresentar OniricMancer daqui da Torre. Venha comigo.\"\n");
		do {
			Narrar("\nDe onde ele surgiu??\n");
			Narrar("\n1. Eu acho que dispenso um passeio, Vexon. Eu realmente preciso achar a sala em que minhas memórias estão o mais rápido possível, sabe...\n");
			Narrar("2. Eu não tenho tempo para isso.\n");
			escolha2 = entradaDados();
		} while (escolha2 != 1 && escolha2 != 2);

		if (escolha2 == 1) {
			Narrar("Vexon: \"Querida... não há tempo perdido aqui. Não se preocupe, a sala com suas lembranças também anseia a sua chegada haha!\n");
		} else if (escolha2 == 2) {
			Narrar("Vexon: \"E eu tentaria colaborar com quem me ajudou em OniricMancer, Ellora.\n");
		}

		Narrar("Só segue ele logo. Vai!\"\n");
		Narrar("\n*Ellora é levada por corredores que parecem infinitos e cheios de luzes que confudem as direções. Ela definitivamente precisa do Vexon pra achar a sala.*\n");
		Narrar("\nVexon: \"Aqui, leitura de biometria. A sua não vai passar, na verdade a sua vai emitir um chamado pela cidade toda sobre a sua localização."
				+ " Não queremos isso certo Ellora?\"\n"
				+ "\nPor que ele tem acesso bem aqui na Torre Neon de OniricMance? Achei que só era um comerciante.\n");

		do {
			Narrar("\n1. Como entro com você aí?\n");
			escolha3 = entradaDados();
		} while (escolha3 != 1);

		if (escolha3 == 1) {
			Narrar("Vexon: \"Você sabe, Ellora. Confirmando sua identidade novamente.\nVai ter que usar a entrada de segurança que normalmente é pra quando um dos funcionários"

					+ "perde os braços ou a mão em alguma batalha e não se regenerou ainda,\naí não pode fazer a leitura da digital e blá blá blá. Algo assim!\"\r\n" ////// ajustar
																																										////// texto/////////////////
					+ "\r\n" + "QUE??????\n");
			do {
				Narrar("\nResolva o desafio a seguir para conseguir entrar na sala: \n");
				Narrar("\nSe o verde é forte, o vermelho é suave.\r\n" + "Se o amarelo é suave, o azul é médio.\r\n"
						+ "Mas ou o verde é forte ou o amarelo é\r\n" + "suave. Forte, suave e médio são as únicas\r\n"
						+ "tonalidades possíveis. Logo: \n" + "\na) O azul é médio.\n"
						+ "b) Ou o vermelho é suave ou o azul é médio. \n" + "c) O amarelo e o vermelho são suaves.\n");
				desafioCores = input.next();

				if (desafioCores.equalsIgnoreCase("b")) {
					Narrar("É isso!");
				} else {
					Narrar("Hm... pensa mais um pouco! ");
				}
			} while (!(desafioCores.equalsIgnoreCase("b")));

		}

		else {
			Narrar("Entrada inválida, acho que você deveria prestar mais atenção...\n");
		}

		Narrar("\nVexon: \"Voilà! Entre.\"\n"
				+ "\n*Vexon fechou com força a porta daquela sala e deu um sorrisinho satisfeito com o barulho que isso fez. Ellora não tinha nenhuma saída agora.*\n");
		Narrar("\r\n"
				+ "*Ao olhar para dentro da sala, algo surpreendente foi visto. Colunas infinitamente altas e extensas ocupavam todos os cantos. As colunas estavam preenchidas \r\n"
				+ "por cubos de algo que parecia ser o que? Cristais? Não se sabe, Ellora definitivamente nunca tinha visto nada igual. Enquanto isso robôs de formatos muito bizarros \r\n"
				+ "trocavam os cubos por outros o tempo todo.\"\n");

		Narrar("\nVexon: \"Bem vinda ao coração de OniricMancer. Você ainda irá conhecer o cérebro daqui, é o seu destino final. Mas aqui com certeza é o coração.\"\n");

		do {
			Narrar(" \n1. É lindo, eu não sei o que são essas coisas mas... é lindo!\n");
			escolha4 = entradaDados();

			if (escolha4 == 1) {
				Narrar("Vexon: \"Essas coisas são as memórias de pessoas como você. Nosso combustível, Ellora. Sabe, memórias são como variáveis em um programa. Espaços preenchidos \r\n"
						+ "a todo momento por valores. Por novas lembranças. Exatamente do que OniricMancer precisa.\"\r\n"
						+ "\r\n" + "Muito legal uhum, agora a gente precisa achar a sala.\n");
			} else {
				Narrar("Entrada inválida, acho que você deveria prestar mais atenção...\n");
			}
		} while (escolha4 != 1);

		do {
			Narrar("\n1. Hm, interessante. Eu espero que as minhas memórias não tenham virado isso aí ainda ha ha ha. Não é?!\n");
			escolha5 = entradaDados();
			if (escolha5 == 1) {
				Narrar("\n\"Vexon: VoCê nÃo PoDe sAiR dE oNiRiCmAnCeR\"\r\n"
						+ "\n*Vexon novamente fica estranho e dessa vez aponta uma arma para você*");
			} else {
				Narrar("\nEntrada inválida, acho que você deveria prestar mais atençâo...\n");
			}
		} while (escolha5 != 1);

		Narrar("\n\nAh não... \n");

		do {
			if (arma == 2) {
				Narrar(" \n1. Atacar Vexon com a Katana | 2. Não fazer nada\n");
				escolha6 = entradaDados();
			} else if (arma == 1) {
				Narrar(" \n1. Atirar no Vexon | 2. Não fazer nada\n");
				escolha6 = entradaDados();
			}

		} while (escolha6 != 1 && escolha6 != 2);

		if (escolha6 == 1) {
			Narrar("\nVamos, tem uma passagem por aqui!\r\n" + "\r\n"
					+ "*Vexon só era mais um para impedir Ellora de voltar ao seu mundo primário... Agora o cérebro de OniricMancer é o destino final.*\r\n"
					+ "\r\n"
					+ "*A passagem dava direto para a sala onde com certeza estaria o que ela precisa. Uma tela gigante que ocupava as quatro paredes do\r\n"
					+ "ambiente é a tela do computador principal desse lugar.*\n");
		} else if (escolha6 == 2) {
			Narrar("\n*Vexon mirou em seu ombro mas a bala passou de raspão.*\n");
			Narrar("\nVamos, tem uma passagem por aqui!\r\n" + "\r\n"
					+ "*Vexon só era mais um para impedir Ellora de voltar ao seu mundo primário... Agora o cérebro de OniricMancer é o destino final.*\r\n"
					+ "\r\n"
					+ "*A passagem dava direto para a sala onde com certeza estaria o que ela precisa. Uma tela gigante que ocupava as quatro paredes do\r\n"
					+ "ambiente é a tela do computador principal desse lugar.*\n");
		}

		Narrar("\nEllora, tem um teclado ali.\r\n" + "\r\n");
		Narrar("Aperte uma tecla qualquer do alfabeto:\n");

		login = input.next();

		//////////////////////////// teste///////////////////////////////

		Narrar("\n*A tela ligou e iluminou todo o local, cercando Ellora. Apareceu uma tela de login \"usuário: e senha:\" \n");

		Narrar("\nAi isso era óbvio né? \n"
				+ "O seu usuário deve ser aquilo que a Caveira ciborgue te chamou: Prototype - alguma coisa...\n");

		do {
			Narrar("\n*Digite o nome de usuário de Ellora:*\n"); // "prototype-305"
			login = input.next();

			if (login.equalsIgnoreCase(user))
				Narrar("\n\nOk, agora a senha... \n");

		} while (!login.equalsIgnoreCase(user));

		Narrar("*Assim que Ellora tentou digitar algo em \"Senha\" um holograma azul de uma mulher apareceu*\r\n"
				+ "\r\n"
				+ "Cortana: \"Oi! Meu nome é Cortana. Sim, eu já sei o que você quer e sinceramente? Vou agilizar pra você. Eu sei pelo que você passou. \r\n"
				+ "É na verdade a segunda pessoa que vejo conseguir chegar até aqui, parabéns.\"\r\n" + "\r\n"
				+ "Cortana: \"Eu não posso deixar tão fácil mas você vai precisar resolver um desafio e aí sim eu te passo sua senha, ok? Vai, vai ser \r\n"
				+ "legal! Aproveite seus últimos momentos aqui.\"\n ");

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		/////// (colocar um desafio de campo minado aqui (?) ou qlqr outro que o
		///////////////////////////////////////////////////////////////////////////////////////////////////////////// enunciado
		///////////////////////////////////////////////////////////////////////////////////////////////////////////// peça
		///////////////////////////////////////////////////////////////////////////////////////////////////////////// de
		///////////////////////////////////////////////////////////////////////////////////////////////////////////// conteúdo)////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////

		do {
			Narrar("\nCortana: \"Ellora, é isso! Eu acho que você não suportaria passar mais cinco minutos em OniricMancer, não é? Haha. Esse lugar também tem me \r\n"
					+ "torrado a paciência, sabe? É todo mundo tão chato!\"\r\n" + "\r\n" + "1. Obrigada, Cortana.\n");
			escolha8 = entradaDados();
			if (escolha8 == 1) {
				Narrar("\nCortana: \"Imagina. Quando você se for não vai se lembrar que esteve aqui e é bem melhor assim. Adeus!\"\n");
			} else {
				Narrar("Entrada inválida, acho que você deveria prestar mais atençâo...\n");
			}
		} while (escolha8 != 1);

		Narrar("\n\nAdeus, OniricMancer\n");
		Narrar("\n.............................\n");
		Narrar("\n.............................\n");
		Narrar("\n.............................\n");

		epilogo();
	}

	////////////////////////////////////////////////// Epílogo////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void epilogo() throws InterruptedException {
		Scanner input = new Scanner(System.in);
		int escolha1, escolha2;

		// HISTÓRIA

		Narrar("\n\nEPÍLOGO - Mundo primário\n\n");
		do {
			Narrar("1. Abrir os olhos\n");
			escolha1 = entradaDados();
			if (escolha1 == 1) {
				Narrar("\n*Vozes ao fundo* \n\nVárias pessoas: \"Ela acordou!\"\n");

			} else {
				Narrar("Entrada inválida, acho que você deveria prestar mais atençâo...\n");
			}

		} while (escolha1 != 1);

		Narrar("*A luz da janela ao lado irritava os olhos. A grande quantidade de fios ligados ao corpo e o cheiro de hospital também estavam desconfortáveis.\nPorém,\r"
				+ "aquilo era melhor do que o sonho esquisito que Ellora teve por tanto tempo.*\n");

		Narrar("*FIM*");
		credits();
		// _________________________|OniricMancer|_________________________

	}

	// CRÉDITOS
	// ******************************************************************************************************************************************************
	public static void credits() throws InterruptedException {

		// VARIAVEIS

		Scanner input = new Scanner(System.in);

		int voltar;

		// CREDITOS

		Narrar("-------------------CRÉDITOS-------------------------\n\n"
				+ "Desenvolvido por: \n- Bruna Gomes\n- Lucas Oliveira\n- Mateus Brito\n- Ramon Nogueira\n- William Mazotti\n\n");
		Narrar("Agradecimentos: \n- Professor Takeo, por todo o apoio durante o projeto.\n- Colegas de classe, pela contribuição com dúvidas e conteúdo.\n- SENAC, pela estrutura.");

		do {
			System.out.println("\n\nDeseja voltar ao menu? \n 1 - Sim | 2 - Não");
			voltar = input.nextInt();
		} while (voltar != 1 && voltar != 2);

		if (voltar == 1) {
			menu();
		} else {
			System.exit(0);
		}

	}

	// INSTRUÇÕES
	// ******************************************************************************************************************************************************

	public static void instrucoes() throws InterruptedException {

		// VARIAVEIS

		Scanner input = new Scanner(System.in);

		int voltar;

		// INSTRUCOES

		Narrar("----------------- INSTRUÇÕES --------------------\n\n"
				+ "1º: As opções de escolha serão sempre identificadas em '1', '2' ou '3'. Digite a opção desejada para prosseguir.\n"
				+ "2º: Respeite os tipos de entrada. Ao ser solicitado um número, digite um número.");

		do {
			System.out.println("\n\nDeseja voltar ao menu? \n 1 - Sim | 2 - Não");
			voltar = input.nextInt();
		} while (voltar != 1 && voltar != 2);

		if (voltar == 1) {
			menu();
		} else {
			System.out.println("\nAté logo!");
			System.exit(0);
		}

	}

	// FUNÇÕES AUXILIARES
	// **********************************************************************************************************************************************

	// FUNÇÃO DE ATRASO NAS SAÍDAS

	public static void pause(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			System.err.format("IOException: %s%n", e);
		}
	}

	// FUNÇÃO PARA TRANSFORMAR STRINGS EM CADEIA DE CARACTERES E EXIBIR UM A UM.

	public static void Narrar(String mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			pause(narrador);
		}
	}

	// FUNÇÃO PARA ENTRADA DE DADOS (INT)

	public static int entradaDados() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		return n;
	}
}
