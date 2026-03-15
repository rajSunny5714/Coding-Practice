public class String01 {
    public static void main(String args[]) {
        String name = "Sunny";
         name = name + " Raj";
        System.out.println(name);

        System.out.println("Hello "+name);

        String name1 = "Naveen";
        String name2 = "Reddy";
        System.out.println(name.concat(" Mr.sj"));

        String s1 = "Sunny";
        String s2 = "Sunny";
         System.out.println(s1==s2);

        String s3 = "Sunny";
        String s4 = "Raj";
         System.out.println(s3==s4);
    }
}