/**
Write a program to accept an integer n from user and create array of size n. 
now accept n values in array by user. 

Now find the sum of all even terms and all odd terms available in array. 
finally print the sum of both in output.
*/

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        System.out.print("Enter how many elements you want to store : ");
        int N = sc.nextInt();

        // creating a array of size N
        int []arr = new int[N];

        // accepting elements
        System.out.print("Enter " + N + " elements : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // creating two variables to store sum of even and odd numbers
        int eSum = 0;
        int oSum = 0;

        // calculating sum 
        for(int e : arr) {
            if(e%2 == 0) {
                eSum += e;
            } else {
                oSum += e;
            }
        }

        // printing sum of even and odd numbers
        System.out.println("Even sum : " + eSum + "\nOdd sum : " + oSum);
    }
}