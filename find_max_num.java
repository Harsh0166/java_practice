import java.util.*;

public class find_max_num{
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the length of array");
    int len = sc.nextInt();
    int [] arr = new int[len];

    System.out.println("enter the elements of an array");
    for(int i= 0 ; i<=arr.length-1;i++){
        arr[i] = sc.nextInt();
    }

    int max = 0;
    for(int j= 0; j<=arr.length-1;j++){
        if(arr[j]>max){
            max = arr[j];
        }
    }
    System.out.println("maximum no is "+max);
    }
}
