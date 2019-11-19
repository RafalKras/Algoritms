package searching;
import sorting.*;

public class BinarySearch { // return index of goal item via binary search
	
	public static int bs(int[] arr, int goal) { // binary search looking for goal, returns index of goal in sorted array, if not found returns -;
		arr = InsertionSort.iSort(arr);
		int min = 0;
		int max = arr.length-1;
		int answer;
		answer = bsr(arr, goal, min, max);
		return answer;
	}

	public static int bsr(int[]arr, int goal, int min, int max) { 
		
		if(arr[(max-min/2)+min] == goal) return (max-min/2)+min;
		else if(arr[(max-min/2)+min] <= goal) return bsr(arr, goal, min, (max-min/2)+min);
		else return bsr(arr, goal, (max-min/2)+min, max);
		
	}
	
}
