package main;
/**
 * Code from Geeks for Geeks: https://www.geeksforgeeks.org/java-program-for-linear-search/# 
 */

/**
 * Linear Search is a fundamental search algorithm that systematically evaluates 
 * each element within an array or list. It initiates the search from the beginning 
 * and assesses each element in relation to the target value until a match is identified or all elements have been inspected.
 * 
 * Use Linear Search when:
 * 1. The list is not sorted or only partially sorted.
 * 2. You need to find the first occurrence of an element.
 * 3. The dataset is small or the array is unsorted.
 * 
 * When not to use Linear Search:
 * 1. For very large datasets or arrays, as it has a time complexity of O(n),
 *    making it inefficient for large-scale searches.
 * 2. When you need to search in a sorted dataset; binary search is more efficient.
 * 3. When frequent search operations are required, consider using data structures
 *    like hash tables or binary search trees for better performance.
 */

//Java code for linearly search x in arr[]. If x
//is present then return its location, otherwise
//return -1
public class LinearSearch {
 // This function returns index of element x in arr[]
 public static int search(int arr[], int x) {
	 // variable so no magic number
	 int wrong = -1;
	 for (int i = 0; i < arr.length; i++) {
         // Return the index of the element if the element
         // is found
         if (arr[i] == x)
             return i;
     }

     // return -1 if the element is not found
     return wrong;
 }
}