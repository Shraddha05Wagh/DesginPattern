package com.scp.factory1;


public class TestDesignEnum {
public static void main(String[] args) {
		
		Employee e1=EmployeeFactory.getEmpInstance(EmployeeFactory.EmpTypes.pemp);
		Employee e2=EmployeeFactory.getEmpInstance(EmployeeFactory.EmpTypes.cemp);
		
		
				
		System.out.println(e1 instanceof PermanantEmp);
		System.out.println(e1 instanceof ContractEmp);

	}
}

abstract class Employee {
	abstract public int getempId();
	abstract public int getnoOfHolidays();
	abstract public int getSalary();

}

class PermanantEmp extends Employee {

	@Override
	public int getempId() {
		return 10000;
	}

	@Override
	public int getnoOfHolidays() {
		return 14;
	}

	@Override
	public int getSalary() {	
		return 45820;
	}

}

class ContractEmp extends Employee {

	@Override
	public int getempId() {	
		return 12;
	}

	@Override
	public int getnoOfHolidays() {
		return 10;
	}

	@Override
	public int getSalary() {
		return 25000;
	}

}

class EmployeeFactory {
	
	public static Employee getEmpInstance(EmpTypes type){
		if(type.equals(EmpTypes.pemp)){
			return new PermanantEmp();
		}else if(type.equals(EmpTypes.cemp)){
			return new ContractEmp();
		}
		return null;
	}
	

	/*enum EmpTypes{
		pemp,
		cemp;
	}*/
	enum EmpTypes{
		pemp,
		cemp;
	}
}
	
	/*public static Employee getEmpInstance(String type){
		if(type.equals("pemp")){
			return new PermanantEmp();
		}else if(type.equals("cemp")){
			return new ContractEmp();
		}
		return null;
	}
	

	*/

