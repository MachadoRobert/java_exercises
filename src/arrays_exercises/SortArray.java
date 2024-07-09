package arrays_exercises;

import java.util.Arrays;

public class SortArray {
	
	//arrays declaration
	private int[] intArray = {1, 5, 6, 7, 2, 3, 10};
	private String[] stringArray = {"a", "c", "b", "f", "e"};

	
	//print usorted int array
	public void printIntArray() {
		for (int element: intArray) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	//print unsorted string array
	public void printStringArray() {
		for (String element: stringArray) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	//print sorted int array
	public void printSortedIntArray() {
		Arrays.sort(intArray);
		for (int element: intArray) {
			System.out.print(element + " ");
		}
		System.out.println();
				
	}
	//print sorted string array
	public void printSortedStringArray() {
		Arrays.sort(stringArray);
		for (String element: stringArray) {
					System.out.print(element + " ");
		}
		System.out.println();
	}
}
