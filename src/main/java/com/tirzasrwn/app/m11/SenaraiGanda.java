package com.tirzasrwn.app.m11;

import java.util.Scanner;

class simpulG { // bagian deklarasi struktur record
                // ------------------------------
  String nama;
  String alamat;
  int umur;
  char jekel;
  String hobi[] = new String[3];
  float ipk;
  simpulG kiri;
  simpulG kanan;
}

/**
 * SenaraiGanda
 */
public class SenaraiGanda {
  public static simpulG awal;
  public static simpulG akhir;
  public static void inisialisasiSenaraiKosong() {
    awal = null;
    akhir = null;
  }
  public static void
  tambahDepan() { //------------bagian entri data dari keyboard--------------
    String NAMA;
    String ALAMAT;
    int UMUR;
    char JEKEL;
    String HOBI[] = new String[3];
    float IPK;
    Scanner masukan = new Scanner(System.in);
    int bacaTombol = 0;
    System.out.println("TAMBAH DEPAN : ");
    System.out.print("Silakan masukkan nama anda : ");
    NAMA = masukan.nextLine();
    System.out.print("Silakan masukkan alamat anda : ");
    ALAMAT = masukan.nextLine();
    System.out.print("Silakan masukkan umur anda : ");
    UMUR = masukan.nextInt();
    System.out.print("Silakan masukkan Jenis Kelamin anda : ");
    try {
      bacaTombol = System.in.read();
    } catch (java.io.IOException e) {
    }
    JEKEL = (char)bacaTombol;
    System.out.println("Silakan masukkan hobi (maks 3) : ");
    System.out.print("hobi ke-0 : ");
    HOBI[0] = masukan.next();
    System.out.print("hobi ke-1 : ");
    HOBI[1] = masukan.next();
    System.out.print("hobi ke-2 : ");
    HOBI[2] = masukan.next();
    System.out.print("Silakan masukkan IPK anda : ");
    IPK = masukan.nextFloat();
    //------------bagian menciptakan & mengisi simpulG baru--------------
    simpulG baru;
    baru = new simpulG();
    baru.nama = NAMA;
    baru.alamat = ALAMAT;
    baru.umur = UMUR;
    baru.jekel = JEKEL;
    baru.hobi[0] = HOBI[0];
    baru.hobi[1] = HOBI[1];
    baru.hobi[2] = HOBI[2];
    baru.ipk = IPK;
    //--------bagian mencangkokkan simpulG baru ke dalam simpul lama----------
    if (awal == null)
    // jika senarai masih kosong
    {
      awal = baru;
      akhir = baru;
      baru.kiri = null;
      baru.kanan = null;
    } else // jika senarai tidak kosong
    {
      baru.kanan = awal;
      awal.kiri = baru;
      awal = baru;
      awal.kiri = null;
    }
  }
  public static void tambahBelakang() {
    //------------bagian entri data dari keyboard--------------
    String NAMA;
    String ALAMAT;
    int UMUR;
    char JEKEL;
    String HOBI[] = new String[3];
    float IPK;
    Scanner masukan = new Scanner(System.in);
    int bacaTombol = 0;
    System.out.println("TAMBAH BELAKANG : ");
    System.out.print("Silakan masukkan nama anda : ");
    NAMA = masukan.nextLine();
    System.out.print("Silakan masukkan alamat anda : ");
    ALAMAT = masukan.nextLine();
    System.out.print("Silakan masukkan umur anda : ");
    UMUR = masukan.nextInt();
    System.out.print("Silakan masukkan Jenis Kelamin anda : ");
    try {
      bacaTombol = System.in.read();
    } catch (java.io.IOException e) {
    }
    JEKEL = (char)bacaTombol;
    System.out.println("Silakan masukkan hobi (maks 3) : ");
    System.out.print("hobi ke-0 : ");
    HOBI[0] = masukan.next();
    System.out.print("hobi ke-1 : ");
    HOBI[1] = masukan.next();
    System.out.print("hobi ke-2 : ");
    HOBI[2] = masukan.next();
    System.out.print("Silakan masukkan IPK anda : ");
    IPK = masukan.nextFloat();
    //------------bagian menciptakan & mengisi simpulG baru--------------
    simpulG baru;
    baru = new simpulG();
    baru.nama = NAMA;
    baru.alamat = ALAMAT;
    baru.umur = UMUR;
    baru.jekel = JEKEL;
    baru.hobi[0] = HOBI[0];
    baru.hobi[1] = HOBI[1];
    baru.hobi[2] = HOBI[2];
    baru.ipk = IPK;
    //--------bagian mencangkokkan simpulG baru ke dalam simpul lama---------
    if (awal == null)
    // jika senarai kosong
    {
      awal = baru;
      akhir = baru;
      baru.kiri = null;
      baru.kanan = null;
    } else
    // jika senarai tidak kosong
    {
      baru.kiri = akhir;
      akhir.kanan = baru;
      akhir = baru;
      akhir.kanan = null;
    }
  }
  public static int hitungJumlahSimpul() {
    int N = 0;
    simpulG bantu;
    bantu = awal;
    while (bantu != null) {
      N++;
      bantu = bantu.kanan;
    }
    return (N);
  }
  public static void tambahTengah() {
    //------------bagian menentukan lokasi target--------------
    Scanner masukan1 = new Scanner(System.in);
    System.out.println("Tentukan Lokasi Penambahan Data");
    int LOKASI = masukan1.nextInt();
    int jumlahsimpulGYangAda = hitungJumlahSimpul();
    if (LOKASI == 1)
      System.out.println("Lakukan penambahan di depan");
    else if (LOKASI > jumlahsimpulGYangAda)
      System.out.println("Lakukan penambahan di belakang");
    else { //------------bagian entri data dari keyboard--------------
      String NAMA;
      String ALAMAT;
      int UMUR;
      char JEKEL;
      String HOBI[] = new String[3];
      float IPK;
      // Scanner masukan = new Scanner(System.in);
      Scanner masukan = new Scanner(System.in);
      int bacaTombol = 0;
      System.out.println("TAMBAH TENGAH : ");
      System.out.print("Silakan masukkan nama anda : ");
      NAMA = masukan.nextLine();
      System.out.print("Silakan masukkan alamat anda : ");
      ALAMAT = masukan.nextLine();
      System.out.print("Silakan masukkan umur anda : ");
      UMUR = masukan.nextInt();
      System.out.print("Silakan masukkan Jenis Kelamin anda : ");
      try {
        bacaTombol = System.in.read();
      } catch (java.io.IOException e) {
      }
      JEKEL = (char)bacaTombol;
      System.out.println("Silakan masukkan hobi (maks 3) : ");
      System.out.print("hobi ke-0 : ");
      HOBI[0] = masukan.next();
      System.out.print("hobi ke-1 : ");
      HOBI[1] = masukan.next();
      System.out.print("hobi ke-2 : ");
      HOBI[2] = masukan.next();
      System.out.print("Silakan masukkan IPK anda : ");
      IPK = masukan.nextFloat();
      //------------bagian menemukan posisi yang dikehendaki-----------
      simpulG bantu;
      bantu = awal;
      int i = 1;
      while ((i < LOKASI) && (bantu != akhir)) {
        bantu = bantu.kanan;
        i++;
      }
      //------------bagian menciptakan & mengisi simpulG baru-----------
      simpulG baru = new simpulG();
      baru.nama = NAMA;
      baru.alamat = ALAMAT;
      baru.umur = UMUR;
      baru.jekel = JEKEL;
      baru.hobi[0] = HOBI[0];
      baru.hobi[1] = HOBI[1];
      baru.hobi[2] = HOBI[2];
      baru.ipk = IPK;
      //------bagian mencangkokkan simpulG baru ke dalam linkedlist lama------
      baru.kiri = bantu.kiri;
      baru.kiri.kanan = baru;
      baru.kanan = bantu;
      bantu.kiri = baru;
    }
  }
  public static void hapus() {
    if (awal == null) // jika senarai masih kosong
    {
      System.out.println("senarai kosong, menghapus tidak dapat dilakukan");
    } else
    // jika senarai tidak kosong
    {
      Scanner masukan = new Scanner(System.in);
      System.out.print("Silakan masukkan nama yang ingin dihapus : ");
      String NAMACARI = masukan.nextLine();
      if (awal == akhir) // jika hanya ada sebuah simpulG
      {
        if (awal.nama.equals(NAMACARI)) {
          System.out.println("menghapus " + NAMACARI + " dilakukan..");
          inisialisasiSenaraiKosong();
        } else
          System.out.println("data " + NAMACARI + " tidak ditemukan");
      } else if (awal.nama.equals(NAMACARI)) // jika nama ditemukan di awal
      {
        System.out.println("menghapus " + NAMACARI + " dilakukan..");
        awal = awal.kanan;
        awal.kiri = null;
      } else {
        simpulG bantu;
        bantu = awal.kanan;
        while (bantu.nama.equals(NAMACARI) == false) {
          bantu = bantu.kanan;
          if (bantu.kanan == null)
            break;
        }
        if ((bantu == akhir) && (akhir.nama.equals(NAMACARI) == false)) {
          System.out.println("data " + NAMACARI + " tidak ditemukan");
        } else if (akhir.nama.equals(NAMACARI)) // jika nama ditemukan di akhir
        {
          akhir = bantu.kiri;
          akhir.kanan = null;
        } else {
          System.out.println("menghapus " + NAMACARI + " dilakukan..");
          bantu.kanan.kiri = bantu.kiri;
          bantu.kiri.kanan = bantu.kanan;
        }
      }
    }
  }
  public static void cetakSenaraiMaju() {
    if (awal == null) // jika senarai masih kosong
      System.out.print("....MAAF SENARAI KOSONG. ... ");
    else // jika senarai tidak kosong
    {
      System.out.println("-------------");
      System.out.println("NO NAMA ALAMAT UMUR JEKEL IPK ");
      System.out.println("-------------");
      simpulG bantu;
      bantu = awal;
      while (bantu != null) {
        System.out.print(bantu.nama + "\t ");
        System.out.print(bantu.alamat + "\t ");
        System.out.print(bantu.umur + "\t ");
        System.out.print(bantu.jekel + "\t ");
        System.out.print(bantu.hobi[0] + "\t ");
        System.out.print(bantu.hobi[1] + "\t ");
        System.out.print(bantu.hobi[2] + "\t ");
        System.out.println(bantu.ipk);
        bantu = bantu.kanan;
      }
      System.out.println("");
    }
  }
  public static void cetakSenaraiMundur() {
    if (awal == null) // jika senarai masih kosong
      System.out.print("....MAAF SENARAI KOSONG. ... ");
    else // jika senarai tidak kosong
    {
      System.out.println("---------");
      System.out.println("NO NAMA ALAMAT UMUR JEKEL IPK ");
      System.out.println("----------");
      simpulG bantu;
      bantu = akhir;
      while (bantu != null) {
        System.out.print(bantu.nama + "\t ");
        System.out.print(bantu.alamat + "\t ");
        System.out.print(bantu.umur + "\t ");
        System.out.print(bantu.jekel + "\t ");
        System.out.print(bantu.hobi[0] + "\t ");
        System.out.print(bantu.hobi[1] + "\t ");
        System.out.print(bantu.hobi[2] + "\t ");
        System.out.println(bantu.ipk);
        bantu = bantu.kiri;
      }
      System.out.println("");
    }
  }

