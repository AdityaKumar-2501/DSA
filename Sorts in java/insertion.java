import java.util.*;

public class insertion{
	public static void PrintArray(int[] arr){
		for (int e :arr ) {
			System.out.print(e + " ");
		}
	}

	public static void InsertionSort(int[] arr){
		for (int i =1; i<arr.length ; i++) {
			for (int j = i -1; j>=0 ;j--){
				if(arr[j+1]<arr[j]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				else
					break;
			}
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

		InsertionSort(arr);
		System.out.println("Sorted Array : ");
		PrintArray(arr);
	}
}