package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * FP-2DAW Desarrollo Web en Entorno Servidor
 * 
 * @author Ana Blanco Escudero
 * 
 *         Clase Connector que implementa los métodos de conexión a la BBDD MySQL.
 */
public class Connector {

	/** Driver del conector */
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	/** Url de acceso a la BBDD */
	private static final String DB_URL = "jdbc:mysql://localhost:3306/empresa?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	/** Usuario para el login a la BBDD */
	private static final String DB_USER = "root";
	/** Contraseña para el login a la BBDD */
	private static final String DB_PASS = "";

	/**
	 * Metodo para crear la conexion con la base de datos
	 * 
	 * @return la conexion con la BBDD MySQL
	 */
	public static Connection getconnection() {
		Connection conn = null;
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
		} catch (ClassNotFoundException e) {
			System.out.println("Loading driver error");
			e.printStackTrace(System.out);
		} catch (SQLException e) {
			System.out.println("Connection error");
			e.printStackTrace(System.out);
		}
		return conn;
	}
}
