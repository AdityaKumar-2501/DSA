import java.util.*;

public class floodfill{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] arr = new int[n][m];

		for (int i = 0;i < arr.length ;i++ ) {
			for (int j = 0; j<arr[0].length ;j++ ) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Paths Are: ");

		boolean[][] visited = new boolean[n][m];
		ff(arr,0,0,"",visited);
	}

	public static void ff(int[][] maze, int row , int col,String psf, boolean[][] visited){
		if (row<0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 1 || visited[row][col] == true) {
			return;
		}

		if (row == maze.length -1 && col == maze[0].length -1) {
			System.out.println(psf);
			return;
		}

		visited[row][col] = true;
		ff(maze,row-1,col,psf+"t",visited);
		ff(maze,row,col-1,psf+"l",visited);
		ff(maze,row+1,col,psf+"d",visited);
		ff(maze,row,col+1,psf+"r",visited);
		visited[row][col] = false;
	}
}