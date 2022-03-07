import java.util.*;

public class printSubsequence{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		printSS("abc", "");

	}
	public static void printSS(String str, String ans){

		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		printSS(ros, ans);
		printSS(ros, ans + ch);
	}
}