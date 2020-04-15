import java.util.Scanner;

public class MoreForLoops {
    public static void main (String[] args) {
        /*
        Set up variables for all the parts
         */
        Scanner input = new Scanner(System.in);
        String userString = "";
        int userStringLength = 0;
        int factorNum = 0;
        int userNum = 0;
        int factorialNum = 1;

        //prints all odd numbers from 1-20
        /*
        Set up for loop with i starting at 1, going up to 20
        If the remainder of i/2 is something other than 0 aka if it's not an even number,
        print out i.
         */
        for(int i = 1; i <= 20; i++) {
            if (i%2 != 0) {
                System.out.print("" + i + " ");

            }
        }
        System.out.println();
        //prints all even numbers from 1-20
        /*
        Similar to above, set up loop with i starting at 1, going up to 20
        This time, if the remainder of i/2 is equal to 0, print out i
         */
        for (int i = 1; i <= 20; i ++) {
            if (i % 2 == 0) {
                System.out.print("" + i + " ");
            }
        }
        System.out.println();

        //reverses a string
        /*
        Asks the user to give a word, stores it in userString
        userStringLength takes the length of userString and stores it as an int
        Set up a for loop with (i = userStringLength - 1) and decrementing by 1 every loop
            (i is userStringLength - 1 because charAt() values start at 0)
        Prints out the character at position i. Since i starts at the last index value,
        the word is printed in reverse
         */
        System.out.print("Enter a word: ");
        userString = input.nextLine();
        userStringLength = userString.length();

        for (int i = userStringLength - 1; i >= 0; i--) {
            System.out.print(userString.charAt(i));
        }
        System.out.println();

        //Displays all factors of a number
        /*
        Asks the user for a number, stores it in factorNum
        set up for loop with (i = factorNum) and decrementing every loop
        Inside the loop, ask if i is a factor of factorNum using the % sign. If it's equal to 0, and not equal to
        factorNum, then it is a factor
        Print out i values that meet the condition above
         */
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
        /*
        Asks the user for a number, stores it in userNum
        factorialNum is set to 1 when initialized at the start
        Set up for loop where i = userNum, and decrements by 1 until 0
        factorialNum is multiplied by the value of i, and then set equal to that value
        Print out factorialNum
         */
        System.out.print("Enter a number: ");
        userNum = input.nextInt();
        for(int i = userNum; i > 0; i--) {
            factorialNum *= i;
        }
        System.out.println("The factorial of that number is: " + factorialNum);
    }
}
