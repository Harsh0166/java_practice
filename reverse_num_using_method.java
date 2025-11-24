import java.util.Scanner;

public class reverse_num_using_method {
    
    static int reverse(int num){
        int temp, rev =0;
        while(num != 0){
            temp = num%10;
            rev = rev*10+temp;
            num = num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int revNum = reverse(num);
        System.out.println("reverse of "+ num+" is : "+ revNum);
    }
}
