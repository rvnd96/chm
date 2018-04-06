package xyzcompany;

public class employee{
	protected String Empno;
	protected String Name;
	protected String Telephone;
	protected double basicSalary;
	protected int OThrs;
	protected double OTrate;
	
	public employee(String Empno,String Name,String Telephone,double basicSalary)
	{
		this.Empno=Empno;
		this.Name=Name;
		this.Telephone=Telephone;
		this.basicSalary=basicSalary;
		
	}
	
	public void setOT(int OThrs,double OTrate) {//set OT details 
		this.OThrs=OThrs;
		this.OTrate=OTrate;
	}
	
	public double calcNetSalary() {
		return basicSalary+OThrs*OTrate;
	}
	
	public void displayNetSalary() {
		System.out.println("Name: "+Name);
		System.out.println("Empno :"+Empno);
		System.out.println("Telephone : "+Telephone);
		System.out.println("Total Salary : "+calcNetSalary());
		System.out.println("");
		
	}
}
