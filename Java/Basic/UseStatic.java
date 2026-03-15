class Mobile {
    String brand;
    int price;
    // String name;
    static String name;

  public void show() {
    System.out.println(brand+":"+name+":"+price);
   }
}
public class UseStatic {
    public static void main(String args[]) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        // obj1.name = "Iphone";
        obj1.price = 50000;
        Mobile.name = "Iphone";   // we can also called and stored data as a class name.

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        // obj2.name = "SmartPhone";
        Mobile.name = "Smartphone";
        obj2.price = 20000;
      
         Mobile.name = "phone";    // static keyword affect all object where data sotred as name. 

        obj1.show();
        obj2.show();
    }
}