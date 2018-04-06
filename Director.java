package xyzcompany;

public class Director extends employee{
	
	private double allowances;
	private double deductions;
	private double bonus;
	private double entertainmentAllowanc;
	
	public Director(String Empno,String Name,String Telephone,double basicSalary,double allowances,double deductions,double	bonus,double entertainmentAllowanc) {
		super(Empno,Name,Telephone,basicSalary);
		
		this.allowances=allowances;
		this.deductions=deductions;
		this.bonus=bonus;
		this.entertainmentAllowanc=entertainmentAllowanc;
	}
	
	public double calcNetSalary() {
		double sal=basicSalary + allowances - deductions +bonus+entertainmentAllowanc;
		return sal;
	
	}
	
}
