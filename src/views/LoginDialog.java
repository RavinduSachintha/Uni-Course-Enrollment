package views;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

import controllers.LoginController;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class LoginDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	
	private LoginController loginController = new LoginController();

	/**
	 * Create the dialog.
	 */
	public LoginDialog() {
		
		setResizable(false);
		setBounds(700, 250, 365, 407);
		getContentPane().setLayout(new BorderLayout());
		
		contentPanel.setBackground(Color.GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblTitle = new JLabel("LOGIN");
		lblTitle.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblTitle.setOpaque(true);
		lblTitle.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		lblTitle.setBounds(10, 11, 338, 129);
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 76));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox<Object> cmbUser = new JComboBox<Object>();
		cmbUser.setModel(new DefaultComboBoxModel<Object>(
				new String[] {
						"Faculty of Engineering", 
						"Faculty of Computer Science", 
						"Faculty of Business Management"}));
		cmbUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmbUser.setBorder(new LineBorder(new Color(0, 0, 0)));
		cmbUser.setBounds(114, 175, 234, 28);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblUser.setOpaque(true);
		lblUser.setBackground(Color.LIGHT_GRAY);
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setBounds(10, 175, 94, 28);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblPassword.setOpaque(true);
		lblPassword.setBackground(Color.LIGHT_GRAY);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(10, 232, 94, 28);
		
		JButton btnLogin = new JButton("Log In");
		btnLogin.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogin.setBounds(54, 301, 103, 33);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(199, 301, 103, 33);
		
		JPasswordField pwdPassword = new JPasswordField(8);
		pwdPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pwdPassword.setMargin(new Insets(2, 10, 2, 2));
		pwdPassword.setBounds(114, 232, 234, 28);
		
		PlainDocument document = (PlainDocument)pwdPassword.getDocument();
		document.setDocumentFilter(new DocumentFilter() {
			@Override
			public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) 
					throws BadLocationException {
                String string = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                if (string.length() <= 8) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
		});
		
		// Event Handling
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = cmbUser.getSelectedItem().toString();
				int userIndex = cmbUser.getSelectedIndex();
				String password = new String(pwdPassword.getPassword());
				loginController.initaliseViewUser(user, password);
				try {
					loginController.initaliseDbUser(user);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				//System.out.println(loginController.validateUser());
				if(loginController.validateUser()) {
					MainWindow.setLoggedUser(userIndex+1);
					dispose();
				} else {
					JOptionPane.showMessageDialog(
							contentPanel, 
							"You have entered a wrong password\nTry again...", 
							"Wrong Password", 
							JOptionPane.ERROR_MESSAGE);
					pwdPassword.setText("");
				}
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pwdPassword.setText("");
				
			}
		});
		
		// Components Adding
		contentPanel.add(lblTitle);
		contentPanel.add(lblUser);
		contentPanel.add(cmbUser);
		contentPanel.add(lblPassword);
		contentPanel.add(pwdPassword);
		contentPanel.add(btnLogin);
		contentPanel.add(btnClear);
	}
	
	/**
	 * Launch the application.
	 */
	public void runLoginDialog() {
		try {
			LoginDialog dialog = new LoginDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
