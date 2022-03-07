import java.util.*;

public class printPermutations{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word to find their permutation: ");
		String str = sc.next();
		pp(str, "");

	}
	public static void pp(String str, String ans){

		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i< str.length() ; i++ ) {
			char ch = str.charAt(i);
			String lpart = str.substring(0,i);
			String rpart = str.substring(i+1);
			String ros = lpart +rpart;
			pp(ros,ans+ch);
		}
	}
}