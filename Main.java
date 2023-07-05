
import java.util.Scanner;

public class Main {
    // Problem 1: Finding the minimum element in an array
    public static int findMinimum(int[] arr){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    // Problem 2: Calculating the average of an array
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    // Problem 3: Checking if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Running code
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Problem 1: Finding the minimum element in an array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        int minElement = findMinimum(arr1);
        System.out.println(minElement);

        // Problem 2: Calculating the average of an array
        System.out.print("Enter the number of elements: ");
        n = scanner.nextInt();
        int[] arr2 = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }
        double average = calculateAverage(arr2);
        System.out.println(average);

        // Problem 3: Checking if a number is prime
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        boolean isPrimeNum1 = isPrime(num1);
        System.out.println(num1 + (isPrimeNum1 ? " is Prime" : " is Composite"));
    }
}
