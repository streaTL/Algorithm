import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] bord = new char[n][m];
        int[] dx = new int[]{-1,-1,-1,0,0,0,1,1,1};
        int[] dy = new int[]{-1,0,1,-1,0,1,-1,0,1};
        boolean[][][][] ck = new boolean[n][m][n][m];
        int ax = 0;
        int ay = 0;
        int bx = 0;
        int by = 0;
        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<m;j++){
                bord[i][j]=s.charAt(j);
                if(s.charAt(j)=='A'){
                    ax=i;
                    ay=j;
                    bord[i][j]='.';
                }
                else if(s.charAt(j)=='B'){
                    bx=i;
                    by=j;
                    bord[i][j]='.';
                }
            }
        }
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{ax,ay,bx,by,0});
        while(!q.isEmpty()){
                int[] g = q.poll();
                if(g[0]==bx&&g[1]==by&&g[2]==ax&&g[3]==ay){
                    System.out.println(g[4]);
                    return;
                }
                for(int i=0;i<9;i++){
                    int axx = g[0]+dx[i];
                    int ayy = g[1]+dy[i];
                    if(axx<0||axx>=n||ayy<0||ayy>=m||bord[axx][ayy]=='X'){
                        axx=g[0];
                        ayy=g[1];
                    }
                    for(int j=0;j<9;j++){
                        int bxx = g[2]+dx[j];
                        int byy = g[3]+dy[j];
                        if(bxx<0||bxx>=n||byy<0||byy>=m||bord[bxx][byy]=='X'){
                            bxx=g[2];
                            byy=g[3];
                        }
                        if(axx==bxx&&ayy==byy)
                            continue;
                        if(axx==g[2]&&ayy==g[3]&&bxx==g[0]&&byy==g[1])
                            continue;
                        if(!ck[axx][ayy][bxx][byy]){
                            ck[axx][ayy][bxx][byy]=true;
                            q.add(new int[]{axx,ayy,bxx,byy,g[4]+1});
                        }
                    }
                }
        }
        System.out.println(-1);
    }
}
