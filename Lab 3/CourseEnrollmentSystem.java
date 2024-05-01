import java.util.Scanner;

public class CourseEnrollmentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter GPA
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        // Prompt user to enter completion status of Course A
        System.out.print("Have you completed Course A? (true/false): ");
        boolean completedCourseA = scanner.nextBoolean();

        System.out.println("You are eligible to enroll in the following courses:");

        // Check eligibility based on GPA and completion status of Course A
        if (gpa >= 3.5) {
            System.out.println("- Course C");
            System.out.println("- Course D");
        } else if (gpa >= 3.0) {
            System.out.println("- Course C");
            if (completedCourseA) {
                System.out.println("- Course D");
            }
        } else {
            if (completedCourseA && gpa >= 2.5) {
                System.out.println("- Course D");
            }
        }

        scanner.close();
    }
}
