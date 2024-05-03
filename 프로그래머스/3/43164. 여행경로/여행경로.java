import java.util.*;
class Solution {

    static String[] srr;
    static boolean[] br;
    static int st=0;
    public void dfs(int a,String[][] tk, boolean[] brr, String s){
        if(a==tk.length+1){
            st=1;
            return;
        }
        for(int i=0;i<tk.length;i++){
            if(st==1)
                return;
            if(!brr[i]&&tk[i][0].equals(s)){
                brr[i]=true;
                srr[a]=tk[i][1];
                dfs(a+1,tk,brr,tk[i][1]);
                brr[i]=false;
            }
        }
    }

    public String[] solution(String[][] tickets) {
        String[] answer = {};
        srr = new String[tickets.length+1];
        srr[0]="ICN";
        br = new boolean[tickets.length];
        // Arrays.sort(tickets,(x,y)->(x[1].charAt(0)==y[1].charAt(0)?x[1].charAt(1)-y[1].charAt(1):x[1].charAt(0)-y[1].charAt(0)));
        Arrays.sort(tickets, (x, y) -> {
            if (x[0].equals(y[0])) {
                return x[1].compareTo(y[1]);
            } else {
                return x[0].compareTo(y[0]);
            }
        });
        for(int i=0; i<tickets.length; i++)
            System.out.print(Arrays.asList(tickets[i])+ " ");
        dfs(1,tickets,br,"ICN");
        return srr;
    }
}