import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		long s=0;
		int[] c = new int[a];
		for(int i=0;i<a;i++) {
			c[i]=sc.nextInt();
			if(s<c[i])
				s=c[i];
		}
		long d=0;
		long e=0; 
		s+=1;
		while(d<s){
			e=(s+d)/2;
			long count = 0;
			for(int j=0;j<a;j++) {
				count+=c[j]/e;
			}
			if(count<b)
				s=e;
			else
				d=e+1;
		}
		
		System.out.println(d-1);
	}

}
