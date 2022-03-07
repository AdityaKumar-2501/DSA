import java.util.*;

public class getMazePath{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of rows : ");
		int n = sc.nextInt();
		System.out.print("Enter number of columns : ");
		int m = sc.nextInt();
		ArrayList<String> ans = gmp(1,1,n,m);
		System.out.println("Total number of paths : " + ans.size());
		System.out.print(ans);
	}

	// sr - source row
	// sc - source column
	// dr - destination row
	// dc - destination column
	public static ArrayList<String> gmp(int sr, int sc, int dr, int dc){

		if (sr == dr && sc == dc) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		ArrayList<String> hpath = new ArrayList<>();
		ArrayList<String> vpath = new ArrayList<>();
		ArrayList<String> mres = new ArrayList<>();

		if (sr < dr) {
			hpath = gmp(sr+1,sc,dr,dc);
		}
		if (sc< dc) {
			vpath = gmp(sr,sc+1,dr,dc);
		}

		for (String res : hpath) {
			mres.add("h" + res);
		}
		for (String res: vpath) {
			mres.add("v" + res);
		}

		return mres;

	}
}