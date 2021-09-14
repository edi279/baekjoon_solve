import java.util.*;
import java.io.*;

public class q9656{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N%2==0) System.out.println("SK"); // 1개 또는 3개씩 가져가므로
        else System.out.println("CY"); // 수량의 홀짝 여부에 따라 승자 결정 
    }
}
