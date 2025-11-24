import java.util.Scanner;

public class even_odd_method {

    static void evenOdd(int num){
        if(num%2 == 0)
            System.out.println("even");
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        evenOdd(num);

    }
}
