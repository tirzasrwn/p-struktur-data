package com.tirzasrwn.app.m13;

/**
 * Simpul
 */
class Simpul {
  String elemen;
  Simpul kiri;
  Simpul kanan;
}

/**
 * Pohon
 */
public class Pohon {

  public static Simpul akar;

  public static void deklarasiPohon() { akar = null; }

  public static Simpul tambahSimpul(Simpul Penunjuk, String ELEMEN) {
    if (Penunjuk == null) {
      Simpul baru = new Simpul();
      baru.elemen = ELEMEN;
      baru.kiri = null;
      baru.kanan = null;
      Penunjuk = baru;
      return (Penunjuk);
    } else {
      if (ELEMEN.compareTo(Penunjuk.elemen) < 0) {
        Penunjuk.kiri = tambahSimpul(Penunjuk.kiri, ELEMEN);
        return (Penunjuk);
      } else {
        Penunjuk.kanan = tambahSimpul(Penunjuk.kanan, ELEMEN);
        return (Penunjuk);
      }
    }
  }
  public static void preOrder(Simpul Penunjuk) {
    if (Penunjuk != null) {
      System.out.print(Penunjuk.elemen + ",");
      preOrder(Penunjuk.kiri);
      preOrder(Penunjuk.kanan);
    }
  }
  public static void inOrder(Simpul Penunjuk) {
    if (Penunjuk != null) {
      inOrder(Penunjuk.kiri);
      System.out.print(Penunjuk.elemen + ",");
      inOrder(Penunjuk.kanan);
    }
  }
  public static void postOrder(Simpul Penunjuk) {
    if (Penunjuk != null) {
      postOrder(Penunjuk.kiri);
      postOrder(Penunjuk.kanan);
      System.out.print(Penunjuk.elemen + ",");
    }
  }
  public static void printTree(Simpul root, String prefix, boolean isLeft) {
    if (root != null) {
      System.out.println(prefix + (isLeft ? "|-- " : "\\-- ") + root.elemen);
      printTree(root.kiri, prefix + (isLeft ? "|   " : "    "), true);
      printTree(root.kanan, prefix + (isLeft ? "|   " : "    "), false);
    }
  }
  public static void main(String[] args) {
    deklarasiPohon();
    akar = tambahSimpul(akar, "M");
    akar = tambahSimpul(akar, "D");
    akar = tambahSimpul(akar, "P");
    akar = tambahSimpul(akar, "D");
    akar = tambahSimpul(akar, "A");
    akar = tambahSimpul(akar, "S");
    akar = tambahSimpul(akar, "K");
    akar = tambahSimpul(akar, "N");
    akar = tambahSimpul(akar, "G");
    akar = tambahSimpul(akar, "O");
    akar = tambahSimpul(akar, "L");
    akar = tambahSimpul(akar, "W");
    akar = tambahSimpul(akar, "F");
    akar = tambahSimpul(akar, "J");
    akar = tambahSimpul(akar, "T");
    akar = tambahSimpul(akar, "H");
    akar = tambahSimpul(akar, "U");
    printTree(akar, "", false);
    System.out.println();
    preOrder(akar);
    inOrder(akar);
    postOrder(akar);
    System.out.println();
  }
}
