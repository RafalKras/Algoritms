package searching;
import java.util.*;

public class App {

	public static void main(String[] args) {
		//Finding one element in array
		//-----------------------------
		
		int[] arr = createArr(true, 50,10,50);
		for(int a: arr) System.out.print(a+ " | ");
		
		
		
		
		
		

	}
	
	public static int[] createArr(boolean u, int size, int min, int max) { //Creates random array with provided size, min and max value. Also option for unique values
		int []arr = new int[size];
		if(u) {
			Random generator = new Random();
			arr[0] = generator.nextInt(max-min)+min;
			if(size <= 1) return arr;
			for(int i = 1; i < size; i++)
			{
				int t = generator.nextInt(max-min)+min;
				boolean flag = false;
				for(int j = i-1; j >= 0; j--) {
					if(arr[j] == t) flag = true;
				}
				if(flag) {
					i--;
				}else {
					arr[i] = t;
				}
				
			}
			
		}else {
			Random generator = new Random();
			for(int i = 0; i < size; i++)
			{
				arr[i] = generator.nextInt(max-min)+min;
			}
			
		}
		
		return arr;
	}

}
