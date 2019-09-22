package sorting;

public class BubbleSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[]{2,9,45,2000,-2,85,74,641,-999999999};
		arr1 = bsort(arr1);
		
		for(int c: arr1) {
			System.out.print( c +" ");
		}
		
	}

	public static int[] bsort(int[] a) {
		
		for(int i=0; i < a.length-1; i++) {
			int flag = 0;
				for(int j=0; j<a.length-1-i;j++) {
					if(a[j]>a[j+1]) {
						int tmp = a[j];
						a[j] = a[j+1];
						a[j+1] = tmp;
						flag = 1;
					}
				}
				if(flag == 0) break;
		}
		return a;
	}
	
	
	
}
