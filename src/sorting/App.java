package sorting;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[]{2,9,45,2000,-2,85,74,641,-999999999};
		arr1 = InsertionSort.iSort(arr1);
		
		for(int c: arr1) {
			System.out.print( c +" ");
		}
	}

}
