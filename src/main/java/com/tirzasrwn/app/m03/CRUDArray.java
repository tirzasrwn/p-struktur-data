package com.tirzasrwn.app.m03;

import java.util.Scanner;

class Form {
  String Name;
  String IdentityNumber;
  float FinalScore;
}

/**
 * CRUDArray
 */
public class CRUDArray {
  static Scanner input = new Scanner(System.in);
  static int studentsCount = 0;

  public static Form getStudentFromInput() {
    Form student = new Form();
    System.out.print("name: ");
    student.Name = input.next();
    System.out.print("indentity number: ");
    student.IdentityNumber = input.next();
    System.out.print("final score: ");
    student.FinalScore = input.nextFloat();
    return student;
  }

  public static Form[] addStudent(Form[] students) {
    studentsCount++;
    Form[] newStudents = new Form[studentsCount];
    for (int i = 0; i < students.length; i++) {
      newStudents[i] = students[i];
    }
    newStudents[students.length] = getStudentFromInput();
    return newStudents;
  }

  public static Form[] deleteStudent(Form[] students) {
    System.out.print("Input the student identity number you want to delete: ");
    String identityNumberToSearch = input.next();
    int indexToDelete = -1;
    for (int i = 0; i < students.length; i++) {
      if (students[i].IdentityNumber.equals(identityNumberToSearch)) {
        indexToDelete = i;
        break;
      }
    }
    if (indexToDelete > -1) {
      studentsCount--;
      Form[] newStudents = new Form[studentsCount];
      for (int i = 0; i < indexToDelete; i++) {
        newStudents[i] = students[i];
      }
      for (int i = indexToDelete; i < newStudents.length; i++) {
        newStudents[i] = students[i + 1];
      }
      System.out.println("Operation delete for id " +
                         students[indexToDelete].IdentityNumber +
                         " is successfull!");

      return newStudents;
    }
    System.out.println("Sorry, we can not find the id!");
    return students;
  }

  private static Form[] updateStudent(Form[] students) {
    System.out.println("Input the student identity you want to update: ");
    String identityNumberToSearch = input.next();
    int indexToUpdate = -1;
    for (int i = 0; i < students.length; i++) {
      if (students[i].IdentityNumber.equals(identityNumberToSearch)) {
        indexToUpdate = i;
        break;
      }
    }
    if (indexToUpdate > -1) {
      students[indexToUpdate] = getStudentFromInput();
      System.out.println("Operation update for id " +
                         students[indexToUpdate].IdentityNumber +
                         " is successfull!");
      return students;
    }
    System.out.println("Sorry, we can not find the id!");
    return students;
  }

  private static void printForm(Form[] students) {
    System.out.printf("|%-2s|%-20s|%-20s|%-10s|\n", "No", "Name",
                      "IdentityNumber", "FinalScore");
    for (int i = 0; i < students.length; i++) {
      System.out.printf("|%-2s|%-20s|%-20s|%-10.2f|\n", i, students[i].Name,
                        students[i].IdentityNumber, students[i].FinalScore);
    }
    if (students.length > 0) {
      System.out.println("Highest score is " + getHighestScore(students));
      System.out.println("Lowest score is " + getLowestScore(students));
    }
  }

  private static float getHighestScore(Form[] students) {
    float currentHighscore = students[0].FinalScore;
    for (int i = 0; i < students.length; i++) {
      if (students[i].FinalScore > currentHighscore) {
        currentHighscore = students[i].FinalScore;
      }
    }
    return currentHighscore;
  }

  private static float getLowestScore(Form[] students) {
    float currentLowestScore = students[0].FinalScore;
    for (int i = 0; i < students.length; i++) {
      if (students[i].FinalScore < currentLowestScore) {
        currentLowestScore = students[i].FinalScore;
      }
    }
    return currentLowestScore;
  }

  public static void main(String[] args) {

    Form[] students = new Form[studentsCount];

  loop:
    while (true) {
      System.out.print(
          "Chose menu (1. Add | 2. Print | 3. Update | 4. Delete | 5. Exit)? (1/2/3/4/5): ");
      switch (input.next()) {
      case "1":
        System.out.println("In add operation");
        students = addStudent(students);
        break;
      case "2":
        System.out.println("In print operation");
        printForm(students);
        break;
      case "3":
        System.out.println("In update operation");
        students = updateStudent(students);
        break;
      case "4":
        System.out.println("In delete operation");
        students = deleteStudent(students);
        break;
      case "5":
        System.out.println("Exit ...");
        break loop;
      default:
        System.out.println("In print operation");
        printForm(students);
        break;
      }
    }

    input.close();
  }
}
