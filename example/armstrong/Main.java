import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("Please input number to be checked:");
        Scanner mScanner = new Scanner(System.in);
        int number = mScanner.nextInt();

        if (isAmstrong(number)) {
            System.out.print(number + " is amstrong");
        } else {
            System.out.print(number + " is not amstrong");
        }
        
        System.out.println("\nPress 1 to continue, or press other key to exit");
        int again = mScanner.nextInt();
        if (again == 1) {
            menu();
        } else {
            mScanner.close();
            System.exit(0);
        }
        
    }

    private static boolean isAmstrong(int number) {
        int currentNumber;
        int cubicResult = 0;
        int originialNumber = number;
        while (number > 0) {  
            currentNumber = number % 10;

            int temp = currentNumber * currentNumber * currentNumber;
            cubicResult = cubicResult + temp;
            number = number / 10;
        }
        boolean val = cubicResult == originialNumber ? true : false;
        return val;
    }
}