package PortoSeguro;

import java.util.Scanner;

public class ListaDoisExerc�cioSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numerodoteclado=0;
		int soma = 0;
		int media = 0;
		int contanumeros = 0;

		Scanner leia = new Scanner(System.in);

		do {
		System.out.println("\nDigite um n�mero do teclado:");
		numerodoteclado = leia.nextInt();
				if (numerodoteclado % 3 == 0 && numerodoteclado != 0) {
				soma = numerodoteclado + soma;
				contanumeros++;
			}
			}	
			while (numerodoteclado != 0);
			
		if (contanumeros != 0) {
			media = soma / contanumeros;
			System.out.println("\nA m�dia dos n�meros m�ltiplos de 3 �: " + media);
			media = leia.nextInt();

		}

		else {
			System.out.println("\nOs n�meros digitados n�o s�o m�ltiplos de 3.");
		}

	}

}


