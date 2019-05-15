package formulario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;

public class Formulario1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textnombre;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textFECHANACIMIENTO;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario1 frame = new Formulario1();
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
	public Formulario1() {
		getContentPane().setBackground(Color.BLACK);
		setTitle("formulario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.YELLOW);
		lblNombre.setBounds(43, 28, 116, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(46, 71, 19, -4);
		getContentPane().add(lblNewLabel);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setForeground(Color.YELLOW);
		lblApellidos.setBounds(43, 53, 116, 14);
		getContentPane().add(lblApellidos);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setForeground(Color.YELLOW);
		lblTelfono.setBounds(46, 78, 113, 14);
		getContentPane().add(lblTelfono);
		
		JLabel email = new JLabel("correo electr\u00F3nico:");
		email.setForeground(Color.YELLOW);
		email.setBounds(46, 142, 113, 14);
		getContentPane().add(email);
		
		textnombre = new JTextField();
		textnombre.setBounds(164, 28, 117, 20);
		getContentPane().add(textnombre);
		textnombre.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(164, 53, 117, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(164, 75, 117, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textFECHANACIMIENTO = new JTextField();
		textFECHANACIMIENTO.setBounds(164, 101, 117, 20);
		getContentPane().add(textFECHANACIMIENTO);
		textFECHANACIMIENTO.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(164, 139, 117, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("PROCESAR");
		tglbtnNewToggleButton.setForeground(Color.YELLOW);
		tglbtnNewToggleButton.setBackground(new Color(0, 0, 204));
		tglbtnNewToggleButton.setBounds(291, 28, 121, 131);
		getContentPane().add(tglbtnNewToggleButton);
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(43, 167, 369, 83);
		getContentPane().add(textArea);
		
		JLabel lblFechaNacimiento = new JLabel("fecha nacimiento:");
		lblFechaNacimiento.setForeground(Color.YELLOW);
		lblFechaNacimiento.setBounds(46, 104, 113, 14);
		getContentPane().add(lblFechaNacimiento);
		
		
	}
}
