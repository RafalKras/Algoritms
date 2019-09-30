package sorting;

// O(0nlogn)

public class QuickSort {

	public static int[] qSort(int[] arr) { // method to declare low bound and upper bound of passed array;
											// pass your array to this method!
		int lb = 0;
		int ub = arr.length-1;
		qs(arr,lb,ub);			// runs function to sort array via QuickSort
		return arr;
	}
	

	
	public static void qs(int[] arr, int lb, int ub) {  // uses conquer and divide technique to sort array via recursion
		
		if(lb<ub) {
			int loc = partition(arr,lb,ub);
			qs(arr,lb,loc-1);
			qs(arr,loc+1,ub);
		}
		
	}
	
	public static int partition(int[]arr,int lb,int ub) {
		int pivot=arr[lb];
		int start=lb;
		int end=ub;
		
		while(start<end) {
			while(arr[start]<=pivot) {
				start++;
			}
			while(arr[end]>pivot) {
				end--;
			}
			if(start<end) {
				int tmp = arr[start];
				arr[start]=arr[end];
				arr[end]=tmp;
			}
		}
		int tmp = arr[start];
		arr[start]=arr[end];
		arr[end]=tmp;
		
		return end;
	}
	
	
}
