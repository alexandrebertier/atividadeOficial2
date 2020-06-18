package com.alexandre;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculaPeso extends JFrame {

	private JPanel contentPane;
	private JTextField txtpeso;
	protected double pesop;
	protected double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculaPeso frame = new CalculaPeso();
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
	public CalculaPeso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Peso na Terra: Kg");
		lblNewLabel.setBounds(38, 27, 103, 14);
		contentPane.add(lblNewLabel);
		
		txtpeso = new JTextField();
		txtpeso.setBounds(39, 67, 86, 20);
		contentPane.add(txtpeso);
		txtpeso.setColumns(10);
		
		JButton btnNewButton = new JButton("LIMPAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtpeso.setText("");
			}
		});
		btnNewButton.setBounds(173, 66, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Selecione o Planeta");
		lblNewLabel_1.setBounds(38, 120, 138, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton mercurio = new JButton("Mercurio");
		mercurio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pesop = Double.parseDouble(txtpeso.getText());
				
				result = pesop * 0.37 ;
				
				JOptionPane.showMessageDialog(null, "seu peso em mercurio é: " +result+ "Kgs");
				
				
					}
		});
		mercurio.setBounds(36, 174, 89, 23);
		contentPane.add(mercurio);
		
		JButton venus = new JButton("Venus");
		venus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pesop = Double.parseDouble(txtpeso.getText());
				
				result = pesop * 0.88 ;
				
				JOptionPane.showMessageDialog(null, "seu peso em venus é: " +result+ "Kgs");
			}
		});
		venus.setBounds(36, 212, 89, 23);
		contentPane.add(venus);
		
		JButton marte = new JButton("Marte");
		marte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pesop = Double.parseDouble(txtpeso.getText());
				
				result = pesop * 0.38 ;
				
				JOptionPane.showMessageDialog(null, "seu peso em marte é: " +result+ "Kgs");
				
			}
		});
		marte.setBounds(173, 174, 89, 23);
		contentPane.add(marte);
		
		JButton jupiter = new JButton("Jupiter");
		jupiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pesop = Double.parseDouble(txtpeso.getText());
				
				result = pesop * 2.64 ;
				
				JOptionPane.showMessageDialog(null, "seu peso em jupiter é: " +result+ "Kgs");
			}
		});
		jupiter.setBounds(173, 212, 89, 23);
		contentPane.add(jupiter);
		
		JButton saturno = new JButton("Saturno");
		saturno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pesop = Double.parseDouble(txtpeso.getText());
				
				result = pesop * 1.15 ;
				
				JOptionPane.showMessageDialog(null, "seu peso em saturno é: " +result+ "Kgs");
				
			}
		});
		saturno.setBounds(312, 174, 89, 23);
		contentPane.add(saturno);
		
		JButton urano = new JButton("Urano");
		urano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pesop = Double.parseDouble(txtpeso.getText());
				
				result = pesop * 1.17 ;
				
				JOptionPane.showMessageDialog(null, "seu peso em urano é: " +result+ "Kgs");
				
				
			}
		});
		urano.setBounds(312, 212, 89, 23);
		contentPane.add(urano);
	}
}
