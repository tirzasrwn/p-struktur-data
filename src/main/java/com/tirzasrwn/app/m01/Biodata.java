package com.tirzasrwn.app.m01;

import java.util.Scanner;

/**
 * Biodata
 */
public class Biodata {
  static final int MAX_MAHASISWA = 5;

  String nama;
  String alamat;
  int umur;
  char jenisKelamin;
  String hobi[] = new String[3];
  float ipk;

  public static void main(String[] args) {
    Biodata[] mahasiswa = new Biodata[MAX_MAHASISWA];
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < mahasiswa.length; i++) {
      mahasiswa[i] = new Biodata();

      System.out.print("nama mahasiswa ke-" + (i + 1) + ": ");
      mahasiswa[i].nama = input.next();
      System.out.print("alamat mahasiswa ke-" + (i + 1) + ": ");
      mahasiswa[i].alamat = input.next();
      System.out.print("umur mahasiswa ke-" + (i + 1) + ": ");
      mahasiswa[i].umur = input.nextInt();
      System.out.print("jenis kelamin mahasiswa ke-" + (i + 1) + ": ");
      try {
        int bacaTombol = System.in.read();
        mahasiswa[i].jenisKelamin = (char)bacaTombol;
      } catch (java.io.IOException e) {
        System.out.println("IOError: " + e.getMessage());
      }
      System.out.println("hobi (maks 3) : ");
      for (int j = 0; j < mahasiswa[i].hobi.length; j++) {
        System.out.print("hobi ke-" + (j + 1) + " : ");
        mahasiswa[i].hobi[j] = input.next();
      }
      System.out.print("IPK mahasiswa ke-" + (i + 1) + ": ");
      mahasiswa[i].ipk = input.nextFloat();
      System.out.println();
    }
    input.close();

    for (int i = 0; i < mahasiswa.length; i++) {
      System.out.println();
      System.out.println("Data mahasiswa ke-" + (i + 1) + ": ");
      System.out.println("nama:" + mahasiswa[i].nama);
      System.out.println("alamat:" + mahasiswa[i].alamat);
      System.out.println("umur:" + mahasiswa[i].umur);
      System.out.println("jenis kelamin:" + mahasiswa[i].jenisKelamin);
      for (int j = 0; j < mahasiswa[i].hobi.length; j++) {
        System.out.println("hobi ke-" + (j + 1) + ": " + mahasiswa[i].hobi[j]);
      }
      System.out.println("ipk:" + mahasiswa[i].ipk);
    }
  }
}
