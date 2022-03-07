import java.util.*;

public class MergeTwoSortedArray{

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
		int[] a = {1,4,6,8,9,12,14,32};
		int[] b = {2,3,5,7,9};

		int[] ans = Merge(a,b);

		for (int e : ans) {
			System.out.print(e+" ");
		}
	}
}