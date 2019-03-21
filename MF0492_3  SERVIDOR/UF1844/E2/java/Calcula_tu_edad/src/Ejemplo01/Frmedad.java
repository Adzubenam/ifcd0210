package Ejemplo01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Frmedad extends JFrame {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frmedad frame = new Frmedad();
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
	public Frmedad() {
		setTitle("CALCULA TU EDAD");
		setBackground(Color.MAGENTA);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		JLabel txtAnoAct = new JLabel("A\u00F1o Actual:");
		txtAnoAct.setForeground(Color.YELLOW);
		txtAnoAct.setBackground(Color.YELLOW);
		txtAnoAct.setBounds(10, 24, 283, 14);
		contentPane.add(txtAnoAct);
		
		JLabel lblNewLabel_1 = new JLabel("A\u00F1o de Nacimiento:");
		lblNewLabel_1.setBounds(10, 69, 135, -9);
		contentPane.add(lblNewLabel_1);
		
		JLabel txtAnoNac = new JLabel("A\u00F1o de Nacimiento:");
		txtAnoNac.setForeground(Color.YELLOW);
		txtAnoNac.setBackground(Color.MAGENTA);
		txtAnoNac.setBounds(10, 49, 118, 14);
		contentPane.add(txtAnoNac);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(132, 19, 161, 19);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(132, 49, 161, 19);
		contentPane.add(textArea_1);
		
		final JTextArea textResultados = new JTextArea();
		textResultados.setBackground(Color.WHITE);
		textResultados.setBounds(10, 101, 392, 137);
		contentPane.add(textResultados);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			private JLabel txtResultados;

			public void actionPerformed(ActionEvent arg0) {
				int AnoAct =Integer.parseInt(txtAnoAct.getText());
				int AnoNac=Integer.parseInt(txtAnoNac.getText());
				int edad;
				edad=AnoAct-AnoNac;
				txtResultados.setText("tu edad actual es:" + edad);
				
		        
			}
		});
		btnProcesar.setBounds(317, 19, 89, 49);
		contentPane.add(btnProcesar);
		
	}
}
