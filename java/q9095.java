import java.util.*;
import java.io.*;

public class q9095{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] n = new int[T];
        for (int i=0;i<T;i++){
            n[i] = Integer.parseInt(br.readLine());
        }
        int[] dp = new int[11];
        int[] result = new int[11];
        result[1] = 1;
        for (int i=2;i<11;i++){
            if (i<4) dp[i] = i-1;
            else dp[i] = dp[i-3]+dp[i-2]+dp[i-1]; // 수열 규칙 적용 
            result[i] = result[i-1]+dp[i]; 
        }
        for (int i=0;i<T;i++){
            sb.append(result[n[i]]+"\n");
        } System.out.print(sb);
    }
}
