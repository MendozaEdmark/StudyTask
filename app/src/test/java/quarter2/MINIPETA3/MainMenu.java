package quarter2.MINIPETA3;

import java.util.Scanner;

public class MainMenu {

    StudentLogin studentLogin = new StudentLogin();
    TeacherLogin teacherLogin = new TeacherLogin();
    ProfileInformation profile = new ProfileInformation();

    public void start(Scanner scanner) {

        int choice = 0;

        while (choice != 3) {

            System.out.println("\n======================");
            System.out.println("      STUDYTASK");
            System.out.println("======================");

            System.out.println("1. Student");
            System.out.println("2. Teacher");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                studentMenu(scanner);

            } else if (choice == 2) {

                teacherMenu(scanner);

            } else if (choice == 3) {

                System.out.println("\nThank you for using StudyTask!");

            } else {

                System.out.println("\nInvalid choice.");
            }
        }
    }

    public void studentMenu(Scanner scanner) {

        int choice = 0;
        boolean loggedIn = false;

        while (choice != 4) {

            System.out.println("\n=== STUDENT MENU ===");
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
            System.out.println("3. Profile");
            System.out.println("4. Back");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                studentLogin.signUp(scanner);

            } else if (choice == 2) {

                loggedIn = studentLogin.signIn(scanner);

            } else if (choice == 3) {

                if (loggedIn) {

                    profile.studentProfile(
                            studentLogin.getStudent(),
                            scanner
                    );

                } else {

                    System.out.println("Please sign in first.");
                }

            } else if (choice == 4) {

                System.out.println("Returning to main menu...");

            } else {

                System.out.println("Invalid choice.");
            }
        }
    }

    public void teacherMenu(Scanner scanner) {

        int choice = 0;
        boolean loggedIn = false;

        while (choice != 4) {

            System.out.println("\n=== TEACHER MENU ===");
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
            System.out.println("3. Profile");
            System.out.println("4. Back");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                teacherLogin.signUp(scanner);

            } else if (choice == 2) {

                loggedIn = teacherLogin.signIn(scanner);

            } else if (choice == 3) {

                if (loggedIn) {

                    profile.teacherProfile(
                            teacherLogin.getTeacher(),
                            scanner
                    );

                } else {

                    System.out.println("Please sign in first.");
                }

            } else if (choice == 4) {

                System.out.println("Returning to main menu...");

            } else {

                System.out.println("Invalid choice.");
            }
        }
    }
}