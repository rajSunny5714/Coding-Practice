import java.util.*;
class Student {
    int rollNo;
    String name;
    float marks;
}
public class Array05 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Naveen";
        s1.marks = 89;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Suraj";
        s2.marks = 91;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "kiran";
        s3.marks = 90;
    
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length; i++) {
            System.out.println(students[i].rollNo +":"+students[i].name +":"+students[i].marks);
        }

        // int nums[] = new int[4];
        // nums[0] = 4;
        // nums[1] = 7;
        // nums[2] = 3;
        // nums[3] = 2;
      
    //    for(int i=0; i<nums.length; i++) {
    //     System.out.println(nums[i]);
    //    }

    //  for(int n:nums) {
    //     System.out.println(n);
    //  }

    }
}