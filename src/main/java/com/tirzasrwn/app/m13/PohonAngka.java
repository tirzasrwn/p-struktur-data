package com.tirzasrwn.app.m13;

/**
 * SimpulAngka
 */
class SimpulAngka {
  int elemen;
  SimpulAngka kiri;
  SimpulAngka kanan;
}

/**
 * PohonAngka
 */
public class PohonAngka {

  public static SimpulAngka akar;

  public static void deklarasiPohon() { akar = null; }

  public static SimpulAngka tambahSimpulAngka(SimpulAngka Penunjuk,
                                              int ELEMEN) {
    if (Penunjuk == null) {
      SimpulAngka baru = new SimpulAngka();
      baru.elemen = ELEMEN;
      baru.kiri = null;
      baru.kanan = null;
      Penunjuk = baru;
      return (Penunjuk);
    } else {
      if (ELEMEN < Penunjuk.elemen) {
        Penunjuk.kiri = tambahSimpulAngka(Penunjuk.kiri, ELEMEN);
        return (Penunjuk);
      } else {
        Penunjuk.kanan = tambahSimpulAngka(Penunjuk.kanan, ELEMEN);
        return (Penunjuk);
      }
    }
  }
  public static void preOrder(SimpulAngka Penunjuk) {
    if (Penunjuk != null) {
      System.out.print(Penunjuk.elemen + ",");
      preOrder(Penunjuk.kiri);
      preOrder(Penunjuk.kanan);
    }
  }
  public static void inOrder(SimpulAngka Penunjuk) {
    if (Penunjuk != null) {
      inOrder(Penunjuk.kiri);
      System.out.print(Penunjuk.elemen + ",");
      inOrder(Penunjuk.kanan);
    }
  }
  public static void postOrder(SimpulAngka Penunjuk) {
    if (Penunjuk != null) {
      postOrder(Penunjuk.kiri);
      postOrder(Penunjuk.kanan);
      System.out.print(Penunjuk.elemen + ",");
    }
  }
  public static void printTree(SimpulAngka root, String prefix,
                               boolean isLeft) {
    if (root != null) {
      System.out.println(prefix + (isLeft ? "|-- " : "\\-- ") + root.elemen);
      printTree(root.kiri, prefix + (isLeft ? "|   " : "    "), true);
      printTree(root.kanan, prefix + (isLeft ? "|   " : "    "), false);
    }
  }
  public static void main(String[] args) {
    deklarasiPohon();
    akar = tambahSimpulAngka(akar, 7);
    akar = tambahSimpulAngka(akar, 5);
    akar = tambahSimpulAngka(akar, 12);
    akar = tambahSimpulAngka(akar, 3);
    akar = tambahSimpulAngka(akar, 6);
    akar = tambahSimpulAngka(akar, 9);
    akar = tambahSimpulAngka(akar, 15);
    akar = tambahSimpulAngka(akar, 1);
    akar = tambahSimpulAngka(akar, 4);
    akar = tambahSimpulAngka(akar, 8);
    akar = tambahSimpulAngka(akar, 10);
    akar = tambahSimpulAngka(akar, 13);
    akar = tambahSimpulAngka(akar, 17);
    printTree(akar, "", false);
    System.out.println();
    // preOrder(akar);
    // inOrder(akar);
    postOrder(akar);
    System.out.println();
  }
}
