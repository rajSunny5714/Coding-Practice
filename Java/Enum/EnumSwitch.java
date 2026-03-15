enum Status {
    Running, Fielding, Success, Batting, Bowling
}
public class EnumSwitch {
    public static void main(String args[]) {
        int i = 5;
        Status s = Status.Success;
        switch(s) { 
        case Running : 
            System.out.println("In running mode..");
            break;
        
        case Fielding : 
            System.out.println("In fielding mode..");
            break;
        
        case Batting : 
            System.out.println("In batting mode..");
            break;

        case Bowling : 
            System.out.println("In bowling mode..");
            break;
        
        default : 
             System.out.println("Done -> Again check...");
             break;
        }  
    }      
}
    