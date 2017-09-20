package conference_Up;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Forget_Password {

	private JFrame frmPasswordretrieval;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Forget_Password window = new Forget_Password();
					window.frmPasswordretrieval.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Forget_Password() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPasswordretrieval = new JFrame();
		frmPasswordretrieval.setTitle("Password_Retrieval");
		frmPasswordretrieval.setBounds(100, 100, 731, 650);
		frmPasswordretrieval.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPasswordretrieval.getContentPane().setLayout(null);
		
		JLabel lblPasswordRetrieval = new JLabel("Password Retrieval");
		lblPasswordRetrieval.setToolTipText("App title");
		lblPasswordRetrieval.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasswordRetrieval.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 38));
		lblPasswordRetrieval.setBounds(146, 65, 416, 86);
		frmPasswordretrieval.getContentPane().add(lblPasswordRetrieval);
		
		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(71, 197, 589, 137);
		frmPasswordretrieval.getContentPane().add(panel);
		
		JLabel lblEmailAddress = new JLabel("E-mail Address");
		lblEmailAddress.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 30));
		lblEmailAddress.setBounds(42, 53, 240, 33);
		panel.add(lblEmailAddress);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(291, 55, 240, 33);
		panel.add(textField);
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(71, 374, 589, 72);
		frmPasswordretrieval.getContentPane().add(panel_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnSubmit.setBounds(198, 13, 216, 46);
		panel_1.add(btnSubmit);
	}

}
