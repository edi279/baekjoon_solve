import java.util.*;

public class q13699{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] t = new long[n+1];
        t[0] = 1;
        for (int i=1;i<=n;i++){
            for (int j=0;j<i/2;j++){
                t[i] += (t[j]*t[i-j-1])*2;
            } if (i%2!=0) t[i] += (t[i/2]*t[i/2]);
        }
        System.out.println(t[n]);
    }
}