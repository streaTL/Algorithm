import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] xx = new int[]{-1,1,0,0};
    static int[] yy = new int[]{0,0,1,-1};
    static char[][] crr;
    static boolean[][] crr2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        crr = new char[a+2][b+2];
        crr2 = new boolean[a+2][b+2];
//        for(char[] i : crr2)
//            Arrays.fill(i,'#');
        for(char[] i : crr)
            Arrays.fill(i,'0');
        for(int i=1;i<=a;i++){
            String s = br.readLine();
            for(int j=1;j<=b;j++){
                crr[i][j]=s.charAt(j-1);
            }
        }
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        String s = br.readLine();
//        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='W'){
                crr2[x][y]=true;
                dfs(x,y);
//                q.add(new int[]{x,y});
//                while(!q.isEmpty()){
//                    int[] ar = q.poll();
//                    for(int j=0;j<4;j++){
//                    if(crr[ar[0]+xx[j]][ar[1]+yy[j]]!='0'&&crr2[ar[0]+xx[j]][ar[1]+yy[j]]!='.'&&crr[ar[0]+xx[j]][ar[1]+yy[j]]==crr[ar[0]][ar[1]]){
//                        crr2[ar[0]+xx[j]][ar[1]+yy[j]]='.';
//                        q.add(new int[]{ar[0]+xx[j],ar[1]+yy[j]});
//                        }
//                    }
//                }
            }
            else if(c=='U'){
                x--;
            }
            else if(c=='L'){
                y--;
            }
            else if(c=='R'){
                y++;
            }
            else if(c=='D'){
                x++;
            }
        }
        for(int i=0;i<4;i++){
            crr2[x+xx[i]][y+yy[i]]=true;
        }
        crr2[x][y]=true;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                if(crr2[i][j])
                    sb.append(".");
                else sb.append("#");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    static void dfs(int x, int y){
        for(int j=0;j<4;j++){
            if(crr[x+xx[j]][y+yy[j]]!='0'&&!crr2[x+xx[j]][y+yy[j]]&&crr[x+xx[j]][y+yy[j]]==crr[x][y]){
                crr2[x+xx[j]][y+yy[j]]=true;
                dfs(x+xx[j],y+yy[j]);
            }
        }
    }
}
