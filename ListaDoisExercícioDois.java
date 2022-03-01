package PortoSeguro;

import java.util.Scanner;

public class ListaDoisExercícioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	float numero[]= new float [10];
	int conteseforpar=0, conteseforimpar=0;
		
	Scanner leia = new Scanner (System.in);
	
	for (int i=0; i<10; i++) {
	
	System.out.println ("Entre com o número " + (i+1) + ":");

	numero [i] = leia.nextFloat();
	
	if (numero [i]%2==0) {
		
	conteseforpar++;
	
	}
	
	else {
		
	conteseforimpar++;
		
	}
	}
	
	System.out.println ("Há " + conteseforimpar + " número(s) ímpar(es) e " + conteseforpar + "numero(s) par(es) na sequência");
	
	conteseforpar = leia.nextInt();
	
	conteseforimpar = leia.nextInt();
	
	
	}
	}	
	
	
	
