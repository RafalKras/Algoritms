package sorting;

public class SelectionSort {

	
	public static int[] sSort(int[] arr) {
		for(int i=0; i <arr.length;i++) { // outer loop for passes
			int minx = i;
			for(int j=i+1; j < arr.length;j++) { // inner loop for finding minimum element
				if (arr[minx]<arr[j]) {
					 minx = j;
				}
			//lol
			int tmp = arr[i];
			arr[i]=arr[minx];
			arr[minx]=tmp;
			}
		}
		return arr;
	}
}
