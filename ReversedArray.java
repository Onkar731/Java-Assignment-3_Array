/**
Write a program to accept an integer n from user and create array of size n. 
now accept n values in array by user. Values can be duplicate. now reverse
the elements of array. Do not create another array.

Note: Do not print array in reverse manipulate the array itself such that
elements of array get stored in reverse order in same array.
*/

import java.util.Scanner;

public class ReversedArray {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many elements you want to store : ");
        int N = sc.nextInt();

        // creating a array of size N
        int []arr = new int[N];

        // accepting elements
        System.out.print("Enter " + N + " elements : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // reversing array elements
        for(int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        // printing reversed array elements 
        for(int e : arr) {
            System.out.print(e + " ");
        }
    }
}