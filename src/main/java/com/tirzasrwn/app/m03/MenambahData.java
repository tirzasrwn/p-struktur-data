package com.tirzasrwn.app.m03;

import java.util.Scanner;

class formatBiodata {
  String nama;
  String alamat;
  int umur;
  char jekel;
  String hobi[] = new String[3];
  float ipk;
}

/**
 * MenambahData
 */
public class MenambahData {
  public static int N = 3;
  public static void ngentriData(formatBiodata biodataMahasiswa[]) {
    Scanner masukan = new Scanner(System.in);
    int bacaTombol = 0;
    for (int i = 0; i <= N - 1; i++) {
      System.out.print("Silakan masukkan nama anda : ");
      biodataMahasiswa[i].nama = masukan.next();
      System.out.print("Silakan masukkan alamat anda : ");
      biodataMahasiswa[i].alamat = masukan.next();
      System.out.print("Silakan masukkan umur anda : ");
      biodataMahasiswa[i].umur = masukan.nextInt();
      System.out.print("Silakan masukkan Jenis Kelamin anda : ");
      try {
        bacaTombol = System.in.read();
      } catch (java.io.IOException e) {
      }
      biodataMahasiswa[i].jekel = (char)bacaTombol;
      System.out.println("Silakan masukkan hobi (maks 3) : ");
      System.out.print("hobi ke-0 : ");
      biodataMahasiswa[i].hobi[0] = masukan.next();
      System.out.print("hobi ke-1 : ");
      biodataMahasiswa[i].hobi[1] = masukan.next();
      System.out.print("hobi ke-2 : ");
      biodataMahasiswa[i].hobi[2] = masukan.next();
      System.out.print("Silakan masukkan IPK anda : ");
      biodataMahasiswa[i].ipk = masukan.nextFloat();
      System.out.println("");
    }
  }

  public static void tampilkanData(formatBiodata biodataMahasiswa[]) {
    System.out.println("");
    System.out.println("NAMA\tALAMAT\tUMUR\tJEKEL\tHOBI1\tHOBI2\tHOBI3\tIPK");
    System.out.println("");
    for (int i = 0; i <= N - 1; i++) {
      System.out.print(biodataMahasiswa[i].nama + "\t");
      System.out.print(biodataMahasiswa[i].alamat + "\t");
      System.out.print(biodataMahasiswa[i].umur + "\t");
      System.out.print(biodataMahasiswa[i].jekel + "\t");
      System.out.print(biodataMahasiswa[i].hobi[0] + "\t");
      System.out.print(biodataMahasiswa[i].hobi[1] + "\t");
      System.out.print(biodataMahasiswa[i].hobi[2] + "\t");
      System.out.println(biodataMahasiswa[i].ipk);
    }
    System.out.println();
  }

  public static void tambahDataDiDepan(formatBiodata biodataMahasiswa[]) {
    formatBiodata biodataMahasiswaBaru = new formatBiodata();
    Scanner masukan = new Scanner(System.in);
    int bacaTombol = 0;
    System.out.print("Silakan masukkan nama anda : ");
    biodataMahasiswaBaru.nama = masukan.next();
    System.out.print("Silakan masukkan alamat anda : ");
    biodataMahasiswaBaru.alamat = masukan.next();
    System.out.print("Silakan masukkan umur anda : ");
    biodataMahasiswaBaru.umur = masukan.nextInt();
    System.out.print("Silakan masukkan Jenis Kelamin anda : ");
    try {
      bacaTombol = System.in.read();
    } catch (java.io.IOException e) {
    }
    biodataMahasiswaBaru.jekel = (char)bacaTombol;
    System.out.println("Silakan masukkan hobi (maks 3) : ");
    System.out.print("hobi ke-0 : ");
    biodataMahasiswaBaru.hobi[0] = masukan.next();
    System.out.print("hobi ke-1 : ");
    biodataMahasiswaBaru.hobi[1] = masukan.next();
    System.out.print("hobi ke-2 : ");
    biodataMahasiswaBaru.hobi[2] = masukan.next();
    System.out.print("Silakan masukkan IPK anda : ");
    biodataMahasiswaBaru.ipk = masukan.nextFloat();
    for (int i = N - 1; i >= 0; i--) {
      biodataMahasiswa[i + 1] = biodataMahasiswa[i];
    }
    biodataMahasiswa[0] = biodataMahasiswaBaru;
    N++;
  }

  public static void tambahDataDiTengah(formatBiodata biodataMahasiswa[]) {
    formatBiodata biodataMahasiswaBaru = new formatBiodata();
    Scanner masukan = new Scanner(System.in);
    int bacaTombol = 0;
    System.out.print("Silakan masukkan nama anda : ");
    biodataMahasiswaBaru.nama = masukan.next();
    System.out.print("Silakan masukkan alamat anda : ");
    biodataMahasiswaBaru.alamat = masukan.next();
    System.out.print("Silakan masukkan umur anda : ");
    biodataMahasiswaBaru.umur = masukan.nextInt();
    System.out.print("Silakan masukkan Jenis Kelamin anda : ");
    try {
      bacaTombol = System.in.read();
    } catch (java.io.IOException e) {
    }
    biodataMahasiswaBaru.jekel = (char)bacaTombol;
    System.out.println("Silakan masukkan hobi (maks 3) : ");
    System.out.print("hobi ke-0 : ");
    biodataMahasiswaBaru.hobi[0] = masukan.next();
    System.out.print("hobi ke-1 : ");
    biodataMahasiswaBaru.hobi[1] = masukan.next();
    System.out.print("hobi ke-2 : ");
    biodataMahasiswaBaru.hobi[2] = masukan.next();
    System.out.print("Silakan masukkan IPK anda : ");
    biodataMahasiswaBaru.ipk = masukan.nextFloat();
    int T;
    System.out.print("Pada posisi ke berapa data akan dimasukkan ? : ");
    T = masukan.nextInt();
    for (int i = N - 1; i >= T; i--) {
      biodataMahasiswa[i + 1] = biodataMahasiswa[i];
    }
    biodataMahasiswa[T] = biodataMahasiswaBaru;
    N++;
  }

