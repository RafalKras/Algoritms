package sorting;

 public class BubbleSortArray { // takes first element and comparing to the all elements and last one becomes the biggest and so on

	public static int[] bsort(int[] a) {	// Bubble sort for integers
		
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
	
	
	public static String[] bsort(String[] str) { // Bubble sort for Strings
		System.out.println("Function in Development.");
		return str;
	}
	
}
