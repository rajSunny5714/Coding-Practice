// Ctreate class and object then perform the task.

class Calculate {               // class creation
    public int add(int n1, int n2) {
        return n1+n2;
    }
}
public class Demo {
    public static void main(String args[]) {
        int num1 = 5;
        int num2 = 4;
        Calculate sum = new Calculate();        // Object Creation
        int result = sum.add(num1, num2);
        System.out.println("Sum = "+result);
    }
}