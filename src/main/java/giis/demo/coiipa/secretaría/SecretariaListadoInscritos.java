package giis.demo.coiipa.secretaría;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class SecretariaListadoInscritos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

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
		
		JScrollPane scrollPaneInscritos = new JScrollPane();
		contentPane.add(scrollPaneInscritos, BorderLayout.CENTER);
		
		JList listInscritos = new JList();
		scrollPaneInscritos.setViewportView(listInscritos);
	}

}
