package PortoSeguro;

import java.util.Scanner;

public class ListaDoisExerc�cioCinco {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	
int numerodoteclado=1, soma=0;

Scanner leia = new Scanner (System.in);

while (numerodoteclado!=0) {

System.out.println("\nDigite um n�mero do teclado:");
	
numerodoteclado = leia.nextInt();

soma = soma + numerodoteclado;
	
}

System.out.println("\nA soma dos n�meros digitados �: " + soma);

soma = leia.nextInt();

}
}
