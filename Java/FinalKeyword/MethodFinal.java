// If we created a final method so it cannot be method override on some other class because the final method is constant.

 class Calcu {
   final public void show() {
        System.out.println("In Final Method");
    }
    public void add(int a, int b) {
        System.out.println("Add = "+(a+b));
    }
}
class Calcu1 extends Calcu {
    //  public void show() {
    //     System.out.println("In Non-Final Class");
    //  }
        public void add(int c, int d) {
          System.out.println("In non-method,  Add = "+ (c+d));  
        }
}
public class MethodFinal {
    public static void main(String args[]) {
        Calcu obj = new Calcu();
        obj.show();
        obj.add(2, 4);

        obj = new Calcu1();
        obj.add(5, 3);
    }
}