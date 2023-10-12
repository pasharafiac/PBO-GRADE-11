import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // deklarasi variabel
    Scanner input = new Scanner(System.in);
    String namaSiswa;
    // input prompt
    System.out.print("Masukan nama siswa: ");
    namaSiswa = input.nextLine();

    // switch case handler
    switch(namaSiswa){
      case "rafi":
        System.out.println(namaSiswa + " hadir");
        break;
      case "agustiar":
        System.out.println(namaSiswa + " hadir");
        break;
      case "zaki":
        System.out.println(namaSiswa + " hadir");
        break;
      default:
        System.out.println(namaSiswa + " bolos");
        break;
    }

      
  }
}