import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] srr = br.readLine().split(" ");
        int a = Integer.parseInt(br.readLine());
        int res = 0;
        for(String s: srr){
            if(s.length()>0)
                res++;
        }
        if(res>a+1){
            System.out.println(-1);
            return;
        }
        List<Integer> ar = new ArrayList<>();
        int[] arr = new int[26];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<26;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for(String s : srr){
            if(s.isEmpty())
                continue;
            if(s.charAt(0)>='a'){
                sb.append((char)(s.charAt(0)-'a'+'A'));
                ar.add(s.charAt(0)-'a');
                arr[s.charAt(0)-'a']--;
                if(arr[s.charAt(0)-'a']<0){
                    System.out.println(-1);
                    return;
                }
            }
            else{
                sb.append(s.charAt(0));
                ar.add(s.charAt(0)-'A');
                arr[s.charAt(0)-'A']--;
                if(arr[s.charAt(0)-'A']<0){
                    System.out.println(-1);
                    return;
                }
            }
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)==s.charAt(i-1))
                    continue;
                if(s.charAt(i)>='a'){
                    arr[s.charAt(i)-'a']--;
                    if(arr[s.charAt(i)-'a']<0){
                        System.out.println(-1);
                        return;
                    }
                }
                else{
                    arr[s.charAt(i)-'A']--;
                    if(arr[s.charAt(i)-'A']<0){
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        for(int i : ar){
            arr[i]--;
            if(arr[i]<0){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(sb);
    }
}
