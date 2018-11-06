package bank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextArea;

public class Bank_Account {

	/**
	 * 
	 */
	private JFrame frame;
	private JTextField displayText;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextArea textArea;
	
	private JButton btnExit;
	private JButton btnReceipt;
	private JButton jbtnLoan;
	private JButton btnReset;
	
	private JButton jbtnbalance,jbtnloan,jbtndeposit,jbtnwd;
	private JButton jbtn1,jbtn2,jbtn3,jbtn4,jbtn5,jbtn6,jbtn7,jbtn8,jbtn9,jbtn0;
	int bal1,bal2,bal3,bal4,pin,val,a=0,bal;
	String str;
	char ch;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bank_Account window = new Bank_Account();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bank_Account() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(12, 109, 113, 122);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		jbtnwd = new JButton("-->");
		jbtnwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a == 0) {
					textArea.setText("\n\n\n\n\tEnter Amount");
					displayText.setText(null);
					ch='W';
				}
				else {
					textArea.setText("\n\n\n\n  click the cancel button & re-enter your\n\tpin");
				}
				a=1;
			}
		});
		jbtnwd.setEnabled(false);
		jbtnwd.setFont(new Font("Dialog", Font.BOLD, 32));
		jbtnwd.setBounds(12, 68, 89, 42);
		panel.add(jbtnwd);
		
		jbtnbalance = new JButton("-->");
		jbtnbalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a == 0) {
					try {
						if(textArea.getText().equals("\n\n\n\n\tHi Sreenivasulu")) {
							bal=1;
							textArea.setText("\n\n\n\n     Your balance is "+Manipulations.balance(bal));
						}
						else if(textArea.getText().equals("\n\n\n\n\tHi Latha")) {
							bal=2;
							textArea.setText("\n\n\n\n     Your balance is "+Manipulations.balance(bal));
						}
						else if(textArea.getText().equals("\n\n\n\n\tHi Kaushik")) {
							bal=3;
							textArea.setText("\n\n\n\n     Your balance is "+Manipulations.balance(bal));
						}
						else if(textArea.getText().equals("\n\n\n\n\tHi Prema Sai")) {
							bal=4;
							textArea.setText("\n\n\n\n     Your balance is "+Manipulations.balance(bal));
						}
					}
					catch(Exception ex) {
						JOptionPane.showMessageDialog(textArea, "Check Account name", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
				else
					textArea.setText("\n\n\n\n  click the cancel button & re-enter your\n\tpin");
				a=1;
			}
		});
		jbtnbalance.setEnabled(false);
		jbtnbalance.setFont(new Font("Dialog", Font.BOLD, 32));
		jbtnbalance.setIcon(null);
		jbtnbalance.setBounds(12, 13, 88, 43);
		panel.add(jbtnbalance);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 0));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(137, 109, 279, 122);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBalance = new JLabel(" Balance");
		lblBalance.setFont(new Font("Dialog", Font.BOLD, 14));
		lblBalance.setBounds(12, 12, 85, 26);
		panel_1.add(lblBalance);
		
		JLabel lblWithdrawl = new JLabel(" Withdrawl");
		lblWithdrawl.setFont(new Font("Dialog", Font.BOLD, 14));
		lblWithdrawl.setBounds(12, 84, 85, 26);
		panel_1.add(lblWithdrawl);
		
		JLabel lblLoan = new JLabel("            Loan");
		lblLoan.setFont(new Font("Dialog", Font.BOLD, 14));
		lblLoan.setBounds(138, 12, 120, 26);
		panel_1.add(lblLoan);
		
		JLabel lblDeposit = new JLabel("  Deposit");
		lblDeposit.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDeposit.setBounds(173, 84, 85, 26);
		panel_1.add(lblDeposit);
		
		displayText = new JTextField();
		displayText.setHorizontalAlignment(SwingConstants.CENTER);
		displayText.setFont(new Font("Dialog", Font.BOLD, 14));
		displayText.setBounds(22, 44, 236, 38);
		panel_1.add(displayText);
		displayText.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(428, 109, 113, 122);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		jbtndeposit = new JButton("<--");
		jbtndeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a == 0) {
					textArea.setText("\n\n\n\n\tEnter amount");
					displayText.setText("");
					ch='D';
				}
				else {
					textArea.setText("\n\n\n\n  click the cancel button & re-enter your\n\tpin");
				}
				a=1;
			}
		});
		jbtndeposit.setEnabled(false);
		jbtndeposit.setFont(new Font("Dialog", Font.BOLD, 32));
		jbtndeposit.setBounds(12, 67, 91, 42);
		panel_2.add(jbtndeposit);
		
		jbtnloan = new JButton("<--");
		jbtnloan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a==0) {
					jbtnLoan.setEnabled(true);
					btnReset.setEnabled(true);
					btnReceipt.setEnabled(true);
					textField.setEnabled(true);
					textField_1.setEnabled(true);
					textField_2.setEnabled(true);
					textField_3.setEnabled(true);
					textField_4.setEnabled(true);					
				}
				else
					textArea.setText("\n\n\n\n  click the cancel button & re-enter your\n\tpin");		
			}
		});
		jbtnloan.setEnabled(false);
		jbtnloan.setFont(new Font("Dialog", Font.BOLD, 32));
		jbtnloan.setBounds(12, 12, 91, 43);
		panel_2.add(jbtnloan);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(12, 271, 529, 335);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		jbtn1 = new JButton("1");
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String setnum = displayText.getText() + "1";
				displayText.setText(setnum);
			}
		});
		jbtn1.setFont(new Font("Dialog", Font.BOLD, 20));
		jbtn1.setBounds(12, 27, 117, 52);
		panel_3.add(jbtn1);
		
		jbtn2 = new JButton("2");
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String setnum = displayText.getText() + "2";
				displayText.setText(setnum);
			}
		});
		jbtn2.setFont(new Font("Dialog", Font.BOLD, 20));
		jbtn2.setBounds(141, 27, 117, 52);
		panel_3.add(jbtn2);
		
		jbtn3 = new JButton("3");
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String setnum = displayText.getText() + "3";
				displayText.setText(setnum);
			}
		});
		jbtn3.setFont(new Font("Dialog", Font.BOLD, 20));
		jbtn3.setBounds(270, 27, 117, 52);
		panel_3.add(jbtn3);
		
		JButton jbtnCancel = new JButton("CANCEL");
		jbtnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("\n\n          Welcome to State Bank ATM\n\n\t\n\n             Enter your 4-digit pin\n");
				displayText.setText(null);
				jbtnbalance.setEnabled(false);
				jbtnwd.setEnabled(false);
				jbtndeposit.setEnabled(false);
				jbtnloan.setEnabled(false);
				str=null;
				ch=' ';
				a=0;
			}
		});
		jbtnCancel.setFont(new Font("Dialog", Font.BOLD, 18));
		jbtnCancel.setBackground(Color.RED);
		jbtnCancel.setBounds(399, 27, 117, 52);
		panel_3.add(jbtnCancel);
		
		JButton jbtnClear = new JButton("CLEAR");
		jbtnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayText.setText("");
				ch=' ';
			}
		});
		jbtnClear.setFont(new Font("Dialog", Font.BOLD, 18));
		jbtnClear.setBackground(SystemColor.info);
		jbtnClear.setBounds(399, 104, 117, 52);
		panel_3.add(jbtnClear);
		
		jbtn6 = new JButton("6");
		jbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String setnum = displayText.getText() + "6";
				displayText.setText(setnum);
			}
		});
		jbtn6.setFont(new Font("Dialog", Font.BOLD, 20));
		jbtn6.setBounds(270, 104, 117, 52);
		panel_3.add(jbtn6);
		
		jbtn5 = new JButton("5");
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String setnum = displayText.getText() + "5";
				displayText.setText(setnum);
			}
		});
		jbtn5.setFont(new Font("Dialog", Font.BOLD, 20));
		jbtn5.setBounds(141, 104, 117, 52);
		panel_3.add(jbtn5);
		
		jbtn4 = new JButton("4");
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String setnum = displayText.getText() + "4";
				displayText.setText(setnum);
			}
		});
		jbtn4.setFont(new Font("Dialog", Font.BOLD, 20));
		jbtn4.setBounds(12, 104, 117, 52);
		panel_3.add(jbtn4);
		
		JButton jbtnEnter = new JButton("ENTER");
		jbtnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
				try {
					val = Integer.parseInt(displayText.getText());
					if(ch == 'W' || ch == 'D')
						textArea.append(Manipulations.enter(str,ch,val));
					else {
						if(val == 1234) {
							textArea.setText("\n\n\n\n\tHi Sreenivasulu");
							str=textArea.getText();
							jbtnbalance.setEnabled(true);
							jbtnwd.setEnabled(true);
							jbtndeposit.setEnabled(true);
							jbtnloan.setEnabled(true);
							
							lblBalance.setVisible(true);
							lblWithdrawl.setVisible(true);
							lblLoan.setVisible(true);
							lblDeposit.setVisible(true);
							
						}
						else if(val == 2345) {
							textArea.setText("\n\n\n\n\tHi Latha");
							str=textArea.getText();
							jbtnbalance.setEnabled(true);
							jbtnwd.setEnabled(true);
							jbtndeposit.setEnabled(true);
							jbtnloan.setEnabled(true);
							
							lblBalance.setVisible(true);
							lblWithdrawl.setVisible(true);
							lblLoan.setVisible(true);
							lblDeposit.setVisible(true);
						}
						else if(val == 3456) {
							textArea.setText("\n\n\n\n\tHi Kaushik");
							str=textArea.getText();
							jbtnbalance.setEnabled(true);
							jbtnwd.setEnabled(true);
							jbtndeposit.setEnabled(true);
							jbtnloan.setEnabled(true);
							
							lblBalance.setVisible(true);
							lblWithdrawl.setVisible(true);
							lblLoan.setVisible(true);
							lblDeposit.setVisible(true);
						}
						else if(val == 4567) {
							textArea.setText("\n\n\n\n\tHi Prema Sai");
							str=textArea.getText();
							jbtnbalance.setEnabled(true);
							jbtnwd.setEnabled(true);
							jbtndeposit.setEnabled(true);
							jbtnloan.setEnabled(true);
							
							lblBalance.setVisible(true);
							lblWithdrawl.setVisible(true);
							lblLoan.setVisible(true);
							lblDeposit.setVisible(true);
						}
						else {
							textArea.setText("\n\n\n\n\tInvalid pin");
						}
						displayText.setText("");
					}
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(displayText, "Enter correct pin", "Error", JOptionPane.ERROR_MESSAGE);
				}
								
			}
		});
		jbtnEnter.setFont(new Font("Dialog", Font.BOLD, 18));
		jbtnEnter.setBackground(new Color(34, 139, 34));
		jbtnEnter.setBounds(399, 182, 117, 52);
		panel_3.add(jbtnEnter);
		
		jbtn9 = new JButton("9");
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String setnum = displayText.getText() + "9";
				displayText.setText(setnum);
			}
		});
		jbtn9.setFont(new Font("Dialog", Font.BOLD, 20));
		jbtn9.setBounds(270, 182, 117, 52);
		panel_3.add(jbtn9);
		
		jbtn8 = new JButton("8");
		jbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String setnum = displayText.getText() + "8";
				displayText.setText(setnum);
			}
		});
		jbtn8.setFont(new Font("Dialog", Font.BOLD, 20));
		jbtn8.setBounds(141, 182, 117, 52);
		panel_3.add(jbtn8);
		
		jbtn7 = new JButton("7");
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String setnum = displayText.getText() + "7";
				displayText.setText(setnum);
			}
		});
		jbtn7.setFont(new Font("Dialog", Font.BOLD, 20));
		jbtn7.setBounds(12, 182, 117, 52);
		panel_3.add(jbtn7);
		
		JButton free2 = new JButton(" ");
		free2.setBounds(399, 256, 117, 52);
		panel_3.add(free2);
		
		JButton free1 = new JButton(" ");
		free1.setBounds(270, 256, 117, 52);
		panel_3.add(free1);
		
		jbtn0 = new JButton("0");
		jbtn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String setnum = displayText.getText() + "0";
				displayText.setText(setnum);
			}
		});
		jbtn0.setFont(new Font("Dialog", Font.BOLD, 20));
		jbtn0.setBounds(141, 256, 117, 52);
		panel_3.add(jbtn0);
		
		JButton free = new JButton(" ");
		free.setBounds(12, 256, 117, 52);
		panel_3.add(free);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(553, 106, 787, 500);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Interest Rate");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel_1.setBounds(26, 44, 183, 31);
		panel_4.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(257, 47, 114, 31);
		panel_4.add(textField);
		textField.setColumns(10);
		
		JLabel lblNumberOfYears = new JLabel("Number of years");
		lblNumberOfYears.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNumberOfYears.setBounds(26, 123, 230, 31);
		panel_4.add(lblNumberOfYears);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(257, 126, 114, 31);
		panel_4.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(257, 204, 114, 31);
		panel_4.add(textField_2);
		
		JLabel lblMonthlyPayment = new JLabel("Monthly Payment");
		lblMonthlyPayment.setFont(new Font("Dialog", Font.BOLD, 22));
		lblMonthlyPayment.setBounds(26, 273, 230, 31);
		panel_4.add(lblMonthlyPayment);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(257, 276, 114, 31);
		panel_4.add(textField_3);
		
		JLabel lblTotalPayment = new JLabel("Total Payment");
		lblTotalPayment.setFont(new Font("Dialog", Font.BOLD, 22));
		lblTotalPayment.setBounds(26, 356, 183, 31);
		panel_4.add(lblTotalPayment);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setBounds(257, 359, 114, 31);
		panel_4.add(textField_4);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		textArea.setText("\n\n          Welcome to State Bank ATM\n\n\t\n\n             Enter your 4-digit pin\n");
		textArea.setBounds(383, 30, 392, 357);
		panel_4.add(textArea);
		
		jbtnLoan = new JButton("Loan");
		jbtnLoan.setEnabled(false);
		jbtnLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double annualInterestRate = Double.parseDouble(textField.getText());
					double monthlyInterestRate = annualInterestRate/1200;
					int numberOfYears = Integer.parseInt(textField_1.getText());
					double loanAmount = Double.parseDouble(textField_2.getText());
					
					double monthlyPayment = loanAmount * monthlyInterestRate/(1 - 1 /Math.pow(1 + monthlyInterestRate , numberOfYears * 12));
					String imonthlyPayment = Double.toString(monthlyPayment);
					imonthlyPayment = String.format("Rs %.2f", monthlyPayment);
					textField_3.setText(imonthlyPayment);
					
					float totalPayment = (float)monthlyPayment * numberOfYears * 12;
					String itotalPayment = String.format("Rs %2f ", totalPayment);
					textField_4.setText(itotalPayment);	
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(textArea, "Enter in digits", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		jbtnLoan.setFont(new Font("Dialog", Font.BOLD, 20));
		jbtnLoan.setBounds(36, 411, 151, 55);
		panel_4.add(jbtnLoan);
		
		btnReceipt = new JButton("Receipt");
		btnReceipt.setEnabled(false);
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String annualInterestRate = String.format(textField.getText());
				String numberOfYears = String.format(textField_1.getText());
				String loanAmount = String.format(textField_2.getText());
				
				String monthlyPayment = String.format(textField_3.getText());
				String totalPayment = String.format(textField_4.getText());
				
				int refs = 1325 + (int) (Math.random()*4238);
				
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:MM:SS");
				tTime.format(timer.getTime());
				SimpleDateFormat tDate = new SimpleDateFormat("DD-MM-YYYY");
				tDate.format(timer.getTime());
				textArea.setText(null);
				textArea.append("Loan Management Systems\n"+
				"Reference:\t\t"+refs+
				"\n===================\t "+
				"\nInterest rate:\t\t "+annualInterestRate +
				"\nRepayment years:\t "+numberOfYears +
				"\nAmount of loan:\t"+"Rs " + loanAmount +
				"\nMonthly Payment:\t "+monthlyPayment +
				"\nTotal Payment:\t   "+totalPayment +
				
				"\n===================\t "+
				"\nDate: " + tDate.format(timer.getTime()) +
				"  Time: "+tTime.format(timer.getTime()) +
				"\n\n\tThank you\n");
			}
		});
		btnReceipt.setFont(new Font("Dialog", Font.BOLD, 20));
		btnReceipt.setBounds(240, 411, 151, 55);
		panel_4.add(btnReceipt);
		
		btnReset = new JButton("Reset");
		btnReset.setEnabled(false);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textArea.setText(null);
			}
		});
		btnReset.setFont(new Font("Dialog", Font.BOLD, 20));
		btnReset.setBounds(436, 411, 151, 55);
		panel_4.add(btnReset);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"confirm if you want to exit",
						"ATM Systems",
						 JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Dialog", Font.BOLD, 20));
		btnExit.setBounds(624, 411, 151, 55);
		panel_4.add(btnExit);
		
		JLabel lblNewLabel_2 = new JLabel("Amount of Loan");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2.setBounds(26, 202, 210, 31);
		panel_4.add(lblNewLabel_2);
	}
}