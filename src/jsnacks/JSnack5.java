package jsnacks;

import java.util.Scanner;

public class JSnack5 {

	public static void main(String[] args) {
		
//		La distanza di Hamming tra due stringhe di uguale lunghezza è il numero di posizioni 
//		nelle quali i caratteri corrispondenti sono diversi.
//		Chiedi all'utente di dirti due parole e stampa la distanza di Hamming.
		
		Scanner scan = new Scanner(System.in);
		
		String parola1, parola2;
		
		System.out.println("inserisci due parole di uguale lunghezza: ");
		parola1 = scan.nextLine();
		parola2 = scan.nextLine();
		
		char[] parola1vett = parola1.toCharArray();
		char[] parola2vett = parola2.toCharArray();
		
		while(parola1vett.length != parola2vett.length) {
			System.out.println("inserimenti non validi!");
			
			System.out.println("inserisci due parole di uguale lunghezza: ");
			parola1 = scan.nextLine();
			parola2 = scan.nextLine();
			
		    parola1vett = parola1.toCharArray();
			parola2vett = parola2.toCharArray();
		}
		
		int contatore = 0;
		for(int i = 0; i < parola1vett.length; i++) {
			if(parola1vett[i] != parola2vett[i]) {
				contatore++ ;
			}
			
		}
		
		System.out.println("la distanza di hamming tra le due stringhe è: " + contatore);
		
		scan.close();
		
	}

}
