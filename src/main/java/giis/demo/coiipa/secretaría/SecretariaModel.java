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
	
	public List<CursoDisplayDTO> obtenerListadoCursos() {
		
//		List<CursoDisplayDTO> test = new ArrayList<CursoDisplayDTO>();
		
//		test.add(new CursosDisplayDTO(1, "patata", 0, "1", "2", 10, "10", "30"));
//		test.add(new CursosDisplayDTO(1, "patata2", 0, "1", "2", 10, "10", "30"));
//		test.add(new CursosDisplayDTO(1, "patata3", 0, "1", "2", 10, "10", "30"));
//		test.add(new CursosDisplayDTO(1, "patata4", 0, "1", "2", 10, "10", "30"));
//		return test;
		String querry = "Select c_id,titulo,precio,fecha,estado,plazas,ins_inicio,ins_final  from curso";
		return db.executeQueryPojo(CursoDisplayDTO.class, querry)	;

		
	}
	public List<InscritosDisplayDTO> obtenerListadoInscritosPorCurso(String id) {
		
		String querry = "Select c.nombre, c.apellidos, i.estado  from colegiado c, inscrito_en i where i.n_colegiado = c.n_colegiado and i.c_id = ? order by c.apellidos";
		//ESTADO VARCHAR(15) CHECK (ESTADO IN ('PRE-INSCRITO','INSCRITO','CANCELADO'))
		
		//return db.executeQueryArray(querry, id);
		//db.executeQueryPojo(InscritosDisplayDTO.class, querry, id); //por algun motivo no hace la conversion al dto y peta
		List<InscritosDisplayDTO> temp = new ArrayList<InscritosDisplayDTO>();
		
		List<Object[]> t=  obtenerListadoInscritosPorCurso2(id);
		for(Object[] n : t) {
			temp.add(new InscritosDisplayDTO(n[0].toString(),n[1].toString(),n[2].toString()));
		}
		
		return temp;
	}
	public List<Object[]> obtenerListadoInscritosPorCurso2(String id) {
		
		String querry = "Select c.nombre, c.apellidos, i.estado  from colegiado c, inscrito_en i where i.n_colegiado = c.n_colegiado and i.c_id = ? order by c.apellidos";
		//ESTADO VARCHAR(15) CHECK (ESTADO IN ('PRE-INSCRITO','INSCRITO','CANCELADO'))
		
		return db.executeQueryArray(querry, id);
		
	}
	
}
