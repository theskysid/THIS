package Learningg.src.com.javatutorial.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        // Initialize the array
        int[] array = {1, 3, 5, 7, 9};

        // Print the original array
        printArray(array);

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two indices
        System.out.println("Give two indices to swap:");
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();

        // Swap the values at the given indices
        if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {
            swap(array, index1, index2);
        } else {
            System.out.println("Invalid indices.");
        }

        // Print the array after swapping
        printArray(array);

        // Close the scanner
        scanner.close();
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }

    // Method to swap elements at two indices in the array
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
