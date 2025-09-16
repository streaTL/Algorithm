import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] cr = new char[s.length()];
        int x = s.length();
        if(x==1){
            System.out.println(s);
            return;
        }
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            cr[i]=s.charAt(i);
            arr[s.charAt(i)-'a']++;
        }
        Arrays.sort(cr);
        for(int i : arr){
            if(i>x/2+x%2){
                System.out.println(-1);
                return;
            }
        }
        for(int i=x/2+x%2;i<x;i++){
            if(cr[i]==cr[x-i-1]){
                for(int j=i+1;j<x;j++){
                    if(cr[i]!=cr[j]){
                        char c = cr[i];
                        cr[i]=cr[j];
                        cr[j]=c;
                        break;
                    }
                }
            }
        }

        for(char i : cr){
            System.out.print(i);
        }
    }
}
