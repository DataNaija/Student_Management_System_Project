package studentdbapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String  studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static  int costOfCourses = 600;
    private static int id = 1000;

    // Constructor: prompt user to enter student's name and year
    public Student(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = input.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = input.nextLine();

        System.out.println("1. Freshmen\n2. Sophomore\n3. Junior\n4. Senior\n Enter student class level: ");
        this.gradeYear = input.nextInt();

        setStudentID();

    }

    // Generate an ID
    private void setStudentID(){
      // Grade level + id
        id++;
      this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll(){
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            if (!course.equals("Q")){
                courses =  courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourses;
            }
            else {
                break;
            }

        } while (1 != 0);
       // System.out.println("ENROLLED IN: " + studentCourses);
        // System.out.println("TUITION BALANCE: " + tuitionBalance);

    }

    // View balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter the amount you want to pay: ");
        Scanner input = new Scanner(System.in);
        int payment = input.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();

    }

    // Show status
    public String showInfo(){
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level:  " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
