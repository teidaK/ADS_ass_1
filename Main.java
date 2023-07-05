
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

    // Problem 4: Finding the factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Problem 5: Finding the n-th element in the Fibonacci sequence
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Problem 6: Calculating the power of a number
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }

    // Problem 7: Reversing an array using recursion
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }


    // Problem 8: Checking if a string consists only of digits
    public static boolean consistsOfDigits(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    // Problem 9: Finding the binomial coefficient C(n, k)
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
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

        // Problem 4: Finding the factorial of a number
        System.out.print("Enter a number: ");
        int factorialNum = scanner.nextInt();
        int factorialResult = factorial(factorialNum);
        System.out.println(factorialResult);

        // Problem 5: Finding the n-th element in the Fibonacci sequence
        System.out.print("Enter a number: ");
        int fibonacciNum = scanner.nextInt();
        int fibonacciResult = fibonacci(fibonacciNum);
        System.out.println(fibonacciResult);

        // Problem 6: Calculating the power of a number
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        int powerResult = power(base, exponent);
        System.out.println(powerResult);

        // Problem 7: Reversing an array using recursion
        System.out.print("Enter the number of elements: ");
        n = scanner.nextInt();
        int[] arr3 = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr3[i] = scanner.nextInt();
        }
        reverseArray(arr3, 0, arr3.length - 1);
        for (int num : arr3) {
            System.out.print(num + " ");
        }

        // Problem 8: Checking if a string consists only of digits
        System.out.print("Enter a string: ");
        String str = scanner.next();
        boolean consistsOfDigits = consistsOfDigits(str);
        System.out.println(str + (consistsOfDigits ? " Yes" : " No"));

        // Problem 9: Finding the binomial coefficient C(n, k)
        System.out.print("Enter n: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter k: ");
        int k1 = scanner.nextInt();
        int binomialCoefficientResult = binomialCoefficient(n1, k1);
        System.out.println(binomialCoefficientResult);
    }
}
