package com.tirzasrwn.app.m12;

import java.util.LinkedList;

public class PercobaanLinkedList4 {
  LinkedList daftarMhs = new LinkedList();
  PercobaanLinkedList4() {
    daftarMhs.add("Agungbp");
    daftarMhs.add("Bambang");
    daftarMhs.add("Cucuk");
    daftarMhs.add("Dion");
    daftarMhs.add("Ending");
    daftarMhs.add("Fifin");
    daftarMhs.add("Gesit");
    daftarMhs.add("Heru");
    daftarMhs.add("Irma");
    daftarMhs.add("Janti");
    System.out.println("N = " + daftarMhs.size());
    for (int i = 0; i <= daftarMhs.size() - 1; i++) {
      System.out.println(i + " " + daftarMhs.get(i));
    }
  }
  public static void main(String args[]) { new PercobaanLinkedList4(); }
}
