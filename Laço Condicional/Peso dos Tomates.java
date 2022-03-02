package PortoSeguro;

import java.util.Scanner;

public class ListaUmExercícioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float peso, excedente, multa;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o valor do peso:");
		
		peso = leia.nextFloat();
				
		if(peso>50) {
			
			excedente = peso - 50;
			
			multa = 4*excedente;
			
			System.out.println("\nHouve excedente. O valor do excedente é: "+ excedente + " kg e o valor da multa é: R$ " + multa);
			
			excedente = leia.nextFloat();
			
			multa = leia.nextFloat();
			
					}
			else {
				excedente = 0;
				
				System.out.println("\nNão houve excedente.");
				
				multa = 0;
				
				System.out.println("\nNão houve multa.");
				
			}
		}
		
	}


