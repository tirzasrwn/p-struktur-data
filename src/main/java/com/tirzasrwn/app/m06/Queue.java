package com.tirzasrwn.app.m06;

/**
 * Queue
 */
public class Queue {

  public static int N = 5;
  public static int belakang = -1;
  public static void enQueue(String antrian[], String data) {
    if (belakang == N - 1) // jika antrian penuh
    {
      System.out.println("maap, antrian penuh, ENQUEUE " + data +
                         " tidak dapat dilakukan");
    } else // jika antrian tidak penuh
    {
      belakang = belakang + 1;
      antrian[belakang] = data;
      System.out.println("ENQUEUE " + data + " berhasil..");
    }
  }
  public static String deQueue(String antrian[]) {
    String hasil;
    if (belakang < 0) // jika antrian kosong
    {
      hasil = "ANTRIAN KOSONG, DEQUEUE GAGAL DILAKUKAN";
    } else // jika antrian tidak kosong
    {
      hasil = antrian[0];
      //----menggeser data kedua dst, maju selangkah ke depan
      for (int i = 0; i <= belakang - 1; i++) {
        antrian[i] = antrian[i + 1];
      }
      belakang = belakang - 1;
    }
    return (hasil);
  }
  public static void bacaAntrian(String antrian[]) {
    System.out.println("---");
    System.out.print("ISI ANTRIAN : (depan)");
    for (int i = 0; i <= belakang; i++) {
      System.out.print(" " + antrian[i]);
    }
    System.out.println(" (belakang)");
    System.out.println("---");
  }
  public static void main(String[] args) {
    String antrian[] = new String[5];
    // Praktik 6
    enQueue(antrian, "Mobil A");
    enQueue(antrian, "Mobil B");
    enQueue(antrian, "Mobil C");
    bacaAntrian(antrian);
    // Praktik 7
    enQueue(antrian, "Mobil D");
    enQueue(antrian, "Mobil E");
    enQueue(antrian, "Mobil F");
    bacaAntrian(antrian);
    // Praktik 8
    System.out.println("deQueue: " + deQueue(antrian));
    bacaAntrian(antrian);
    // Praktik 9
    System.out.println("deQueue: " + deQueue(antrian));
    System.out.println("deQueue: " + deQueue(antrian));
    System.out.println("deQueue: " + deQueue(antrian));
    bacaAntrian(antrian);
    // Praktik 10
    System.out.println("deQueue: " + deQueue(antrian));
    System.out.println("deQueue: " + deQueue(antrian));
    bacaAntrian(antrian);
  }
}
