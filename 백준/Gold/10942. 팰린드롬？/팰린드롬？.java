import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int[] arr = new int[a];
        st = new StringTokenizer(bf.readLine());
        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int[][] arr2 = new int[a][a];
        for(int i=a-1;i>=0;i--){
            for(int j=a-1;j>=i;j--){
                if(i==j)
                    arr2[i][j]=1;
                else if(j-i==1){
                    if(arr[i]==arr[j])
                        arr2[i][j]=1;
                    else
                        arr2[i][j]=0;
                }
                else{
                    if(arr[i]==arr[j]&&arr2[i+1][j-1]==1)
                        arr2[i][j]=1;
                    else
                        arr2[i][j]=0;
                }
            }
        }

//        for(int i=0;i<a;i++){
//            for(int j=0;j<=i;j++){
//                if(i==j)
//                    arr2[j][i]=1;
//                else if(i-j==1){
//                    if(arr[i]==arr[j])
//                        arr2[j][i]=1;
//                    else
//                        arr2[j][i]=0;
//                }
//                else{
//                    if(arr[i]==arr[j]&&arr2[j+1][i-1]==1)
//                        arr2[j][i]=1;
//                    else
//                        arr2[j][i]=0;
//                }
//            }
//        }

        int b = Integer.parseInt(bf.readLine());

        for(int i=0;i<b;i++){
            st=new StringTokenizer(bf.readLine());
            int x=Integer.parseInt(st.nextToken())-1;
            int y=Integer.parseInt(st.nextToken())-1;
            sb.append(arr2[x][y]).append("\n");
//            System.out.println(arr2[x][y]);
        }
        System.out.println(sb);
    }
}
