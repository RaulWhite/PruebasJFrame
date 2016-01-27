package prueba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class prueba extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba frame = new prueba();
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
	public prueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pantalla = new JPanel();
		contentPane.add(pantalla, BorderLayout.CENTER);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		final JLabel label1 = new JLabel("");
		
		JButton boton1 = new JButton("Boton 1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label1.setText("Hola Mundo");
			}
		});
		boton1.setForeground(new Color(255, 255, 255));
		boton1.setBackground(SystemColor.desktop);
		
		JButton boton2 = new JButton("Boton 2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label1.setText("");
			}
		});
		boton2.setForeground(new Color(255, 255, 255));
		boton2.setBackground(new Color(128, 0, 0));
		
		GroupLayout gl_pantalla = new GroupLayout(pantalla);
		gl_pantalla.setHorizontalGroup(
			gl_pantalla.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pantalla.createSequentialGroup()
					.addGap(81)
					.addComponent(boton1)
					.addPreferredGap(ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
					.addComponent(boton2)
					.addGap(76))
				.addGroup(gl_pantalla.createSequentialGroup()
					.addGap(159)
					.addGroup(gl_pantalla.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pantalla.createSequentialGroup()
							.addGap(12)
							.addComponent(label1))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(167, Short.MAX_VALUE))
		);
		gl_pantalla.setVerticalGroup(
			gl_pantalla.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pantalla.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label1)
					.addPreferredGap(ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
					.addGroup(gl_pantalla.createParallelGroup(Alignment.BASELINE)
						.addComponent(boton2)
						.addComponent(boton1))
					.addGap(22))
		);
		pantalla.setLayout(gl_pantalla);
	}
}
