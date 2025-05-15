import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(br.readLine());
        String s = br.readLine();
        char c = s.charAt(0);
        boolean[] brr = new boolean[4];
        if(c=='B')
            brr[0]=true;
        else
            brr[2]=true;
        if(s.charAt(a-1)=='B')
            brr[1]=true;
        else brr[3]= true;
        int r=0;
        int b=0;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arb = new ArrayList<>();
        for(int i=0;i<a;i++){
            if(c=='B'){
                if(s.charAt(i)==c){
                    b++;
                }
                else{
                    c='R';
                    if(b!=0)
                        arb.add(b);
                    r++;
                    b=0;
                }
            }
            else{
                if(s.charAt(i)==c){
                    r++;
                }
                else{
                    c='B';
                    if(r!=0)
                        arr.add(r);
                    b++;
                    r=0;
                }
            }
        }
        if(c=='B')
            arb.add(b);
        else arr.add(r);

        int sumb = 0;
        int sumr = 0;
        for(int i : arr){
            sumr+=i;
        }
        for(int i : arb){
            sumb+=i;
        }
        if(brr[0]){
            if(brr[1]){
                sumb-=Math.max(arb.get(0),arb.get(arb.size()-1));
            }
            else{
                sumb-=arb.get(0);
                sumr-=arr.get(arr.size()-1);                
            }
        }
        else{
            if(brr[1]){
                sumb-=arb.get(arb.size()-1);
                sumr-=arr.get(0);
            }
            else{
                sumr-=Math.max(arr.get(0),arr.get(arr.size()-1));
            }
        }
        System.out.print(Math.min(sumb,sumr));
    }
}