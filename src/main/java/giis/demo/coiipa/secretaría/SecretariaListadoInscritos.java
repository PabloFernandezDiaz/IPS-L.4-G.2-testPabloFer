package giis.demo.coiipa.secretaría;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class SecretariaListadoInscritos extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPaneInsc;
	private JList listInsc;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getScrollPaneInsc(), BorderLayout.CENTER);
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
}
