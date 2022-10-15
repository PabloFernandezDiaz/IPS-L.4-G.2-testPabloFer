package giis.demo.coiipa.secretaría;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

import giis.demo.coiipa.secretaría.view.SecretariaListadoCursos;
import giis.demo.coiipa.secretaría.view.SecretariaListadoInscritos;
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
	/**
	 * constructor del controlador encargado de realizar la asignacion de parametros inicial
	 * @param model
	 * @param LisCursos
	 */
	
	public SecretariaController(SecretariaModel model, SecretariaListadoCursos LisCursos) {
		
		this.model = model;
		this.LisCursos = LisCursos;
		
		this.initView();
	}
	/**
	 * recoge el listado de cursos y los muestra en una lista
	 * @param model
	 * @param LisCursos
	 */
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
		
		//un lisener que detecta cuando se hace doble click en un elemento de la lista
		LisCursos.getListListadoCursos().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event)
			{
			  if (event.getClickCount() == 2 && event.getButton() == MouseEvent.BUTTON1) {
			   generarListadoInscritos();
			  }
			}

			
		});
		LisCursos.getListListadoCursos().setModel( modelolist);

	}
	
	/**
	 * genera la vista de los inscritos de un curso y la muestra
	 */
	private void generarListadoInscritos() {
		// TODO Auto-generated method stub
		 System.out.println("double clicked"+LisCursos.getListListadoCursos().getSelectedValue());
		    lisInsc= new SecretariaListadoInscritos();
		    List<InscritosDisplayDTO> listadoAl=	model.obtenerListadoInscritosPorCurso(((CursoDisplayDTO)LisCursos.getListListadoCursos().getSelectedValue()).getC_id());
		    
		    DefaultListModel<InscritosDisplayDTO> modelolist = new DefaultListModel<InscritosDisplayDTO>(); 
			for(int i=0; i<listadoAl.size();i++) {
				modelolist.addElement(listadoAl.get(i));
			}
			
//		    List<Object[]> listadoAl=	model.obtenerListadoInscritosPorCurso2(((CursoDisplayDTO)LisCursos.getListListadoCursos().getSelectedValue()).getC_id());
//		    
//		    DefaultListModel<Object[]> modelolist = new DefaultListModel<Object[]>(); 
//			for(int i=0; i<listadoAl.size();i++) {
//				modelolist.addElement(listadoAl.get(i));
//			}
			
			lisInsc.getListInsc().setModel(modelolist);
			lisInsc.setLocationRelativeTo(LisCursos);
			lisInsc.setVisible(true);
			lisInsc.setEnabled(true);
			//cuando se cierra la pestaña se vuelve a la anterior
			lisInsc.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					LisCursos.setVisible(true);
					LisCursos.setEnabled(true);
					LisCursos.setLocationRelativeTo(lisInsc);
				}
			});
			
			LisCursos.setVisible(false);
			LisCursos.setEnabled(false);
	}
	
	
}
