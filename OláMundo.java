package PortoSeguro;

import java.util.Scanner;

public class Ol·Mundo {

	public static void main(String[] args) {
	
		String nome;
		int idade;
		float altura;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Ol· Mundo");
		System.out.println("\n\t\tEntre com o seu nome:");
		nome = leia.nextLine();
		System.out.println("\n\t\tEntre com a sua idade:");
		idade = leia.nextInt();
		System.out.println("\n\t\tEntre com a sua altura:");
		altura = leia.nextFloat();
		System.out.println("\n\t\tMeu nome È "+nome+",tenho "+idade+" anos e tenho "+altura+" de altura.");
	}

}
