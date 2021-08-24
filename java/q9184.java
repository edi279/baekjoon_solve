import java.util.*;
import java.io.*;

public class q9184{
    static int[][][] dp = new int[21][21][21];
    public static boolean range(int a, int b, int c){
        if (a>0&&a<=20&&b>0&&b<=20&&c>0&&c<=20) return true;
        else return false;
    }
    public static int w(int a, int b, int c){
        if (range(a, b, c)&&dp[a][b][c]!=0) return dp[a][b][c];
        if (a<=0||b<=0||c<=0) return 1;
        else if (a>20||b>20||c>20){
            return dp[20][20][20] = w(20, 20, 20);
        } else if (a<b&&b<c){
            return dp[a][b][c] = w(a, b, c-1)+w(a, b-1, c-1)-w(a, b-1, c);
        } else return dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
    }
    public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();
        Scanner in = new Scanner(System.in);
        while(true){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if(a==-1&&b==-1&&c==-1) break;
            sb.append("w("+a+", "+b+", "+c+") = "+w(a, b, c)+"\n");
        }
        System.out.print(sb);
    }
}