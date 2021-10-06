class Gracz {
  int liczba = 0; // tu jest zapisywana typowana liczba 

  public void zgaduj() {
    liczba = (int) (Math.random() * 10);
    System.out.println("Typuje liczbe: " + liczba);
  }
}
