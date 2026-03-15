class Mobile {
    String brand;
    int price;
    // String name;
    static String name;

  public void show() {
    System.out.println(brand+":"+name+":"+price);
   }
   public static void show1(Mobile obj) {
     System.out.println(obj.brand+":"+obj.name+":"+obj.price);
   }
}
public class UseStatic3 {
    public static void main(String args[]) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 50000;
        Mobile.name = "Iphone";   

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        Mobile.name = "Smartphone";
        obj2.price = 20000;
      
        Mobile.name = "Phone";   

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}