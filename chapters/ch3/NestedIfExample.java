package chapters.ch3;

import java.util.Scanner;

/**
 * Takes in the total grade and the number of subjects.
 * Calculates the average grade.
 * Gives back feedback based on the grade.
 *
 * @author kyria
 */
public class NestedIfExample {
    public static void main(String[] args) {
        // Init
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int modulesCount = 0;
        int average = 0;

        // Inputs
        System.out.println("Please give in the number of total marks: ");
        totalMarks = scanner.nextInt();
        System.out.println("Please give in the the amount of modules: ");
        modulesCount = scanner.nextInt();


        if (modulesCount != 0) { // zero module division handler

            // Calculate
            average = totalMarks / modulesCount;

            // Feedback
            if ((average <= 10) && (average >= 9)){
                System.out.printf("Excellent! \nGrade: %d", average);
            } else if ((average <= 8) && (average >= 7)) {
                System.out.printf("Very good! \nGrade: %d", average);
            } else if ((average <= 6) && (average >= 5)) {
                System.out.printf("Good! \nGrade: %d", average);
            } else if ((average <= 4) && (average >= 0)) {
                System.out.printf("Failed. \nGrade: %d", average);
            } else {
                System.out.println("Error! Input outside of 0-10 field.");
            }
        } else {
            System.out.println("Wrong module input!");
        }
    }
}
