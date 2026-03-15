import java.util.*;
class Result{
    public static void FizzBuzz(int n) {
        for(int i=1; i<=15; i++) {
            if(i%3==0 && i%5==0)
            System.output.println("FizzBuzz");
             if(i%3==0 && i%5!=0)
            System.output.println("Fizz");
             if(i%3!=0 && i%5==0)
            System.output.println("Buzz");
            else{
                System.out.println(i);
            }

        }
    }
}