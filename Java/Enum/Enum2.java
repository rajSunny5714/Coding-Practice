enum Status {
    Running, Fielding, Success, Batting, Bowling
}
public class Enum2 {
    public static void main(String args[]) {
        int i = 5;
        Status s = Status.Running;
        if(s == Status.Running) 
        System.out.println("In running mode..");
        else if(s == Status.Fielding)
        System.out.println("In fielding mode..");
        else if(s == Status.Batting)
        System.out.println("In batting mode..");
        else {
             System.out.println("Again check...");
        }
        }
    }