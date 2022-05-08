package Pousada;

import java.util.Scanner;

public class Pousada {

		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			cliente reservaQuarto[] = new cliente[10];

			System.out.println("Insira as informa��es do cliente para a reserva:");
			System.out.print("Nome do cliente: ");
			String nome = teclado.nextLine();
			System.out.print("Email do cliente: ");
			String email = teclado.nextLine();

			boolean opcao = false;
			while(opcao == false) {
				System.out.println("Qual quarto sera reservado pelo cliente? (0 a 9)");
				int reserva = teclado.nextInt();

				if(reserva > 0 && reserva <= 9) {
					if(reservaQuarto[reserva] == null) {
						reservaQuarto[reserva] = new cliente(nome, email);
						System.out.println("\nA reserva do quarto " + reserva + " foi efetuada.");
						opcao = true;
					} else {
						System.out.println("Quarto indisponivel!");
					}
				} else {
					System.out.println("Resposta inv�lida!");
				}

			}
			System.out.println("Lista de reservas:");
			
			for(int i = 0; i < 10; i++) {
				if(reservaQuarto[i] != null) {
					System.out.println("Quarto " + i + ": " + reservaQuarto[i].toString());
				}	
			}
			System.out.print("\nQual quarto quer consultar?");
			
			int numQuarto = teclado.nextInt();
			
			if(numQuarto > 0 && numQuarto <= 9) {
				if(reservaQuarto[numQuarto] == null) {
					System.out.println("\nQuarto disponivel!");
				} else {
					System.out.println("\nQuarto ja reservado para o cliente " + reservaQuarto[numQuarto].getNome());
				}
			} else {
				while(numQuarto < 0 || numQuarto > 9) {
					System.out.println("Reposta inv�lida, tente outra");
					numQuarto = teclado.nextInt();
				}
			}
			teclado.close();
		}
	}

//1. Construir um programa para gerenciar a reserva dos 10 quartos de uma pousada.  O programa deve gerenciar a reserva de 1 di�ria apenas de 
//cada um dos quartos.  Cada quarto � numerado de 0 a 9 e pode ser reservado por apenas 1 respons�vel, de acordo com sua escolha. 
//Ou seja, o Jo�o pode reservar o quarto 5 e a Ana pode reservar o quarto 3, mesmo que os outros quartos n�o tenham sido reservados 
//(fora da ordem). Somente poder� ser realizada uma reserva por quarto.  

//Para efetivar a reserva, o cliente deve informar seu nome, e-mail para contato e o n�mero do quarto desejado.

//As informa��es que devem estar na classe Cliente s�o, portanto, nome e e-mail.

//Se estiver dispon�vel, o quarto deve ser reservado, caso contr�rio, uma mensagem dever� ser mostrada informando da impossibilidade.  

//Em seguida o sistema deve perguntar se deseja realizar a reserva de outro quarto.  Se a resposta for sim, deve solicitar novamente todas as informa��es j� indicadas.

//Ao terminar de realizar as reservas, um relat�rio de ocupa��o dos quartos deve ser mostrado, como no exemplo abaixo:

//Reservas:
//Quarto 3:  Ana Silveira, e-mail: ana@gmail.com 
//Quarto 5: Jo�o Antero, e-mail: ja@gmail.com
//Quarto 8: Pedro Marques, e-mail: pmarques@gmail.com

//Tamb�m deve ser poss�vel consultar a situa��o de cada quarto e receber uma das informa��es:
//- Quarto n�o reservado
//ou
//- Quarto reservado para Pedro Marques


//Dica1: lembrar que o vetor � inicializado com NULL e esse valor pode ser utilizado em testes tamb�m.
//Dica 2: usar construtores
//Dica 3: usar getters e setters somente quando os atributos precisarem desses m�todos