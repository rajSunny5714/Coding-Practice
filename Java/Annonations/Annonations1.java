@Depricated
class A {
    public void showFunction() {
        System.out.println("In function A");
    }
}
class B extends A{
    @Override
    public void showFunction() {
        System.out.println("In function B");
    }
}
public class Annonations1 {
    public static void main(String args[]) {
        B obj = new B();
        obj.showFunction();
    }
}