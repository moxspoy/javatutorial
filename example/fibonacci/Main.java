import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] fibs = getFibbonacci(10);

        /* Printing all fibs element */
        for (int var : fibs) {
            System.out.println(var);
        }
    }

    private static int[] getFibbonacci(int numOfElements) {
        int i = 0;
        int j = 1;
        int[] fibArr = new int[numOfElements];
        fibArr[0] = i;
        fibArr[1] = j;
        for (int k = 2; k < numOfElements; k++) {
            fibArr[k] = fibArr[k-2] + fibArr[k-1];
        }
        return fibArr;
    }
}