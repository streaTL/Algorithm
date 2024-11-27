import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a=br.readLine();
        String b=br.readLine();
        String c="";
        Stack<Character> s = new Stack<>();
        for(int i=0;i<a.length();i++){
            s.add(a.charAt(i));
            if(s.size()>=b.length()){
                int t=0;
                int x=0;
                for(int j=s.size()-b.length();j<s.size();j++){
                    if(s.get(j)!=b.charAt(x)){
                        t++;
                        break;
                    }
                    x++;
                }
                if(t==0){
                    for(int j=0;j<b.length();j++){
                        s.pop();
                    }
                }
            }
        }
//        while(true){
//            if(s.size()>=b.length()){
//                int t=0;
//                int x=0;
//                for(int j=s.size()-b.length();j<s.size();j++){
//                    if(s.get(j)!=b.charAt(x)) {
//                        t++;
//                        break;
//                    }
//                    x++;
//                }
//                if(t==0){
//                    for(int j=0;j<b.length();j++){
//                        s.pop();
//                    }
//                }
//                else break;
//            }
//            else break;
//        }



//        for(int i=0;i<a.length();i++){
//            c+=a.charAt(i);
//            if(c.length()>=b.length()&& c.endsWith(b)){
//                c=c.substring(0,c.length()-b.length());
//            }
//        }
//        while(c.endsWith(b)){
//            c=c.substring(0,c.length()-b.length());
//        }
//        if(c.length()>0)
//            System.out.println(c);
//        else System.out.println("FRULA");
    StringBuilder sb = new StringBuilder();
        if(s.size()>0) {
            for(char i:s)
                sb.append(i);
            System.out.println(sb);
        }
        else System.out.println("FRULA");
    }
}
