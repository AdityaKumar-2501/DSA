import java.util.*;

public class quickSelect{

	public static int select(int[] arr, int lo, int hi, int k){
		int pivot = arr[hi];
		int pi = partition(arr,pivot,lo,hi);

		if (k > pi) {
			return select(arr,pi+1, hi, k);
		}
		else if (k<pi){
			return select(arr,lo, pi-1, k);
		}
		else{
			return arr[pi];
		}
	}

	public static int partition(int[] arr, int pivot, int lo, int hi){
		int i = lo , j = lo;
		while(i<= hi){
			if (arr[i] > pivot) {
				i++;
			}
			else{
				swap(arr,i,j);
				i++;j++;
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

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Number of elments: ");
		int n = scn.nextInt();
		System.out.print("Enter the elements: ");
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	    }
	    System.out.print("Enter which Kth smallest value you want : ");
	    int k  = scn.nextInt();
	    System.out.print( k+ "th smallest value in array is : ");
		int ans = select(arr,0,arr.length-1,k-1);
		System.out.print(ans);
	}
}