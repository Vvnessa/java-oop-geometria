package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {

    /*Creare una classe Main contenente il metodo main(), nel quale chiedete all’utente di inserire, da console, i valori di base e di
    altezza con cui istanziare un nuovo Rettangolo. Dopo averlo istanziato, stampate a video il perimetro e l’area.
    BONUS Aggiungere alla classe Rettangolo un metodo disegna() che stampa in console il rettangolo con le sue dimensioni, come
    nell’immagine allegata*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserici la tua base ");
        int base = scan.nextInt();
        System.out.println("inserici la tua  h ");
        int altezza = scan.nextInt();
        RettangoloGeometria nuovorettangolo = new RettangoloGeometria(base, altezza);

        System.out.println("Il tuo risultato :"+ " "  +nuovorettangolo.calcolaArea());
        /*
        System.out.println(nuovorettangolo.calcolaArea());*/

        System.out.println("il tuo perimetro sara : "+"  "  +nuovorettangolo.calcolaPerimetro());

    }
}
