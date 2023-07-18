package dominio;

import java.util.Locale;
import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		Double valor = sc.nextDouble();
		Double moedas = 0.0;
		
		int NotaCem =0;
		int NotaCinquenta =0;
		int NotaVinte =0;
		int NotaDez =0;
		int NotaCinco =0;
		int NotaDois =0;
		int MoedasUm = 0;
		int MoedasCinquenta = 0;
		int MoedasVinteECinco = 0;
		int MoedasDez = 0;
		int MoedasCinco = 0;
		int MoedasZeroUm = 0;
		while (moedas < valor) {
			if(moedas + 100 <= valor) {
				moedas = moedas +100;
				NotaCem++;
			}else if(moedas + 50 <= valor) {
				moedas = moedas+ 50;
				NotaCinquenta++;
			}else if(moedas + 20 <= valor) {
				moedas = moedas + 20;
				NotaVinte++;
			}else if(moedas + 10 <= valor) {
				moedas=moedas + 10;
				NotaDez++;
			}else if(moedas + 5 <= valor) {
				moedas=moedas + 5;
				NotaCinco++;
			}else if(moedas + 2 <= valor) {
				moedas = moedas + 2;
				NotaDois++;
			}else if(moedas + 1 <= valor) {
				moedas = moedas + 1;
				MoedasUm++;
			}else if(moedas + 0.50 <= valor) {
				moedas = moedas + 0.50;
				MoedasCinquenta++;
			}else if(moedas + 0.25 <= valor) {
				moedas = moedas + 0.25;
				MoedasVinteECinco++;
			}else if(moedas + 0.10 <= valor) {
				moedas = moedas + 0.10;
				MoedasDez++;
			}else if(moedas + 0.05 <= valor) {
				moedas = moedas + 0.05;
				MoedasCinco++;
			}else if(moedas + 0.01 <= valor) {
				moedas = moedas + 0.01;
				MoedasZeroUm++;
			}
			System.out.println("rodou");
			System.out.println("modeas: " + moedas + "valor: " + valor);
		}
		System.out.println("NOTAS: ");
		System.out.println(NotaCem + "		notas(s)	de		R$		100.00");
		System.out.println(NotaCinquenta + "		notas(s)	de		R$		50.00");
		System.out.println(NotaVinte + "		notas(s)	de		R$		20.00");
		System.out.println(NotaDez + "		notas(s)	de		R$		10.00");
		System.out.println(NotaCinco + "		notas(s)	de		R$		5.00");
		System.out.println(NotaDois + "		notas(s)	de		R$		2.00");
		System.out.println("MOEDAS: ");
		System.out.println(MoedasUm + "		moeda(s)	de		R$		1.00");
		System.out.println(MoedasCinquenta + "		moeda(s)	de		R$		0.50");
		System.out.println(MoedasVinteECinco + "		moeda(s)	de		R$		0.25");
		System.out.println(MoedasDez + "		moeda(s)	de		R$		0.10");
		System.out.println(MoedasCinco + "		moeda(s)	de		R$		0.05");
		System.out.println(MoedasZeroUm + "		moeda(s)	de		R$		0.01");
		
		sc.close();


	}

}
