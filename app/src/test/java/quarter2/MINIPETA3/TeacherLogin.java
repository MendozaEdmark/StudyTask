package quarter2.MINIPETA3;

import java.util.Scanner;

public class TeacherLogin {

    Teacher teacher = new Teacher();

    public void signUp(Scanner scanner) {

        System.out.println("\n=== TEACHER SIGN UP ===");

        System.out.print("Enter Teacher ID: ");
        teacher.teacherID = scanner.nextLine();

        System.out.print("Enter Password: ");
        teacher.password = scanner.nextLine();

        System.out.print("Enter Name: ");
        teacher.name = scanner.nextLine();

        System.out.println("\nTeacher account created successfully!");
    }

    public boolean signIn(Scanner scanner) {

        System.out.println("\n=== TEACHER SIGN IN ===");

        System.out.print("Enter Teacher ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (id.equals(teacher.teacherID) &&
                password.equals(teacher.password)) {

            System.out.println("\nTeacher login successful!");
            System.out.println("Welcome, " + teacher.name + "!");

            return true;

        } else {

            System.out.println("\nInvalid Teacher ID or Password.");

            return false;
        }
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
