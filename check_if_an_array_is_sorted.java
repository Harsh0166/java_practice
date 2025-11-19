import java.util.*;

public class check_if_an_array_is_sorted{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of array");
        int len = sc.nextInt();
        int [] arr = new int[len];

        System.out.println("enter the elements of an array");
        for(int i= 0 ; i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }

        boolean check = true;
        for(int j= 0;j<arr.length-1;j++){
            if(arr[j]> arr[j+1]){
                check = false;
                break;
            }
        }

        if(check){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }

    }
}
