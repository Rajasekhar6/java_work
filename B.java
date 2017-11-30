package javaprograms;

public class B extends A{

	void m1()
	{
		System.out.println("this is child m1");
		
	}
	
	void m2()
	
	{
		System.out.println("this is child m2");
	}
	
	public static void main(String[] args) {

A a = new B();
a.m1();
		
	}

}
