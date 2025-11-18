// import java.util.*;;

// public class count_total_number_of_words_in_a_string {
//     public static void main(String[] arg){
//         Scanner sc = new Scanner(System.in);

//         String sent = sc.nextLine();

//         String arr[] = sent.trim().split(" ");
//         System.out.println(arr.length);
//     }
// }

import java.util.*;

public class count_total_number_of_words_in_a_string {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        String sent = sc.nextLine().trim();

        int count = 1;
        for(int i=0 ; i< sent.length()-1;i++){
            if(sent.charAt(i)== ' '){
                count = count+1;
            }
        }
        System.out.println(count);
    }
}