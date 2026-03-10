import java.util.Scanner;

public class AverageTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("num1: ");
        int num1 = scanner.nextInt();

        System.out.print("num2: ");
        int num2 = scanner.nextInt();

        System.out.print("num3: ");
        int num3 = scanner.nextInt();

        double average = (num1 + num2 + num3) / 3.0;

        System.out.println("Average: " + average);

        scanner.close();
    }
}
