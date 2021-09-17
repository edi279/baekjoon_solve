import java.util.*;
import java.io.*;

public class q11659{
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = in.nextInt();
        int M = in.nextInt();
        int[] arr = new int[N+1];
        for (int i=1;i<=N;i++){
            arr[i] = in.nextInt();
            arr[i] += arr[i-1];
        }
        int[][] size = new int[M][2];
        for (int i=0;i<M;i++){
            size[i][0] = in.nextInt();
            size[i][1] = in.nextInt();
        }
        int result;
        for (int i=0;i<M;i++){
            result = arr[size[i][1]]-arr[size[i][0]-1];
            sb.append(result+"\n");
        } System.out.print(sb);
    }
}