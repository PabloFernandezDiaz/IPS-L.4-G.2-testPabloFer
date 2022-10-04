package giis.demo.coiipa.secretaría;

import javax.swing.ListModel;

import giis.demo.util.ui.SwingUtil;

public class SecretariaController {
		
	private SecretariaModel model;
	private SecretariaListadoCursos LisCursos;
	
	public SecretariaController(SecretariaModel model, SecretariaListadoCursos LisCursos) {
		
		this.model = model;
		this.LisCursos = LisCursos;
		
		this.initView();
	}

	private void initView() {
		// TODO Auto-generated method stub
		getListaCursos();
		LisCursos.setVisible(true);
	}

	private void getListaCursos() {
		// TODO Auto-generated method stub
		//LisCursos.getListListadoCursos().setModel( SwingUtil.getTableModelFromPojos( model.obtenerListadoCursos(),
			//	new String[] {"C_ID", "Titulo", "precio", "fecha", "estado", "plazas", "fechInicio", "fechFinal"}));
		LisCursos.getListListadoCursos().setModel( new ListModel( model.obtenerListadoCursos())));

	}
	
	
	
}
