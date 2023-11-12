package Udemy;

import java.util.Scanner;

public class IfElseIntervalorNum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double num;

		System.out.print("Informe um número: ");
		num = scan.nextDouble();
		
		if(num < 25) {
			System.out.println("intervalo de 0 a 25");
		}else if(num >= 25 && num < 50 ) {
			System.out.println("Intervalo de 25 a 50");
		}else if(num >= 50 && num < 75) {
				System.out.println("Intervalo de 50 a 75");
		}else if(num >=75 && num < 100) {
			System.out.println("Intervalo de 75 a 100");
		}else {
			System.out.println("Número inválido");
		}
		
		
			

	}

}
