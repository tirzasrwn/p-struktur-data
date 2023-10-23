package com.tirzasrwn.app.m07;

class tipePointerK {
  String namaKota;
  tipePointerK kanan;
  tipePointerK kiri;
}

/**
 * BelajarPointer3
 */
public class BelajarPointer3 {

  public static void main(String[] args) {
    tipePointerK P;
    P = new tipePointerK();
    P.namaKota = "Yogyakarta";
    tipePointerK Q;
    Q = new tipePointerK();
    Q.namaKota = "Klaten";
    tipePointerK R;
    R = new tipePointerK();
    R.namaKota = "Solo";
    tipePointerK S;
    S = new tipePointerK();
    S.namaKota = "Sragen";
    tipePointerK T;
    T = new tipePointerK();
    T.namaKota = "Ngawi";
    System.out.println("Nilai P,Q,R,S,T adalah :");
    System.out.println("---");
    System.out.println("Nilai P.namaKota adalah = " + P.namaKota);
    System.out.println("Nilai Q.namaKota adalah = " + Q.namaKota);
    System.out.println("Nilai R.namaKota adalah = " + R.namaKota);
    System.out.println("Nilai S.namaKota adalah = " + S.namaKota);
    System.out.println("Nilai T.namaKota adalah = " + T.namaKota);
    P.kanan = Q;
    Q.kanan = R;
    R.kanan = S;
    S.kanan = T;
    T.kanan = null;

    // null P Q R S T null

    P.kiri = null;
    Q.kiri = P;
    R.kiri = Q;
    S.kiri = R;
    T.kiri = S;
    System.out.println("Elemen namaKota untuk pointer P adalah :");
    System.out.println("---");
    System.out.println(P.namaKota);
    System.out.println(P.kanan.kiri.namaKota);
    System.out.println(P.kanan.kanan.kiri.kiri.namaKota);
    // System.out.println(
    //     "Nilai-nilai yang dapat diakses dari pointer P adalah :");
    // System.out.println("---");
    // System.out.println(P.namaKota);
    // System.out.println(P.kanan.namaKota);
    // System.out.println(P.kanan.kanan.namaKota);
    // System.out.println(P.kanan.kanan.kanan.namaKota);
    // System.out.println(P.kanan.kanan.kanan.kanan.namaKota);

    // System.out.println("Nilai P.namaKota adalah = " + P.namaKota);
    // System.out.println("Nilai Q.namaKota adalah = " + Q.namaKota);
    // System.out.println("Nilai R.namaKota adalah = " + R.namaKota);
    // System.out.println("Nilai S.namaKota adalah = " + S.namaKota);
    // System.out.println("Nilai T.namaKota adalah = " + T.namaKota);
    //
    // System.out.println(P.namaKota);
    // System.out.println(P.kanan.namaKota);
    // System.out.println(P.kanan.kanan.namaKota);
    // System.out.println(P.kanan.kanan.kanan.namaKota);
    // System.out.println(P.kanan.kanan.kanan.kanan.namaKota);
    //
    // System.out.println(R.namaKota);
    // P.kanan.kanan.namaKota = "Surakarta";
    // System.out.println(R.namaKota);

    // tipePointerK BANTU;
    // BANTU = P;
    // while (BANTU != null) {
    //   System.out.println("Nilai BANTU.namaKota adalah = " + BANTU.namaKota);
    //   BANTU = BANTU.kanan;
    // }

    tipePointerK BANTU;
    BANTU = T;
    while (BANTU != null) {
      System.out.println("Nilai BANTU.namaKota adalah = " + BANTU.namaKota);
      BANTU = BANTU.kiri;
    }
  }
}
