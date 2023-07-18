package dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		ArrayList<String>  palavras = new ArrayList<String>(); 
		
		for (int i = 0; i < n; i++) {
			
			String fraseEmbaralhada = sc.nextLine();
			palavras.add(fraseEmbaralhada);
		}
		
		
		for (int i = 0; i < palavras.size(); i++) {
			String palavra = "";
			for (int j = (palavras.get(i).length() / 2) - 1; j >= 0 ; j--) {
				palavra = palavra + palavras.get(i).charAt(j);
			}
			for (int j = palavras.get(i).length() - 1; j >= palavras.get(i).length() / 2 ; j--) {
				palavra = palavra + palavras.get(i).charAt(j);
			}
			System.out.println(palavra);
		}
		
		
		sc.close();
		
		
		
		
	}

}
