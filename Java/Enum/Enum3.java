enum Laptop {
    macbook(2200), hp(1800), lenovo, dell(2000);
    private int price;

    private Laptop() {
        price = 1000;
    }
    private Laptop(int price) {
        this.price = price;
        System.out.println("In Laptop : " + this.name());
    }
    public int getPrice() {
        return price;
    }
    public void setPrice() {
        this.price = price;
    }
}
public class Enum3 {
    public static void main(String args[]) {
        // Laptop lap =  Laptop.macbook;
        // System.out.println(lap);

        for(Laptop lap : Laptop.values()) {
            System.out.println(lap + ":" + lap.getPrice());
        }
    }
}