package conference_Up;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JButton;

public class Home_Page {

	private JFrame frmHomepage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_Page window = new Home_Page();
					window.frmHomepage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHomepage = new JFrame();
		frmHomepage.setTitle("Home_Page");
		frmHomepage.setBounds(100, 100, 877, 738);
		frmHomepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHomepage.getContentPane().setLayout(null);
		
		JLabel lblHomePage = new JLabel("Home Page");
		lblHomePage.setToolTipText("App title");
		lblHomePage.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomePage.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 38));
		lblHomePage.setBounds(130, 65, 577, 86);
		frmHomepage.getContentPane().add(lblHomePage);
		
		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(75, 177, 714, 374);
		frmHomepage.getContentPane().add(panel);
		
		JButton btnBookMeeting = new JButton("Book Meeting");
		btnBookMeeting.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnBookMeeting.setBounds(70, 42, 269, 60);
		panel.add(btnBookMeeting);
		
		JButton btnMeeting = new JButton("Edit Meeting");
		btnMeeting.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnMeeting.setBounds(386, 42, 263, 60);
		panel.add(btnMeeting);
		
		JButton btnDeleteMeeting = new JButton("Delete Meeting");
		btnDeleteMeeting.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnDeleteMeeting.setBounds(70, 152, 269, 63);
		panel.add(btnDeleteMeeting);
		
		JButton btnShowMeetings = new JButton("Show Meetings");
		btnShowMeetings.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnShowMeetings.setBounds(70, 265, 269, 63);
		panel.add(btnShowMeetings);
		
		JButton btnBookInformation = new JButton("Book Information");
		btnBookInformation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnBookInformation.setBounds(386, 151, 263, 64);
		panel.add(btnBookInformation);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnLogout.setBounds(380, 267, 269, 59);
		panel.add(btnLogout);
	}
}
