package com.tirzasrwn.app.m12;

import java.util.LinkedList;

public class PercobaanLinkedList1 {
  LinkedList daftarMhs = new LinkedList();
  PercobaanLinkedList1() {
    if (daftarMhs.isEmpty() == true) {
      System.out.println("Linkedlist kosong");
    } else {
      System.out.println("Linkedlist isi");
    }
  }
  public static void main(String args[]) { new PercobaanLinkedList1(); }
}
