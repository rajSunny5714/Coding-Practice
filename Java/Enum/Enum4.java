enum Status {
    Running, Fielding, Success, Batting, Bowling
}
public class Enum4 {
    public static void main(String args[]) {
        int i = 5;
       
        Status[] ss = Status.values();
        for(Status s : ss) {                        // Lower and upper case print
        System.out.println("Data : "+ s+s.ordinal());
        
        }
    }
}