import java.util.Scanner;

//도영이가만든음식
public class Main {

	static int x;
	static int d;
	static int sum;
	static int[][]T;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		T = new int[x][2];
		for(int i=0;i<x;i++) {
			T[i][0]=sc.nextInt();
			T[i][1]=sc.nextInt();
		}
		sum=Math.abs(T[0][0]-T[0][1]);
		for(int i=1;i<=x;i++) {
			d=i;
			m1(0,0,1,0);	
		}
		System.out.println(sum);
	}
	private static void m1(int n,int start, int xva,int pva) {
		if(n==d) {
			//System.out.println(xva+" "+pva);
			if(Math.abs(xva-pva)<sum) {
			sum=Math.abs(xva-pva);
			//System.out.println(sum);
			}
			return;
		}
		for(int i=start;i<x;i++) {		
			m1(n+1,i+1,xva*T[i][0], pva+T[i][1]);
		}
	}
	
}
