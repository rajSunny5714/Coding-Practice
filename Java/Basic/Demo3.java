        // Method Overloading
        // In Method Overloading name of the method or function is same but the number of parameter and arguments are different. 

class Addition {
    public int add(int n1, int n2, int n3) {
        return n1+n2+n3;
    }
       public int add(int n1, int n2) {
        return n1+n2;
    }
       public double add(int n1, double n2) {
        return n1+n2;
    }
       public float add(float n1, int n2) {
        return n1+n2;
    }
       public long add(long n1, int n2) {
        return n1+n2;
    }
       public double add(int n1, int n2, double n3) {
        return n1+n2+n3;
    }
}
public class Demo3 {
    public static void main(String args[]) {
        Addition obj = new Addition();
        int result = obj.add(2,4,5);
        int result1 = obj.add(3,4);
        double result2 = obj.add(3,4.54);
        float result3 = obj.add(3.54f,4);
        long result4 = obj.add(54333,4);
        double result5 = obj.add(3,4,5.4343);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }
}