import java.util.*;

public class getKeyCombination{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the key Code : ");
		String str = sc.next();

		ArrayList<String> words = getKPC(str);
		System.out.print(words);
	}

	static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	public static ArrayList<String> getKPC(String  str){
		if (str.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rres = getKPC(ros);
		ArrayList<String> mres = new ArrayList<>();

		String codeforch = codes[ch - '0'];
		for (int i = 0; i<codeforch.length() ;i++ ) {
			char chcode= codeforch.charAt(i);
			for (String rstr: rres ) {
				mres.add(chcode + rstr);
			}
		}

		return mres;
	}
}