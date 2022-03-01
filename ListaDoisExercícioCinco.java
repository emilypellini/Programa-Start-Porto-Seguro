package PortoSeguro;

import java.util.Scanner;

public class ListaDoisExercícioCinco {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	
int numerodoteclado=1, soma=0;

Scanner leia = new Scanner (System.in);

while (numerodoteclado!=0) {

System.out.println("\nDigite um número do teclado:");
	
numerodoteclado = leia.nextInt();

soma = soma + numerodoteclado;
	
}

System.out.println("\nA soma dos números digitados é: " + soma);

soma = leia.nextInt();

}
}
