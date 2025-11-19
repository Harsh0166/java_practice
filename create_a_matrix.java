import java.util.Scanner;

public class create_a_matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length (m x n) of 2d array");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] arr = new int[m][n];

        System.out.println("enter the elements of an array");
        for(int i= 0 ; i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("matrix is:");
        for(int i=0;i<m;i++){
            for(int j= 0; j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
