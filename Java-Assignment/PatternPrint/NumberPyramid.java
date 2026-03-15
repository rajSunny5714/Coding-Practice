package PatternPrint;
import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        printNumberPyramid(rows);
    }
    public static void printNumberPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int space = i; space < rows; space++) {
                System.out.print(" ");
            }
            for (int num = 1; num <= i; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}