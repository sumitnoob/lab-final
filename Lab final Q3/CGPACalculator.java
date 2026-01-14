import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Student ID: ");
        String id = sc.nextLine();

        System.out.print("No. of Courses: ");
        int n = sc.nextInt();

        int creditTaken = 0;
        int creditEarned = 0;
        double totalPoints = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print("C" + i + " Credit: ");
            int credit = sc.nextInt();

            System.out.print("CT: ");
            int ct = sc.nextInt();

            System.out.print("AT: ");
            int at = sc.nextInt();

            System.out.print("FE: ");
            int fe = sc.nextInt();

            int total = ct + at + fe;
            double gp = 0;

            if (total >= 80) gp = 4.0;
            else if (total >= 75) gp = 3.75;
            else if (total >= 70) gp = 3.5;
            else if (total >= 65) gp = 3.25;
            else if (total >= 60) gp = 3.0;
            else if (total >= 55) gp = 2.75;
            else if (total >= 50) gp = 2.5;
            else if (total >= 45) gp = 2.25;
            else if (total >= 40) gp = 2.0;
            else gp = 0;

            creditTaken += credit;

            if (gp > 0) {
                creditEarned += credit;
                totalPoints += gp * credit;
            }
        }

        double cgpa = totalPoints / creditTaken;

        String grade;
        if (cgpa >= 3.75) grade = "A";
        else if (cgpa >= 3.5) grade = "A-";
        else if (cgpa >= 3.25) grade = "B+";
        else if (cgpa >= 3.0) grade = "B";
        else if (cgpa >= 2.75) grade = "B-";
        else if (cgpa >= 2.5) grade = "C+";
        else if (cgpa >= 2.25) grade = "C";
        else if (cgpa >= 2.0) grade = "D";
        else grade = "F";

        System.out.println("\nStudent ID: " + id);
        System.out.println("Credit Taken: " + creditTaken);
        System.out.println("Credit Earned: " + creditEarned);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
