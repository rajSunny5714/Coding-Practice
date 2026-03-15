public class Array02 {
    public static void main(String args[]) {
        int arr[][] = new int[3][4];
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {

                //  for random number generated in the arrays.
                arr[i][j] = (int)(Math.random() * 10);
                // arr[i][j] = (int)(Math.random() * 100);
            }
        }
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                System.out.print(arr[i][j]+" ");
            }
                System.out.println();
        }
    }
}

    