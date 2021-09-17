import java.util.*;
import java.math.*; // long 이상의 수 사용(BigInteger)

public class q10826{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger[] arr = new BigInteger[n+1];
        arr[0] = BigInteger.ZERO;
        if (n>0) arr[1] = BigInteger.ONE;
        for (int i=2;i<=n;i++){
            arr[i] = arr[i-2].add(arr[i-1]); // BigInteger 연산법
        } // .add(), .substract(), .multiply(), .divide(), .equals() 
        System.out.println(arr[n]);
    }
}