import java.util.Scanner;

public class SimpleBankAccountSimulator {
    public static void main(String[] arg){
        
        double balance = 25000.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option");
        System.out.println("1. check account balance");
        System.out.println("2. deposit amount");
        System.out.println("3. withdraw amount");

        int option = sc.nextInt();

        switch(option)
        {
            case 1 :
                System.out.println("your balance is Rs "+ balance);
                break;

            case 2:
                System.out.println("enter an amount for deposit");
                double amount = sc.nextDouble();
                balance = balance + amount;
                System.out.println("your new balance is Rs"+balance);
                break;

            case 3:
                System.out.println("enter an amount to withdraw");
                amount = sc.nextDouble();
                if(amount<= balance)
                {
                    balance = balance - amount;
                    System.out.println("withdraw of"+ amount +"is successful");
                    System.out.println("your new balance is Rs"+balance);
                }
                else{
                    System.out.println("insufficiant amount");
                }
                break;

            default:
                System.out.println("invalid option");
        }

    }
}
