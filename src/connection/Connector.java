package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/empresa?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root";

    /**
     * Metodo para crear la conexion con la base de datos
     * @return la conexion con mysql
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
