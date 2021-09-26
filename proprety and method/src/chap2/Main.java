package chap2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		person gl =new person();//goi 1 bien moi trong Class Person
		
		Student st1=new Student();//goi 1 bien moi trong class Student
		Scanner sc=new Scanner(System.in);//ham nhap 
		String strname=new String(); //khai bao bien ten
		String strmasv=new String();// khai bao bien masv
		int a;						// khai bao bien ngay sinh					
		System.out.println("nhap vao ten");
		strname=sc.next();								
		System.out.println("nhap vao ma sv");
		strmasv=sc.next();
		System.out.println("nhap vao ngay sinh");
		a=sc.nextInt();
		
		//cho bien st1 truy cap vao setter trong cac class
		st1.setName(strname); //tham tri bien strname vua tao vao ham setName in Clas Person
		st1.setDay(a);         //tham tri bien a vua tao vao ham setDay in Clas Person
		st1.setMasv(strmasv); //tham tri bien strmasv vua tao vao ham setMasv in Clas Person
		st1.inra();				ham in ra cac gia tri cua bien vua nhap o tren			
		Teacher gv =new Teacher();
		gv.setName("PC");
		gv.setScore(123456);
		gv.setMasv("modul Wifi");
		gv.inra();

		
	
		
		
		
	}

}
