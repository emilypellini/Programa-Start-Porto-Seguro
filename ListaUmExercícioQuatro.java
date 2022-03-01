package PortoSeguro;

import java.util.Scanner;

public class ListaUmExercícioQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite um valor:");
		
		numero = leia.nextInt();
		
		if (numero<0) {
			
		System.out.println("\nO número "+ numero + " é negativo.");
		
		}
		
		else {
		
		System.out.println("\nO número "+ numero + " é positivo.");		
		
		}
		
		if (numero%2 == 0) {
			
	System.out.println("\nO número "+ numero + " é par.");
		
		}
		
		else {
			
	System.out.println("\nO número "+ numero + " é ímpar.");
	
		}
	
	}

}
