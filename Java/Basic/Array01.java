public class Array01 {
    public static void main(String args[]) {
        // int arr[] = {2,3,4,7};
        // int arr[] =   new int[4];
        // arr[0] = 3;
        // arr[1] = 2;
        // arr[2] = 4;
        // arr[3] = 9;
        // for(int i=0; i<4; i++) { 
        // System.out.println(arr[i]);
        // }

        int nums[][] = new int[3][4];
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                System.out.print(nums[i][j]+" ");
            }
                System.out.println();
        }
    }
}