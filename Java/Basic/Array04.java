public class Array04 {
    public static void main(String args[]) {
        int arr[][] = new int[3][];     // Jagged Array
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[4];
        for(int i=0; i<3; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()* 10);       // use for generate random number.
            }
        }
        for(int i=0; i<3; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        
    }
}