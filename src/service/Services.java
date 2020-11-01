package service;

import java.util.ArrayList;
import java.util.List;

import dao.EmployeeDao;
import dao.PayrollDao;
import model.Employee;
import model.Payroll;
import modelBean.EmployeeBean;
import modelBean.PayrollBean;

public class Services {

	public List<EmployeeBean> listEmp() {
		EmployeeDao emp = new EmployeeDao();
		
		List<Employee> listEmp = emp.ListEmployees();
		
		List<EmployeeBean> listEmpBean = new ArrayList<>();
		
		for (Employee employee : listEmp) {
			EmployeeBean empBean = new EmployeeBean(employee);
			listEmpBean.add(empBean);
		}
		
		return listEmpBean;
	};

	public PayrollBean payroll(String dni) {
		PayrollDao pay = new PayrollDao();
		Payroll payroll = pay.getPayroll(dni);
		PayrollBean payrollBean = new PayrollBean(payroll);
				
		return payrollBean;
	};

	public EmployeeBean modifyEmp(String dniSearch) {
		EmployeeDao emp = new EmployeeDao();
		Employee employee = emp.selectEmployee(dniSearch); 
		EmployeeBean empBean = new EmployeeBean(employee);
		
		return empBean;
	};
}
