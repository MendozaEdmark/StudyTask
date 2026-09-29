package quarter2.MINIPETA3;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Group8StudyTask {

    public void start(Scanner scanner) {

        boolean running = true;

        while (running) {

            System.out.println("\n======================");
            System.out.println("       STUDYTASK");
            System.out.println("======================");
            System.out.println("1. Student");
            System.out.println("2. Teacher");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            System.out.println(choice);

            if (choice == 1) {

                System.out.println("\nStudent selected.");


            } else if (choice == 2) {

                System.out.println("\nTeacher selected.");


            } else if (choice == 3) {

                System.out.println("\nThank you for using StudyTask!");
                running = false;

            } else {

                System.out.println("\nInvalid choice.");

            }
        }
    }
}
