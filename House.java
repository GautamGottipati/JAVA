import java.lang.*;
import java.io.*;

public class House
{
	int length,breadth;
	//default constructor : compiler will call this by default.
	House(){
		System.out.println("Your House is initiated");
	}
	House(int l,int b){
		length = l;
		breadth = b;
	}
	House(String name,int l,int b){
		System.out.printf("Hello! owner name = %s ,length = %d, bredth = %d",name,l,b);
	}
	
}

class cons{
	public static void main(String[] args){
		House h = new House();//no argument constructor called
		House h1 = new House(5,2);// Parameterized cons called
		House h2 = new House("Gautam",5,2);//3 parameter's
	}
}
