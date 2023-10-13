package com.tirzasrwn.app.m04;

import java.util.Scanner;

/**
 * BinarySearch
 */
public class BinarySearch {

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

  public static void mencariDataBiner(formatBiodata biodataMahasiswa[]) {
    String kataKunci;
    int lokasi = -1;
    boolean statusKetemu = false;
    Scanner masukan = new Scanner(System.in);
    System.out.print("Masukkan kata kunci pencarian : ");
    kataKunci = masukan.next();
    int atas, bawah, tengah;
    atas = 0;
    bawah = N - 1;
    tengah = (atas + bawah) / 2;
    while ((statusKetemu == false) && (bawah - atas != 1)) {
      System.out.println(biodataMahasiswa[tengah].nama + " <---> " + kataKunci);
      if (kataKunci.compareTo(biodataMahasiswa[tengah].nama) < 0) {
        bawah = tengah;
        tengah = (atas + bawah) / 2;
      } else if (kataKunci.compareTo(biodataMahasiswa[tengah].nama) > 0) {
        atas = tengah;
        tengah = (atas + bawah) / 2;
      } else {
        statusKetemu = true;
        lokasi = tengah;
      }
    }
    if (statusKetemu == true) {
      System.out.println("Data yang anda cari KETEMU di larik ke :" + lokasi);
    } else {
      System.out.println("maap, nama yang anda cari tidak ditemukan ");
    }
  }

  public static void main(String[] args) {
    formatBiodata biodataMahasiswa[] = new formatBiodata[10];
    biodataMahasiswa[0] = new formatBiodata();
    biodataMahasiswa[1] = new formatBiodata();
    biodataMahasiswa[2] = new formatBiodata();
    ngentriData(biodataMahasiswa);
    tampilkanData(biodataMahasiswa);
    mencariDataBiner(biodataMahasiswa);
  }
}
