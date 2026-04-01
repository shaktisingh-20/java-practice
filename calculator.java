import java.util.*;

public class calculator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Choose the operator");
        int op = sc.nextInt();

        System.out.println("addition");
        System.out.println("multipliction");
        System.out.println("Divide");
        System.out.println("modulus");
        System.out.println("Substraction");

        switch(op){
            case 1:System.out.println("Addition:" +(a+b));
            break;
            case 2:System.out.println("Multiplication:" +(a*b));
            break;
            case 3:System.out.println("Divide:" +(a/b));
            break;
            case 4:System.out.println("modulus:" +(a%b));
            break;
            case 5:System.out.println("Substraction:" +(a-b));
            break;
        }
    }
}