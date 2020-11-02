package service;

import java.util.ArrayList;
import java.util.List;

import dao.EmployeeDao;
import dao.PayrollDao;
import model.Employee;
import model.Payroll;
import modelBean.EmployeeBean;
import modelBean.PayrollBean;

/**
 * FP-2DAW Desarrollo Web en Entorno Servidor
 * 
 * @author Ana Blanco Escudero
 * 
 *         Clase Services que implementa los servicios necesarios para implementar la lógica de negocio.
 */
public class Services {

	/**
	 * Método que devuelve una lista de empleados.
	 * 
	 * @return listEmpBean La lista de empleados Bean
	 */
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

	/**
	 * Método que devuelve la nómina de un empleado a partir de su DNI
	 * 
	 * @param dni El DNI del empleado por el que buscar
	 * @return La nómina Bean del empleado .
	 */
	public PayrollBean payroll(String dni) {
		PayrollDao pay = new PayrollDao();
		Payroll payroll = pay.getPayroll(dni);
		PayrollBean payrollBean = new PayrollBean(payroll);
				
		return payrollBean;
	};

	/**
	 * Método que devuelve todos los datos de un empleado a partir de su DNI
	 * 
	 * @param dniSearch El DNI del empleado por el que buscar
	 * @return El empleado Bean
	 */
	public EmployeeBean modifyEmp(String dniSearch) {
		EmployeeDao emp = new EmployeeDao();
		Employee employee = emp.selectEmployee(dniSearch); 
		EmployeeBean empBean = new EmployeeBean(employee);
		
		return empBean;
	};
}
