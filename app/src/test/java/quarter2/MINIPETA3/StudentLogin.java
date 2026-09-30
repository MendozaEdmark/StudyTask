package quarter2.MINIPETA3;

import java.util.Scanner;

public class StudentLogin {

    Student student = new Student();

    public void signUp(Scanner scanner) {

        System.out.println("\n=== STUDENT SIGN UP ===");

        System.out.print("Enter Student ID: ");
        student.studentID = scanner.nextLine();

        System.out.print("Enter Password: ");
        student.password = scanner.nextLine();

        System.out.print("Enter Name: ");
        student.name = scanner.nextLine();

        System.out.print("Enter Section: ");
        student.section = scanner.nextLine();

        System.out.println("\nStudent account created successfully!");
    }

    public boolean signIn(Scanner scanner) {

        System.out.println("\n=== STUDENT SIGN IN ===");

        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (id.equals(student.studentID) &&
                password.equals(student.password)) {

            System.out.println("\nStudent login successful!");
            System.out.println("Welcome, " + student.name + "!");

            return true;

        } else {

            System.out.println("\nInvalid Student ID or Password.");

            return false;
        }
    }

    public Student getStudent() {
        return student;
    }
}
