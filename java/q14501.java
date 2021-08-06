import java.util.*;

public class q14501 {
    static int max = 0;
    public static void dfs(int[]T, int[]P, int N, int index, int sum){
        if (index>=N){ // N일 마감
            max = Math.max(max, sum);
            return;
        } else if (index+T[index]<=N){ // 기간이 초과되지 않을 경우
            dfs(T, P, N, index+T[index], sum+P[index]);
        } else dfs(T, P, N, index+T[index], sum); // 최적의 날짜 탐색

        dfs(T, P, N, index+1, sum); // 다음 branch로 이동
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // 퇴사전 근무일
        int[] T = new int[N];
        int[] P = new int[N];
        for (int i=0;i<N;i++){
            T[i] = in.nextInt(); // 상담기간
            P[i] = in.nextInt(); // 보수
        }
        dfs(T, P, N, 0, 0); // 최상위 노드에서 탐색 시작
        System.out.println(max);
    }
}