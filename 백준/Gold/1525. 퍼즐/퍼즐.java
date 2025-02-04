import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        char[] crr = new char[9];
        int[][] arr = new int[5][5];
        Queue<String> q = new LinkedList<>();
        HashSet<String> hs = new HashSet<>();
        int res=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=-1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=3;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<=3;j++){
                sb.append(st.nextToken());
            }
        }
        String s ="";
        q.add(sb.toString());
        hs.add(sb.toString());
        int su=0;
        while(!q.isEmpty()){
            int count=q.size();
            res++;
            for(int i=0;i<count;i++){
                s = q.poll();
//                sb.setLength(0);
//                sb.append(q.poll());
                if(s.equals("123456780")){
                    su=1;
                    break;
                }
//                System.out.println(s);
                int n = s.indexOf("0");
//                System.out.println(n);
                int z=0;
                for(int j=1;j<=3;j++){
                    for(int k=1;k<=3;k++){
                        arr[j][k]=s.charAt(z)-'0';
                        z++;
                    }
                }
                int x = (n/3)+1;
                int y = (n%3)+1;
                if(arr[x+1][y]!=-1){
                    arr[x][y]=arr[x+1][y];
                    arr[x+1][y]=0;
//                    sb.setLength(0);
                    for(int j=1;j<=3;j++){
                        for(int k=1;k<=3;k++){
//                            sb.append(String.valueOf(arr[j][k]));
                            crr[3*(j-1)+k-1]=(char)(arr[j][k]+'0');
                        }
                    }
                    if(!hs.contains(String.valueOf(crr))){
                        hs.add(String.valueOf(crr));
                        q.add(String.valueOf(crr));
                    }
                    arr[x+1][y]=arr[x][y];
                    arr[x][y]=0;
                }
                if(arr[x-1][y]!=-1){
                    arr[x][y]=arr[x-1][y];
                    arr[x-1][y]=0;
//                    sb.setLength(0);
                    for(int j=1;j<=3;j++){
                        for(int k=1;k<=3;k++){
//                            sb.append(String.valueOf(arr[j][k]));
                            crr[3*(j-1)+k-1]=(char)(arr[j][k]+'0');
                        }
                    }
                    if(!hs.contains(String.valueOf(crr))){
                        hs.add(String.valueOf(crr));
                        q.add(String.valueOf(crr));
                    }
                    arr[x-1][y]=arr[x][y];
                    arr[x][y]=0;
                }
                if(arr[x][y+1]!=-1){
                    arr[x][y]=arr[x][y+1];
                    arr[x][y+1]=0;
//                    sb.setLength(0);
                    for(int j=1;j<=3;j++){
                        for(int k=1;k<=3;k++){
//                            sb.append(String.valueOf(arr[j][k]));
                            crr[3*(j-1)+k-1]=(char)(arr[j][k]+'0');
                        }
                    }
                    if(!hs.contains(String.valueOf(crr))){
                        hs.add(String.valueOf(crr));
                        q.add(String.valueOf(crr));
                    }
                    arr[x][y+1]=arr[x][y];
                    arr[x][y]=0;
                }
                if(arr[x][y-1]!=-1){
                    arr[x][y]=arr[x][y-1];
                    arr[x][y-1]=0;
//                    sb.setLength(0);
                    for(int j=1;j<=3;j++){
                        for(int k=1;k<=3;k++){
//                            sb.append(String.valueOf(arr[j][k]));
                            crr[3*(j-1)+k-1]=(char)(arr[j][k]+'0');
                        }
                    }
                    if(!hs.contains(String.valueOf(crr))){
                        hs.add(String.valueOf(crr));
                        q.add(String.valueOf(crr));
                    }
                    arr[x][y-1]=arr[x][y];
                    arr[x][y]=0;
                }
            }
            if(su==1){
                break;
            }
        }
        if(su==0)
            System.out.println(-1);
        else System.out.println(res-1);
    }
}