import java.util.Scanner;

public class Main {
    
    /*
    This code piece generates factorials using given input
    Eg: 
        input = 3
        prints 3!, 2!, 1! separately
    */

    public static long factorial(long n) {
        if (n >= 1)
            return (n * factorial(n - 1));
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");

        long num = scanner.nextInt();
        scanner.nextLine();
        long a = num;

        for (int i = 1; i <= a; i++) {
            System.out.println("Factorial of " + num + " is: " + factorial(num));
            num--;
        }

        scanner.close();
    }
}
