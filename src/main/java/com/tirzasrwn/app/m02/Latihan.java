package com.tirzasrwn.app.m02;

import java.util.Scanner;

class formatBiodataL {
  String nama;
  String alamat;
  int umur;
  char jekel;
  String hobi[] = new String[3];
  float ipk;
}

class Latihan {

  public static int jumlahDataMahasiswaYangDikehendaki;
  public static Scanner masukan = new Scanner(System.in);
  public static final int MAX_MAHASISWA = 10;
  public static int jumlahDataMahasiswaSekarang;

  private static void setJumlahMahasiswa() {
    System.out.print("Silakan masukkan jumlah mahasiswa: ");
    jumlahDataMahasiswaYangDikehendaki = masukan.nextInt();
    System.out.println();
  }

  private static void ngentriData(formatBiodataL biodataMahasiswa[]) {
    for (int i = 0; i < biodataMahasiswa.length; i++) {
      jumlahDataMahasiswaSekarang++;
      System.out.print("Silakan masukkan nama anda : ");
      biodataMahasiswa[i].nama = masukan.next();
      System.out.print("Silakan masukkan alamat anda : ");
      biodataMahasiswa[i].alamat = masukan.next();
      System.out.print("Silakan masukkan umur anda : ");
      biodataMahasiswa[i].umur = masukan.nextInt();
      System.out.print("Silakan masukkan Jenis Kelamin anda : ");
      try {
        int bacaTombol = 0;
        bacaTombol = System.in.read();
        biodataMahasiswa[i].jekel = (char)bacaTombol;
      } catch (java.io.IOException e) {
        System.out.println("IOException: " + e.getMessage());
      }
      System.out.println("Silakan masukkan hobi (maks 3) : ");
      for (int j = 0; j < biodataMahasiswa[i].hobi.length; j++) {
        System.out.print("hobi ke-" + (j + 1) + " : ");
        biodataMahasiswa[i].hobi[j] = masukan.next();
      }
      System.out.print("Silakan masukkan IPK anda : ");
      biodataMahasiswa[i].ipk = masukan.nextFloat();
      System.out.println();
      if (jumlahDataMahasiswaSekarang == MAX_MAHASISWA) {
        System.out.println("Maaf, memori sudah penuh!");
        return;
      }
    }
  }

  private static void tampilkanData(formatBiodataL biodataMahasiswa[]) {
    System.out.println();
    System.out.printf("|%-10s|%-10s|%-6s|%-6s|%-10s|%-10s|%-10s|%-4s|\n",
                      "NAMA", "ALAMAT", "UMUR", "JEKEL", "HOBI1", "HOBI2",
                      "HOBI3", "IPK");
    for (int i = 0; i < jumlahDataMahasiswaSekarang; i++) {
      System.out.printf("|%-10s|%-10s|%-6d|%-6s|%-10s|%-10s|%-10s|%-4.2f|\n",
                        biodataMahasiswa[i].nama, biodataMahasiswa[i].alamat,
                        biodataMahasiswa[i].umur, biodataMahasiswa[i].jekel,
                        biodataMahasiswa[i].hobi[0],
                        biodataMahasiswa[i].hobi[1],
                        biodataMahasiswa[i].hobi[2], biodataMahasiswa[i].ipk);
    }
  }

  public static void main(String[] args) {
    setJumlahMahasiswa();
    formatBiodataL biodataMahasiswa[] =
        new formatBiodataL[jumlahDataMahasiswaYangDikehendaki];
    for (int i = 0; i < biodataMahasiswa.length; i++) {
      biodataMahasiswa[i] = new formatBiodataL();
    }
    ngentriData(biodataMahasiswa);
    tampilkanData(biodataMahasiswa);
    masukan.close();
  }
}
