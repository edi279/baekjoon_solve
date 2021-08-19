import java.util.*;

public class q5800{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int[] N = new int[K];
        int[][] data = new int[K][3];
        for (int i=0;i<K;i++){
            N[i] = in.nextInt();
            int[] score = new int[N[i]];
            for (int j=0;j<N[i];j++){
                score[j] = in.nextInt();
            } Arrays.sort(score);
            data[i][0] = score[N[i]-1]; // Max
            data[i][1] = score[0]; // Min
            for (int j=1;j<N[i];j++){
                data[i][2] = Math.max(data[i][2], score[j]-score[j-1]);
            } // Largest gap
        }
        for (int i=0;i<K;i++){
            System.out.println("Class "+(i+1));
            System.out.print("Max "+data[i][0]+", ");
            System.out.print("Min "+data[i][1]+", ");
            System.out.println("Largest gap "+data[i][2]);
        }
    }
}