package PortoSeguro;

import java.util.Scanner;

public class ListaDoisExercícioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int numero=1000;
	
	Scanner leia = new Scanner (System.in);
	
	for (numero=1000; numero<2000; numero++) {	
		
	if (numero%11==5) {
	
	System.out.println ("\nO número " + numero + " quando dividido por 11, dá resto 5.");	

	numero = leia.nextInt ();
	
	}
	}
	}
	}
