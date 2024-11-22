import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String s1 = br.readLine();
        String s2 = br.readLine();
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            if(s1.charAt(i)=='1')
                arr[i]=1;
        }
        int sum=1000000;
        int res=0;
        if(arr[0]==s2.charAt(0)-'0'){
            if(a==2&&arr[1]==s2.charAt(1)-'0'){
                System.out.println(0);
                return;
            }
            else if(a==2&&arr[1]!=s2.charAt(1)-'0'){
                System.out.println(-1);
                return;
            }
            for(int i=2;i<a;i++){
                if(arr[i-1]!=s2.charAt(i-1)-'0'){
                    res++;
                    if(arr[i-1]==1)
                        arr[i-1]=0;
                    else arr[i-1]=1;
                    if(arr[i]==1)
                        arr[i]=0;
                    else arr[i]=1;
                    if(i!=a-1){
                        if(arr[i+1]==1)
                            arr[i+1]=0;
                        else arr[i+1]=1;
                    }
                }
            }
            if(arr[a-1]==s2.charAt(a-1)-'0')
                sum=Math.min(sum,res);
            res=0;
            for(int i=0;i<a;i++){
                if(s1.charAt(i)=='1')
                    arr[i]=1;
                else arr[i]=0;
            }
            if(arr[2]==0)
                arr[2]=1;
            else arr[2]=0;
            res+=2;
            for(int i=2;i<a;i++){
                if(arr[i-1]!=s2.charAt(i-1)-'0'){
                    res++;
                    if(arr[i-1]==1)
                        arr[i-1]=0;
                    else arr[i-1]=1;
                    if(arr[i]==1)
                        arr[i]=0;
                    else arr[i]=1;
                    if(i!=a-1){
                        if(arr[i+1]==1)
                            arr[i+1]=0;
                        else arr[i+1]=1;
                    }
                }
            }
            if(arr[a-1]==s2.charAt(a-1)-'0')
                sum=Math.min(sum,res);
        }
        else{
            if(a==2&&arr[1]!=s2.charAt(1)-'0'){
                System.out.println(1);
                return;
            }
            else if(a==2&&arr[1]==s2.charAt(1)-'0'){
                System.out.println(-1);
                return;
            }
            if(arr[0]==0)
                arr[0]=1;
            else arr[0]=0;
            if(arr[1]==0)
                arr[1]=1;
            else arr[1]=0;
            res++;
            for(int i=2;i<a;i++){
                if(arr[i-1]!=s2.charAt(i-1)-'0'){
                    res++;
                    if(arr[i-1]==1)
                        arr[i-1]=0;
                    else arr[i-1]=1;
                    if(arr[i]==1)
                        arr[i]=0;
                    else arr[i]=1;
                    if(i!=a-1){
                        if(arr[i+1]==1)
                            arr[i+1]=0;
                        else arr[i+1]=1;
                    }
                }
            }
            if(arr[a-1]==s2.charAt(a-1)-'0')
                sum=Math.min(sum,res);
            res=0;
            for(int i=0;i<a;i++){
                if(s1.charAt(i)=='1')
                    arr[i]=1;
                else arr[i]=0;
            }
            if(arr[0]==0)
                arr[0]=1;
            else arr[0]=0;
            if(arr[1]==0)
                arr[1]=1;
            else arr[1]=0;
            if(arr[2]==0)
                arr[2]=1;
            else arr[2]=0;
            res+=1;
            for(int i=2;i<a;i++){
                if(arr[i-1]!=s2.charAt(i-1)-'0'){
                    res++;
                    if(arr[i-1]==1)
                        arr[i-1]=0;
                    else arr[i-1]=1;
                    if(arr[i]==1)
                        arr[i]=0;
                    else arr[i]=1;
                    if(i!=a-1){
                        if(arr[i+1]==1)
                            arr[i+1]=0;
                        else arr[i+1]=1;
                    }
                }
            }
            if(arr[a-1]==s2.charAt(a-1)-'0')
                sum=Math.min(sum,res);
        }
        if(sum==1000000)
            System.out.println(-1);
        else
            System.out.println(sum);
    }
}
