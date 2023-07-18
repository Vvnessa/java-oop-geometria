package org.lessons.java.geometria;

public class RettangoloGeometria {

    /*Consegna: Nel progetto java-oop-geometria creare un package org.lessons.java.geometria, in cui inserire le classi:
una classe Rettangolo con due attributi interi: base e altezza. Aggiungere un opportuno costruttore con parametri. Aggiungere
due metodi: calcolaArea e calcolaPerimetro che calcolano e restituiscono, rispettivamente, l’area e il perimetro del rettangolo.
Creare una classe Main contenente il metodo main(), nel quale chiedete all’utente di inserire, da console, i valori di base e di
 altezza con cui istanziare un nuovo Rettangolo. Dopo averlo istanziato, stampate a video il perimetro e l’area.
BONUS Aggiungere alla classe Rettangolo un metodo disegna() che stampa in console il rettangolo con le sue dimensioni, come
nell’immagine allegata
*/

    int base;
  int altezza;



 //aggiungiamo costruttore di nome  come la classe



   RettangoloGeometria (int base, int altezza){
      this.base=base;
      this.altezza=altezza;

      //Aggiugngiamo due metodi /

  }

int calcolaArea (){
     int   area= base* altezza;
     return area;

}
 int calcolaPerimetro (){
       int p= 2*(base+altezza);
       return p;
 }

// metodi
}