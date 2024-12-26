import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<int[]> ar;
    static ArrayList<int[]> ar1;
    static boolean[][] brr;
    static boolean[][] brr2;
    static int[] xx = new int[]{1,0,-1,0};
    static int[] yy = new int[]{0,1,0,-1};
    static int res=10000;
    static int size;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        size=a;
        int b = Integer.parseInt(st.nextToken());
        brr = new boolean[a+2][a+2];
        ar = new ArrayList<>();
        ar1 = new ArrayList<>();
        for(int i=1;i<=a;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<=a;j++){
                int c = Integer.parseInt(st.nextToken());
                if(c!=1)
                    brr[i][j]=true;
                if(c==2)
                    ar.add(new int[]{i,j});
            }
        }
//        for(int i=0;i<a+2;i++){
//            for(int j=0;j<a+2;j++){
//                System.out.print(brr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
        brr2 = new boolean[a+2][a+2];
        dfs(0,b,0);
        if(res==10000)
            System.out.println(-1);
        else System.out.println(res-1);

    }

    private static void dfs(int a, int b,int c){
        if(a==b){
            Queue<int[]> q = new LinkedList<>();
            for(int i=0;i<size+2;i++){
                brr2[i]=brr[i].clone();
            }

            for(int[] i:ar1){
                brr2[i[0]][i[1]]=false;
                q.add(i);
            }

//            for(int i=0;i<7+2;i++){
//                for(int j=0;j<7+2;j++){
//                    System.out.print(brr2[i][j]+" ");
//                }
//                System.out.println();
//            }
//            System.out.println();

            int count=0;
            while(!q.isEmpty()){
                int x = q.size();
                count++;
                for(int i=0;i<x;i++){
                    for(int j=0;j<4;j++){
                        if(brr2[q.peek()[0]+xx[j]][q.peek()[1]+yy[j]]){
                            brr2[q.peek()[0]+xx[j]][q.peek()[1]+yy[j]]=false;
                            q.add(new int[]{q.peek()[0]+xx[j],q.peek()[1]+yy[j]});
                        }
                    }
                    q.poll();
                }
            }
            for(int i=1;i<=size;i++){
                for(int j=1;j<=size;j++){
                    if(brr2[i][j]){
//                        System.out.println("hhh");
                        return;
                    }
                }
            }
            res=Math.min(count,res);
            return;
        }

        for(int i=c;i<ar.size();i++){
            ar1.add(ar.get(i));
            dfs(a+1,b,i+1);
            ar1.remove(ar1.size()-1);
        }

    }

}
