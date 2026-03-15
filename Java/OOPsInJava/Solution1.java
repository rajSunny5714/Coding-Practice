import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class Person {
	public Person(String nm, int ag) {
		name=new String(nm);
		age=ag;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		name=sc.nextLine();
		age= sc.nextInt();
	}
	public void show() {
		System.out.println("My name is "+name +"and my age is "+age);
	}
}
class Solution1 {
	
	public static void main(String args[]) {
		Person p= new Person();
		p.input();
		p.show();
		// Write your code here
		
	}
}