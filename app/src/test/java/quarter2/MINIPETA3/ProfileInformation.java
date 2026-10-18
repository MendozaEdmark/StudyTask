package quarter2.MINIPETA3;

import java.util.Scanner;

public class ProfileInformation {

    public void studentProfile(Student student, Scanner scanner) {

        int choice = 0;

        while (choice != 4) {

            System.out.println("\n=== STUDENT PROFILE ===");
            System.out.println("Name: " + student.name);
            System.out.println("Student ID: " + student.studentID);
            System.out.println("Section: " + student.section);

            System.out.println("\n1. Change Name");
            System.out.println("2. Change Password");
            System.out.println("3. View Profile");
            System.out.println("4. Back");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.print("Enter new name: ");
                student.name = scanner.nextLine();

                System.out.println("Name updated successfully!");

            } else if (choice == 2) {

                System.out.print("Enter new password: ");
                student.password = scanner.nextLine();

                System.out.println("Password updated successfully!");

            } else if (choice == 3) {

                System.out.println("\nName: " + student.name);
                System.out.println("Student ID: " + student.studentID);
                System.out.println("Section: " + student.section);

            } else if (choice == 4) {

                System.out.println("Returning...");

            } else {

                System.out.println("Invalid choice.");
            }
        }
    }

    public void teacherProfile(Teacher teacher, Scanner scanner) {

        int choice = 0;

        while (choice != 4) {

            System.out.println("\n=== TEACHER PROFILE ===");
            System.out.println("Name: " + teacher.name);
            System.out.println("Teacher ID: " + teacher.teacherID);

            System.out.println("\n1. Change Name");
            System.out.println("2. Change Password");
            System.out.println("3. View Profile");
            System.out.println("4. Back");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.print("Enter new name: ");
                teacher.name = scanner.nextLine();

                System.out.println("Name updated successfully!");

            } else if (choice == 2) {

                System.out.print("Enter new password: ");
                teacher.password = scanner.nextLine();

                System.out.println("Password updated successfully!");

            } else if (choice == 3) {

                System.out.println("\nName: " + teacher.name);
                System.out.println("Teacher ID: " + teacher.teacherID);

            } else if (choice == 4) {

                System.out.println("Returning...");

            } else {

                System.out.println("Invalid choice.");
            }
        }
    }
}