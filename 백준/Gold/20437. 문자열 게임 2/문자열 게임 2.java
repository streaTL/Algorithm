import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a;i++){
            int[]arr = new int[26];
            String s = br.readLine();
            int b = Integer.parseInt(br.readLine());
            int res=100000;
            int res2=-1;
            for(int j=0;j<s.length();j++){
                int o = s.charAt(j)-'a';
                arr[o]++;
            }
            if(b==1){
                sb.append(1).append(" ").append(1).append("\n");
                continue;
            }
            for(int j=0;j<s.length()-1;j++){
                int x=1;
                if(arr[s.charAt(j)-'a']<b)
                    continue;
                for(int k=j+1;k<s.length();k++){
                    if(s.charAt(k)==s.charAt(j))
                        x++;
                    if(x==b){
                        res=Math.min(res,k-j+1);
                        res2=Math.max(res2,k-j+1);
                        arr[s.charAt(j)-'a']--;
                        break;
                    }
                }
            }
            if(res==100000)
                sb.append(-1).append("\n");
            else
                sb.append(res).append(" ").append(res2).append("\n");
        }
        System.out.println(sb);
    }
}
