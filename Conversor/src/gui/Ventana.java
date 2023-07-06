package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SpringLayout;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Color;
import java.awt.Toolkit;

public class Ventana {

	private JFrame frmConversor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frmConversor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversor = new JFrame();
		frmConversor.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Core i5\\Documents\\PROYECTOS\\JAVA-PROJECTS\\Conversor-Moneda\\img\\Flavicon.png"));
		frmConversor.setTitle("Conversor");
		frmConversor.setBounds(100, 100, 568, 371);
		frmConversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		frmConversor.getContentPane().add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel titulo = new JLabel("Jokker Conversion");
		titulo.setForeground(new Color(255, 255, 255));
		sl_panel.putConstraint(SpringLayout.NORTH, titulo, 44, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, titulo, 173, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, titulo, 369, SpringLayout.WEST, panel);
		titulo.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 21));
		panel.add(titulo);
		
		JLabel lb_txt = new JLabel("Seleccione una Opcion de Conversion");
		lb_txt.setForeground(new Color(255, 255, 255));
		sl_panel.putConstraint(SpringLayout.NORTH, lb_txt, 67, SpringLayout.SOUTH, titulo);
		sl_panel.putConstraint(SpringLayout.WEST, lb_txt, 149, SpringLayout.WEST, panel);
		lb_txt.setFont(new Font("Roboto", Font.PLAIN, 15));
		panel.add(lb_txt);
	}
}
