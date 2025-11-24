import java.util.Scanner;

public class find_max_using_method {
    
    static int max(int a,int b){
        if(a>b)
            return a;
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int largest = max(a , b);
        System.out.println("largest num : "+largest);
        
    }
}
