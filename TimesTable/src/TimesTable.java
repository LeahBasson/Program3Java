
import java.util.Scanner;

public class TimesTable {

    public static void main(String[] args) {
        // read in a positive integer and then display the times tables for that number, from 1 to 12.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a whole number > 0: ");
        int number = input.nextInt();

        while (number <= 0) {

            if (number <= 0) {
                System.out.print("**Error**Number must be > 0, please re-enter: ");
                number = input.nextInt();
            }
        }
        
        System.out.println(number + " TIMES TABLES");
            System.out.println("-----------------------------------------");
            System.out.println("1 x " + number + " = " + number * 1);
            System.out.println("2 x " + number + " = " + number * 2);
            System.out.println("3 x " + number + " = " + number * 3);
            System.out.println("4 x " + number + " = " + number * 4);
            System.out.println("5 x " + number + " = " + number * 5);
            System.out.println("6 x " + number + " = " + number * 6);
            System.out.println("7 x " + number + " = " + number * 7);
            System.out.println("8 x " + number + " = " + number * 8);
            System.out.println("9 x " + number + " = " + number * 9);
            System.out.println("10 x " + number + " = " + number * 10);
            System.out.println("11 x " + number + " = " + number * 11);
            System.out.println("12 x " + number + " = " + number * 12);

    }

}
