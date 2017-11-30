package javaprograms;

public class Thisstatement {

	int i;String name; int age;
	
	
	Thisstatement()
	{
		System.out.println("this is default constructor"); 
		
	}
	Thisstatement(int a,double b)
	{
		this();
		System.out.println("int and double constructor");
	}
	Thisstatement(int a, String s)
	{
		this(1,1.0);
		System.out.println("int and string constructor");
	}
	
	public static void main(String[] args) {
		
		Thisstatement stm = new Thisstatement(1,"raja");
		
	}

}
