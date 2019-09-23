package sorting;


public class App {

	public static void main(String[] args) {
		
//
		// use insertion sort
		int[] arr1 = new int[]{2,9,45,20,-2,85,74,641,-9,0,0,0,0,1,5,6,8,7,4,20};
		arr1 = InsertionSort.iSort(arr1);
		
		System.out.println("Uses Insertion Sort to sort Array");
		for(int c: arr1) {
			System.out.print( c +" ");
		}
		System.out.println();
		
		// use Bubble sort
		System.out.println("Uses bubbleSort to sort array.");
		int[] arr2 = new int[]{5,2,3,-9,-25,-6,0,0,4,8,12,20,26};
		arr2 = BubbleSortArray.bsort(arr2);
		for(int c: arr2) {
			System.out.print( c +" ");
		}
		System.out.println();
		
		// use Selection Sort
		
		System.out.println("Uses SelectionSort to sort array.");
		int[] arr3 = new int[]{5,2,3,-9,-25,-6,0,0,4,8,12,20};
		arr3 = SelectionSort.sSort(arr3);
		for(int c: arr3) {
		System.out.print( c +" ");
		}
		System.out.println();
			
	}

}
