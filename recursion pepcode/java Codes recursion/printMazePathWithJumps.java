import java.util.*;

public class printMazePathWithJumps{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of rows : ");
		int n = sc.nextInt();
		System.out.print("Enter number of columns : ");
		int m = sc.nextInt();
		pmpwj(1,1,n,m,"");

	}
	public static void pmpwj(int sr, int sc, int dr, int dc, String psf){

		if (sr == dr && sc == dc) {
			System.out.println(psf);
			return;
		}

		// for horizontal
			for (int i = 1; i<= dr -sr ; i++ ) {
				pmpwj(sr + i, sc, dr, dc , psf + "h" + i);
			}
		// for vertical
			for (int i = 1; i<= dc -sc ; i++ ) {
				pmpwj(sr, sc + i, dr, dc , psf + "v" + i);
			}
		// for diagonal
			for (int i = 1; i<= dr -sr  && i <= dc -sc; i++ ) {
				pmpwj(sr + i, sc + i, dr, dc , psf + "d" + i);
			}
		
	}
}