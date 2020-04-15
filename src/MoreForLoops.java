import java.util.Scanner;

public class MoreForLoops {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String userString = "";
        int userStringLength = 0;
        int factorNum = 0;
        int userNum = 0;
        int factorialNum = 1;

        //prints all odd numbers from 1-20
        for(int i = 1; i <= 20; i++) {
            if (i%2 != 0) {
                System.out.print("" + i + " ");

            }
        }
        System.out.println();
        //prints all even numbers from 1-20
        for (int i = 1; i <= 20; i ++) {
            if (i % 2 == 0) {
                System.out.print("" + i + " ");
            }
        }
        System.out.println();

        //reverses a string
        System.out.print("Enter a word: ");
        userString = input.nextLine();
        userStringLength = userString.length();

        for (int i = userStringLength - 1; i >= 0; i--) {
            System.out.print(userString.charAt(i));
        }
        System.out.println();

        //Displays all factors of a number
        System.out.print("Enter a number: ");
        factorNum = input.nextInt();
        System.out.print("The factors of that number are: ");
        for(int i = factorNum; i > 0; i--) {
            if (factorNum % i == 0 && factorNum != i) {
                System.out.print("" + i + " ");
            }
        }
        System.out.println();

        //Computes the factorial of a number
        System.out.print("Enter a number: ");
        userNum = input.nextInt();
        for(int i = userNum; i > 0; i--) {
            factorialNum *= i;
        }
        System.out.println("The factorial of that number is: " + factorialNum);
    }
}
