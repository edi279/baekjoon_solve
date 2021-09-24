import java.util.*;
import java.io.*;

public class q14916{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        for (int i=1;i<=n;i++){
            if (i%5==0) dp[i] = i/5; // 5로 나눠떨어지는 수
            else if (i%5==2) dp[i] = (int)i/5 + 1; // ex. 2, 7, 12, ...
            else if (i%5==4) dp[i] = (int)i/5 + 2; // ex. 4, 9, 14, ...
            else { // dp 사용 이유
                if (i%2==0) dp[i] = dp[i-i%10]+(i%10)/2; // ex. 6, 8, 16, ...
                else if (i>5) dp[i] = dp[i-5]+1; // ex. 11, 13, ... 
                else dp[i] = -1; // 1, 3을 제외하고 못 거슬러주진 않음.
            }
        }
        System.out.println(dp[n]);
    }
}