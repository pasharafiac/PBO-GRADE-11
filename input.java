import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // deklarasi variabel
    Scanner input = new Scanner(System.in);
    String nama;
    int kelas;
    double usia;
    float absen;

    // input field nama
    System.out.print("Masukan nama: ");
    nama = input.nextLine();
    
    // input field kelas
    System.out.print("Masukan kelas: ");
    kelas = input.nextInt();
    
    // input field usia
    System.out.print("Masukan usia: ");
    usia = input.nextDouble();
    
    // input field absen
    System.out.print("Masukan absen: ");
    absen = input.nextFloat();

    System.out.println("\nNama: " + nama);
    System.out.println("Kelas: " + kelas);
    System.out.println("Usia: " + usia);
    System.out.println("Absen: " + absen);
  }
}