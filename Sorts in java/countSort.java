import java.util.*;

public class countSort{

	public static void Countsort(int[] arr, int min, int max){
		int range = max - min + 1;
		int[] farr = new int[range];
		// for counting the frequence of elements
		for (int i = 0; i < arr.length ; i++ ) {
			int idx = arr[i] - min;
			farr[idx]++;
		}
		//for counting the last position of element to be present in sorted array
		for (int i = 1; i <farr.length; i++ ) {
			farr[i] = farr[i] + farr[i-1];
		}

		int [] ans = new int [arr.length];
		// for inserting the value in sorted array
		for (int i = arr.length -1 ; i>= 0 ;i--) {
			int val = arr[i];
			int pos = farr[val - min];
			int idx = pos - 1;
			ans[idx] = val;
			farr[val - min]--;
		}

		//for putting the sorted array in original array
		for(int i= 0; i<ans.length;i ++){
			arr[i] = ans[i];
		}
	}
	
	public static void print(int[] arr) {
	  for (int i = 0; i < arr.length; i++) {
	    System.out.print(arr[i] + " ");
	  }
	  System.out.println();
	}

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Number of elments: ");
		int n = scn.nextInt();
		System.out.print("Enter the elements: ");
	    int[] arr = new int[n];
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	      max = Math.max(max, arr[i]);
	      min = Math.min(min, arr[i]);
	    }
	    System.out.println("Sorted Array : ");
	    Countsort(arr,min,max);
	    
	    print(arr);
	}
}