import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Your FizzBuzz: ");
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");


                System.out.print("FizzBuzz");
            } else if (i % 3 == 0) {

                System.out.println("Fizz");
            } else if (i % 5 == 0) {

                System.out.println("Buzz");
            } else {
                System.out.println(i);

            }
        }
    }
}