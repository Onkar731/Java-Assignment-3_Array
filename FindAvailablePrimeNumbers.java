/**
Write a program to accept an integer n from user and create array of size n. 
now accept n values in array by user. 

Now find how many prime numbers are available in array.
*/

import java.util.Scanner;

public class FindAvailablePrimeNumbers {
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

        int count = 0; // storing count of prime numbers in array
        // finding prime numbers in array
        for(int e: arr) {
            int i = 2;

            while(i < e) {
                if(e%i == 0) {
                    break;
                }
                i++;
            }

            if(i == e) {
                count++;
            }
        }

        // printing available prime numbers in array
        System.out.println("Prime numbers available : " + count);
    }
}