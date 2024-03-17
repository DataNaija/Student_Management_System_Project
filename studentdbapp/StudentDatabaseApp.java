package studentdbapp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        // Ask how many new students to be added
        System.out.println("Enter number of new student to enroll: ");
        Scanner input = new Scanner(System.in);
        int numOfStudent = input.nextInt();
        Student[] students = new Student[numOfStudent];

        // Create x number of new students
        for (int x = 0; x < numOfStudent; x++){
            students[x] = new Student();
            students[x].enroll();
            students[x].payTuition();

        }
        for (int x = 0; x < numOfStudent; x++){

            System.out.println(students[x].showInfo());   // sout was used because the method return something

        }

    }

}
