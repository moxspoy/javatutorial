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

        if (isPalindrome(number)) {
            System.out.print(number + " is palindrome");
        } else {
            System.out.print(number + " is not palindrome");
        }
        
        System.out.println("\nTekan 1 untuk lanjut");
        int again = mScanner.nextInt();
        if (again == 1) {
            menu();
        } else {
            mScanner.close();
            System.exit(0);
        }
        
    }

    private static boolean isPalindrome(int number) {
        boolean val = true;
        String numberStr = String.valueOf(number);
        int numberLength = numberStr.length();
        for (int i = 0; i < numberLength ; i++) {
            if(numberStr.charAt(i) != numberStr.charAt((numberLength-1)-i)) {
                val = false;
                break;
            } 
        }
        return val;
    }
}