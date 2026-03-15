class Human {
    private int age = 20;
    private String name = "Sunny";

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
public class Encap1 {
    public static void main(String args[]) {
        Human obj = new Human();
        System.out.println("Name = "+obj.getName()+" and "+"Age = "+obj.getAge());
    }
}