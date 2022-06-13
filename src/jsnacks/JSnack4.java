package jsnacks;

import java.util.Scanner;

public class JSnack4 {

	public static void main(String[] args) {
		
//		Crea un array di numeri interi
//		e fai la somma di tutti gli elementi che sono in posizione dispari
		
		Scanner scan = new Scanner(System.in);
		
		int dim;
		System.out.println("inserisci la dimensione dell'array che vuoi creare: ");
		dim = scan.nextInt();
		
		int[] array = new int[dim];
		System.out.println("Riempi il vettore: ");
		for(int i = 0; i < dim; i++) {
			array[i] = scan.nextInt();
		}
		
		int sommaDispari = 0;
		for(int i = 0; i < dim; i++) {
			if((i+1)%2 != 0) {
				sommaDispari += array[i];
			}
		}
		
		System.out.println("il vettore creato è: ");
		for(int i = 0; i < dim; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("la somma degli elementi di posto dispari è: " + sommaDispari);
		
		scan.close();
	}

}
