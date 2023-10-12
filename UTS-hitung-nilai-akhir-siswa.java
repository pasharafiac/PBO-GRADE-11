import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // membuat objek scanner untuk sistem input
    Scanner input = new Scanner(System.in);

    // input nama (string)
    System.out.print("Masukan nama: ");
    String namaSiswa = input.nextLine();
    
    // input kelas {integer}
    System.out.print("Masukan kelas: ");
    int kelasSiswa = input.nextInt();

    // input nomor absen (integer)
    System.out.print("Masukan nomor absen: ");
    int absenSiswa = input.nextInt();

    // input nilai tugas PBO (int)
    System.out.print("Masukan nilai PBO: ");
    int nilaiTugas = input.nextInt();

    // input nilai UTS (int)
    System.out.print("Masukan nilai UTS: ");
    int nilaiUts = input.nextInt();

    // input nilai UAS (int)
    System.out.print("Masukan nilai UAS: ");
    int nilaiUas = input.nextInt();

    // mendapatkan nilai akhir tugas, uts, dan uas
    double nilaiAkhirTugas = nilaiTugas * 0.10;
    double nilaiAkhirUts = nilaiUts * 0.30;
    double nilaiAkhirUas = nilaiUas * 0.60;

    // menjumlahkan semua nilai lalu dibagi 3
    double nilaiRataRataKeseluruhan = nilaiAkhirTugas + nilaiAkhirUts + nilaiAkhirUas;

    System.out.println(nilaiRataRataKeseluruhan);

    // jika nilai 100-85 maka nilai A
    if (nilaiRataRataKeseluruhan >= 85 && nilaiRataRataKeseluruhan <= 100){
      System.out.println("Siswa " + namaSiswa + " mendapatkan nilai A dengan nilai akhir " + nilaiRataRataKeseluruhan);
    } 

    // jika nilai 84-75 maka nilai B
    else if (nilaiRataRataKeseluruhan >= 75 && nilaiRataRataKeseluruhan <= 84){
      System.out.println("Siswa " + namaSiswa + " mendapatkan nilai B dengan nilai akhir " + nilaiRataRataKeseluruhan);
    } 

    // jika nilai 74-65 maka nilai C
    else if (nilaiRataRataKeseluruhan >= 65 && nilaiRataRataKeseluruhan <= 74){
      System.out.println("Siswa " + namaSiswa + " mendapatkan nilai C dengan nilai akhir " + nilaiRataRataKeseluruhan);
    } 

    // jika nilai 74-65 maka nilai C
    else if (nilaiRataRataKeseluruhan >= 50 && nilaiRataRataKeseluruhan <= 64){
      System.out.println("Siswa " + namaSiswa + " mendapatkan nilai D dengan nilai akhir " + nilaiRataRataKeseluruhan);
    }

    // ketika dibawah 50
    else {
      System.out.println("\n\n [HASIL] Siswa " + namaSiswa + " mendapatkan nilai D dengan nilai akhir " + nilaiRataRataKeseluruhan);
    }
  }
}
