import java.util.*;

public class q11055{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N+1];
        for (int i=1;i<=N;i++){
            arr[i] = in.nextInt();
        }
        int[] dp = new int[N+1];
        for (int i=1;i<=N;i++){
            dp[i] = arr[i];
            for (int j=1;j<i;j++){
                if (arr[j]<arr[i]){ // 선택된 숫자보다 작은 수가 있을 경우
                    dp[i] = Math.max(dp[j]+arr[i], dp[i]);
                } // dp에는 arr에서의 수열 증가에 따라 더해진 값이 저장됨.
            }
        } Arrays.sort(dp);
        System.out.println(dp[N]);
    }
}