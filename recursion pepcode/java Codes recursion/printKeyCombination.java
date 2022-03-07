import java.util.*;

public class printKeyCombination{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the key code : ");
		String str = sc.next();
		pkc(str, "");
	}

	static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	public static void pkc(String str, String ans){

		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch  = str.charAt(0);
		String ros = str.substring(1);

		String codeforch = codes[ch - '0'];
		for (int i = 0 ;i <codeforch.length() ;i++ ) {
			char chcode = codeforch.charAt(i);
			pkc(ros , ans + chcode);
		}
	}
}