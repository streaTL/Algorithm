import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String[] srr = new String[a];
        int[][] arr = new int[b][26];
        for(int i=0;i<a;i++){
            String s = br.readLine();
            srr[i]=s;
            for(int j=0;j<b;j++){
                arr[j][s.charAt(j)-'A']++;
            }
        }
        for(String i : srr){
            for(String j : srr){
                int x=0;
                for(int k=0;k<b;k++){
                    if(i.charAt(k)!=j.charAt(k)){
                        x++;
                        if(x>2){
                            System.out.println("CALL FRIEND");
                            return;
                        }
                    }
                }
            }
        }
        if(a==2){
            boolean x = true;
            for(int i=0;i<b;i++){
                if(srr[0].charAt(i)!=srr[1].charAt(i)){
                    if(x){
                        System.out.print(srr[0].charAt(i));
                        x=!x;
                    }
                    else System.out.print(srr[1].charAt(i));
                }
                else System.out.print(srr[0].charAt(i));
            }
            return;
        }
        for(int i=0;i<b;i++){
            int x=0;
            int y=0;
            for(int j=0;j<26;j++){
                if(arr[i][j]>x){
                    x=arr[i][j];
                    y=j;
                }
            }
            System.out.print((char)(y+'A'));
        }

    }
}
