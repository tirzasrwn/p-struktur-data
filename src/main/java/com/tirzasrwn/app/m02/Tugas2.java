package com.tirzasrwn.app.m02;

import java.util.Scanner;

class Form {
  String Name;
  String IdentityNumber;
  float MidScore;
  float FinalScore;
}

/**
 * Tugas2
 */
class Tugas2 {
  static final int MAX_STUDENTS = 20;
  static Scanner input = new Scanner(System.in);
  static int studentCount = 0;

  private static void inputData(Form[] students) {
    for (int i = 0; i < students.length; i++) {
      studentCount++;
      students[i] = new Form();
      System.out.print("name: ");
      students[i].Name = input.next();
      System.out.print("identity number: ");
      students[i].IdentityNumber = input.next();
      System.out.print("mid score: ");
      students[i].MidScore = input.nextFloat();
      System.out.print("final score: ");
      students[i].FinalScore = input.nextFloat();
      if (studentCount == MAX_STUDENTS) {
        System.out.println("Sorry, there are no memory left!");
        return;
      }
      if (!answer()) {
        return;
      }
    }
  }

  private static void printForm(Form[] students) {
    System.out.printf("|%-20s|%-20s|%-10s|%-10s|\n", "Name", "IdentityNumber",
                      "MidScore", "FinalScore");
    for (int i = 0; i < studentCount; i++) {
      System.out.printf("|%-20s|%-20s|%-10.2f|%-10.2f|\n", students[i].Name,
                        students[i].IdentityNumber, students[i].MidScore,
                        students[i].FinalScore);
    }
  }

  static boolean answer() {
    System.out.print("are you want to add more student? (y/n): ");
    if (!input.next().contains("y")) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Form[] students = new Form[MAX_STUDENTS];
    inputData(students);
    printForm(students);
    input.close();
  }
}
