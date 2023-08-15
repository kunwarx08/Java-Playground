import java.util.Scanner;

public class MinorProjectGrade {
    public static int calculateGradePoint(int marks) {
        // Similar grading logic as before
        if (marks >= 90 && marks <= 100) {
            return 10;
        } else if (marks >= 80 && marks < 90) {
            return 9;
        } else if (marks >= 70 && marks < 80) {
            return 8;
        } else if (marks >= 60 && marks < 70) {
            return 7;
        } else if (marks >= 50 && marks < 60) {
            return 6;
        } else if (marks >= 45 && marks < 50) {
            return 5;
        } else if (marks >= 40 && marks < 45) {
            return 4;
        } else {
            return 0; // Assign 0 as grade point for marks below 40
        }
    }

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Did you do a minor project in this semester? (yes/no): ");
        // String projectChoice = scanner.next();
        // if (projectChoice.equalsIgnoreCase("yes")) {
        //     System.out.print("Enter the marks for your minor project (out of 100): ");
        //     int projectMarks = scanner.nextInt();
        //     int projectGradePoint = calculateGradePoint(projectMarks);

        //     if (projectGradePoint != 0) {
        //         System.out.println("Your minor project marks: " + projectMarks);
        //         System.out.println("Your minor project grade point: " + projectGradePoint);
        //     } else {
        //         System.out.println("Invalid marks entered for the minor project.");
        //     }
        // } else if (projectChoice.equalsIgnoreCase("no")) {
        //     int projectMarks = 0;
        //     int projectGradePoint = 0;
        //     System.out.println("No minor project done. Marks: " + projectMarks + ", Grade Point: " + projectGradePoint);
        // } else {
        //     System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
        // }
        
        // scanner.close();




        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you Mentoring Subject in this semester with credit? (yes/no): ");
        String mentoringChoice = scanner.next();
        int minorCredit=1;
        if (mentoringChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter the marks for your minor project (out of 100): ");
            int mentoringMarks = scanner.nextInt();
            int mentoringGradePoint = calculateGradePoint(mentoringMarks);

            if (mentoringGradePoint != 0) {
                System.out.println("Your minor project marks: " + mentoringMarks);
                System.out.println("Your minor project grade point: " + mentoringGradePoint);
                System.out.println("Your minor project Credit: "+ minorCredit);
            } else {
                System.out.println("Invalid marks entered for the minor project.");
            }
        } else if (mentoringChoice.equalsIgnoreCase("no")) {
            int mentoringMarks = 0;
            int mentoringGradePoint = 0;
            System.out.println("No minor project done. Marks: " + mentoringMarks + ", Grade Point: " + mentoringGradePoint);
        } else {
            System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
        }







    }
}

