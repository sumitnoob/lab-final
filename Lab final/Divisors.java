import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("This program prints the positive divisors of positive integers.");

        while (true) {

            int n;
            while (true) {
                System.out.print("Please enter a positive integer: ");
                n = sc.nextInt();
                if (n > 0)
                    break;
                System.out.println(n + " is not a positive integer.");
            }

            for (int i = n; i >= 1; i--) {
                if (n % i == 0)
                    System.out.println(i);
            }

            while (true) {
                System.out.print("Would you like to see the divisors of another integer (Y/N)? ");
                char ch = sc.next().charAt(0);

                if (ch == 'Y' || ch == 'y')
                    break;
                if (ch == 'N' || ch == 'n') {
                    sc.close();
                    return;
                }

                System.out.println("Please respond with Y or N.");
            }
        }
    }
}
