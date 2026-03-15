abstract class A {
    public abstract void show(); 
    public abstract void display();
}
public class FileAbstract {
    public static void main(String args[]) {
        A obj = new A()    // Here we are not create a object of class A while on there we are create object of Anonymous class.
         {
                public void show() {
                  System.out.println("show method of new abstract class");
                }
                 public void display() {
                  System.out.println("display method of new abstract class");
                }
        };
        obj.show();
        obj.display();
    }
}