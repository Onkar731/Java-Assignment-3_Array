/**
Write a program to accept an integer n from user and create array of size n. 
now accept n values in array by user. Now find how many Fibonacci terms are
available in array. 

Fibonacci term are those numbers which are available in Fibonacci series 
for example 0 1 1 2 3 5 8 13..... so these all terms are Fibonacci terms.
*/

import java.util.Scanner;

public class FindFibonacciTerms {
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

        // finding fibonacci terms in array
        int fib = 0 , a = 0 , b = 1 ; 
        int fib_count = 0;
	
		for(int i = 0; i < arr.length; i++) {
			if(fib > arr[i]) {
				fib = 0; a = 0; b = 1;
			}

			if(fib == arr[i]) {
				fib_count++;
				continue;
			}

			while(fib <= arr[i]) {
				fib = a + b;
				if(fib == arr[i]) {
					fib_count++;
					break;
				}
				a = b;
				b = fib;
			}
		}

        // printing fibonacci terms count
		System.out.println("Total fibonacci terms are : " + fib_count);
    }
}