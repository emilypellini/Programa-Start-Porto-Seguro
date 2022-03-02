package PortoSeguro;

import java.util.Scanner;

public class ListaUmExercícioSete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	float base, altura, area;

	Scanner leia = new Scanner (System.in);
		
	System.out.println("\nEntre com o valor da base do triângulo:");
	
	base = leia.nextFloat();
	
	System.out.println("\nEntre com o valor da altura do triângulo:");
	
	altura = leia.nextFloat();
	
	if (base>0 && altura>0) {
	
	area = base*altura/2;
	
	System.out.println("\nA área do triângulo é:" + area);
	
	area = leia.nextFloat();
	
	}
	
	else {
	
	System.out.println("\nOs valores de base e/ou altura são inválidos para calcular a área do triângulo.");
		
		}
	
	}

}
