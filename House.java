class C1

{

	C1()// no arguments constructor

	{

		System.out.println("Hello world");

	}

	C1(String name,int sno)//parameterized constructor

	{

		System.out.println("Welcome "+name);
		System.out.println("SNo "+sno);

	}

}

class C2

{

	protected C2()//protected constructor

	{

		System.out.println("This is protected constructor");

	}

}

class C3

{

	public C3()//public constructor

	{
		System.out.println("This is public constructor");
		
	}

}

public class constra extends C3

{

	public static void main(String args[])

	{

		C1 w=new C1();

		C1 x=new C1("Gautam",303);

		C3 t=new C3();

		C2 m=new C2();

	}

}
