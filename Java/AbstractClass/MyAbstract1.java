abstract class Car {
    public abstract void drive();
    public abstract void fly();
    public void musicPlay() {
       System.out.println("Music Playing..."); 
    }
}
abstract class Wagonar extends Car {
    public void drive() {
        System.out.println("Car Driving...");
    }
}
class UpdatedWagonar extends Wagonar {      // concrete class
    public void fly() {
        System.out.println("Car Is Flying..");
    }
}
public class MyAbstract1 {
    public static void main(String args[]) {
        // we can't create object of abstract class.
        Car obj = new UpdatedWagonar();
        obj.musicPlay();
        obj.drive();
        obj.fly();
    } 
}