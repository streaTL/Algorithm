import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int t=0;t<n;t++){
            String rd = br.readLine();
            int a = Integer.parseInt(br.readLine());
            String s = br.readLine();
            s = s.substring(0,s.length()-1);
            s = s.substring(1);
            String[] srr = s.split(",");
            ArrayDeque<String> ad = new ArrayDeque<>();
            for(String i : srr){
                if(!i.isEmpty())
                    ad.add(i);
            }
            boolean b = true;
            boolean x = true;
            for(int i=0;i<rd.length();i++){
                if(rd.charAt(i)=='R'){
                    b=!b;
                }
                else{
                    if(ad.isEmpty()){
                        sb.append("error\n");
                        x = false;
                        break;
                    }
                    if(b)
                        ad.pollFirst();
                    else ad.pollLast();
                }
            }
            if(x){
                if(b){
                    sb.append("[");
                    while(!ad.isEmpty()){
                        sb.append(ad.pollFirst());
                        if(!ad.isEmpty())
                            sb.append(",");
                    }
                    sb.append("]\n");
                }
                else{
                    sb.append("[");
                    while(!ad.isEmpty()){
                        sb.append(ad.pollLast());
                        if(!ad.isEmpty())
                            sb.append(",");
                    }
                    sb.append("]\n");
                }
            }
        }
        System.out.println(sb);
    }
}
