import java.util.*;
import java.io.*;

public class q1003{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] N = new int[T];
        int[] count_0 = new int[41];
        int[] count_1 = new int[41];
        for (int i=0;i<T;i++){
            N[i] = Integer.parseInt(br.readLine());
        }
        count_0[0] = 1;
        count_1[0] = 0;
        count_0[1] = 0;
        count_1[1] = 1;
        for (int i=2;i<41;i++){
            count_0[i] = count_0[i-1]+count_0[i-2];
            count_1[i] = count_1[i-1]+count_1[i-2];
        }
        for (int i=0;i<T;i++){
            sb.append(count_0[N[i]]+" "+count_1[N[i]]+"\n");
        }
        System.out.println(sb);
    }
}