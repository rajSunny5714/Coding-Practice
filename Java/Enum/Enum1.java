enum Status {
    Running, Fielding, Success, Batting, Bowling
}
public class Enum1 {
    public static void main(String args[]) {
        int i = 5;
        // Status s = Status.Running;
        // System.out.println(s);

        // Status s = Status.Success;
        // System.out.println(s.ordinal());

        Status[] ss = Status.values();
        for(Status s : ss) { 
        // System.out.println(s);
        System.out.println("Index no. : " + s.ordinal() + "Values : " + s);
        }
    }
}