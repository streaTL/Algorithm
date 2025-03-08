import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static int a;
	static int[][]arr;
	static int[]dx={-1,1,0,0};
	static int[]dy={0,0,-1,1};
	static int sum;
	static ArrayList<Integer> ar;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ar = new ArrayList<>();
		a = sc.nextInt();
		arr = new int [a][a];
		for(int i=0;i<a;i++) {
			String t = sc.next();
			for(int j=0;j<a;j++) {
				arr[i][j]=t.charAt(j)-48;
			}
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				if(arr[i][j]==1) {
					sum=0;
					dfs(i,j);
					ar.add(sum);
				}
			}
		}
		System.out.println(ar.size());
		Collections.sort(ar);
		for(int d:ar) {
			System.out.println(d);
		}
	}
	private static void dfs(int x, int y) {
		sum++;
		arr[x][y]=0;
		for(int i=0;i<4;i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0&&nx<a&&ny>=0&&ny<a&&arr[nx][ny]==1) {
				dfs(nx,ny);
			}
		}
	}

}
