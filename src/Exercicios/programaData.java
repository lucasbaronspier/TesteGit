package Exercicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class programaData {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE,d");
		SimpleDateFormat sdf2 = new SimpleDateFormat("d");
		
		Date data1= new Date();
	
		System.out.println("Hoje é "+sdf1.format(data1));
	}
}
//Construir um programa para mostrar a data do sistema escrita por extenso usando as classes discutidas e
//testando as demais formas, como por exemplo: 
//Hoje é terça-feira, dia 5 de abril de 2022 e agora são 19 horas e 32 minutos.