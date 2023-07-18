package dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int contador = 0;
		
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		
		for (int i = 0; i < n; i++) {
			int numeroDigitado = sc.nextInt();
			numeros.add(numeroDigitado);
		}
		
		for (int i = 0; i < numeros.size(); i++) {
			for (int j = 0; j < numeros.size(); j++) {
				if(numeros.get(i) - numeros.get(j) == k) {
					contador++;
				}
			}
		}
		System.out.println(contador);
		
		sc.close();
	}

}
