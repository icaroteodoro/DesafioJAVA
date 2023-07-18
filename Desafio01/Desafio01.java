package dominio;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantidadeEntrada = sc.nextInt();
		ArrayList<Integer> numerosPares = new ArrayList<Integer>();
		ArrayList<Integer> numerosImpares = new ArrayList<Integer>();
		for (int i = 0; i < quantidadeEntrada; i++) {
			int numeroDigitado = sc.nextInt();
			if(numeroDigitado % 2 == 0) {
				numerosPares.add(numeroDigitado);
			}else {
				numerosImpares.add(numeroDigitado);
			}
		}
		Collections.sort(numerosPares);
		Collections.sort(numerosImpares);
		for (int i = 0; i < numerosPares.size(); i++) {
			System.out.println(numerosPares.get(i));
		}
		for (int i = numerosImpares.size() - 1; i >= 0; i--) {
			System.out.println(numerosImpares.get(i));
			
		}
		sc.close();
	}
}
