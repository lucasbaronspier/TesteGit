package Exercicios;

import java.util.Scanner;

public class tresPontoSete {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor desejado: ");
		double valorDesejado = teclado.nextDouble();
		System.out.println("Informe o aporte mensal: ");
		double valorMensal = teclado.nextDouble();
		
		int meses=1;
		
		for(double valorTotal=0 ; valorTotal<valorDesejado ; ) {
			valorTotal=valorTotal*1.005;
			valorTotal=valorTotal+valorMensal;
			meses++;
			
			System.out.printf("No mes %d o valor foi de %.2f\n",meses,valorTotal);
		}
		
		System.out.printf("\n Iriam levar um total de %d meses para alcan�ar o valor desejado!",meses);
	}
	
}

//3.7	Dado o valor de um dep�sito fixo mensal e um montante desejado, determine quantos meses ser�o necess�rios
//para acumular o montante desejado, considerando juros mensais de 0,5%.  Mostrar a cada m�s qual � o valor obtido 
//e ao final informar a quantidade de meses.