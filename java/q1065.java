import java.util.Scanner;

public class q1065 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // 1000 이하
        int[] arr = new int[3];
        int count = 0;
        if (N<100) count = N;
        else if (N>=100 && N<=1000){
            count = 99;
            for (int i=100;i<=N;i++){
                arr[0] = i/100;
                arr[1] = (i-arr[0]*100)/10;
                arr[2] = i-(i/10)*10;
                if (arr[0]-arr[1] == arr[1]-arr[2]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}