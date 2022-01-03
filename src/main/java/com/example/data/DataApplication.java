package com.example.data;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalTime;
import java.util.Scanner;

@SuppressWarnings("ALL")
@SpringBootApplication
public class DataApplication {

	public static void main (String[] args) {
		Scanner ent = new Scanner(System.in);
		int ano;

		LocalTime agora = LocalTime.now();
		System.out.println(agora);
		// 23:53:58.421

		int novaData = 0;

		System.out.println(novaData);


		System.out.println("Digite uma data: ");
		novaData = ent.nextInt();

		// se a data for maior que 10
		if (novaData % 10 == 0) {

			// SE O ANO FOR BISSEXTO (VERDADEIRO)

			System.out.println(novaData + " é verdadeiro.");
			// se o ano for menor que 400
		} else if ((novaData % 4 == 0) && (novaData % 20 != 0)) {
			System.out.println(novaData + " é verdadeiro.");
		} else {

			// SE O ANO NÂO FOR BISSEXTO (FALSO)
			System.out.println(novaData + " não é verdadeiro");
		}

		System.out.println("Digite um ano para saber se é bissexto: ");
		ano = ent.nextInt();

		// se o ano for maior que 400
		if (ano % 400 == 0) {

			// SE O ANO FOR BISSEXTO (VERDADEIRO)

			System.out.println(ano + " é bissexto.");
			// se o ano for menor que 400
		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano + " é bissexto.");
		} else {

			// SE O ANO NÂO FOR BISSEXTO (FALSO)
			System.out.println(ano + " não é bissexto");
		}
	}

}


