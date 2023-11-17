package com.tirzasrwn.app.m09;

import java.util.Scanner;
class simpul {
  String nama;
  String alamat;
  int umur;
  char jekel;
  String hobi[] = new String[3];
  float ipk;
  simpul kanan;
}

/**
 * SingleLinkedList
 */
public class SingleLinkedList {
  public static simpul awal;
  public static simpul akhir;
  public static void inisialisasiSenaraiKosong() {
    awal = null;
    akhir = null;
  }
  public static void tambahDepan() {
    //------------bagian entri data dari keyboard--------------
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
    //------------bagian menciptakan & mengisi simpul baru--------------
    simpul baru;
    baru = new simpul();
    baru.nama = NAMA;
    baru.alamat = ALAMAT;
    baru.umur = UMUR;
    baru.jekel = JEKEL;
    baru.hobi[0] = HOBI[0];
    baru.hobi[1] = HOBI[1];
    baru.hobi[2] = HOBI[2];
    baru.ipk = IPK;
    //---------bagian mencangkokkan simpul baru ke dalam simpul lama------------
    if (awal == null)
    // jika senarai masih kosong
    {
      awal = baru;
      akhir = baru;
      baru.kanan = null;
    } else // jika senarai tidak kosong
    {
      baru.kanan = awal;
      awal = baru;
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
    //------------bagian menciptakan & mengisi simpul baru--------------
    simpul baru;
    baru = new simpul();
    baru.nama = NAMA;
    baru.alamat = ALAMAT;
    baru.umur = UMUR;
    baru.jekel = JEKEL;
    baru.hobi[0] = HOBI[0];
    baru.hobi[1] = HOBI[1];
    baru.hobi[2] = HOBI[2];
    baru.ipk = IPK;
    //----------bagian mencangkokkan simpul baru ke dalam simpul lama----------
    // jika senarai kosong
    if (awal == null) {
      awal = baru;
      akhir = baru;
      baru.kanan = null;
    } else
    // jika senarai tidak kosong
    {
      akhir.kanan = baru;
      akhir = baru;
      baru.kanan = null;
    }
  }
  public static void cetakSenarai() {
    if (awal == null) // jika senarai masih kosong
      System.out.print("....MAAF SENARAI KOSONG. ...");
    else // jika senarai tidak kosong
    {
      System.out.println();
      System.out.println("NO\t NAMA\t ALAMAT\t UMUR\t JEKEL\t IPK");
      System.out.println();
      simpul bantu;
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
    }
  }

  public static int hitungJumlahSimpul() {
    int N = 0;
    simpul bantu;
    bantu = awal;
    while (bantu != null) {
      N++;
      bantu = bantu.kanan;
    }
    return (N);
  }

  public static void tambahTengah() {
    Scanner masukan1 = new Scanner(System.in);
    System.out.println("Tentukan Lokasi Penambahan Data");
    int LOKASI = masukan1.nextInt();
    int jumlahSimpulYangAda = hitungJumlahSimpul();
    if (LOKASI == 1)
      System.out.println("Lakukan penambahan di depan");
    else if (LOKASI > jumlahSimpulYangAda)
      System.out.println("Lakukan penambahan di belakang");
    else {
      //------------bagian entri data dari keyboard--------------
      String NAMA;
      String ALAMAT;
      int UMUR;
      char JEKEL;
      String HOBI[] = new String[3];
      float IPK;
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
      //------------bagian menemukan posisi yang dikehendaki--------------
      simpul bantu;
      bantu = awal;
      int N = 1;
      while ((N < LOKASI - 1) && (bantu != akhir)) {
        bantu = bantu.kanan;
        N++;
      }
      //------------bagian menciptakan & mengisi simpul baru--------------
      simpul baru = new simpul();
      baru.nama = NAMA;
      baru.alamat = ALAMAT;
      baru.umur = UMUR;
      baru.jekel = JEKEL;
      baru.hobi[0] = HOBI[0];
      baru.hobi[1] = HOBI[1];
      baru.hobi[2] = HOBI[2];
      baru.ipk = IPK;
      //--------bagian mencangkokkan simpul baru ke dalam linkedlist lama------
      baru.kanan = bantu.kanan;
      bantu.kanan = baru;
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
      if (awal == akhir) // jika hanya ada sebuah simpul
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
      } else {
        simpul bantu;
        bantu = awal;
        while (bantu.kanan.nama.equals(NAMACARI) == false) {
          bantu = bantu.kanan;
          if (bantu.kanan == null)
            break;
        }
        if ((bantu == akhir) && (akhir.nama.equals(NAMACARI) == false)) {
          System.out.println("data " + NAMACARI + " tidak ditemukan");
        } else if (akhir.nama.equals(NAMACARI)) // jika nama ditemukan di akhir
        {
          bantu.kanan = null;
          akhir = bantu;
        } else {
          System.out.println("menghapus " + NAMACARI + " dilakukan..");
          bantu.kanan = bantu.kanan.kanan;
        }
      }
    }
  }
  //---------bagian program utama-----------
  public static void main(String[] args) {
    System.out.println("Hello, world!");
    inisialisasiSenaraiKosong();
    tambahDepan();
    tambahDepan();
    tambahDepan();
    tambahDepan();
    tambahBelakang();
    tambahBelakang();
    tambahBelakang();
    tambahBelakang();
    tambahTengah();
    hapus();
    cetakSenarai();
  }
}
