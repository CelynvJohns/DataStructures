package main;

/**
 * Code from Geeks for Geeks:https://www.geeksforgeeks.org/java-program-for-bubble-sort/
 */

//Java program for implementation 
//of Bubble Sort 
class BubbleSort { 
 public static void bubbleSort(int arr[]) 
 { 
	 int one = 1;
     int n = arr.length; 
     for (int i = 0; i < n - 1; i++) 
         for (int j = 0; j < n - i - one; j++) 
             if (arr[j] > arr[j + one]) { 
                 // swap temp and arr[i] 
                 int temp = arr[j]; 
                 arr[j] = arr[j + one]; 
                 arr[j + one] = temp; 
             } 
 } 
}