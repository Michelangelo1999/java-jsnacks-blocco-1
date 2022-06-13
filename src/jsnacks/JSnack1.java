package jsnacks;

import java.util.Scanner;

public class JSnack1 {

	public static void main(String[] args) {
		
//		Il software deve chiedere per 5 volte all’utente di inserire un numero. Il programma 
//		stampa la somma di tutti i numeri inseriti.
//		Esegui questo programma in due versioni, con il for e con il while.
		
		Scanner scan = new Scanner(System.in);
		int somma = 0;
		int numero;
		
		//ciclo for version
		for(int i = 0; i < 5; i++) {
			System.out.println("inserisci un numero: ");
			numero = scan.nextInt();
			
			somma += numero;
		}
		
		System.out.println("la somma dei numeri inseriti è: " + somma);
		
		
		//ciclo while version
		int contatore = 0;
		int somma2 = 0;
		System.out.println("inserisci 5 numeri: ");
		while(contatore < 5) {
			numero = scan.nextInt();
			somma2 += numero;
			contatore ++;
		}
		
		System.out.println("la somma dei numeri inseriti è: " + somma2);
		
		scan.close();
	}

}
