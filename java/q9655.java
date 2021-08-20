import java.util.*;

public class q9655{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (N%2==0) System.out.println("CY");
        else System.out.println("SK");
        // 돌 1개 또는 3개 가져가니까 결국 홀짝으로 결정됨
        // 채점 시간 꽤 소요되는거 보니까 걍 BufferedReader쓰는게 더 나을듯..
    }
}