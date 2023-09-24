package com.tirzasrwn.app.m02;

import java.util.Scanner;

class formatBiodataT {
  String nama;
  String alamat;
  int umur;
  char jekel;
  String hobi[] = new String[3];
  float ipk;
}

class Tugas1 {
  public static final int MAX_MAHASISWA = 20;
  public static int jumlahDataMahasiswa;
  public static Scanner masukan = new Scanner(System.in);

  private static void ngentriData(formatBiodataT biodataMahasiswa[]) {
    for (int i = 0; i < biodataMahasiswa.length; i++) {
      jumlahDataMahasiswa++;
      biodataMahasiswa[i] = new formatBiodataT();
      System.out.print("Silakan masukkan nama anda: ");
      biodataMahasiswa[i].nama = masukan.next();
      System.out.print("Silakan masukkan alamat anda: ");
      biodataMahasiswa[i].alamat = masukan.next();
      System.out.print("Silakan masukkan umur anda: ");
      biodataMahasiswa[i].umur = masukan.nextInt();
      System.out.print("Silakan masukkan jenis kelamin anda: ");
      try {
        int bacaTombol = 0;
        bacaTombol = System.in.read();
        biodataMahasiswa[i].jekel = (char)bacaTombol;
      } catch (java.io.IOException e) {
        System.out.println("IOException: " + e.getMessage());
      }
      System.out.println("Silakan masukkan hobi (maks 3): ");
      for (int j = 0; j < biodataMahasiswa[i].hobi.length; j++) {
        System.out.print("hobi ke-" + (j + 1) + ": ");
        biodataMahasiswa[i].hobi[j] = masukan.next();
      }
      System.out.print("Silakan masukkan IPK anda: ");
      biodataMahasiswa[i].ipk = masukan.nextFloat();
      System.out.println();
      if (jumlahDataMahasiswa == MAX_MAHASISWA) {
        System.out.println("Maaf, memori sudah penuh!");
        return;
      }
      if (!ambilJawaban()) {
        return;
      }
    }
  }

  private static void tampilkanData(formatBiodataT biodataMahasiswa[]) {
    System.out.println();
    System.out.printf("|%-10s|%-10s|%-6s|%-6s|%-10s|%-10s|%-10s|%-4s|\n",
                      "NAMA", "ALAMAT", "UMUR", "JEKEL", "HOBI1", "HOBI2",
                      "HOBI3", "IPK");
    for (int i = 0; i < jumlahDataMahasiswa; i++) {
      System.out.printf("|%-10s|%-10s|%-6d|%-6s|%-10s|%-10s|%-10s|%-4.2f|\n",
                        biodataMahasiswa[i].nama, biodataMahasiswa[i].alamat,
                        biodataMahasiswa[i].umur, biodataMahasiswa[i].jekel,
                        biodataMahasiswa[i].hobi[0],
                        biodataMahasiswa[i].hobi[1],
                        biodataMahasiswa[i].hobi[2], biodataMahasiswa[i].ipk);
    }
  }

  private static boolean ambilJawaban() {
    System.out.print("Apakah anda ingin melanjutkan? (y/n): ");
    if (!masukan.next().contains("y")) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    formatBiodataT biodataMahasiswa[] = new formatBiodataT[MAX_MAHASISWA];
    ngentriData(biodataMahasiswa);
    tampilkanData(biodataMahasiswa);
    masukan.close();
  }
}
