import java.lang.*;
import java.io.*;

public class House
{
	House(){
		System.out.println("Your House is initiated");
	}
	House(int l,int b){
		System.out.println("length = "+l+"Breadth = ",b);
	}
	House(String name,int l,int b){
		System.out.println("House name ="+name+" Lenght ="+l+" Breadth ="+b);
	}
	
}

class cons{
	public static void main(String[] args){
		House h = new House();//Default constructor called
		House h1 = new House(5,2);// Parameterized cons called
		House h2 = new House("Gautam",5,2);//3 parameters
	}
}
