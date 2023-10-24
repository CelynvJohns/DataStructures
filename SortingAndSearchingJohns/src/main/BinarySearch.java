package main;
/**
 * Code from Geeks for Geeks:https://www.geeksforgeeks.org/binary-search-in-java/
 */

/**
 * Binary Search is a powerful search algorithm optimized for 
 * sorted sequences. It employs a divide-and-conquer approach, 
 * breaking down the search range into smaller segments, making 
 * it ideal for large sorted datasets.
 * 
 * When you can use Binary Search:
 * - Sorted Data: Binary Search is ideal for searching in sorted data, such as arrays, lists, or trees.
 * - Large Datasets: It's particularly useful for large datasets, where the efficiency of Binary Search becomes evident.
 * - Static Data: When the data doesn't change frequently, Binary Search can be applied efficiently.
 * - Ordered Collections: It can be employed in ordered collections, like dictionaries or phone books, to quickly find entries.
 * 
 * When you cannot use Binary Search:
 * - Unsorted Data: Binary Search doesn't work for unsorted data. You need to sort the data first.
 * - Dynamic Data: If the data is continually changing or dynamically updated, 
 * 					Binary Search is not suitable as it assumes a static dataset.
 * - Non-Sorted Collections: It cannot be applied to unordered data structures, like hash tables or unsorted arrays.
 * - Complex Comparisons: Binary Search relies on simple comparison operations. 
 *         					If you need to perform complex comparisons, it may not be the best choice.
 * - Memory Constraints: In some cases, Binary Search's memory overhead might not be feasible, 
 * 							so other search methods should be considered.
 */

//Java implementation of iterative Binary Search
class BinarySearch {
 // Returns index of x if it is present in arr[l....r], else return -1
 public static int binarySearch(int arr[], int x){
	 
	 int l = 0, r = arr.length - 1;
	 int divide =2;
	 int pointer = 1;
	 int wrong = -1;
	 
     while (l <= r) {
         int mid = (l + r) / divide;

         // If the element is present at the
         // middle itself
         if (arr[mid] == x) {
             return mid;

         // If element is smaller than mid, then
         // it can only be present in left subarray
         // so we decrease our r pointer to mid - 1 
         } else if (arr[mid] > x) {
             r = mid - pointer;

         // Else the element can only be present
         // in right subarray
         // so we increase our l pointer to mid + 1
         } else {
           l = mid + pointer;
         }  
     }

     // We reach here when element is not present
     //  in array
     return wrong;
 }
}