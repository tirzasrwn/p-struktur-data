package com.tirzasrwn.app.m14;
import java.util.Scanner;

class FormatBiodata {
  int nim;
  String nama;
  String alamat;
  int umur;
  char jekel;
  float ipk;
}

public class Hashing {
  public static int N = 1000; // Initialize N to 1000

  public static int hitungNilaiHash(int nilaiAwal) { return nilaiAwal % 997; }

  public static void ngentriData(FormatBiodata biodataMahasiswa[]) {
    Scanner masukan = new Scanner(System.in);
    System.out.print("Berapa data yang akan dientri ? : ");
    int banyakEntri = masukan.nextInt();

    FormatBiodata biodataMahasiswaBaru;
    for (int i = 0; i < banyakEntri; i++) {
      biodataMahasiswaBaru = new FormatBiodata();
      System.out.print("Silakan masukkan NIM anda : ");
      biodataMahasiswaBaru.nim = masukan.nextInt();
      System.out.print("Silakan masukkan nama anda : ");
      biodataMahasiswaBaru.nama = masukan.next();
      System.out.print("Silakan masukkan alamat anda : ");
      biodataMahasiswaBaru.alamat = masukan.next();
      System.out.print("Silakan masukkan umur anda : ");
      biodataMahasiswaBaru.umur = masukan.nextInt();
      System.out.print("Silakan masukkan Jenis Kelamin anda : ");
      biodataMahasiswaBaru.jekel = masukan.next().charAt(0);
      System.out.print("Silakan masukkan IPK anda : ");
      biodataMahasiswaBaru.ipk = masukan.nextFloat();

      int NH = hitungNilaiHash(biodataMahasiswaBaru.nim);
      //+++++++ MENGATASI COLLISION +++++++++++++++++++++
      while (biodataMahasiswa[NH].nama != null) {
        System.out.println("terjadi tabrakan pada NH=" + NH);
        NH++;
      }
      //+++++++++++++++++++++++++++++++++++++++++++++++++++
      System.out.println("Biodata " + biodataMahasiswaBaru.nama +
                         " ditempatkan pada larik ke : " + NH);
      biodataMahasiswa[NH] = biodataMahasiswaBaru;
    }
  }

  public static void berhentiSebentar() {
    System.out.println("");
    System.out.println("Tekan tombol ENTER untuk melanjutkan .. ");
    Scanner masukan = new Scanner(System.in);
    masukan.nextLine(); // Use nextLine to consume the newline character
  }

  public static void tampilkanData(FormatBiodata biodataMahasiswa[]) {
    System.out.println("---");
    System.out.println("NO NAMA ALAMAT UMUR JEKEL IPK");
    System.out.println("---");
    for (int i = 0; i < N; i++) {
      System.out.print(i + " ");
      System.out.print(biodataMahasiswa[i].nama + "\t ");
      System.out.print(biodataMahasiswa[i].alamat + "\t ");
      System.out.print(biodataMahasiswa[i].umur + "\t ");
      System.out.print(biodataMahasiswa[i].jekel + "\t ");
      System.out.println(biodataMahasiswa[i].ipk);
      if (i % 100 == 0 && i != 0) // Adjust condition to avoid unnecessary
                                  // pauses at the beginning
        berhentiSebentar();
    }
    System.out.println("---");
  }

  public static void cariData(FormatBiodata biodataMahasiswa[], int cariNIM) {
    int NH = hitungNilaiHash(cariNIM);
    int awalNH = NH; // Simpan nilai awal NH untuk menentukan kondisi berhenti

    // Lakukan pencarian dengan linear probing hingga menemukan data atau
    // mengetahui bahwa data tidak ada
    while (biodataMahasiswa[NH].nim != 0 &&
           biodataMahasiswa[NH].nim != cariNIM) {
      NH = (NH + 1) % N; // Geser ke indeks berikutnya dengan linear probing
      if (NH == awalNH) {
        // Kembali ke awal jika sudah menjelajahi seluruh tabel
        System.out.println("Data dengan NIM " + cariNIM + " tidak ditemukan.");
        return;
      }
    }

    if (biodataMahasiswa[NH].nim == cariNIM) {
      System.out.println("Data dengan NIM " + cariNIM +
                         " ditemukan pada indeks " + NH);
      System.out.println("Detail Biodata:");
      System.out.println("NIM   : " + biodataMahasiswa[NH].nim);
      System.out.println("Nama  : " + biodataMahasiswa[NH].nama);
      System.out.println("Alamat: " + biodataMahasiswa[NH].alamat);
      System.out.println("Umur  : " + biodataMahasiswa[NH].umur);
      System.out.println("Jekel : " + biodataMahasiswa[NH].jekel);
      System.out.println("IPK   : " + biodataMahasiswa[NH].ipk);
    } else {
      System.out.println("Data dengan NIM " + cariNIM + " tidak ditemukan.");
    }
  }

  public static void main(String[] args) {
    FormatBiodata biodataMahasiswa[] = new FormatBiodata[1000];
    for (int i = 0; i < 1000; i++)
      biodataMahasiswa[i] = new FormatBiodata();

    ngentriData(biodataMahasiswa);
    // tampilkanData(biodataMahasiswa);

    Scanner masukan = new Scanner(System.in);
    System.out.print("Masukkan NIM yang akan dicari: ");
    int cariNIM = masukan.nextInt();

    cariData(biodataMahasiswa, cariNIM);
  }
}
