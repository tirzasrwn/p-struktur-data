package com.tirzasrwn.app.m07;

class tipePointer {
  int angka;
  String teks;
}

/**
 * BelajarPointer1
 */
public class BelajarPointer1 {

  public static void main(String[] args) {
    tipePointer P;
    P = null;
    if (P == null)
      System.out.println("Pointer P menunjuk ke Null");
    else
      System.out.println("Pointer P mengarah ke tempat lain");
  }
}
