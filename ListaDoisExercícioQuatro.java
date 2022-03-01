package PortoSeguro;

import java.util.Scanner;

public class ListaDoisExercícioQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 0, qpessoas = 1, qcalmas = 0, qmnervosas = 0, qhagressivos = 0, qocalmos = 0, qnervosas40 = 0,
				qcalmas18 = 0;
		String sexo = "sexo";
		String personalidade = "personalidade";

		Scanner leia = new Scanner(System.in);

		for (qpessoas = 1; qpessoas < 3; qpessoas++) {

			System.out.println("\nEntre com a posição do participante:");
			qpessoas = leia.nextInt();

			System.out.println("\nEntre com a idade do participante:");
			idade = leia.nextInt();

			System.out.println("\nEntre com o sexo do participante:");
			sexo = leia.next();

			System.out.println("\nEntre com a personalidade do participante:");
			personalidade = leia.next();

			if (personalidade.equalsIgnoreCase("calma")) {

				qcalmas++;

			}

			if (sexo.equalsIgnoreCase("feminino") && personalidade.equalsIgnoreCase("nervosa")) {

				qmnervosas++;

			}

			if (sexo.equalsIgnoreCase("masculino") && personalidade.equalsIgnoreCase("agressiva")) {

				qhagressivos++;

			}

			if (sexo.equalsIgnoreCase("outros") && personalidade.equalsIgnoreCase("calma")) {

				qocalmos++;

			}

			if (personalidade.equalsIgnoreCase("nervosa") && idade < 40) {

				qnervosas40++;

			}

			if (personalidade.equalsIgnoreCase("calma") && idade > 18) {

				qcalmas18++;

			}
		}

		System.out.println("\nA quantidade de pessoas calmas é:" + qcalmas);
		// qcalmas = leia.nextInt();

		System.out.println("\nA quantidade de mulheres nervosas é:" + qmnervosas);
		// qmnervosas = leia.nextInt();

		System.out.println("\nA quantidade de homens agressivos é:" + qmnervosas);
		// qmnervosas = leia.nextInt();

		System.out.println("\nA quantidade de outros calmo é:" + qocalmos);
		// qocalmos = leia.nextInt();

		System.out.println("\nA quantidade de pessoas nervosas com mais de 40 anos é:" + qnervosas40);
		// qnervosas40 = leia.nextInt();

		System.out.println("\nA quantidade de pessoas calmas com menos de 18 anos é:" + qcalmas18);
		// qcalmas18 = leia.nextInt();

	}
}
