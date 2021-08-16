import java.util.*;

public class q1427 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char[] N = in.next().toCharArray(); // 한글자씩 떼서 배열로
        Arrays.sort(N);
        for (int i=N.length-1;i>=0;i--){
            System.out.print(N[i]);
        }        
    }
}