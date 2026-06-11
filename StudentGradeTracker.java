import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        double[] grades = new double[n];

        double total = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Grade: ");
            grades[i] = sc.nextDouble();
            sc.nextLine();

            total += grades[i];
        }

        double highest = grades[0];
        double lowest = grades[0];

        for (int i = 1; i < n; i++) {

            if (grades[i] > highest) {
                highest = grades[i];
            }

            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        double average = total / n;

        System.out.println("\n===== STUDENT REPORT =====");

        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " : " + grades[i]);
        }

        System.out.println("\nAverage Score : " + average);
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score  : " + lowest);

        sc.close();
    }
}
