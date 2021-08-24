import java.util.*;
import java.io.*;

public class Main{
    static int[] arr;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();
    public static void find_arr(int N, int M, int index){
        if (index>=M){
            for (int i=0;i<M;i++){
                sb.append(arr[i]+" ");
            } sb.append("\n");
            return;
        }
        for (int i=0;i<N;i++){
            if (!check[i]){
                for (int j=0;j<i;j++){
                    check[j] = true;
                }
                arr[index] = i+1;
                find_arr(N, M, index+1);
                for (int j=0;j<i;j++){
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
        check = new boolean[N];
        find_arr(N, M, 0);
        System.out.print(sb);
    }
}
