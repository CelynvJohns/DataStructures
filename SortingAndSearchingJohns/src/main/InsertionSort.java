
/**
 * Code from Geeks for Geeks:https://www.geeksforgeeks.org/java-program-for-insertion-sort/
 */

package main;

//Java program for implementation of Insertion Sort 
class InsertionSort { 
 // Function to sort array using insertion sort 
	 public static  void sort(int arr[]) 
 {
	 int one = 1;
     int n = arr.length; 
     for (int i = one; i < n; ++i) { 
         int key = arr[i]; 
         int j = i - one; 

         // Move elements of arr[0..i-1], that are 
         // greater than key, to one position ahead 
         // of their current position 
         while (j >= 0 && arr[j] > key) { 
             arr[j + one] = arr[j]; 
             j = j - one; 
         } 
         arr[j + one] = key; 
     } 
 } 
}