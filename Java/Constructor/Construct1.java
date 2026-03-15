class Human {
    private int age;
    private String name;

    public Human() {    // default Contructor
        age = 12;
        name = "John";
    }

    public Human(int age, String name) {   // Parameterized Contructor
        this.age = age;
        this.name = name;
    }
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
public class Construct1 {
    public static void main(String args[]) {
        Human obj = new Human();
         System.out.println("Name = "+obj.getName()+" and "+"Age = "+obj.getAge());
        Human obj1 = new Human(19, "Raj");
        // obj.setAge(19);
        // obj.setName("Raj");
        System.out.println("Name = "+obj1.getName()+" and "+"Age = "+obj1.getAge());
   
    }
}

// when the object are created the default contructor called automatically.