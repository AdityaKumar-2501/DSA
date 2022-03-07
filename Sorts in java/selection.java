import java.util.*;

public class selection{

	public static void PrintArray(int[] arr){
		for (int e :arr ) {
			System.out.print(e + " ");
		}
	}

	public static void SelectionSort(int[] arr){
		for (int i =0;i<arr.length ; i++) {
			int min = i;
			for (int j = i+1;j<arr.length ;j++ ) {
				if(arr[min]>arr[j]){
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
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

		SelectionSort(arr);
		System.out.println("Sorted Array : ");
		PrintArray(arr);
	}
}