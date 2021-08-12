import java.io.*;
import java.util.*;

public class q2869 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken()); // 올라감
        int B = Integer.parseInt(st.nextToken()); // 미끄러짐
        int V = Integer.parseInt(st.nextToken()); // 최종 높이
        int day = (V-B)/(A-B);
        if ((V-B)%(A-B)!=0) day++;
        System.out.println(day);
    }
}