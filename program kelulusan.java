class Main {
  public static void main(String[] args) {
    // data nilai siswa
    float nilaiBindo = 85;
    float nilaiMtk = 70;
    float nilaiPbo = 90;
    float nilaiDatabase = 70;
    float nilaiPpl = 95;
    float nilaiIot = 85;

    // menghitung nilai rata rata
    double nilaiRataRata = (nilaiBindo + nilaiMtk + nilaiPbo + nilaiDatabase + nilaiPpl + nilaiIot) / 6;

    // siswa dinyatakan lulus apabila nilai diatas atau sama dengan 75
    if (nilaiRataRata >= 75){
      System.out.println("ANDA LULUS");
    } 
    // siswa dinyatakan tidak lulus apabila nilai kurang dari 75
    else {
      System.out.println("MAAF ANDA TIDAK LULUS");
    }
  }
}