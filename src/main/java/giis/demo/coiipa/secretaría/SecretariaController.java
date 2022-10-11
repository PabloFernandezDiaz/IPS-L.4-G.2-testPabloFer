package giis.demo.coiipa.secretaría;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

import giis.demo.util.ui.SwingUtil;

public class SecretariaController {
		
	private SecretariaModel model;
	private SecretariaListadoCursos LisCursos;
	private SecretariaListadoInscritos lisInsc;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecretariaController frame = new SecretariaController( new SecretariaModel(), new SecretariaListadoCursos());
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
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
		List<CursoDisplayDTO> lista = model.obtenerListadoCursos();
		DefaultListModel<CursoDisplayDTO> modelolist = new DefaultListModel<CursoDisplayDTO>(); 
		for(int i=0; i<lista.size();i++) {
			modelolist.addElement(lista.get(i));
		}
		//LisCursos.getListListadoCursos().getModel();
		LisCursos.getListListadoCursos().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event)
			{
			  if (event.getClickCount() == 2 && event.getButton() == MouseEvent.BUTTON1) {
			    System.out.println("double clicked"+LisCursos.getListListadoCursos().getSelectedValue());
			    lisInsc= new SecretariaListadoInscritos();
			    List<Object[]> listadoAl=	model.obtenerListadoInscritosPorCurso(((CursoDisplayDTO)LisCursos.getListListadoCursos().getSelectedValue()).getC_id());
			    
			    DefaultListModel<Object[]> modelolist = new DefaultListModel<Object[]>(); 
				for(int i=0; i<listadoAl.size();i++) {
					modelolist.addElement(listadoAl.get(i));
				}
				lisInsc.getListInsc().setModel(modelolist);
				lisInsc.setVisible(true);
			  }
			}
		});
		LisCursos.getListListadoCursos().setModel( modelolist);

	}
	
	
	
}
