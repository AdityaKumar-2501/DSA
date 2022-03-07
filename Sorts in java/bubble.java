import java.util.*;

public class bubble{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of element : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements: ");
		for (int i = 0;i <n ;i++ ) {
			arr[i] = sc.nextInt();
		}

		BubbleSort(arr);
		System.out.println("Sorted Array : ");
		PrintArray(arr);
	}
	public static void BubbleSort(int[] arr){
		for (int itr = 1; itr <= arr.length -1;itr++ ) {
			for (int j = 0; j< arr.length -itr ;j++ ) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void PrintArray(int[] arr){
		for (int e :arr ) {
			System.out.print(e + " ");
		}
	}
}