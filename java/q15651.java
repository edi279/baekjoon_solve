import java.util.*;
import java.io.*;

public class Main{
    static int[] arr;
    static int[] p_arr;
    static StringBuilder sb = new StringBuilder();
    public static void find_arr(int N, int M, int index){
        if (index>=M){
            for (int i=0;i<M;i++){
                sb.append(arr[i]+" ");
            }
            sb.append("\n");
            return;
        }
        for (int i=0;i<N;i++){
            arr[index] = i+1;
            find_arr(N, M, index+1);
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        arr = new int[N];
        p_arr = new int[M];
        find_arr(N, M, 0);
        System.out.print(sb);
    }
}