  public static void tambahDataDiBelakang(formatBiodata biodataMahasiswa[]) {
    formatBiodata biodataMahasiswaBaru = new formatBiodata();
    Scanner masukan = new Scanner(System.in);
    int bacaTombol = 0;
    System.out.print("Silakan masukkan nama anda : ");
    biodataMahasiswaBaru.nama = masukan.next();
    System.out.print("Silakan masukkan alamat anda : ");
    biodataMahasiswaBaru.alamat = masukan.next();
    System.out.print("Silakan masukkan umur anda : ");
    biodataMahasiswaBaru.umur = masukan.nextInt();
    System.out.print("Silakan masukkan Jenis Kelamin anda : ");
    try {
      bacaTombol = System.in.read();
    } catch (java.io.IOException e) {
    }
    biodataMahasiswaBaru.jekel = (char)bacaTombol;
    System.out.println("Silakan masukkan hobi (maks 3) : ");
    System.out.print("hobi ke-0 : ");
    biodataMahasiswaBaru.hobi[0] = masukan.next();
    System.out.print("hobi ke-1 : ");
    biodataMahasiswaBaru.hobi[1] = masukan.next();
    System.out.print("hobi ke-2 : ");
    biodataMahasiswaBaru.hobi[2] = masukan.next();
    System.out.print("Silakan masukkan IPK anda : ");
    biodataMahasiswaBaru.ipk = masukan.nextFloat();
    biodataMahasiswa[N] = biodataMahasiswaBaru;
    N++;
  }

  public static void hapusDataDiDepan(formatBiodata biodataMahasiswa[]) {
    for (int i = 0; i <= N - 2; i++) {
      biodataMahasiswa[i] = biodataMahasiswa[i + 1];
    }
    System.out.println("Proses menghapus data ke-0 selesai.");
    N--;
  }

  public static void hapusDataDiTengah(formatBiodata biodataMahasiswa[]) {
    Scanner masukan = new Scanner(System.in);
    int T;
    System.out.print("Tuliskan posisi data yang akan dibapus : ");
    T = masukan.nextInt();
    for (int i = T; i <= N - 2; i++) {
      biodataMahasiswa[i] = biodataMahasiswa[i + 1];
    }
    System.out.println("Proses menghapus data ke-" + T + " selesai.");
    N--;
  }

  public static void hapusDataDiBelakang(formatBiodata biodataMahasiswa[]) {
    System.out.println("Proses menghapus data paling akhir selesai.");
    N--;
  }

  public static void tukarData(int indexA, int indexB,
                               formatBiodata biodataMahasiswa[]) {
    formatBiodata tmpBiodataA = biodataMahasiswa[indexA];
    biodataMahasiswa[indexA] = biodataMahasiswa[indexB];
    biodataMahasiswa[indexB] = tmpBiodataA;
  }

  public static void editData(int indexEdit, formatBiodata biodataMahasiswa[]) {
    formatBiodata biodataMahasiswaBaru = new formatBiodata();
    System.out.println("Edit data mahasiswa index ke-" + indexEdit);
    Scanner masukan = new Scanner(System.in);
    int bacaTombol = 0;
    System.out.print("Silakan masukkan nama anda : ");
    biodataMahasiswaBaru.nama = masukan.next();
    System.out.print("Silakan masukkan alamat anda : ");
    biodataMahasiswaBaru.alamat = masukan.next();
    System.out.print("Silakan masukkan umur anda : ");
    biodataMahasiswaBaru.umur = masukan.nextInt();
    System.out.print("Silakan masukkan Jenis Kelamin anda : ");
    try {
      bacaTombol = System.in.read();
    } catch (java.io.IOException e) {
    }
    biodataMahasiswaBaru.jekel = (char)bacaTombol;
    System.out.println("Silakan masukkan hobi (maks 3) : ");
    System.out.print("hobi ke-0 : ");
    biodataMahasiswaBaru.hobi[0] = masukan.next();
    System.out.print("hobi ke-1 : ");
    biodataMahasiswaBaru.hobi[1] = masukan.next();
    System.out.print("hobi ke-2 : ");
    biodataMahasiswaBaru.hobi[2] = masukan.next();
    System.out.print("Silakan masukkan IPK anda : ");
    biodataMahasiswaBaru.ipk = masukan.nextFloat();
    biodataMahasiswa[indexEdit] = biodataMahasiswaBaru;
  }

  public static void main(String[] args) {
    formatBiodata biodataMahasiswa[] = new formatBiodata[10];
    biodataMahasiswa[0] = new formatBiodata();
    biodataMahasiswa[1] = new formatBiodata();
    biodataMahasiswa[2] = new formatBiodata();
    ngentriData(biodataMahasiswa);
    tampilkanData(biodataMahasiswa);
    // tambahDataDiDepan(biodataMahasiswa);
    // tambahDataDiTengah(biodataMahasiswa);
    tambahDataDiBelakang(biodataMahasiswa);
    // hapusDataDiDepan(biodataMahasiswa);
    // hapusDataDiTengah(biodataMahasiswa);
    // hapusDataDiBelakang(biodataMahasiswa);
    // tukarData(0, 2, biodataMahasiswa);
    // editData(1, biodataMahasiswa);
    tampilkanData(biodataMahasiswa);
  }
}
