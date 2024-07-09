package app;

import date_time_exercises.NY_CurrentTime;
import arrays_exercises.SortArray;

public class App {
	public static void main (String[]Args) {
		SortArray sortArrays = new SortArray();
		
		sortArrays.printIntArray();
		sortArrays.printStringArray();
		
		sortArrays.printSortedIntArray();
		sortArrays.printSortedStringArray();
	}
}
