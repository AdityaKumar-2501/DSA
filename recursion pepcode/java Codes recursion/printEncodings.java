import java.util.*;

public class printEncodings{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		pe(str, "");

	}

	public static void pe(String ques, String asf){
		if(ques.length() == 0){
			System.out.println(asf);
			return;
		}
		else if(ques.length() == 1){
			char ch = ques.charAt(0);
			if (ch == '0')
				return;
			else {
				int chv = ch - '0';
				char code = (char)('a' +chv- 1);
				System.out.println(asf+code);
			}
		}
		else{
			char ch = ques.charAt(0);
			String ros = ques.substring(1);
			if (ch == '0')
				return;
			else {
				int chv = ch - '0';
				char code = (char)('a' +chv- 1);
				pe(ros, asf+code);
			}

			String ch12 = ques.substring(0,2);
			String ros12 = ques.substring(2);

			int ch12v = Integer.parseInt(ch12);
			if (ch12v <= 26){
				char code = (char)('a' + ch12v -1);
				pe(ros12, asf+code);
			}

		}
	}
}