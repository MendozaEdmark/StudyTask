package quarter2.MINIPETA3;

import java.util.Scanner;

public class CompleteTaskSubmission {

    public static void main(String[] args) {
        TaskSubmission();
    }

    public static void TaskSubmission() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Has the task been submitted? (true/false): ");
        boolean isSubmitted = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Enter submission status (Completed/Missing): ");
        String submissionStatus = scanner.nextLine();

        System.out.print("Is the task overdue? (true/false): ");
        boolean isOverdue = scanner.nextBoolean();

        System.out.println("\n--- Complete Task Submission Details ---");
        System.out.println("Is Submitted: " + isSubmitted);
        System.out.println("Submission Status: " + submissionStatus);
        System.out.println("Is Overdue: " + isOverdue);

        scanner.close();
    }
} // T