import java.util.*;

public class printMazePath{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of rows: ");
		int n = sc.nextInt();
		System.out.print("Enter Number of columns: ");
		int m = sc.nextInt();
		pmp(1,1,n,m,"");

	}

	// sr - source row
	// sc - source column
	// dr - destination row
	// dc - destination column
	// psf - path so far
	public static void pmp(int sr, int sc, int dr, int dc, String psf){

		if(sr == dr && sc == dc){
			System.out.println(psf);
			return;
		}

		if (sr < dr) {
			count++;
			pmp(sr+1,sc,dr,dc,psf + "h");
		}
		if(sc < dc){
			count++;
			pmp(sr,sc+1,dr,dc, psf + "v");
		}
	}
}