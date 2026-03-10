import java.util.Scanner;

public class AverageTestCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program: Compute the average of 3 numbers");
        System.out.println("Formula: (num1 + num2 + num3) / 3");

        System.out.print("Enter num1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter num2: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter num3: ");
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3) / 3;

        System.out.println("Average: " + average);

        scanner.close();
    }
}