package CalcularotGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private double answer,number;
	int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	
	public void addInput(String str) {
		
		input.setText(input.getText()+str);
		
	}
	
	public void calculate() {
		switch(operation) {
		case 1:
			answer=number+Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2:
			answer=number-Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer=number*Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4:
			answer=number/Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
			
		
		}
	}
	
	public Calculator() {
		setType(Type.UTILITY);
		setTitle("Hesap Makinesi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBounds(10, 11, 332, 61);
		contentPane.add(screen);
		screen.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 21, 332, 40);
		screen.add(panel);
		panel.setLayout(null);
		
		input = new JTextField();
		input.setEditable(false);
		input.setFont(new Font("Tahoma", Font.BOLD, 20));
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setBounds(0, 0, 332, 40);
		panel.add(input);
		input.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(160, 0, 172, 14);
		screen.add(lbl);
		
		JPanel control = new JPanel();
		control.setBounds(10, 83, 332, 320);
		contentPane.add(control);
		control.setLayout(new GridLayout(4, 4, 20, 20));
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("9");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("+");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation = 1;
				input.setText("");
				lbl.setText(number+e.getActionCommand());
			}
		});
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_4 = new JButton("4");
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_2_4);
		
		JButton btnNewButton = new JButton("5");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton);
		
		JButton btnNewButton_2_10 = new JButton("6");
		btnNewButton_2_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_2_10);
		
		JButton btnNewButton_2_3 = new JButton("-");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation = 2;
				input.setText("");
				lbl.setText(number+e.getActionCommand());
			}
		});
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_7 = new JButton("1");
		btnNewButton_2_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_2_7);
		
		JButton btnNewButton_2_6 = new JButton("2");
		btnNewButton_2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_2_6);
		
		JButton btnNewButton_2_5 = new JButton("3");
		btnNewButton_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_2_5);
		
		JButton btnNewButton_2_8 = new JButton("*");
		btnNewButton_2_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation = 3;
				input.setText("");
				lbl.setText(number+e.getActionCommand());
			}
		});
		btnNewButton_2_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_2_8);
		
		JButton btnNewButton_2_9 = new JButton("0");
		btnNewButton_2_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_2_9);
		
		JButton btnNewButton_2_11 = new JButton("=");
		btnNewButton_2_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				 if(input.getText().equals("63.0")) {
					lbl.setText("YAŞASIN URFALILAR!!!");
				}else {
					lbl.setText("");
				}
				
			}
		});
		btnNewButton_2_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_2_11);
		
		JButton btnNewButton_2_12 = new JButton("C");
		btnNewButton_2_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
			}
		});
		btnNewButton_2_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_2_12);
		
		JButton btnNewButton_2_13 = new JButton("/");
		btnNewButton_2_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation = 4;
				input.setText("");
				lbl.setText(number+e.getActionCommand());
			}
		});
		btnNewButton_2_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_2_13);
	}
}
