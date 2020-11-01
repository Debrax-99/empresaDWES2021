package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.Connector;
import model.Employee;

public class EmployeeDao {
	private static final String SELECT_ALL = "SELECT id_employee, name, dni, sex, category, years from employee";
	private static final String SELECT_EMPLOYEE = "SELECT id_employee, name, dni, sex, category, years from employee WHERE dni=?";

	public List<Employee> ListEmployees() {
		Employee employee;
		List<Employee> employees = new ArrayList<>();

		Connection conn = null;

		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Connector.getconnection();
			ps = conn.prepareStatement(SELECT_ALL);
			rs = ps.executeQuery();
			while (rs.next()) {
				int idEmployee = rs.getInt("id_employee");
				String name = rs.getString("name");
				String dni = rs.getString("dni");
				char sex = rs.getString("sex").charAt(0);
				int category = rs.getInt("category");
				int years = rs.getInt("years");

				employee = new Employee(idEmployee, name, dni, sex, category, years);
				employees.add(employee);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (ps != null) {	
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return employees;
	}
	
	public Employee selectEmployee(String dniSearch) {

		Employee employee = null;

		Connection conn = null;

		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Connector.getconnection();
			ps = conn.prepareStatement(SELECT_EMPLOYEE);
			ps.setString(1, dniSearch);
			rs = ps.executeQuery();
						
			if (rs.absolute(1)) {
				int idEmployee = rs.getInt("id_employee");
				String name = rs.getString("name");
				String dni = rs.getString("dni");
				char sex = rs.getString("sex").charAt(0);
				int category = rs.getInt("category");
				int years = rs.getInt("years");

				employee = new Employee(idEmployee, name, dni, sex, category, years);
			}			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return employee;
	}
}
