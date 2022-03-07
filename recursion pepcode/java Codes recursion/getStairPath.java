import java.util.*;

public class getStairPath{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Stairs: ");
		int n = sc.nextInt();
		ArrayList<String> ans = gsp(n);
		System.out.print(ans);

	}
	public static ArrayList<String> gsp(int n){

		if (n == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		else if (n < 0) {
			ArrayList<String> bres = new ArrayList<>();
			return bres;
		}

		ArrayList<String> part1 = gsp(n-1);
		ArrayList<String> part2 = gsp(n-2);
		ArrayList<String> part3 = gsp(n-3);

		ArrayList<String> mres = new ArrayList<>();

		for (String res : part1) {
			mres.add(1 + res);
		}
		for (String res : part2) {
			mres.add(2 + res);
		}
		for (String res : part3) {
			mres.add(3 + res);
		}

		return mres;

	}
}