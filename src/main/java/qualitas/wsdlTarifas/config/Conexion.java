package qualitas.wsdlTarifas.config;
import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.context.annotation.Bean;

public class Conexion {

	@Bean
	public static Connection getConexionC() {
		Connection con = null; 
		String url= "mysql://localhost/qualitasCotizador?useSSL=false";
		String user="root";
		String pass ="root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(url, user, pass);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con; 
	}
}
