import java.util.Scanner;
public class Exceptional1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int result = a/b;
            System.out.println("The answer is :"+result);
        }
        catch(ArithmeticException e) {
            System.out.println("Can't divided by zero");
        }
    }
}