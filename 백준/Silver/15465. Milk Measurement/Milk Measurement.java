import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int[] arr = new int[3];
        boolean[] brr = new boolean[3];
        brr[0]=true;
        brr[1]=true;
        brr[2]=true;
        int[][] arr2 = new int[a][3];
        for(int i=0;i<a;i++){
            st=new StringTokenizer(br.readLine());
            arr2[i][0]=Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            if(s.equals("Mildred")){
                arr2[i][1]=0;
            }
            else if(s.equals("Elsie")){
                arr2[i][1]=1;
            }
            else{
                arr2[i][1]=2;
            }
            arr2[i][2]=Integer.parseInt(st.nextToken());
        }
        int res=0;
        Arrays.sort(arr2,(x,y)->x[0]-y[0]);
        for(int i=0;i<a;i++){
            arr[arr2[i][1]]+=arr2[i][2];
            if(arr[0]>arr[1]){
                if(arr[0]>arr[2]){
                    if(brr[0]&&!brr[1]&&!brr[2]){
                    }
                    else{
                        brr[0]=true;
                        brr[1]=false;
                        brr[2]=false;
                        res++;
                    }
                }
                else if(arr[0]<arr[2]){
                    if(!brr[0]&&!brr[1]&&brr[2]){
                    }
                    else{
                        brr[0]=false;
                        brr[1]=false;
                        brr[2]=true;
                        res++;
                    }
                }
                else{
                    if(brr[0]&&!brr[1]&&brr[2]){
                    }
                    else{
                        brr[0]=true;
                        brr[1]=false;
                        brr[2]=true;
                        res++;
                    }
                }
            }
            else if(arr[0]<arr[1]){
                if(arr[1]>arr[2]){
                    if(!brr[0]&&brr[1]&&!brr[2]){
                    }
                    else{
                        brr[0]=false;
                        brr[1]=true;
                        brr[2]=false;
                        res++;
                    }
                }
                else if(arr[1]<arr[2]){
                    if(!brr[0]&&!brr[1]&&brr[2]){
                    }
                    else{
                        brr[0]=false;
                        brr[1]=false;
                        brr[2]=true;
                        res++;
                    }
                }
                else{
                    if(!brr[0]&&brr[1]&&brr[2]){
                    }
                    else{
                        brr[0]=false;
                        brr[1]=true;
                        brr[2]=true;
                        res++;
                    }
                }
            }
            else{
                if(arr[1]>arr[2]){
                    if(brr[0]&&brr[1]&&!brr[2]){
                    }
                    else{
                        brr[0]=true;
                        brr[1]=true;
                        brr[2]=false;
                        res++;
                    }
                }
                else if(arr[1]<arr[2]){
                    if(!brr[0]&&!brr[1]&&brr[2]){
                    }
                    else{
                        brr[0]=false;
                        brr[1]=false;
                        brr[2]=true;
                        res++;
                    }
                }
                else{
                    if(brr[0]&&brr[1]&&brr[2]){
                    }
                    else{
                        brr[0]=true;
                        brr[1]=true;
                        brr[2]=true;
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
