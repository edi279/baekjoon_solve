import java.util.*;
import java.io.*;

public class q11441{
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = in.nextInt(); // 수의 개수 N
        long[] arr = new long[N+1];
        for (int i=1;i<=N;i++){
            arr[i] = in.nextInt();
            arr[i] += arr[i-1]; // (구간 끝)-(구간 시작) 연산을 편하게 하기 위함
        }
        int M = in.nextInt(); // 구간 개수 M
        int[][] part = new int[M][2];
        for (int i=0;i<M;i++){
            part[i][0] = in.nextInt();
            part[i][1] = in.nextInt();
        }
        long[] result = new long[M];
        for (int i=0;i<M;i++){
            result[i] = arr[part[i][1]]-arr[part[i][0]-1];
            sb.append(result[i]+"\n");
        } System.out.print(sb);
    }
}