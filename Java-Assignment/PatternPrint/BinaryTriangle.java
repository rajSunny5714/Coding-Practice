package PatternPrint;

import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        printBinaryTriangle(rows);
    }
    public static void printBinaryTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            int value = (i % 2 == 0) ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value = 1 - value;
            }
            System.out.println();
        }
    }
}