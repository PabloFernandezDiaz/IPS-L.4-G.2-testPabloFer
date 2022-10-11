package giis.demo.coiipa.secretaría;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import giis.demo.util.db.Database;

public class SecretariaModel {

	private Database db=new Database();
	
	public List<CursosDisplayDTO> obtenerListadoCursos() {
		
		List<CursosDisplayDTO> test = new ArrayList<CursosDisplayDTO>();
		
//		test.add(new CursosDisplayDTO(1, "patata", 0, "1", "2", 10, "10", "30"));
//		test.add(new CursosDisplayDTO(1, "patata2", 0, "1", "2", 10, "10", "30"));
//		test.add(new CursosDisplayDTO(1, "patata3", 0, "1", "2", 10, "10", "30"));
//		test.add(new CursosDisplayDTO(1, "patata4", 0, "1", "2", 10, "10", "30"));
//		return test;
		String querry = "Select c_id,titulo,precio,fecha,estado,plazas,ins_inicio,ins_final  from curso";
		return db.executeQueryPojo(CursosDisplayDTO.class, querry)	;

		
	}
	public List<Object[]> obtenerListadoInscritosPorCurso(String id) {
		
		String querry = "Select c.nombre, c.apellidos  from colegiado c, inscrito_en i where i.n_colegiado = c.n_colegiado and i.c_id = ?";
		//ESTADO VARCHAR(15) CHECK (ESTADO IN ('PRE-INSCRITO','INSCRITO','CANCELADO'))
		
		return db.executeQueryArray(querry, id);
	}
	
}
