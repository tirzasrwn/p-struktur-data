package com.tirzasrwn.app.m12;

import java.util.ArrayList;

public class PercobaanArrayListL2 {
  ArrayList<String> daftarMhs = new ArrayList<>();

  PercobaanArrayListL2() {
    if (daftarMhs.isEmpty()) {
      System.out.println("ArrayList kosong");
    } else {
      System.out.println("ArrayList isi");
    }

    daftarMhs.add("Agungbp");
    daftarMhs.add("Bambang");

    if (daftarMhs.isEmpty()) {
      System.out.println("ArrayList kosong");
    } else {
      System.out.println("ArrayList isi");
    }
  }

  public static void main(String args[]) { new PercobaanArrayListL2(); }
}
