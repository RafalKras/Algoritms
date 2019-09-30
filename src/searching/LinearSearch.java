package searching;

public class LinearSearch {

	public static int ls(int[] arr, int goal) { // return index where goal occurs via linear search
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]== goal) return i;
		}
		return -1;
	}
}
