package PortoSeguro;

import java.util.Scanner;

public class ListaUmExercícioTrêsV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	float[] quadrado = new float[4];
	
	float[] numero = new float[4];

	Scanner leia = new Scanner(System.in);

	for (int y = 0; y < 4; y++) {

	System.out.println("\nEntre com o número " + (y + 1));
	
	numero[y] = leia.nextFloat();
	
	quadrado[y] = numero[y] * numero[y];
	
	}

	if (quadrado[2] >= 1000) {
			System.out.println("\nO quadrado do terceiro número é " + quadrado[2]);
	} 
	else {
		
	for (int x = 0; x < quadrado.length; x++) {
	
	System.out.println("\nO quadrado do número " + numero[x] + " é " + quadrado[x]);
			
			}
		}
	}
}
