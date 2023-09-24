package com.tirzasrwn.app.m01;

import java.util.Scanner;

/**
 * Latihan
 */
public class Latihan {

  public static void main(String[] args) {
    String password;
    System.out.print("Silahkan masukkan password: ");
    Scanner input = new Scanner(System.in);
    password = input.next();
    input.close();
    if (!password.equals("AKAKOM")) {
      System.out.println("Password anda salah!");
      return;
    }
    System.out.println("Password anda benar!");
  }
}
