package Udemy;

import java.util.Locale;
import java.util.Scanner;

public class IfElseEixos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		double x, y;
		System.out.print("1º Cordenada: "); x = scan.nextDouble();
		System.out.print("2º Cordenada: "); y = scan.nextDouble();

		if (x > 0 && y > 0) {
			System.out.println("\nQ1");
		} else if (x > 0 && y < 0) {
			System.out.println("\nQ4");
		} else if (x < 0 && y > 0) {
			System.out.println("\nQ2");
		} else if(x<0 && y<0) {
			System.out.println("\nQ3");
		}else {
			System.out.println("\nOrigem");
		}

	}

}
