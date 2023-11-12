package Udemy;

import java.util.Scanner;

public class IfElseParImpar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;

		System.out.print("Informe seu número: ");
		num = scan.nextInt();

		if (num % 2 == 0) {
			System.out.println("\nSeu número é par");
		} else {
			System.out.println("\nSeu número é ímpar");
		}

	}

}
