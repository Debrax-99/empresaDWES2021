package controller;

import dao.EmployeeDao;
import dao.PayrollDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao emp = new EmployeeDao();
		PayrollDao pay = new PayrollDao();
		
		emp.ListEmployees().forEach(employee->System.out.println(employee));
		
		System.out.println(pay.getPayroll("12345678P"));

	}

}
