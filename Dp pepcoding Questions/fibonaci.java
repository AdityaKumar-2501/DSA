import java.util.*;

public class fibonaci{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		int ans = fib(n, new int[n+1]);
		System.out.println("Fibonacci value at "+n+" is "+ans);
	}
	public static int fib(int n , int[] qb){
		if (n==0 || n ==1 ) {
			return n;
		}

		if(qb[n] != 0){
			return qb[n];
		}

		int fibn = fib(n-1, qb) + fib(n-2 , qb);
		qb[n] = fibn;
		return fibn;
	}
}