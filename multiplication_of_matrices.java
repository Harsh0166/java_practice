import java.util.Scanner;
    
public class multiplication_of_matrices {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length (m x n)and(p (is same as n) xq) of array");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int q = sc.nextInt();


        int [][] arr1 = new int[m][n];

        System.out.println("enter the elements of an array 1");
        for(int i= 0 ; i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j] = sc.nextInt();
            }
        }


        int [][] arr2 = new int[m][n];

        System.out.println("enter the elements of an array 2");
        for(int i= 0 ; i<m;i++){
            for(int j=0;j<n;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        int [][] result = new int[m][n];

        System.out.println("matrix is:");
        for(int i=0;i<m;i++){
            for(int j= 0; j<n;j++){
                for(int k = 0;k<q;k++){
                    result[i][j] += arr1[i][k] * arr2[j][k];
                    System.out.print(result[i][j]+" ");
                }
            }
            System.out.println(); 
        }


    }

}