  public static void tukarNilai(simpulG X, simpulG Y) {
    simpulG sementara = new simpulG();
    sementara.nama = X.nama;
    sementara.alamat = X.alamat;
    sementara.umur = X.umur;
    sementara.jekel = X.jekel;
    sementara.ipk = X.ipk;
    X.nama = Y.nama;
    X.alamat = Y.alamat;
    X.umur = Y.umur;
    X.jekel = Y.jekel;
    X.ipk = Y.ipk;
    Y.nama = sementara.nama;
    Y.alamat = sementara.alamat;
    Y.umur = sementara.umur;
    Y.jekel = sementara.jekel;
    Y.ipk = sementara.ipk;
  }

  public static void mengurutkanDataBubble_TeknikTukarNilai() {
    int N = hitungJumlahSimpul();
    simpulG A = null;
    simpulG B = null;
    simpulG berhenti = akhir.kanan;
    System.out.println("Banyaknya simpul = " + hitungJumlahSimpul());
    for (int i = 1; i <= hitungJumlahSimpul() - 1; i++) {
      A = awal;
      B = awal.kanan;
      int nomor = 1;
      while (B != berhenti) {
        if (A.nama.compareTo(B.nama) > 0) {
          // tukarkan elemen dari simpul A dan elemen dari simpul B
          tukarNilai(A, B);
        }
        A = A.kanan;
        B = B.kanan;
        nomor++;
      }
      berhenti = A;
    }
    System.out.println("===PROSES PENGURUTAN BUBBLE SELESAI======");
  }

  public static void cariLinear() {
    if (awal == null) // jika senarai masih kosong
      System.out.print("....MAAF SENARAI KOSONG. ...");
    else // jika senarai tidak kosong
    {
      Scanner masukan = new Scanner(System.in);
      System.out.print("Silakan masukkan nama yang anda cari : ");
      String NAMACARI = masukan.nextLine();
      boolean statusKetemu = false;
      int i = 0;
      int posisiKetemu = -1;
      simpulG bantu;
      bantu = awal;
      while (bantu != null) {
        if (NAMACARI.equals(bantu.nama)) {
          statusKetemu = true;
          posisiKetemu = i;
        }
        bantu = bantu.kanan;
        i++;
      }
      System.out.println("Status Ketemu = " + statusKetemu + " di posisi ke " +
                         posisiKetemu);
    }
  }

  public static void main(String[] args) {
    inisialisasiSenaraiKosong();
    tambahDepan();
    tambahDepan();
    tambahDepan();
    tambahDepan();
    tambahDepan();
    cetakSenaraiMaju();
    cariLinear();
  }
}
