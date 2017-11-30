package javaprograms;

public class Reverseofnumber {

	
	
	public static void main(String[] args) {

		int n =432;
		int res=0, rem;
		
		while(n>0)
		{
rem = n%10;
n = n/10;
res = res*10+rem;

	}
		System.out.println(res);
	}
}

