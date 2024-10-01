import java.util.Scanner;

public static String grading(double marks) {
    if (marks >= 90) {
        return "A+";
    } else if (marks >= 80) {
        return "A";
    } else if (marks >= 70) {
        return "B";
    } else if (marks >= 60) {
        return "C";
    } else if (marks >= 50) {
        return "D";
    } else if (marks >= 36) {
        return "P";
    } else {
        return "F";
    }
}

public static void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number of Subjects: ");
    int numOfSubjects = sc.nextInt();

    double[] marks = new double[numOfSubjects];
    double total = 0;

    for (int i = 0; i < numOfSubjects; i++) {
        System.out.print("Enter the marks scored " + (i + 1) + " (out of 100): ");
        marks[i] = sc.nextDouble();
        total += marks[i];
    }
    double average = total / numOfSubjects;
    average = Math.round(average);
    String grade = grading(average);

    System.out.println("---Results---");
    System.out.println("Total Marks: " + total);
    System.out.println("Average Marks: " + average);
    System.out.println("Grade: " + grade);

    sc.close();
}
