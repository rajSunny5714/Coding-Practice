class A {
    public A() {
        System.out.println("In A");
    }
    public A(int n) {
        System.out.println("In int B");
    }
}
class B extends A{
    public B() {
        super();
        System.out.println("In B");  
    }
    public B(int n) {
        this();
        System.out.println("In int A");
    }
}

public class Construct4 {
    public static void main(String args[]) {
        B obj = new B(5);
    }
}