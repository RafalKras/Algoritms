package sorting;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[]{2,9,45,20,-2,85,74,641,-9,0,0,0,0,1,5,6,8,7,4,20};
		arr1 = InsertionSort.iSort(arr1);
		
		for(int c: arr1) {
			System.out.print( c +" ");
		}
	}

}
