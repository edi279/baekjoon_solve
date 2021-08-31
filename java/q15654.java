import java.util.*;
import java.io.*;

public class q15654{
    static int N, M;
    static int[] arr;
    static int[] result;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();
    static void find_arr(int N, int M, int index){
        if (index>=M){
            for (int i=0;i<M;i++){
                sb.append(result[i]+" ");
            } sb.append("\n");
            return;
        }
        for (int i=0;i<N;i++){
            if (!check[i]){
                check[i] = true;
                result[index] = arr[i]; // 특정 배열이 존재
                find_arr(N, M, index+1);
                check[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        arr = new int[N];
        check = new boolean[N];
        result = new int[N];
        for (int i=0;i<N;i++){
            arr[i] = in.nextInt();
        } Arrays.sort(arr);
        find_arr(N, M, 0);
        System.out.print(sb);
    }
}