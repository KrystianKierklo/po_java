public class FilmTester {
   public static void main(String[] args) {
      Film pierwszy = new Film();
      pierwszy.tytul = "Przeminelo z hossa";
      pierwszy.rodzaj = "Tragedia";
      pierwszy.ocena = -2;
      Film drugi = new Film();
      drugi.tytul = "Matrix dla zuchwalych";
      drugi.rodzaj = "Komedia";
      drugi.ocena = 5;
      drugi.odtworz();
      Film trzeci = new Film();
      trzeci.tytul = "Byte Club";
      trzeci.rodzaj = "Tragedia, ale o wydzwieku optymistycznym";
      trzeci.ocena = 127;
      trzeci.wypiszInfo();
   }
}
