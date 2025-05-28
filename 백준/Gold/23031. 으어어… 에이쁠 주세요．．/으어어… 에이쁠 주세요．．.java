import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int[] si = new int[]{0,0};
        int[][] arr = new int[n][n];
        int[] xx = new int[]{-1,-1,-1,0,0,1,1,1};
        int[] yy = new int[]{-1,0,1,-1,1,-1,0,1};
        int[] xxx = new int[]{1,0,-1,0};
        int[] yyy = new int[]{0,-1,0,1};
        ArrayList<int[]> ar = new ArrayList<>();
        for(int i=0;i<n;i++){
            String z = br.readLine();
            for(int j=0;j<n;j++){
                if(z.charAt(j)=='S'){
                    arr[i][j]=2;
                }
                else if(z.charAt(j)=='Z'){
                    ar.add(new int[]{i,j,0});
                }
            }
        }
        int w = 0;
        for(int i=0;i<=s.length();i++){
            for(int[] j : ar){
                if(j[0]==si[0]&&j[1]==si[1]&&arr[j[0]][j[1]]==0){
                    System.out.print("Aaaaaah!");
                    return;
                }
                if(arr[j[0]][j[1]]==0)
                    arr[j[0]][j[1]]=1;
            }
            if(i==s.length())
                break;
            int x=si[0];
            int y=si[1];
            if(s.charAt(i)=='F'){
                x = si[0]+xxx[w];
                y = si[1]+yyy[w];
                if(x>=0&&x<n&&y>=0&&y<n) {
                    si[0] = x;
                    si[1] = y;
                }
                x=si[0];
                y=si[1];
            }
            else if(s.charAt(i)=='R'){
                if(w==3)
                    w=0;
                else w++;
            }
            else if(s.charAt(i)=='L'){
                if(w==0)
                    w=3;
                else w--;
            }
            if(arr[x][y]==1){
                System.out.print("Aaaaaah!");
                return;
            }
            else if(arr[x][y]==2){
                for(int j=0;j<8;j++){
                    int a = x+xx[j];
                    int b = y+yy[j];
                    if(a>=0&&a<n&&b>=0&&b<n&&arr[a][b]!=2){
                        arr[a][b]=3;
                    }
                }
            }

            for(int[] j : ar){
                if(arr[j[0]][j[1]]==1)
                    arr[j[0]][j[1]]=0;
            }

            for(int[] j : ar){
                if(j[0]==0&&j[2]==1){
                    j[2]=0;
                }
                else if(j[0]==n-1&&j[2]==0){
                    j[2]=1;
                }
                else{
                    if(j[2]==0)
                        j[0]++;
                    else
                        j[0]--;
                }
            }

        }
        System.out.print("Phew...");
    }
}