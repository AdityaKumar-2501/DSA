import java.util.*;

public class QuickSort{

	public static void quickSort(int[] arr, int lo, int hi){

		if (lo >= hi) {
			return;
		}

		int pivot = arr[hi];
		int pi = partition(arr,pivot,lo,hi);
		quickSort(arr,lo,pi -1);
		quickSort(arr,pi+1,hi);
	}

	public static int partition(int[] arr, int pivot, int lo, int hi){
    	// 0 to j-1 -> <= pivot
		// j to i-1 -> > pivot
		// i to end -> unknown

		int i = lo, j= lo;
		while(i <= hi){
			if(arr[i] > pivot){
				i++;
			}else{
				swap(arr,i,j);
				i++
				;j++;
			}
		}
		return j-1;
    
  	}

	// used for swapping ith and jth elements of array
	public static void swap(int[] arr, int i, int j) {
	  int temp = arr[i];
	  arr[i] = arr[j];
	  arr[j] = temp;
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
	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	    }
	    System.out.println("Sorted Array : ");
	    quickSort(arr,0,arr.length -1);
	    
	    print(arr);
	}
}