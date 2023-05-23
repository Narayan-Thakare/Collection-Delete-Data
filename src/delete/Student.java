package delete;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Student {

	int roll;
	String name;
	String address;
	Student (int roll,String name,String address){
		this.roll=roll;
		this.name=name;
		this.address=address;
		
		
	}
	
	public int getRoll(){
		
		return roll;
	}
	
	public String getName(){
		return name;
	}
	public String getAddress(){
		
		return address;
	}
	public String toString(){
		return roll+" "+name+" "+address;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean loop =true;
		Scanner s=new Scanner (System.in);
		Collection<Student>c=new ArrayList<Student>();
		while(loop){
			
			System.out.println("1.Add Student");
			System.out.println("2.Show Student");
			System.out.println("3.Search Student");
			System.out.println("4.Delete Student");
			System.out.println("5.Exit Student ");
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
