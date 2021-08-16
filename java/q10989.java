import java.io.*;
import java.util.*;

public class q10989{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // append 사용 위해
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        } Arrays.sort(arr);
        for (int i=0;i<N;i++){
            sb.append(arr[i]+"\n"); // println은 시간초과
        }
        System.out.println(sb);
    }
}