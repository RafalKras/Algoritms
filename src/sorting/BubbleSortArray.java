package sorting;

// O(n^2)

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
		// System.out.println("Function in Development.");
		
		for(int i=0; i < str.length-1; i++) {
			int flag = 0;
				for(int j=0; j<str.length-1-i;j++) {
					
					String a = str[j]; 
					String b = str[j+1];  

					int compare = a.compareTo(b);  

					
					if(compare > 0) {
						String tmp = str[j];
						str[j] = str[j+1];
						str[j+1] = tmp;
						flag = 1;
					}
				}
				if(flag == 0) break;
		}
		
		return str;
	}
	
	public static boolean compareStr (String str1, String str2) {
		
		int k = 0;
		while(k < str1.length() && k < str2.length()) {
			if(str1.charAt(k) > str2.charAt(k)) {
				return false;
			}
			k++;
		}
		
		return true;
	}
	
}
