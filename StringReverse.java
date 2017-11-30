package javaprograms;

public class StringReverse {

	public static void main(String[] args) {

		String str = "SEKHAR";
		
		String strr = "";
		
		int i= str.length();
		
		for(i=i-1;i>=0;i--)
			
		{
			strr = strr+str.charAt(i);
			
		}System.out.println(strr);
		
		
		
	}

}
