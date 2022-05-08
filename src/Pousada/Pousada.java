package Pousada;

import java.util.Scanner;

public class Pousada {

		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			cliente reservaQuarto[] = new cliente[10];

			System.out.println("Insira as informações do cliente para a reserva:");
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
					System.out.println("Resposta inválida!");
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
					System.out.println("Reposta inválida, tente outra");
					numQuarto = teclado.nextInt();
				}
			}
			teclado.close();
		}
	}

//1. Construir um programa para gerenciar a reserva dos 10 quartos de uma pousada.  O programa deve gerenciar a reserva de 1 diária apenas de 
//cada um dos quartos.  Cada quarto é numerado de 0 a 9 e pode ser reservado por apenas 1 responsável, de acordo com sua escolha. 
//Ou seja, o João pode reservar o quarto 5 e a Ana pode reservar o quarto 3, mesmo que os outros quartos não tenham sido reservados 
//(fora da ordem). Somente poderá ser realizada uma reserva por quarto.  

//Para efetivar a reserva, o cliente deve informar seu nome, e-mail para contato e o número do quarto desejado.

//As informações que devem estar na classe Cliente são, portanto, nome e e-mail.

//Se estiver disponível, o quarto deve ser reservado, caso contrário, uma mensagem deverá ser mostrada informando da impossibilidade.  

//Em seguida o sistema deve perguntar se deseja realizar a reserva de outro quarto.  Se a resposta for sim, deve solicitar novamente todas as informações já indicadas.

//Ao terminar de realizar as reservas, um relatório de ocupação dos quartos deve ser mostrado, como no exemplo abaixo:

//Reservas:
//Quarto 3:  Ana Silveira, e-mail: ana@gmail.com 
//Quarto 5: João Antero, e-mail: ja@gmail.com
//Quarto 8: Pedro Marques, e-mail: pmarques@gmail.com

//Também deve ser possível consultar a situação de cada quarto e receber uma das informações:
//- Quarto não reservado
//ou
//- Quarto reservado para Pedro Marques


//Dica1: lembrar que o vetor é inicializado com NULL e esse valor pode ser utilizado em testes também.
//Dica 2: usar construtores
//Dica 3: usar getters e setters somente quando os atributos precisarem desses métodos