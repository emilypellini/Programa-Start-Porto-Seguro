package PortoSeguro;

import java.util.Scanner;

public class ListaUmExerc�cioTr�s {
                 
	public static void main(String[] args) {
			
		float numero1, quadrado1, numero2, quadrado2, numero3, quadrado3, numero4, quadrado4;
				
			Scanner leia = new Scanner (System.in);
			
		System.out.println("\nEntre com o n�mero 1: ");
		
		numero1 = leia.nextFloat();
		quadrado1 = numero1*numero1;
		
		System.out.println("\nEntre com o n�mero 2: ");
		
		numero2 = leia.nextFloat();
		quadrado2 = numero2*numero2;
		
		System.out.println("\nEntre com o n�mero 3: ");
		
		numero3 = leia.nextFloat();
		quadrado3 = numero3*numero3;
		
		System.out.println("\nEntre com o n�mero 4: ");
		
		numero4 = leia.nextFloat();
		quadrado4 = numero4*numero4;
				
if (quadrado3 >= 1000) {
	
	System.out.println("\nO quadrado do n�mero 3 �: " + quadrado3);
	
	quadrado3 = leia.nextFloat();
	
}
else {
	System.out.println("\nO n�mero 1 �: "+ numero1 + " e o quadrado desse n�mero � " + quadrado1);
	System.out.println("\nO n�mero 2 �: "+ numero2 + " e o quadrado desse n�mero � " + quadrado2);		
	System.out.println("\nO n�mero 3 �: "+ numero3 + " e o quadrado desse n�mero � " + quadrado3);
	System.out.println("\nO n�mero 3 �: "+ numero4 + " e o quadrado desse n�mero � " + quadrado4);
	
	quadrado1 = leia.nextFloat();
	quadrado2 = leia.nextFloat();
	quadrado3 = leia.nextFloat();
	quadrado4 = leia.nextFloat();
}
		
			
						}
}
