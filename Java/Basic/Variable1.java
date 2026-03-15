class Addition {
    int num = 5;
    public int add(int n1, int n2) {
        // System.out.println(num);
        return n1+n2;
    }
}
public class Variable1 {
    public static void main(String args[]) {
        // int data = 10;
        Addition obj = new Addition();
        Addition obj1 = new Addition();
        int res = obj.add(4,3);
        obj.num = 8;
        // System.out.println(res);
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}