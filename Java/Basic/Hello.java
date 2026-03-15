// import java.util.*;
public class Hello{
    public static void main(String args[]) {
        // System.out.println("Hello In Java Developer World");

        // Data types

     /*   int n  = 6;
        byte by = 127;
        short sh = 542;
        long l = 3354l;

        float f = 4.3f;
        double d = 5.4;

        char c = 's';
        boolean b1 = true;
        boolean b2 = false;
*/

        // Literals

        /*int num1 = 0b101;
        System.out.println(num1);
        int num2 = 0x7E;
        System.out.println(num2);
        int num3 = 10_00_00_000;
        System.out.println(num3);
        double num4 = 12e10;
        System.out.println(num4);
        char c = 'a';
        c++;
       System.out.println(c);
*/
   
    //   Type Conversion

    // byte b = 257;
/*    int a = 257;
    byte k = (byte) a;
    System.out.println(k);

    float f = 5.6f;
    int t = (int)f;
    System.out.println(t);

    byte b = 10;
    byte b1 = 30;
    int result = b1*b;
    System.out.println(result);
*/

    //   Operators

    // Aitrhmetical Operators
   /* int a = 4;
    int b = 2;
    int add = a+b;
  System.out.println(add);
  int sub = a-b;
  System.out.println(sub);
  int multi = a*b;
  System.out.println(multi);
  int div = a/b;
  System.out.println(div);
  int rem = a%b;
  System.out.println(rem);
   
   a=a+2;
  System.out.println(a);
   a+=2;
  System.out.println(a);  
   a=a-2;
  System.out.println(a);
  a++;       // Post-Increment
  System.out.println(a);
    ++a;       // Pre-Increment
  System.out.println(a);

 a--;       // Post-Decrement
  System.out.println(a);
    --a;       // Pre-Decrement
  System.out.println(a);
  */

    //  Relation Operators
   /* int a = 5, b = 7;
    boolean result = a<b;
    System.out.println(result);
        boolean result = a<=b;
    System.out.println(result);
    boolean result = a>b;
    System.out.println(result);
    boolean result = a>=b;
    System.out.println(result);
    boolean result = a==b;
    System.out.println(result);
    boolean result = a!=b;
    System.out.println(result);
   */

      //  Logical Operators
     /* int a = 7;
      int b = 5;
      int x = 8; 
      int y = 3;
      boolean result = a>b && x>y ;
      System.out.println(result);
      boolean result = a>=b && x<=y ;
      System.out.println(result);
        boolean result = a>b || x>y ;
      System.out.println(result);
       boolean result = a<b || x<y || x>a;
      System.out.println(result);
       boolean result = a!=b && x<=y ;
      System.out.println(result);
        boolean result = a<=b || x!=y ;
        System.out.println(result);
*/

        // Conditional Statement
   /*     int a = 9;
        if(a>5)
            System.out.println("Hello");
        int x = 18;
        if(false)
               System.out.println("Bye");

          int x = 23;
        if(x>20 && x<=30)    // 21 - 30
          System.out.println("Hello");
         
         
          int x = 38;
        if(x>20 && x<=30)    // 21 - 30
          System.out.println("Hello");
          else
          System.out.println("Bye");

         // Comparison of two number
         int x = 5, y = 7;
         if(x>y) {
          System.out.println(x);
          // System.out.println("bye");
         }
         else {
          System.out.println(y);
         }

           // Comparison of three number
        int x = 5, y = 6, z = 7;
        if(x>y && x>z)
        System.out.println(x);
        else if(y>x && y>z) 
        System.out.println(y);
        else{
          System.out.println(z);
        }

          Check odd or even
          int x = 4;   // taking a number to check the conditions.
          String result = ""; 
          if(x%2==0)
          result = "even";
          else
          result = "odd";

      System.out.println(result);
*/
        // Ternary operator
     /* int x = 5;
      int result = 0;
      result = x%2==0 ? 10 : 20;  // 10 for even and 20 for odd.
      System.out.println(result);
*/

        //  Switch case
    /*    int n = 8;
        switch(n) 
      {
          case 1:
            System.out.println("Monday");
            break;
          case 2:
            System.out.println("Tuesday");
            break;
          case 3:
            System.out.println("Wednesday");
            break;
          case 4:
            System.out.println("Thurday");
            break;
          case 5:
            System.out.println("Friday");
            break;
          case 6:
            System.out.println("saturday");
            break;
          case 7:
            System.out.println("Sunday");
            break;
          default:
            System.out.println("Enter a valid number");
       }
       */
                        // Loops (while, d0-while and for)
              //while loop
        //  int i = 1;
        //  while(i<=5) {
        //   System.out.println("Java "+i);
        //   i++;
        //  }
        //  System.out.println(i);
                // Nested while
        // int i = 1;
        //  while(i<=5) {
        //   System.out.println("Java "+i);
        //   int j=1;
        //   while(j<=3) {
        //     System.out.println("Developer "+j);
        //     j++;
        //   }
        //   i++;
        //  }
        //  System.out.println("Bye "+i);

        // do-while loop
        // int i = 1;
        // do {
        //   System.out.println("Java "+i);
        //   i++;
        //  } while(i<=5);
        //  System.out.println(i);

        //  int i = 5;
        // do {
        //   System.out.println("Java "+i);
        //   i++;
        //  } while(i<=5);          // do-while loop run atleast one time then check the condition. 

                // for loop
            // for(int i=1; i<=4; i++) {
            //   System.out.println(i);
            // }  

            // for(int i=1; i<=4; i++) {
            //   System.out.println("DAY "+i);
            //   for(int j=1; j<=5; j++) {
            //     System.out.println(" "+ (j+8) +"-"+(j+9));
            //   }
            //  }  

            //  for(int i=1; i<=5; i++) {
            //     for(int j=1; j<=i; j++) {
            //     System.out.print("*");
            //   }
            //   System.out.println("");
            //  } 

            // int i,j,row = 5;
            // for (i=0; i<row; i++)  {  
            //     //inner loop work for space      
            //     for (j=row-i; j>1; j--)  {  
            //     //prints space between two stars  
            //     System.out.print(" ");   
            //     }   
            //     //inner loop for columns  
            //     for (j=0; j<=i; j++ )  {   
            //     //prints star      
            //     System.out.print("* ");   
            //     }   
            //     //throws the cursor in a new line after printing each line  
            //     System.out.println();   
            //     }   
                                
     }
}
     
