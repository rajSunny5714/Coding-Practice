public class String02 {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Sunny");
        sb.append(" Raj");
        // System.out.println(sb);

        sb.deleteCharAt(2);
        // System.out.println(sb);

        sb.insert(2,"n");
        System.out.println(sb);


    }
}