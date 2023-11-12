package Udemy;

import java.util.Scanner;

public class IfElseDuracaoJogos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int in, fim,tempo;

		System.out.println("Informe o inicio do jogo: ");
		in = scan.nextInt();
		System.out.println("Informe o final do jogo: ");
		fim = scan.nextInt();
		
		

		if(in<fim) {
			tempo = in - fim;
		}else {
			tempo = 24 - in + fim;
		}
		System.out.println("O jogo durou: "+ tempo + " hora(s)");
	}
}
