package PortoSeguro;

import java.util.Scanner;

public class ListaUmExerc�cioSete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	float base, altura, area;

	Scanner leia = new Scanner (System.in);
		
	System.out.println("\nEntre com o valor da base do tri�ngulo:");
	
	base = leia.nextFloat();
	
	System.out.println("\nEntre com o valor da altura do tri�ngulo:");
	
	altura = leia.nextFloat();
	
	if (base>0 && altura>0) {
	
	area = base*altura/2;
	
	System.out.println("\nA �rea do tri�ngulo �:" + area);
	
	area = leia.nextFloat();
	
	}
	
	else {
	
	System.out.println("\nOs valores de base e/ou altura s�o inv�lidos para calcular a �rea do tri�ngulo.");
		
		}
	
	}

}
