package giis.demo.coiipa.secretaría;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import giis.demo.util.db.Database;

public class SecretariaModel {

	private Database db=new Database();
	
	public List<CursosEntity> obtenerListadoCursos() {
		
		String querry = "Select * from cursos";
		return db.executeQueryPojo(CursosEntity.class, querry)	;
		
	}
	
}
