import java.util.*;

public class mazePathWithJump{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of rows : ");
		int n = sc.nextInt();
		System.out.print("Enter number of columns : ");
		int m = sc.nextInt();
		ArrayList<String> ans = mwj(1,1,n,m);
		System.out.println("Total number of paths : " + ans.size());
		System.out.print(ans);
	}
	
	public static ArrayList<String> mwj(int sr, int sc, int dr, int dc){
		if (sr == dr && sc == dc) {
			ArrayList<String>bres = new ArrayList<>();
			bres.add("");
			return bres;
		}

		ArrayList<String> paths = new ArrayList<>();

		// horizontal paths
		for (int ms = 1; ms<=dr - sr ; ms++ ) {
			ArrayList<String> hpath = mwj(sr+ms,sc,dr,dc);
			for (String res :hpath ) {
				paths.add("h" + ms + res);
			}
		}

		// vertical paths
		for (int ms = 1; ms<=dc - sc ; ms++ ) {
			ArrayList<String> vpath = mwj(sr,sc+ms,dr,dc);
			for (String res :vpath ) {
				paths.add("v" + ms + res);
			}
		}

		// diagonal paths
		for (int ms = 1; ms<=dr - sr && ms<=dc-sc; ms++ ) {
			ArrayList<String> dpath = mwj(sr+ms,sc+ms,dr,dc);
			for (String res :dpath ) {
				paths.add("d" + ms + res);
			}
		}

		return paths;
	}
}