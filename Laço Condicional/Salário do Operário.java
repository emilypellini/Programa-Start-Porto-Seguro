package PortoSeguro;

import java.util.Scanner; 

public class ListaUmExercícioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float horas, horasextras, salario;
	
	Scanner leia = new Scanner (System.in);
	
	System.out.println ("\nEntre com o número de horas trabalhadas:");
	
	horas = leia.nextFloat();
	
	if (horas > 50) {
		
		horasextras = horas - 50;
		
		salario = 500 + (horasextras*20);
		
		System.out.println ("\n O colaborador realizou " + horasextras + " horas extras e o salário será R$ " + salario);
		
		horas = leia.nextFloat();
		
		horasextras = leia.nextFloat();
		
		salario = leia.nextFloat();
		
			}
	else {
		
		salario = horas*10;
		
		System.out.println ("\n O colaborador não realizou horas extras. O salário será R$ " + salario);
		
		horas = leia.nextFloat();
		
		salario = leia.nextFloat();
	
	}
	}

}
