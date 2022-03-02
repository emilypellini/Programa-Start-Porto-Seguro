package PortoSeguro;

import java.util.Scanner;

public class ListaDoisExercícioTrês { 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int idade=0, contaseformenorque21=0, contaseformaiorque50=0; 
	
	Scanner leia = new Scanner (System.in);
	
	while (idade!=99) {
		
	System.out.println("\nEntre com a idade:");
	
	idade = leia.nextInt();
	
	if (idade>0 && idade<21) {
	
	contaseformenorque21 ++;
	
	}
	
	else if (idade>0 && idade>50) {
	
	contaseformaiorque50++;
	
	}
	}
	
	System.out.println("\n" + contaseformenorque21 + " tem menos que 21 anos " + contaseformaiorque50 + " tem mais que 50 anos.");
	
	contaseformenorque21 = leia.nextInt();
	
	contaseformaiorque50 = leia.nextInt();
	
	}	
	}


