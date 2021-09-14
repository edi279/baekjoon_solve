import java.util.*;
import java.io.*;

public class q15666{
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int idx = 0;
    static int[] arr;
    static int[] p_arr;
    static boolean[] check;
    static void find_arr(int index){
        if(index>=M){
            for (int i=0;i<M;i++){
                sb.append(p_arr[i]+" ");
            } sb.append("\n");
            return;
        }
        for (int i=0;i<=idx;i++){
            if(!check[i]){
                for(int j=0;j<i;j++){
                    check[j] = true;
                } // 중복 출력은 가능
                p_arr[index] = arr[i];
                find_arr(index+1);
                for(int j=0;j<i;j++){
                    check[j] = false;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        int[] origin_arr = new int[N]; // 원래 수열
        for(int i=0;i<N;i++){
            origin_arr[i] = in.nextInt();
        } Arrays.sort(origin_arr);
        arr = new int[N]; // 처음 입력 받은 것에서 같은 수 제거한 배열
        arr[0] = origin_arr[0];
        for (int i=1;i<N;i++){
            if (arr[idx]!=origin_arr[i]){
                idx++;
                arr[idx] = origin_arr[i];
            } // 중복되는 수 제거
        }
        p_arr = new int[N]; // M만큼 출력될 배열
        check = new boolean[N];
        find_arr(0);
        System.out.print(sb);
    }
}