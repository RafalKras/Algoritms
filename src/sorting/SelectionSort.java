package sorting;

public class SelectionSort {  // looks for minimum element in array and put it to start of array and so on

	
	public static int[] sSort(int[] arr) {
		for(int i=0; i <arr.length;i++) { // outer loop for passes
			int min=i;
			for(int j=i+1; j < arr.length;j++) { // inner loop for finding minimum element
				if (arr[j]<arr[min]) {
					 min = j;
				}
			}
			if(min!=i) {
			int tmp = arr[i];
			arr[i]=arr[min];
			arr[min]=tmp;
			}
		}
		return arr;
	}
}
