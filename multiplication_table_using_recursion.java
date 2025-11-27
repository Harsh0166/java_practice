import java.util.Scanner;

public class multiplication_table_using_recursion {

    static void table(int num, int n){
        if(n>10)
            return;
        System.out.println(num+" x " + n+" = "+num * n );
        table(num,n+1);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        System.out.println("enter the number of table");
        int num = sc.nextInt();
        table(num,n);

    }
}
