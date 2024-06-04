package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // chiediamo all'utente di inserire il nome, cognome, colore preferito e data di nascita
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci il tuo cognome: ");
        String cognome = scanner.nextLine();

        System.out.print("Inserisci il tuo colore preferito: ");
        String colore = scanner.nextLine();

        System.out.print("Inserisci il giorno di nascita (in numero): ");
        int giorno = scanner.nextInt();

        System.out.print("Inserisci il mese di nascita (in numero): ");
        int mese = scanner.nextInt();

        System.out.print("Inserisci l'anno di nascita (in numero): ");
        int anno = scanner.nextInt();

        scanner.close();

        // calcoliamo la somma dell'anno, mese e giorno di nascita
        int somma = anno + mese + giorno;

        // generiamo la password concatenando nome, cognome, colore preferito e somma
        String password = nome + "-" + cognome + "-" + colore + "-" + somma;

        // stampiamo la password generata
        System.out.println("La tua password è: " + password);
    }
}
