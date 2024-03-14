import java.util.Scanner;
public class ProgramA1_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 =sc.nextInt();
        System.out.println("Enter num2");
        int num2 =sc.nextInt();
        System.out.println("Enter any operator('+','-','*','/')");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+':
            int sum= num1+num2;
            System.out.println(sum);
            break;

            case '-':
            int diff= num1-num2;
            System.out.println(diff);
            break;

            case '*':
            int product= num1*num2;
            System.out.println(product);
            break;

            case '/':
            int div= num1/num2;
            System.out.println(div);
            break;

            default:
            System.out.println("Invalid operator");
            break;
        }
    }
    
}
