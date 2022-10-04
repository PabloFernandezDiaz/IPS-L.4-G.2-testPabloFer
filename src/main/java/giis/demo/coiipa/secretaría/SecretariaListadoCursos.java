package giis.demo.coiipa.secretaría;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class SecretariaListadoCursos extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPaneListadoCursos;
	private JList listListadoCursos;

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
			listListadoCursos = new JList();
			listListadoCursos.setModel(new AbstractListModel() {
				String[] values = new String[] {"a"};
				public int getSize() {
					return values.length;
				}
				public Object getElementAt(int index) {
					return values[index];
				}
			});
		}
		return listListadoCursos;
	}
}
