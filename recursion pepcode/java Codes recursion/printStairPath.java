import java.util.*;

public class printStairPath{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Stairs: ");
		int n = sc.nextInt();
		psp(n,"");

	}
	public static void psp(int n, String ans){

		if (n == 0) {
			System.out.println(ans);
			return;
		}
		else if(n < 0){
			return;
		}

		psp(n-1,1 + ans);
		psp(n-2,2 + ans);
		psp(n-3,3 + ans);
	}
}