package jsnacks;

import java.util.Random;
import java.util.Scanner;

public class JSnack3 {

	public static void main(String[] args) {
		
//		Generatore di “nomi cognomi” casuali: prendendo una lista di nomi e una lista di 
//		cognomi, genera una falsa lista di 3 invitati.
		Scanner scan = new Scanner(System.in);
		
		String[] listaNomi = new String[3];
		String[] listaCognomi = new String[3];
		
		System.out.println("inserisci nomi nella lista dei nomi: ");
		for(int i = 0; i < listaNomi.length; i++) {
			listaNomi[i] = scan.nextLine();
		}
		
		System.out.println("inserisci i cognomi nella lista cognomi: ");
		for(int i = 0; i < listaCognomi.length; i++) {
			listaCognomi[i] = scan.nextLine();
		}
		
		Random rnd = new Random();
		String[] listaInvitati = new String[3];
		int indexNome, indexCognome;
		
		for(int i = 0; i < listaInvitati.length; i++) {
		    indexNome = rnd.nextInt(3);
		    indexCognome = rnd.nextInt(3);
		    
		    listaInvitati[i] = listaNomi[indexNome] + " " + listaCognomi[indexCognome];
		}
		
		System.out.println("la lista degli invitati è: ");
		for(int i = 0; i < listaInvitati.length; i++) {
			System.out.println(listaInvitati[i] + " ");
		}
		
		scan.close();
	}

}
