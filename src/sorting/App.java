package sorting;
import java.util.*;

public class App {

	public static void main(String[] args) {
		
		int max = 60;
		int[] arr1 = new int[max];
		
		Random rn = new Random();
		
		for(int i=0;i<max;i++) {
			arr1[i] = rn.nextInt();
		}
//
		// use insertion sort
	//	int[] arr1 = new int[]{2,9,45,20,-2,85,74,641,-9,0,0,0,0,1,5,6,8,7,4,20,0,12,15,14,14,19,9,8,75,1481,51,51,51,51,51,231,50,2,530,560,332,03,0,320,320,32,-99,32,23,1,-8,212,12,1,21,21,-57,210,2,-32,2,0};
		
		long time1 = System.nanoTime();
		arr1 = InsertionSort.iSort(arr1);
		long time2 = System.nanoTime() - time1;
		System.out.println("Uses Insertion Sort to sort Array");
		for(int c: arr1) {
			System.out.print( c +" ");
		}
		System.out.println();
		System.out.println("Czas sortowania to: " + time2 + " milisekund.");
		System.out.println();
		
		
		// use Bubble sort
		System.out.println("Uses bubbleSort to sort array.");
		int[] arr2 = new int[]{2,9,45,20,-2,85,74,641,-9,0,0,0,0,1,5,6,8,7,4,20,0,12,15,14,14,19,9,8,75,1481,51,51,51,51,51,231,50,2,530,560,332,03,0,320,320,32,-99,32,23,1,-8,212,12,1,21,21,-57,210,2,-32,2,0};
		time1 = System.nanoTime();
		arr2 = BubbleSortArray.bsort(arr2);
		time2 = System.nanoTime() - time1;
		for(int c: arr2) {
			System.out.print( c +" ");
		}
		System.out.println();
		System.out.println("Czas sortowania to: " + time2 + " milisekund.");
		System.out.println();
		
		// use Bubble sort for Strings
		System.out.println("Uses bubbleSort to sort array.");
		String[] arrstr = new String[]{"Jeden","Anna","ania","125osiem","polo wa","ania","anna"};
		time1 = System.nanoTime();
		arrstr = BubbleSortArray.bsort(arrstr);
		time2 = System.nanoTime() - time1;
		for(String s: arrstr) {
			System.out.print( s +" ");
		}
		System.out.println();
		System.out.println("Czas sortowania to: " + time2 + " milisekund.");
		System.out.println();
		
		
		// use Selection Sort
		
		System.out.println("Uses SelectionSort to sort array.");
		int[] arr3 = new int[]{2,9,45,20,-2,85,74,641,-9,0,0,0,0,1,5,6,8,7,4,20,0,12,15,14,14,19,9,8,75,1481,51,51,51,51,51,231,50,2,530,560,332,03,0,320,320,32,-99,32,23,1,-8,212,12,1,21,21,-57,210,2,-32,2,0};
		time1 = System.nanoTime();
		arr3 = SelectionSort.sSort(arr3);
		time2 = System.nanoTime() - time1;
		for(int c: arr3) {
		System.out.print( c +" ");
		}
		System.out.println();
		System.out.println("Czas sortowania to: " + time2 + " milisekund.");
		System.out.println();	
		
		
		System.out.println("Uses QuickSort to sort array.");
		int[] arr4 = new int[]{2,9,45,20,-2,85,74,641,-9,0,0,0,0,1,5,6,8,7,4,20,0,12,15,14,14,19,9,8,75,1481,51,51,51,51,51,231,50,2,530,560,332,03,0,320,320,32,-99,32,23,1,-8,212,12,1,21,21,-57,210,2,-32,2,0};
		time1 = System.nanoTime();
		arr4 = QuickSort.qSort(arr4);
		time2 = System.nanoTime() - time1;
		for(int c: arr4) {
		System.out.print( c +" ");
		}
		System.out.println();
		System.out.println("Czas sortowania to: " + time2 + " milisekund.");
		System.out.println();
	}

}
