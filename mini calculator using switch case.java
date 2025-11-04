import java.util.*;

class mini_calculator_using_switch_case{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no.");
        int num1 = sc.nextInt();

        System.out.println("enter the no.");
        int num2 = sc.nextInt();

        System.out.println("enter the operator(+,-,*,/)");
        String operator = sc.next();

        double result;
        switch(operator){
            case "+":
                result = num1+ num2;
                System.out.println(result);
            break;

            case "-":
                result = num1 - num2;
                System.out.println(result);
            break;

            case "*":
                result = num1 * num2;
                System.out.println(result);
            break;

            case "/":
                result = num1 / num2;
                System.out.println(result);
            break;
            
            default:
            System.out.println("invalid operation");
        }

    }
}