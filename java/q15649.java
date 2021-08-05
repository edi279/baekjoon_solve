import java.util.Scanner;

public class q15649 {
    public static void backtrack(int[]arr, boolean[]check, int index, int N, int M){
        if (index==M){
            for (int i=0;i<M;i++){
                System.out.print(arr[i]+" ");
            } 
            System.out.println();
            return;
        }
        for (int i=0;i<N;i++){
            if (!check[i]){ 
                check[i] = true; // N 이하의 수 중 사용한 수 체크
                arr[index] = i+1; // 현재 인덱스에 숫자 추가
                backtrack(arr, check, index+1, N, M); // 다음 인덱스 체크로 넘어감
                check[i] = false; // M개 채우면 백트래킹해서 다시 탐색하도록
            }
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // 1부터 N까지 수의 범위
        int M = in.nextInt(); // 길이 M 수열
        int[] arr = new int[M];
        boolean[] check = new boolean[N];
        backtrack(arr, check, 0, N, M);
    }
}