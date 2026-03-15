class A {
    public A() {     // All constructor are extends object class so the all are used super(); keyword.
        super();
        System.out.println("In A");
    }
     public A(int n) {
        super();
        System.out.println("In int A");
    }
}
    class B extends A {
        public B() {
            // super(5);     // the super keyword are called parameterized constructor of A when in super keyword we pass an argument otherwise it called default constructor.
            System.out.println("In B");
        }
        public B(int n) {
            this();
            System.out.println("In int B");
        }
   }


public class Construct3 {
    public static void main(String args[]) {
        B obj = new B(5);
    }
}