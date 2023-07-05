
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


    }
}
