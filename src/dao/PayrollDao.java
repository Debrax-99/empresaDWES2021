package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.Connector;
import model.Employee;
import model.Payroll;

/**
 * FP-2DAW Desarrollo Web en Entorno Servidor
 * 
 * @author Ana Blanco Escudero
 * 
 *         Clase PayrollDao que implementa los métodos asociados al objeto del
 *         modelo Payroll BBDD
 */
public class PayrollDao {
	private static final String SELECT_DNI = "SELECT id_payroll, dni, salary from payroll WHERE dni=?";

	/**
	 * Método que devuelve la nómina de un empleado buscando en la BBDD a partir de
	 * su DNI
	 * 
	 * @param dniSearch El DNI del empleado por el que buscar
	 * @return La nómina del empleado .
	 */
	public Payroll getPayroll(String dniSearch) {

		Payroll payroll = null;

		Connection conn = null;

		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = Connector.getconnection();
			ps = conn.prepareStatement(SELECT_DNI);
			ps.setString(1, dniSearch);
			rs = ps.executeQuery();

			if (rs.absolute(1)) {
				int idPayroll = rs.getInt("id_payroll");
				String dni = rs.getString("dni");
				int salary = rs.getInt("salary");

				payroll = new Payroll(idPayroll, dni, salary);
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

		return payroll;
	}
}
