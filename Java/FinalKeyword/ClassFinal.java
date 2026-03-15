// If we created a final class so it cannot inherited or extends some other class because the final class is constant.


final class Calcu {
    public void show() {
        System.out.println("In Final Class");
    }
    public void add(int a, int b) {
        System.out.println("Add = "+(a+b));
    }
}
// class Calcu1 extends Calcu {     // can't extends final class
//     
// }
public class ClassFinal {
    public static void main(String args[]) {
        Calcu obj = new Calcu();
        obj.show();
        obj.add(2, 4);
    }
}