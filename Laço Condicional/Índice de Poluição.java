package PortoSeguro;

import java.util.Scanner;

public class ListaUmExercícioCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float indicedepoluicao;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o valor do índice de poluição:");
		
		indicedepoluicao = leia.nextFloat();
		
		if (indicedepoluicao < 0.05) {
		
		System.out.println("\nO índice de poluição é aceitável");
		
		}
		
		else if (indicedepoluicao >= 0.05 && indicedepoluicao <= 0.25) {
			
		System.out.println("\nO índice de poluição é aceitável");
		
		}
		
		else if (indicedepoluicao > 0.25 && indicedepoluicao <=	 0.3) {
			
		System.out.println("\nO índice de poluição está acima do aceitável. Indústrias do Grupo 1 devem suspender atividades.");
		
		}
		
		else if (indicedepoluicao > 0.3 && indicedepoluicao <= 0.4) {
			
		System.out.println("\nO índice de poluição está acima do aceitável. Indústrias do Grupo 1 e 2 devem suspender atividades.");
		
		}
		
		else if (indicedepoluicao > 0.4 && indicedepoluicao <= 0.5) {
		
		System.out.println("\nO índice de poluição está acima do aceitável. Indústrias dos Grupos 1,2 e 3 devem suspender atividades.");
		
		}
		
		else if (indicedepoluicao > 0.5) {
			
		System.out.println("\nO índice de poluição está acima do aceitável. Indústrias dos Grupos 1,2 e 3 devem suspender atividades.");
		
		}
				
		}
		
		}
		
		
		
	


