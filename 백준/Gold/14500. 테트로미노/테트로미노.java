import java.util.Scanner;

public class Main {

	static int a,b,arr[][];
	static boolean[][] brr;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,1,-1};
	static int res=0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		arr = new int[a][b];
		brr=new boolean[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				dfs(0,i,j,arr[i][j]);
				dfs2(0,i,j,arr[i][j],0);
			}
		}
		System.out.println(res);
	}
	private static void dfs2(int n, int x, int y, int sum,int t) {
		if(n==3) {
			if(sum>res)
				res=sum;
			return;
		}
		for(int i=t;i<4;i++) {
			int lx = x+dx[i];
			int ly = y+dy[i];
			if(lx>=0&&lx<a&&ly>=0&&ly<b) {
				dfs2(n+1,x,y,sum+arr[lx][ly],i+1);
			}
		}
	}
	private static void dfs(int n, int x, int y, int sum) {
		
		if(n==3) {
			if(sum>res)
				res=sum;
			return;
		}
		brr[x][y]=true;
		for(int i=0;i<4;i++) {
			int lx = x+dx[i];
			int ly = y+dy[i];
			if(lx>=0&&lx<a&&ly>=0&&ly<b&&!brr[lx][ly]) {
				dfs(n+1,lx,ly,sum+arr[lx][ly]);
				brr[lx][ly]=false;
			}
		}
		brr[x][y]=false;
	}

}
