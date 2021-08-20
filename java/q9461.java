import java.util.*;
import java.io.*;

public class q9461{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        long[] P = new long[100]; // int overflow
        int[] arr = new int[T];
        for (int i=0;i<T;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        P[0] = 1;
        P[1] = 1;
        P[2] = 1;
        for (int i=3;i<100;i++){
            P[i] = P[i-3]+P[i-2];
        }
        for (int i=0;i<T;i++){
            sb.append(P[arr[i]-1]+"\n");
        }
        System.out.println(sb);
    }
}