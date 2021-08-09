import java.util.*;

public class q1543 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String txt = in.nextLine();  
        String word = in.nextLine(); 
        int count = 0;
        for (int i=0;i<=txt.length()-word.length();i++){
            int end_index = i+word.length(); // substring(시작, 끝+1)
            if (txt.substring(i, end_index).equals(word)){
                count++;
                i = end_index-1;
            }
        }
        System.out.println(count);
    }
}