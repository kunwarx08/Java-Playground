import java.util.*;

public class grade {
    public static int calculateGradePoint(int marks) {
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
            // For marks below 40, you can define a suitable grade point.
            // For simplicity, we'll return -1 for such cases.
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marksArray = new int[numSubjects];
        int[] gradePointsArray = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marksArray[i] = scanner.nextInt();
            gradePointsArray[i] = calculateGradePoint(marksArray[i]);
        }

        System.out.println("\nSubject-wise Grade Points:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Subject " + (i + 1) + ": Marks = " + marksArray[i] + ", Grade Point = " + gradePointsArray[i]);
        }

        //scanner.close();
    }
}
