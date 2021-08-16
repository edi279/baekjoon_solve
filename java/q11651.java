import java.util.*;

public class q11651{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] arr = new int[N][2];
        for (int i=0;i<N;i++){
            arr[i][0] = in.nextInt(); // x
            arr[i][1] = in.nextInt(); // y
        }
        Arrays.sort(arr, (p1, p2) -> {
            if (p1[1]==p2[1]) return p1[0]-p2[0];
            else return p1[1]-p2[1];
        });
        for (int i=0;i<N;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}