    //    Creating one class as the class name Things and perform multiple task in it.

class Things {
    public void playMusic() {
        System.out.println("Music Playing..");
    }
    public String getMeAPen(int cost) {
        if(cost>=5)
        return "Pen";
        else {
            return "Nothing";
        }
    }
}
public class Demo2 {
    public static void main(String args[]) {
        Things obj = new Things();
        obj.playMusic();
        String str = obj.getMeAPen(5);
        System.out.println(str);

    }
}