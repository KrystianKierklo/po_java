class Zgadywanka {
  /* Klasa Zgadywanka ma trzy skladowe
  slużace do przechowywania trzech
  obiektow Gracz. */
  Gracz p1;
  Gracz p2;
  Gracz p3;

  public void rozpocznijGre() {
    /* Utworzenie trzech obiektow
    Gracz i zapisanie ich
    w trzech skladowych. */
    p1 = new Gracz(); 
    p2 = new Gracz();
    p3 = new Gracz();


    /* Deklaracja trzech zmiennych,
    w ktorych beda przechowywane
    trzy liczby wytypowane przez
    poszczegolnych graczy */
    int typp1 = 0;
    int typp2 = 0;
    int typp3 = 0;


    /* Deklaracja trzech zmiennych, ktore beda przechowywać
    wartości true (prawda) lub false (falsz), w zależności
    od odpowiedzi konkretnego gracza. */
    boolean p1odgadl = false;
    boolean p2odgadl = false;
    boolean p3odgadl = false;

    /* Wyznaczenie liczby, jaka beda
    musieli odgadnać gracze.*/
    int liczbaOdgadywana = (int) (Math.random() * 10);
    System.out.println("Myśle o liczbie z zakresu do 0 do 9...");

    while(true) {
      System.out.println("Należy wytypować liczbe: " + liczbaOdgadywana );
      // Wywolanie metody zgaduj() każdego z graczy
      p1.zgaduj();
      p2.zgaduj();
      p3.zgaduj();

      /* Pobranie liczb wytypowanych przez
         każdego z graczy (wynikow wywolania
         metody zgaduj()) poprzez odczytanie
         jej ze skladowych obiektow graczy. */

      typp1 = p1.liczba;
      System.out.println("Gracz pierwszy wytypowal liczbe: " + typp1);

      typp2 = p2.liczba;
      System.out.println("Gracz drugi wytypowal liczbe: " + typp2);

      typp3 = p3.liczba;
      System.out.println("Gracz trzeci wytypowal liczbe: " + typp3);
      

      /* Sprawdzenie liczb wytypowanych przez
      graczy w celu określenia, czy odpowiadaja
      one wyznaczonej liczbie. Jeśli gracz
      wytypowal poprawnie, to odpowiedniej
      zmiennej przypisywana jest wartość true
      (pamietaj, że domyślnie zmienna ta ma
      wartość false). */

      if (typp1 == liczbaOdgadywana) {
        p1odgadl = true;
      }
      if (typp2 == liczbaOdgadywana) {
        p2odgadl = true;
      }
      if (typp3 == liczbaOdgadywana) {
        p3odgadl = true;
      }
      
      /*Jeśli gracz pierwszy LUB gracz drugi, LUB gracz
      trzeci odgadl… (operator || to logiczne LUB).*/
      if (p1odgadl || p2odgadl || p3odgadl) {
        System.out.println("Mamy zwyciezce!");
        System.out.println("Czy gracz pierwszy wytypowal poprawnie? " + p1odgadl);
        System.out.println("Czy gracz drugi wytypowal poprawnie? " + p2odgadl);
        System.out.println("Czy gracz trzeci wytypowal poprawnie? " + p3odgadl);
        System.out.println("Koniec gry.");
        break; // Gra skończona, zatem wychodzimy z petli while
      } else {
        /*W przeciwnym przypadku petla jest dalej
        realizowana, a gracze sa proszeni
        o wytypowanie kolejnych liczb. */
        System.out.println("Gracze beda musieli sprobować jeszcze raz.");
      } // if - else
    } // koniec while
  } // koniec metody rozpocznijGre
} // koniec klasy
