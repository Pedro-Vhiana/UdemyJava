package Udemy;

import java.util.Scanner;

public class IfElseNegativoPositivo {

	public static void main(String[] args) {

		int num;

		Scanner scan = new Scanner(System.in);

		System.out.print("Informe seu número: ");
		num = scan.nextInt();

		if (num > 0) {
			System.out.println("seu número é positivo");

		} else {
			System.out.println("Seu número é negativo");
		}

	}

}
