public class Array03 {
    public static void main(String args[]) {
        int arr[][] = new int[3][4];
        for(int n[]: arr) {
            for(int m:n) {
                // arr[n][m] = (int)(Math.random() * 10);
                System.out.print(m);
            }
            System.out.println();
        }
    }
}