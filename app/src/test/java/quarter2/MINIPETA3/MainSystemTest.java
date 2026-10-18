package quarter2.MINIPETA3;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MainSystemTest {

    @Test
    public void testCompleteSystemFlow() {

        StringBuilder input = new StringBuilder();

        int step = 1;

        while (step <= 22) {

            if (step == 1) {
                // Main Menu - Student
                input.append("1\n");

            } else if (step == 2) {
                // Student Menu - Sign Up
                input.append("1\n");

            } else if (step == 3) {
                // Student ID
                input.append("STU123\n");

            } else if (step == 4) {
                // Student Password
                input.append("1234\n");

            } else if (step == 5) {
                // Student Name
                input.append("Test Student\n");

            } else if (step == 6) {
                // Student Section
                input.append("ICT 12\n");

            } else if (step == 7) {
                // Student Menu - Sign In
                input.append("2\n");

            } else if (step == 8) {
                // Student ID for Sign In
                input.append("STU123\n");

            } else if (step == 9) {
                // Student Password for Sign In
                input.append("1234\n");

            } else if (step == 10) {
                // Student Menu - Profile
                input.append("3\n");

            } else if (step == 11) {
                // Profile - Change Name
                input.append("1\n");

            } else if (step == 12) {
                // New Student Name
                input.append("Updated Student\n");

            } else if (step == 13) {
                // Profile - Change Password
                input.append("2\n");

            } else if (step == 14) {
                // New Student Password
                input.append("5678\n");

            } else if (step == 15) {
                // Profile - Back
                input.append("4\n");

            } else if (step == 16) {
                // Student Menu - Back
                input.append("4\n");

            } else if (step == 17) {
                // Main Menu - Teacher
                input.append("2\n");

            } else if (step == 18) {
                // Teacher Menu - Sign Up
                input.append("1\n");

            } else if (step == 19) {
                // Teacher ID
                input.append("TEACH123\n");

            } else if (step == 20) {
                // Teacher Password
                input.append("abcd\n");

            } else if (step == 21) {
                // Teacher Name
                input.append("Test Teacher\n");

            } else if (step == 22) {
                // Teacher Menu - Sign In
                input.append("2\n");
            }

            step++;
        }

        // Continue the teacher flow
        input.append("TEACH123\n");
        input.append("abcd\n");

        // Teacher Profile
        input.append("3\n");

        // Change Teacher Name
        input.append("1\n");
        input.append("Updated Teacher\n");

        // Change Teacher Password
        input.append("2\n");
        input.append("efgh\n");

        // Back from Profile
        input.append("4\n");

        // Back from Teacher Menu
        input.append("4\n");

        // Exit Main Menu
        input.append("3\n");

        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(input.toString().getBytes());

        Scanner scanner = new Scanner(inputStream);

        MainMenu mainSystem = new MainMenu();

        mainSystem.start(scanner);
    }
}
//Gian