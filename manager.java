package xyzcompany;

public class manager extends employee {

	private double allowances;
	private double deductions;
	
	
	public manager(String Empno,String Name,String Telephone,double basicSalary,double allowances,double deductions)
	{
		super(Empno,Name,Telephone,basicSalary);
		this.allowances=allowances;
		this.deductions=deductions;
	}
	
	public double calcNetSalary() {
		return basicSalary+allowances-deductions;
	}
	

}


