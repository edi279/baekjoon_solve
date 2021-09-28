import java.util.*;

public class q11722{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N+1];
        for (int i=1;i<=N;i++){
            arr[i] = in.nextInt();
        }
        int[] dp = new int[N+1];
        for (int i=1;i<=N;i++){
            dp[i] = 1;
            for (int j=1;j<i;j++){
                if (arr[j]>arr[i]){ // 기준점보다 더 큰 수가 앞에 있을 때
                    dp[i] = Math.max(dp[j]+1, dp[i]); // 큰 수가 있으면 카운트 증가
                } // 큰 수보다 더 큰 수들을 카운팅한 값까지 같이 더해줌.
            }
        } Arrays.sort(dp);
        System.out.println(dp[N]);
    }
}