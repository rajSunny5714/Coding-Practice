// Dynamic memory patch used or access only inheritence.

class A {
    public void show() { 
    System.out.println("In Class A");
}
}
class B extends A {
    public void show() { 
    System.out.println("In Class B");
  }
}
class C extends A {
    public void show() { 
    System.out.println("In Class C");
   }
}

public class Memo1 {
    public static void main(String args[]) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}