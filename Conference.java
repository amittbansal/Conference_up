package conference_Up;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import java.awt.Panel;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Conference {

	private JFrame frmConferenceuplogin;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conference window = new Conference();
					window.frmConferenceuplogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Conference() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConferenceuplogin = new JFrame();
		frmConferenceuplogin.setFont(null);
		frmConferenceuplogin.setTitle("Conference_Up_Login");
		frmConferenceuplogin.setBounds(100, 100, 803, 662);
		frmConferenceuplogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConferenceuplogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conference Up");
		lblNewLabel.setToolTipText("App title");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 38));
		lblNewLabel.setBounds(147, 56, 416, 86);
		frmConferenceuplogin.getContentPane().add(lblNewLabel);
		
		Panel panel = new Panel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(72, 165, 589, 202);
		frmConferenceuplogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBounds(64, 57, 203, 33);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(279, 57, 240, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 30));
		lblPassword.setBounds(64, 137, 203, 33);
		panel.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(279, 137, 240, 29);
		panel.add(textField_1);
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(72, 412, 589, 72);
		frmConferenceuplogin.getContentPane().add(panel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(61, 13, 216, 46);
		panel_1.add(btnNewButton);
		
		JButton btnForgetPassword = new JButton("Forget Password");
		btnForgetPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnForgetPassword.setBounds(313, 13, 216, 46);
		panel_1.add(btnForgetPassword);
	}
}
