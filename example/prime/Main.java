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

        if (isPrimeNumber(number)) {
            System.out.print("prime number");
        } else {
            System.out.print("not prime number");
        }
        
        System.out.println("\nPress 1 to continue");
        int again = mScanner.nextInt();
        if (again == 1) {
            menu();
        } else {
            mScanner.close();
            System.exit(0);
        }
        
    }

    private static boolean isPrimeNumber(int number) {
        boolean val = true;
        for (int i = 2; i < number-1; i++) {
            //not Prime number
            if(number%i == 0) {
                val = false;
                break;
            }
        }
        return val;
    }
}