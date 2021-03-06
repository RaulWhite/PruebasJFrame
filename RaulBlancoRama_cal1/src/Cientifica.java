/**
 * @author Raúl Blanco Rama
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import java.awt.Insets;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cientifica extends JFrame {
	private JTextField pantInf;
	private JTextField pantSup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cientifica frame = new Cientifica();
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
	public Cientifica() {
		getContentPane().setBackground(new Color(51, 51, 51));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 661);
		
		JPanel numeros = new JPanel();
		numeros.setBackground(new Color(51, 51, 51));
		
		JPanel operaciones = new JPanel();
		operaciones.setBackground(new Color(51, 51, 51));
		
		JPanel pantalla = new JPanel();
		pantalla.setBackground(new Color(245, 245, 220));
		
		JPanel operComplejas = new JPanel();
		operComplejas.setBackground(new Color(51, 51, 51));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 51));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(pantalla, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(operComplejas, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(numeros, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(operaciones, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(pantalla, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(operComplejas, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(operaciones, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(numeros, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		pantalla.setLayout(new GridLayout(2, 0, 0, 0));
		
		pantSup = new JTextField();
		pantSup.setFocusTraversalKeysEnabled(false);
		pantSup.setFocusable(false);
		pantSup.setFont(new Font("Dialog", Font.PLAIN, 30));
		pantSup.setEditable(false);
		pantSup.setBackground(new Color(143, 188, 143));
		pantalla.add(pantSup);
		pantSup.setColumns(14);
		
		pantInf = new JTextField();
		pantInf.setFocusTraversalKeysEnabled(false);
		pantInf.setFocusable(false);
		pantInf.setHorizontalAlignment(SwingConstants.RIGHT);
		pantInf.setFont(new Font("Dialog", Font.PLAIN, 30));
		pantInf.setEnabled(true);
		pantInf.setEditable(false);
		pantInf.setDropMode(DropMode.USE_SELECTION);
		pantInf.setBackground(new Color(143, 188, 143));
		pantInf.setText("0.");
		pantalla.add(pantInf);
		pantInf.setColumns(14);
		
		JButton x_1Button = new JButton("x⁻¹");
		x_1Button.setMargin(new Insets(2, 2, 2, 2));
		x_1Button.setForeground(Color.WHITE);
		x_1Button.setFont(new Font("SansSerif", Font.BOLD, 16));
		x_1Button.setBackground(new Color(102, 102, 102));
		
		JButton ncrButton = new JButton("nCr");
		ncrButton.setMargin(new Insets(2, 2, 2, 2));
		ncrButton.setForeground(Color.WHITE);
		ncrButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		ncrButton.setBackground(new Color(102, 102, 102));
		
		JButton polButton = new JButton("Pol(");
		polButton.setMargin(new Insets(2, 2, 2, 2));
		polButton.setForeground(Color.WHITE);
		polButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		polButton.setBackground(new Color(102, 102, 102));
		
		JButton x3Button = new JButton("x³");
		x3Button.setMargin(new Insets(2, 2, 2, 2));
		x3Button.setForeground(Color.WHITE);
		x3Button.setFont(new Font("SansSerif", Font.BOLD, 16));
		x3Button.setBackground(new Color(102, 102, 102));
		
		JButton modeButton = new JButton("");
		modeButton.setMargin(new Insets(2, 2, 2, 2));
		modeButton.setForeground(Color.WHITE);
		modeButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		modeButton.setBackground(new Color(220, 220, 220));
		
		JButton onButton = new JButton("");
		onButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		onButton.setMargin(new Insets(2, 2, 2, 2));
		onButton.setForeground(Color.WHITE);
		onButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		onButton.setBackground(new Color(220, 220, 220));
		
		JPanel flechas = new JPanel();
		flechas.setBackground(UIManager.getColor("Button.foreground"));
		
		JButton alphaButton = new JButton("");
		alphaButton.setMargin(new Insets(2, 2, 2, 2));
		alphaButton.setForeground(Color.WHITE);
		alphaButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		alphaButton.setBackground(new Color(220, 220, 220));
		
		JButton shiftButton = new JButton("");
		shiftButton.setMargin(new Insets(2, 2, 2, 2));
		shiftButton.setForeground(Color.WHITE);
		shiftButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		shiftButton.setBackground(new Color(220, 220, 220));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(shiftButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(x_1Button, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(alphaButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(ncrButton, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addComponent(flechas, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(polButton, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(x3Button, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(modeButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(onButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(13)
									.addComponent(alphaButton, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
								.addComponent(shiftButton, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(onButton, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(15)
									.addComponent(modeButton, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(ncrButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addComponent(x_1Button, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(polButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addComponent(x3Button, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
						.addComponent(flechas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		flechas.setLayout(new GridLayout(3, 3, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 51, 51));
		flechas.add(panel_1);
		
		JButton btnNewButton = new JButton("▲");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 18));
		btnNewButton.setBackground(new Color(220, 220, 220));
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		flechas.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 51, 51));
		flechas.add(panel_2);
		
		JButton btnNewButton_1 = new JButton("◀");
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 18));
		btnNewButton_1.setBackground(new Color(220, 220, 220));
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		flechas.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(220, 220, 220));
		flechas.add(panel_3);
		
		JButton btnNewButton_2 = new JButton("▶");
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 18));
		btnNewButton_2.setBackground(new Color(220, 220, 220));
		btnNewButton_2.setMargin(new Insets(0, 0, 0, 0));
		flechas.add(btnNewButton_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(51, 51, 51));
		flechas.add(panel_4);
		
		JButton btnNewButton_3 = new JButton("▼");
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 18));
		btnNewButton_3.setBackground(new Color(220, 220, 220));
		btnNewButton_3.setMargin(new Insets(0, 0, 0, 0));
		flechas.add(btnNewButton_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(51, 51, 51));
		flechas.add(panel_5);
		panel.setLayout(gl_panel);
		operComplejas.setLayout(new GridLayout(3, 6, 5, 30));
		
		JButton ab_cButton = new JButton("ab/c");
		ab_cButton.setMargin(new Insets(2, 2, 2, 2));
		ab_cButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		ab_cButton.setForeground(Color.WHITE);
		ab_cButton.setBackground(new Color(102, 102, 102));
		operComplejas.add(ab_cButton);
		
		JButton sqrootButton = new JButton("√");
		sqrootButton.setMargin(new Insets(2, 2, 2, 2));
		sqrootButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		sqrootButton.setForeground(Color.WHITE);
		sqrootButton.setBackground(new Color(102, 102, 102));
		operComplejas.add(sqrootButton);
		
		JButton sqrButton = new JButton("x²");
		sqrButton.setMargin(new Insets(2, 2, 2, 2));
		sqrButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		sqrButton.setForeground(Color.WHITE);
		sqrButton.setBackground(new Color(102, 102, 102));
		operComplejas.add(sqrButton);
		
		JButton elevadoButton = new JButton("^");
		elevadoButton.setMargin(new Insets(2, 2, 2, 2));
		elevadoButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		elevadoButton.setForeground(Color.WHITE);
		elevadoButton.setBackground(new Color(102, 102, 102));
		operComplejas.add(elevadoButton);
		
		JButton logButton = new JButton("log");
		logButton.setMargin(new Insets(2, 2, 2, 2));
		logButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		logButton.setForeground(Color.WHITE);
		logButton.setBackground(new Color(102, 102, 102));
		operComplejas.add(logButton);
		
		JButton lnButton = new JButton("ln");
		lnButton.setMargin(new Insets(2, 2, 2, 2));
		lnButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		lnButton.setForeground(Color.WHITE);
		lnButton.setBackground(new Color(102, 102, 102));
		operComplejas.add(lnButton);
		
		JButton fraccionButton = new JButton("(-)");
		fraccionButton.setMargin(new Insets(2, 2, 2, 2));
		fraccionButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		fraccionButton.setForeground(Color.WHITE);
		fraccionButton.setBackground(new Color(102, 102, 102));
		operComplejas.add(fraccionButton);
		
		JButton gradosButton = new JButton("º ' \"");
		gradosButton.setMargin(new Insets(2, 2, 2, 2));
		gradosButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		gradosButton.setForeground(Color.WHITE);
		gradosButton.setBackground(new Color(102, 102, 102));
		operComplejas.add(gradosButton);
		
		JButton hypButton = new JButton("hyp");
		hypButton.setMargin(new Insets(2, 2, 2, 2));
		hypButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		hypButton.setForeground(Color.WHITE);
		hypButton.setBackground(new Color(102, 102, 102));
		operComplejas.add(hypButton);
		
		JButton sinButton = new JButton("sin");
		sinButton.setMargin(new Insets(2, 2, 2, 2));
		sinButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		sinButton.setForeground(Color.WHITE);
		sinButton.setBackground(new Color(102, 102, 102));
		operComplejas.add(sinButton);
		
		JButton cosButton = new JButton("cos");
		cosButton.setMargin(new Insets(2, 2, 2, 2));
		cosButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		cosButton.setForeground(Color.WHITE);
		cosButton.setBackground(new Color(102, 102, 102));
		operComplejas.add(cosButton);
		
		JButton tanButton = new JButton("tan");
		tanButton.setMargin(new Insets(2, 2, 2, 2));
		tanButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		tanButton.setForeground(Color.WHITE);
		tanButton.setBackground(new Color(102, 102, 102));
		operComplejas.add(tanButton);
		
		JButton rclButton = new JButton("RCL");
		rclButton.setMargin(new Insets(2, 2, 2, 2));
		rclButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		rclButton.setForeground(Color.WHITE);
		rclButton.setBackground(new Color(102, 102, 102));
		operComplejas.add(rclButton);
		
		JButton engButton = new JButton("ENG");
		engButton.setMargin(new Insets(2, 2, 2, 2));
		engButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		engButton.setForeground(Color.WHITE);
		engButton.setBackground(new Color(102, 102, 102));
		operComplejas.add(engButton);
		
		JButton abrirParButton = new JButton("(");
		abrirParButton.setMargin(new Insets(2, 2, 2, 2));
		abrirParButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		abrirParButton.setForeground(Color.WHITE);
		abrirParButton.setBackground(new Color(102, 102, 102));
		operComplejas.add(abrirParButton);
		
		JButton cerrarParButton = new JButton(")");
		cerrarParButton.setMargin(new Insets(2, 2, 2, 2));
		cerrarParButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		cerrarParButton.setForeground(Color.WHITE);
		cerrarParButton.setBackground(new Color(102, 102, 102));
		operComplejas.add(cerrarParButton);
		
		JButton aposButton = new JButton("'");
		aposButton.setMargin(new Insets(2, 2, 2, 2));
		aposButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		aposButton.setForeground(Color.WHITE);
		aposButton.setBackground(new Color(102, 102, 102));
		operComplejas.add(aposButton);
		
		JButton memPosButton = new JButton("M+");
		memPosButton.setMargin(new Insets(2, 2, 2, 2));
		memPosButton.setFont(new Font("SansSerif", Font.BOLD, 16));
		memPosButton.setForeground(Color.WHITE);
		memPosButton.setBackground(new Color(102, 102, 102));
		operComplejas.add(memPosButton);
		operaciones.setLayout(new GridLayout(4, 2, 8, 23));
		
		JButton deleteButton = new JButton("DEL");
		deleteButton.setMargin(new Insets(2, 2, 2, 2));
		deleteButton.setForeground(Color.WHITE);
		deleteButton.setBackground(new Color(204, 51, 51));
		deleteButton.setFont(new Font("SansSerif", Font.BOLD, 22));
		deleteButton.setToolTipText("Borrar número en posición");
		operaciones.add(deleteButton);
		
		JButton acButton = new JButton("AC");
		acButton.setMargin(new Insets(2, 2, 2, 2));
		acButton.setForeground(Color.WHITE);
		acButton.setBackground(new Color(204, 51, 51));
		acButton.setFont(new Font("SansSerif", Font.BOLD, 22));
		acButton.setToolTipText("Borrar todo");
		operaciones.add(acButton);
		
		JButton multButton = new JButton("X");
		multButton.setMargin(new Insets(2, 2, 2, 2));
		multButton.setBackground(new Color(102, 102, 102));
		multButton.setForeground(Color.WHITE);
		multButton.setFont(new Font("SansSerif", Font.BOLD, 25));
		multButton.setToolTipText("Multiplicar");
		operaciones.add(multButton);
		
		JButton divButton = new JButton("/");
		divButton.setMargin(new Insets(2, 2, 2, 2));
		divButton.setBackground(new Color(102, 102, 102));
		divButton.setForeground(Color.WHITE);
		divButton.setFont(new Font("SansSerif", Font.BOLD, 25));
		divButton.setToolTipText("Dividir");
		operaciones.add(divButton);
		
		JButton sumButton = new JButton("+");
		sumButton.setMargin(new Insets(2, 2, 2, 2));
		sumButton.setBackground(new Color(102, 102, 102));
		sumButton.setForeground(Color.WHITE);
		sumButton.setFont(new Font("SansSerif", Font.BOLD, 25));
		sumButton.setToolTipText("Sumar");
		operaciones.add(sumButton);
		
		JButton restaButton = new JButton("-");
		restaButton.setMargin(new Insets(2, 2, 2, 2));
		restaButton.setBackground(new Color(102, 102, 102));
		restaButton.setForeground(Color.WHITE);
		restaButton.setFont(new Font("SansSerif", Font.BOLD, 25));
		restaButton.setToolTipText("Restar");
		operaciones.add(restaButton);
		
		JButton ansButton = new JButton("Ans");
		ansButton.setMargin(new Insets(2, 2, 2, 2));
		ansButton.setBackground(new Color(102, 102, 102));
		ansButton.setForeground(Color.WHITE);
		ansButton.setFont(new Font("SansSerif", Font.BOLD, 22));
		ansButton.setToolTipText("Última respuesta");
		operaciones.add(ansButton);
		
		JButton igualButton = new JButton("=");
		igualButton.setMargin(new Insets(2, 2, 2, 2));
		igualButton.setBackground(new Color(102, 102, 102));
		igualButton.setForeground(Color.WHITE);
		igualButton.setFont(new Font("SansSerif", Font.BOLD, 25));
		igualButton.setToolTipText("Resultado");
		operaciones.add(igualButton);
		numeros.setLayout(new GridLayout(4, 3, 8, 23));
		
		JButton num7 = new JButton("7");
		num7.setMargin(new Insets(2, 2, 2, 2));
		num7.setToolTipText("7");
		num7.setFont(new Font("SansSerif", Font.BOLD, 25));
		num7.setForeground(Color.WHITE);
		num7.setBackground(new Color(102, 102, 102));
		numeros.add(num7);
		
		JButton num8 = new JButton("8");
		num8.setMargin(new Insets(2, 2, 2, 2));
		num8.setToolTipText("8");
		num8.setFont(new Font("SansSerif", Font.BOLD, 25));
		num8.setForeground(Color.WHITE);
		num8.setBackground(new Color(102, 102, 102));
		numeros.add(num8);
		
		JButton num9 = new JButton("9");
		num9.setMargin(new Insets(2, 2, 2, 2));
		num9.setToolTipText("9");
		num9.setFont(new Font("SansSerif", Font.BOLD, 25));
		num9.setForeground(Color.WHITE);
		num9.setBackground(new Color(102, 102, 102));
		numeros.add(num9);
		
		JButton num4 = new JButton("4");
		num4.setMargin(new Insets(2, 2, 2, 2));
		num4.setToolTipText("4");
		num4.setFont(new Font("SansSerif", Font.BOLD, 25));
		num4.setForeground(Color.WHITE);
		num4.setBackground(new Color(102, 102, 102));
		numeros.add(num4);
		
		JButton num5 = new JButton("5");
		num5.setMargin(new Insets(2, 2, 2, 2));
		num5.setToolTipText("5");
		num5.setFont(new Font("SansSerif", Font.BOLD, 25));
		num5.setForeground(Color.WHITE);
		num5.setBackground(new Color(102, 102, 102));
		numeros.add(num5);
		
		JButton num6 = new JButton("6");
		num6.setMargin(new Insets(2, 2, 2, 2));
		num6.setToolTipText("6");
		num6.setFont(new Font("SansSerif", Font.BOLD, 25));
		num6.setForeground(Color.WHITE);
		num6.setBackground(new Color(102, 102, 102));
		numeros.add(num6);
		
		JButton num1 = new JButton("1");
		num1.setMargin(new Insets(2, 2, 2, 2));
		num1.setToolTipText("1");
		num1.setFont(new Font("SansSerif", Font.BOLD, 25));
		num1.setForeground(Color.WHITE);
		num1.setBackground(new Color(102, 102, 102));
		numeros.add(num1);
		
		JButton num2 = new JButton("2");
		num2.setMargin(new Insets(2, 2, 2, 2));
		num2.setToolTipText("2");
		num2.setFont(new Font("SansSerif", Font.BOLD, 25));
		num2.setForeground(Color.WHITE);
		num2.setBackground(new Color(102, 102, 102));
		numeros.add(num2);
		
		JButton num3 = new JButton("3");
		num3.setMargin(new Insets(2, 2, 2, 2));
		num3.setToolTipText("3");
		num3.setFont(new Font("SansSerif", Font.BOLD, 25));
		num3.setForeground(Color.WHITE);
		num3.setBackground(new Color(102, 102, 102));
		numeros.add(num3);
		
		JButton num0 = new JButton("0");
		num0.setMargin(new Insets(2, 2, 2, 2));
		num0.setToolTipText("0");
		num0.setFont(new Font("SansSerif", Font.BOLD, 25));
		num0.setForeground(Color.WHITE);
		num0.setBackground(new Color(102, 102, 102));
		numeros.add(num0);
		
		JButton punto = new JButton(".");
		punto.setMargin(new Insets(2, 2, 2, 2));
		punto.setToolTipText("Decimal");
		punto.setFont(new Font("SansSerif", Font.BOLD, 25));
		punto.setForeground(Color.WHITE);
		punto.setBackground(new Color(102, 102, 102));
		numeros.add(punto);
		
		JButton exponente = new JButton("EXP");
		exponente.setMargin(new Insets(2, 2, 2, 2));
		exponente.setToolTipText("Exponente");
		exponente.setFont(new Font("SansSerif", Font.BOLD, 22));
		exponente.setForeground(Color.WHITE);
		exponente.setBackground(new Color(102, 102, 102));
		numeros.add(exponente);
		getContentPane().setLayout(groupLayout);
	}
}
