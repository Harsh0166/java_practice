import java.util.*;

public class reverse_an_array {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the length of array");
    int len = sc.nextInt();
    int [] arr = new int[len];

    System.out.println("enter the elements of an array");
    for(int i= 0 ; i<=arr.length-1;i++){
        arr[i] = sc.nextInt();
    }

    // System.out.println("reverse array are");
    // for( int j=arr.length-1; j>=0;j--){
    //     System.out.println(arr[j]);
    // }

    int k = arr.length-1;

    for(int j = 0 ; j<=(k)/2;j++){

        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;

        k--;
    }


    System.out.println("reversed array are");
    for( int m = 0;m<arr.length ;m++){
        System.out.println(arr[m]);
    }
 }
}



