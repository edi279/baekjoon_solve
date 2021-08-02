import java.util.Scanner;

public class q2798 {
    public static void main(String[] args){
        Scanner in =  new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        int[] arr = new int[N];

        for (int i=0;i<N;i++){
            arr[i] = in.nextInt();
        }

        int sum=0, candi_sum=0;
        for (int i=0;i<N-2;i++){
            for(int j=i+1;j<N-1;j++){
                for(int k=j+1;k<N;k++){
                    candi_sum = arr[i]+arr[j]+arr[k];
                    if(candi_sum==M){
                        sum=candi_sum;
                        break;
                    } else if(candi_sum<=M && candi_sum>=sum) sum=candi_sum;
                    else continue;
                }
            }
        }
        System.out.println(sum);
    }
}
