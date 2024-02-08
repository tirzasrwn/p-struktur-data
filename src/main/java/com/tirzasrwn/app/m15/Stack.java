package com.tirzasrwn.app.m15;

/**
 * Stack
 */
public class Stack {

  public static int N = 4;
  public static int atas = -1;
  public static void push(String tumpukan[], String data, boolean isShow) {
    if (atas == N - 1) // jika tumpukan penuh
    {
      System.out.println("tumpukan penuh PUSH " + data +
                         " tidak dapat dilakukan");
    } else // jika tumpukan tidak penuh
    {
      atas = atas + 1;
      tumpukan[atas] = data;
      if (isShow) {
        System.out.println("PUSH " + data);
      }
    }
  }
  public static String pop(String tumpukan[]) {
    String hasil;
    if (atas < 0) // jika tumpukan kosong
    {
      hasil = "TUMPUKAN KOSONG, POP GAGAL DILAKUKAN";
    } else // jika tumpukan tidak kosong
    {
      hasil = tumpukan[atas];
      atas = atas - 1;
    }
    return (hasil);
  }
  public static void bacaTumpukan(String tumpukan[]) {
    System.out.println("");
    System.out.println("-STACK AWAL-");
    for (int i = atas; i >= 0; i--) {
      System.out.println("BUKU " + tumpukan[i]);
    }
    System.out.println("-STACK AKHIR-");
    System.out.println("");
  }
  public static void main(String[] args) {
    String tumpukan[] = new String[10];
    push(tumpukan, "I", true);
    push(tumpukan, "D", true);
    push(tumpukan, "T", true);
    push(tumpukan, "U", true);
    push(tumpukan, "O", true);
    bacaTumpukan(tumpukan);
    pop(tumpukan);
    System.out.println("POP: BUKU " + pop(tumpukan));
    System.out.println("POP: BUKU " + pop(tumpukan));
    push(tumpukan, "U", false);
    bacaTumpukan(tumpukan);
  }
}
