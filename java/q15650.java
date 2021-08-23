import java.util.*;

public class q15650{
    static int[] arr;
    static boolean[] check;
    public static void find_arr(int N, int M, int index){
        if (index>=M){
            for (int i=0;i<M;i++){
                System.out.print(arr[i]+" ");
            } 
            System.out.println();
            return;
        }
        for (int i=0;i<N;i++){
            if(!check[i]){ // boolean값이 false
                for (int j=0;j<=i;j++){
                    check[j] = true; // 인덱스 체크(값 사용)
                }
                arr[index] = i+1; // 배열 채우기
                find_arr(N, M, index+1); // 원소 M개 채울때까지 인덱스 증가
                for (int j=0;j<=i;j++){
                    check[j] = false; // 백트래킹 마치면 초기화
                } // 앞 수보다 작은 수 사용 x
            }
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        arr = new int[N];
        check = new boolean[N];
        find_arr(N, M, 0);
    }
}