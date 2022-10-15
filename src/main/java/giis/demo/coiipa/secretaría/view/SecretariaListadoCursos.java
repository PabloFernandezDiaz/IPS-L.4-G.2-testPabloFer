package giis.demo.coiipa.secretaría.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import giis.demo.coiipa.secretaría.CursoDisplayDTO;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class SecretariaListadoCursos extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPaneListadoCursos;
	private JList listListadoCursos;
	private JPanel panelLabels;
	private JLabel lblid;
	private JLabel lbltitulo;
	private JLabel lblFecha;
	private JLabel lblPrecio;
	private JLabel lblEstadp;
	private JLabel lblPlazas;
	private JLabel lblIns_inicio;
	private JLabel lblIns_final;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecretariaListadoCursos frame = new SecretariaListadoCursos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public SecretariaListadoCursos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getScrollPaneListadoCursos(), BorderLayout.CENTER);
		contentPane.add(getPanelLabels(), BorderLayout.NORTH);
	}

	private JScrollPane getScrollPaneListadoCursos() {
		if (scrollPaneListadoCursos == null) {
			scrollPaneListadoCursos = new JScrollPane();
			scrollPaneListadoCursos.setViewportView(getListListadoCursos());
		}
		return scrollPaneListadoCursos;
	}
	public JList getListListadoCursos() {
		if (listListadoCursos == null) {
			DefaultListModel<CursoDisplayDTO> modelolist = new DefaultListModel<CursoDisplayDTO>();
			listListadoCursos = new JList<CursoDisplayDTO>(modelolist);
			
//			listListadoCursos.setModel(new AbstractListModel() {
//				String[] values = new String[] {"a"};
//				public int getSize() {
//					return values.length;
//				}
//				public Object getElementAt(int index) {
//					return values[index];
//				}
//			});
		}
		return listListadoCursos;
	}
	private JPanel getPanelLabels() {
		if (panelLabels == null) {
			panelLabels = new JPanel();
			panelLabels.add(getLblid());
			panelLabels.add(getLbltitulo());
			panelLabels.add(getLblFecha());
			panelLabels.add(getLblPrecio());
			panelLabels.add(getLblEstadp());
			panelLabels.add(getLblPlazas());
			panelLabels.add(getLblIns_inicio());
			panelLabels.add(getLblIns_final());
		}
		return panelLabels;
	}
	private JLabel getLblid() {
		if (lblid == null) {
			lblid = new JLabel("ID");
		}
		return lblid;
	}
	private JLabel getLbltitulo() {
		if (lbltitulo == null) {
			lbltitulo = new JLabel("Titulo");
		}
		return lbltitulo;
	}
	private JLabel getLblFecha() {
		if (lblFecha == null) {
			lblFecha = new JLabel("Fecha");
		}
		return lblFecha;
	}
	private JLabel getLblPrecio() {
		if (lblPrecio == null) {
			lblPrecio = new JLabel("Precio");
		}
		return lblPrecio;
	}
	private JLabel getLblEstadp() {
		if (lblEstadp == null) {
			lblEstadp = new JLabel("Estado");
		}
		return lblEstadp;
	}
	private JLabel getLblPlazas() {
		if (lblPlazas == null) {
			lblPlazas = new JLabel("Plazas");
		}
		return lblPlazas;
	}
	private JLabel getLblIns_inicio() {
		if (lblIns_inicio == null) {
			lblIns_inicio = new JLabel("Fecha inicio inscr");
		}
		return lblIns_inicio;
	}
	private JLabel getLblIns_final() {
		if (lblIns_final == null) {
			lblIns_final = new JLabel("Fecha final inscr");
		}
		return lblIns_final;
	}
}
