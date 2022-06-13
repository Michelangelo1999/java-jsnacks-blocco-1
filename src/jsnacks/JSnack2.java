package jsnacks;

import java.util.Scanner;

public class JSnack2 {

	public static void main(String[] args) {
		
//		Chiedi all'utente di inserire un numero, se è pari stampa il numero, se è dispari 
//		stampa il numero successivo
		
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.println("inserisci un numero: ");
		numero = scan.nextInt();
		
		if(numero%2 != 0) {
			numero++;
		}
		
		System.out.println("allora stampo: " + numero);
		
		scan.close();

	}

}
