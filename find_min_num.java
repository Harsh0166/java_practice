
import java.util.*;

import java.util.Scanner;

public class find_min_num {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the length of array");
    int len = sc.nextInt();
    int [] arr = new int[len];

    System.out.println("enter the elements of an array");
    for(int i= 0 ; i<=arr.length-1;i++){
        arr[i] = sc.nextInt();
    }

    int min = Integer.MAX_VALUE;
    for(int j= 0; j<=arr.length-1;j++){
        if(arr[j]<min){
            min = arr[j];
        }
    }
    System.out.println("minimum no is "+min);

    }
}
