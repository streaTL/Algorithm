import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        boolean[][] brr = new boolean[a][b];
        boolean[][] brr2 = new boolean[a][b];
        int[] xx = {-1,0,0,1};
        int[] yy = {0,-1,1,0};
        for(int i=0;i<a;i++){
            String s = br.readLine();
            for(int j=0;j<b;j++){
                if(s.charAt(j)=='X'){
                    brr[i][j]=true;
                    brr2[i][j]=true;
                }
            }
        }

        st = new StringTokenizer(br.readLine());
        int sx = Integer.parseInt(st.nextToken())-1;
        int sy = Integer.parseInt(st.nextToken())-1;
        st = new StringTokenizer(br.readLine());
        int ex = Integer.parseInt(st.nextToken())-1;
        int ey = Integer.parseInt(st.nextToken())-1;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        q1.add(sx);
        q2.add(sy);
        boolean bb=false;
        while(!q1.isEmpty()){
            int x = q1.poll();
            int y = q2.poll();
//            System.out.println(x+" "+y);
            for(int i=0;i<4;i++){
                int ax = x+xx[i];
                int ay = y+yy[i];
                if(ax==ex&&ay==ey){
                    bb=true;
                    break;
                }
                if(ax>=0&&ax<a&&ay>=0&&ay<b&&!brr2[ax][ay]){
                    q1.add(ax);
                    q2.add(ay);
                    brr2[ax][ay]=true;
                }
            }
            if(bb)
                break;
        }
//        System.out.println(bb);
        int res=0;
        int snum=0;
        int dnum=0;
        if(!bb)
            System.out.print("NO");
        else{
            for(int i=0;i<4;i++){
                int exx = ex+xx[i];
                int eyy = ey+yy[i];
                if(exx>=0&&exx<a&&eyy>=0&&eyy<b&&!brr[exx][eyy])
                    res++;
            }
//            System.out.println(res);
            if(res>1)
                System.out.print("YES");
            else if(res==1){
                if(brr[ex][ey]){
                    System.out.println("YES");
                    return;
                }
                for(int i=0;i<4;i++){
                    int exx = ex+xx[i];
                    int eyy = ey+yy[i];
                    if(exx>=0&&exx<a&&eyy>=0&&eyy<b&&exx==sx&&eyy==sy)
                        snum=i;
                    if(exx>=0&&exx<a&&eyy>=0&&eyy<b&&!brr[exx][eyy])
                        dnum=i;
                }
//                System.out.println(snum);
                if(sx==ex&&sy==ey){
                    System.out.print("YES");
                    return;
                }
                if(snum==0)
                    System.out.print("NO");
                else{
                    if(snum==dnum)
                        System.out.print("No");
                    else
                        System.out.print("YES");
                }
            }
            else{
                if(brr[ex][ey])
                    System.out.println("YES");
                else System.out.println("NO");
            }
        }

    }
}