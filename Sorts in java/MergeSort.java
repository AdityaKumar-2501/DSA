import java.util.*;

public class MergeSort{

	public static int[] mergeSort(int[] arr, int lo, int hi){
		if (lo == hi) {
			int[] ba = new int[1];
			ba[0] = arr[lo];
			return ba;
		}

		int mid = (lo + hi)/2;
		int[] lsh = mergeSort(arr, lo, mid);
		int[] rsh = mergeSort(arr, mid+1, hi);
		int[] fsa = Merge(lsh, rsh);
		return fsa;
	}

	public static int[] Merge(int[]a, int[]b){
		int[] res = new int[a.length + b.length];

		int i = 0, j = 0, k = 0;
		while(i < a.length && j < b.length){
			if (a[i]< b[j]) {
				res[k] = a[i];
				i++;
				k++;
			}else{
				res[k] = b[j];
				j++;
				k++;
			}
		}
		while (i < a.length) {
			res[k] = a[i];
			i++;
			k++;
		}
		while (j < b.length) {
			res[k] = b[j];
			j++;
			k++;
		}
		return res;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of element : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements: ");
		for (int i = 0;i <n ;i++ ) {
			arr[i] = sc.nextInt();
		}

		int[] ans = mergeSort(arr,0,arr.length-1);
		System.out.println("Sorted Array : ");
		PrintArray(ans);
	}
	public static void PrintArray(int[] arr){
		for (int e :arr ) {
			System.out.print(e + " ");
		}
	}
}