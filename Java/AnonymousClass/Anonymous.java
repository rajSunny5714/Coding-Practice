class A {
    public void show() {
        System.out.println("Show method in class A");
    }
}

// class B extends A {
//     public void show() {
//         System.out.println("show methods in class B");
//     }
// }

public class Anonymous {
    public static void main(String args[]) {
        A obj = new A()
         {
                public void show() {
                  System.out.println("show method of new class");
                }
        };
        obj.show();
    }
}