class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        age = a;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}
public class Encap2 {
    public static void main(String args[]) {
        Human obj = new Human();
        obj.setAge(19);
        obj.setName("Raj");
        System.out.println("Name = "+obj.getName()+" and "+"Age = "+obj.getAge());
    }
}