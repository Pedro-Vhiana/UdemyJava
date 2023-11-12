package Udemy;

import java.util.Scanner;

public class IfElseMultiplos {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("Informe um número: ");
		a = scan.nextInt();
		
		System.out.println("\nInforme outro número: ");
		b = scan.nextInt();
		
		if(a%b == 0) {
			System.out.println("\nSão múltiplos");
		}else {
			System.out.println("\nNão são múltiplos");
		}
		
		
	}

}
