package xyzcompany;

public class xyz {

	public static void main(String args[]) {
		
		employee emp1=new employee("343249TD","Pasan","0713456789",42500);
		emp1.setOT(45, 345);
		emp1.displayNetSalary();
		
		employee emp2=new employee("453249TD","Kasun","0783433432",34000);
		emp1.setOT(45, 345);
		emp1.displayNetSalary();
		
		manager man1=new manager("123454MD","Nirmal","0723458950",90500,5000,2000);
		man1.displayNetSalary();
		
		manager man2=new manager("223654MD","Kamal","0761453956",105500,7000,3000);
		man1.displayNetSalary();
		
		Director dir1=new Director("014345DD","Prasanna","0772545675",225000,3000,5000,5000,1000);
		dir1.displayNetSalary();
		
		Director dir2=new Director("023376DD","Chamika","0713612818",235000,5000,6000,5000,1000);
		dir2.displayNetSalary();
		
		
	}

}
