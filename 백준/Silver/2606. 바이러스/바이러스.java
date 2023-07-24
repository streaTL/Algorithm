import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][]c = new int[b][2];
		boolean[]d=new boolean[a+1];
		d[1]=true;
		for(int i=0;i<b;i++) {
			c[i][0]=sc.nextInt();
			c[i][1]=sc.nextInt();
		}
		Queue<Integer> q = new LinkedList<>();
		q.offer(1);
		int x=0;
		int y=0;
		while(true) {
			if(!q.isEmpty())
				x=q.poll();
			else
				break;
			for(int i=0;i<b;i++) {
			if(c[i][0]==x&&d[c[i][1]]==false) {
				q.offer(c[i][1]);
				d[c[i][1]]=true;
				y++;
			}
			else if(c[i][1]==x&&d[c[i][0]]==false) {
				q.offer(c[i][0]);
				d[c[i][0]]=true;
				y++;
			}
			}
		}
		System.out.println(y);
	}

}
