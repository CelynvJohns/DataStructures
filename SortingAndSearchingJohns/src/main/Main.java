package main;

import java.util.Arrays;
import java.util.Random;
import main.InsertionSort;


public class Main {
    public static void main(String[] args) {
        int MAX = 335934;
        int[] unsortedArray = generateRandomIntArray(MAX);
        int[] sortedArray;

        // Perform Linear Search
        int target = 42;
        int linearSearchIndex = LinearSearch.search(unsortedArray, target);
        System.out.println("Linear Search:");
        if (linearSearchIndex != -1) {
            System.out.println("Element " + target + " found at index " + linearSearchIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        // Perform Binary Search
        int sortedTarget = 42; // Make sure the array is sorted
        sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        Arrays.sort(sortedArray);
        int binarySearchIndex = BinarySearch.binarySearch(sortedArray, sortedTarget);
        System.out.println("Binary Search:");
        if (binarySearchIndex != -1) {
            System.out.println("Element " + sortedTarget + " found at index " + binarySearchIndex);
        } else {
            System.out.println("Element " + sortedTarget + " not found in the array.");
        }

     // Bubble Sort
        //int[] bubbleArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        //System.out.println("Bubble Sort:");
        //System.out.println("Data Before Sorting: " + Arrays.toString(bubbleArray)); // Display data before sorting
        //long bubbleSortStartTime = System.currentTimeMillis();
        //BubbleSort.bubbleSort(bubbleArray);
        //long bubbleSortEndTime = System.currentTimeMillis();
        //long bubbleSortTime = bubbleSortEndTime - bubbleSortStartTime;
        //System.out.println("Data After Sorting: " + Arrays.toString(bubbleArray)); // Display data after sorting
        //System.out.println("Bubble Sort took " + bubbleSortTime + " milliseconds.");

        // Selection Sort
        int[] selectionArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        System.out.println("Selection Sort:");
        //System.out.println("Data Before Sorting: " + Arrays.toString(selectionArray)); // Display data before sorting
        long selectionSortStartTime = System.currentTimeMillis();
        SelectionSort.sort(selectionArray);
        long selectionSortEndTime = System.currentTimeMillis();
        long selectionSortTime = selectionSortEndTime - selectionSortStartTime;
        //System.out.println("Data After Sorting: " + Arrays.toString(selectionArray)); // Display data after sorting
        System.out.println("Selection Sort took " + selectionSortTime + " milliseconds.");

        // Insertion Sort
        //int[] insertionArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        //System.out.println("Insertion Sort:");
        //System.out.println("Data Before Sorting: " + Arrays.toString(insertionArray)); // Display data before sorting
        //long insertionSortStartTime = System.currentTimeMillis();
        //InsertionSort.sort(insertionArray);
        //long insertionSortEndTime = System.currentTimeMillis();
        //long insertionSortTime = insertionSortEndTime - insertionSortStartTime;
        //System.out.println("Data After Sorting: " + Arrays.toString(insertionArray)); // Display data after sorting
       // System.out.println("Insertion Sort took " + insertionSortTime + " milliseconds.");
    }

    // Implement generateRandomIntArray method here

    public static int[] generateRandomIntArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        int MAX = 100000;

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(MAX); // Generates random integers between 0 and 99,999
        }

        return array;
    }
}
