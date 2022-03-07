import java.util.*;

public class TargetSumSubset{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];

		for (int i = 0 ;i< arr.length ;i++ ) {
			arr[i] = sc.nextInt();
		}

		int targetSum = sc.nextInt();
		printTarSubset(arr,0,"",0,targetSum);
	}
	// set is subset
	// sos is sum of subset

	public static void printTarSubset(int [] arr, int idx, String set, int sos, int targetSum){

		if (idx == arr.length) {
			if (sos == targetSum) {
				System.out.println(set + ".");
			}
			return;
		}

		printTarSubset(arr, idx+1, set + arr[idx] + ", " , sos + arr[idx], targetSum);
		printTarSubset(arr,idx+1,set,sos,targetSum);
	}
}