import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";
        char c = 'e';
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>96){
                c = a.charAt(i);
                c-=32;
                b+=c;
            }
            else
                {
                c = a.charAt(i);
                c+=32;
                b+=c;
            }
        }
        System.out.print(b);
    }
}