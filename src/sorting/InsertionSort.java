package sorting;

public class InsertionSort {
	
	public static int[] iSort(int[] arr) { // Insertion sort for integers
		
		for(int i = 1; i < arr.length; i++) { // outher loop for unsorted pieces
			int tmp = arr[i];
			int j = i-1; 
				while(j>=0 && arr[j]>tmp) { 	// inner loop for inserting items in good position
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1] = tmp;
			}
		
		return arr;
	}

}
