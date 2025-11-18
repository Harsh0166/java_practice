import java.util.*;;

public class check_no_in_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of elements");
        int len = sc.nextInt();

        int[] arr = new int[len];
        System.out.println("enter the array elements");
        for(int i =0; i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the number to found");
        int num = sc.nextInt();
        boolean check=true;
        for(int i =0 ; i<=arr.length-1;i++){
            if(num == arr[i]){
                System.out.println("number is found");
                check=false;
                break;
            }
            
        }
        if(check){
                System.out.println("Number not found");
            }

    }
}
