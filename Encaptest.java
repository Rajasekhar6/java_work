package javaprograms;

public class Encaptest {

	private String empname;
	private int empsal;
	
	
	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public int getEmpsal() {
		return empsal;
	}


	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	
	public static void main(String[] args) {
		
		Encaptest encap = new Encaptest();
		Encaptest encap1 = new Encaptest();
		
		encap.setEmpname("Raja");
		System.out.println(encap.getEmpname());
		encap.setEmpsal(100000);
		System.out.println(encap.getEmpsal());
		
		encap1.setEmpname("Sekhar");
		System.out.println(encap1.getEmpname());
		encap1.setEmpsal(200000);
		System.out.println(encap1.getEmpsal());
		
		
		
		
		
	}

}
