class Main {
  public static void main(String[] args) {
    // variabel konstanta
    double phi = 22/7;
    int radius = 21;

    // proses menghitung keliling lingkaran
    double keliling = 2 * phi * radius;

    // proses memnghitung luas lingkaran
    double luas = phi * radius * radius;

    // mencetak hasilnya
    System.out.println("Luas nya adalah: " + luas);
    System.out.println("Keliling nya adalah: " + keliling);
  }
}