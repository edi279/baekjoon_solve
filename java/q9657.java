import java.util.*;
import java.io.*;

public class q9657{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 돌 1, 3, 4
        boolean[] dp = new boolean[1001];
        dp[1] = true; // SK
        dp[2] = false; // CY
        dp[3] = true;
        dp[4] = true;
        for (int i=5;i<=N;i++){
            if (!dp[i-4]||!dp[i-3]||!dp[i-1]) dp[i] = true;
            else dp[i] = false;
        }
        if (dp[N]) System.out.println("SK");
        else System.out.println("CY");
    }
}