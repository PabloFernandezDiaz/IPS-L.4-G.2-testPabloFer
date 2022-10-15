package giis.demo.coiipa.secretaría.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SecretariaListadoInscritos extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPaneInsc;
	private JList listInsc;
	private JPanel panelLabels;
	private JLabel lblApellidos;
	private JLabel lblNombre;
	private JLabel lblFechaInsc;
	private JLabel lblEstadoInscr;
	private JLabel lblAbono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecretariaListadoInscritos frame = new SecretariaListadoInscritos();
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
	public SecretariaListadoInscritos() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 471, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getScrollPaneInsc(), BorderLayout.CENTER);
		contentPane.add(getPanelLabels(), BorderLayout.NORTH);
	}

	private JScrollPane getScrollPaneInsc() {
		if (scrollPaneInsc == null) {
			scrollPaneInsc = new JScrollPane();
			scrollPaneInsc.setViewportView(getListInsc());
		}
		return scrollPaneInsc;
	}
	public JList getListInsc() {
		if (listInsc == null) {
			listInsc = new JList();
		}
		return listInsc;
	}
	private JPanel getPanelLabels() {
		if (panelLabels == null) {
			panelLabels = new JPanel();
			panelLabels.add(getLblApellidos());
			panelLabels.add(getLblNombre());
			panelLabels.add(getLblFechaInsc());
			panelLabels.add(getLblEstadoInscr());
			panelLabels.add(getLblAbono());
		}
		return panelLabels;
	}
	private JLabel getLblApellidos() {
		if (lblApellidos == null) {
			lblApellidos = new JLabel("Apellidos");
		}
		return lblApellidos;
	}
	private JLabel getLblNombre() {
		if (lblNombre == null) {
			lblNombre = new JLabel("Nombre");
		}
		return lblNombre;
	}
	private JLabel getLblFechaInsc() {
		if (lblFechaInsc == null) {
			lblFechaInsc = new JLabel("Fecha Inscr");
		}
		return lblFechaInsc;
	}
	private JLabel getLblEstadoInscr() {
		if (lblEstadoInscr == null) {
			lblEstadoInscr = new JLabel("Estado");
		}
		return lblEstadoInscr;
	}
	private JLabel getLblAbono() {
		if (lblAbono == null) {
			lblAbono = new JLabel("Cantidad abonada");
		}
		return lblAbono;
	}
}
