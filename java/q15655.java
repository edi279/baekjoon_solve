import java.util.*;
import java.io.*;

public class q15655{
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
                for (int j=0;j<=i;j++){
                    check[j] = true;
                }
                result[index] = arr[i];
                find_arr(N, M, index+1);
                for (int j=0;j<=i;j++){
                    check[j] = false;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        arr = new int[N];
        result = new int[N];
        check = new boolean[N];
        for (int i=0;i<N;i++){
            arr[i] = in.nextInt();
        } Arrays.sort(arr);
        find_arr(N, M, 0);
        System.out.print(sb);
    }
}