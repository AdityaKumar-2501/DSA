import java.util.Scanner;

public class allIndexInArray{
	public static void main(String[] args) {
		int[]a = {1,2,3,2,1,4,5,2,3,4,3,4};
		int []ans = allIndices(a,3,0,0);

		for (int element : ans ) {
			System.out.print(element+" ");
		}
	}

	public static int[] allIndices(int[] arr,int x, int idx, int fsf){
		if (idx == arr.length) {
			return new int[fsf];
		}

		if (arr[idx] == x) {
			int [] iarr = allIndices(arr,x,idx+1,fsf+1);
			iarr[fsf] = idx;
			return iarr;
		}
		else{
			int [] iarr = allIndices(arr,x,idx+1,fsf);
			return iarr;
		}
	}
}