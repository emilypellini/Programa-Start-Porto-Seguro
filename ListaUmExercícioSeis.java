package PortoSeguro;

import java.util.Scanner;

public class ListaUmExercícioSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idadedonadador;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com a idade do nadador:");
		
		idadedonadador = leia.nextInt ();
		
		if (idadedonadador < 5) {
			
		System.out.println("\nO nadador não tem idade mínima para participar da competição.");	
		
		}
		
		else if (idadedonadador >= 5 && idadedonadador <= 7) {
		
		System.out.println("\nO nadador está classificado na categoria Infantil A.");	
		
		}
		
		else if (idadedonadador >= 8 && idadedonadador <= 11) {
			
		System.out.println("\nO nadador está classificado na categoria Infantil B.");	
	
		}
		
		else if (idadedonadador >= 12 && idadedonadador <= 13) {
			
		System.out.println("\nO nadador está classificado na categoria Juvenil A.");		
		
		}
		
		else if (idadedonadador >= 14 && idadedonadador <= 17) {
			
		System.out.println("\nO nadador está classificado na categoria Juvenil B.");		
		
		}		
		
		else if (idadedonadador > 18) {
			
		System.out.println("\nO nadador está classificado na categoria Adultos.");		
		
		}				
		
	}

}
