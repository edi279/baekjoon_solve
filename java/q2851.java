import java.util.*;

public class q2851 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        for (int i=0;i<10;i++){
            arr[i] = in.nextInt();
        }
        for (int i=0;i<10;i++){
            if (Math.abs((arr[i]+sum)-100)<=Math.abs(sum-100)){
                sum = arr[i]+sum;
            } else break;
        }
        System.out.println(sum);
    }
}