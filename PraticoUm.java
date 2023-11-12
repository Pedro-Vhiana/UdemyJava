package Udemy;

import java.util.Locale; // Biblíoteca

public class PraticoUm {

	public static void main(String[] args) {

		String p1 = "Computador";
		String p2 = "Pacote Office";
		
		int idade = 30;
		int code = 5290;
		char genero = 'M';
		
		double valor1 = 2100.0;
		double valor2 = 650.50;
		double media = 53.234567;
		
		System.out.println("Products: ");
		
		// Lembrar de colocar vírgula no lugar de + para concatenar após a formatação com %.2f.
		System.out.printf("\n"+ p1 +", o preço é R$ %.2f",valor1);
		
		System.out.printf("\n"+p2+", o preço é R$ %.2f",valor2);
		
		System.out.printf("\n\nRecord: "+idade+" anos, "+"Código "+code+" e genero "+genero);
		
		// O Valor após o ponto de: %.( Aqui dita as casas decimais após a vírgula ).
		System.out.printf("\n\nMédia de peso em decimal: %.8f",media);
		System.out.printf("\nMédia de três em peso decimal: %.3f",media);
		
		Locale.setDefault(Locale.US); // Muda o padrão da separação decimal de vírgula para ponto ( padrão americano ).
		
		System.out.printf("\nUS decimal com ponto: %.3f%n",media);
		
		

	}

}
