/**
Write a program to accept an integer n from user and create array of size n. 
now accept n values in array by user. Values can be duplicate. Now find the
most repeated element in array. if all elements are with frequency 1 print
the message "all element has same frequency"
*/

import java.util.Scanner;

public class FindMostRepeatedElement {
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
        
        // creating a temp array of size arr.length
        int []temp = new int[arr.length];
        int highFrequency = 0; 
        int highFrequencyElement = 0;
        boolean flag = false;
        int i = 0;

        for(int e : arr) {
            int count = 0;

            // setting flag to true if element's frequency already calculated
            // this code is to reduce recounting of an element
            for(int ele : temp) {
                if(ele == e) {
                    flag = true;
                }
            }

            // checking flag
            if(flag) {
                flag = false;
                continue;
            }

            // counting frequency
            for(int ele : arr) {
                if(e == ele) {
                    count++;
                }
            }

            // assigning count to highfrequency
            if(count > highFrequency) {
                highFrequency = count;
                highFrequencyElement = e;
            }

            // storing counted element in temp
            temp[i++] = e;
        }

        if(highFrequency != 1) {
            System.out.println(highFrequencyElement + " " + highFrequency);
        } else {
            System.out.println("All elements are with frequency 1");
        }
    }
}