package views;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import java.awt.Insets;

public class LoginDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LoginDialog dialog = new LoginDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LoginDialog() {
		setBounds(100, 100, 374, 407);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblTitle = new JLabel("LOGIN");
			lblTitle.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			lblTitle.setOpaque(true);
			lblTitle.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
			lblTitle.setBounds(10, 11, 338, 129);
			lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 76));
			lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
			contentPanel.add(lblTitle);
		}
		
		JComboBox<Object> cmbUser = new JComboBox<Object>();
		cmbUser.setModel(new DefaultComboBoxModel<Object>(new String[] {"Faculty of Engineering", "Faculty of Computer Science", "Faculty of Business Management"}));
		cmbUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmbUser.setBorder(new LineBorder(new Color(0, 0, 0)));
		cmbUser.setBounds(114, 175, 234, 28);
		contentPanel.add(cmbUser);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblUser.setOpaque(true);
		lblUser.setBackground(Color.LIGHT_GRAY);
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setBounds(10, 175, 94, 28);
		contentPanel.add(lblUser);
		{
			JLabel lblPassword = new JLabel("Password");
			lblPassword.setBorder(new LineBorder(new Color(0, 0, 0)));
			lblPassword.setOpaque(true);
			lblPassword.setBackground(Color.LIGHT_GRAY);
			lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
			lblPassword.setBounds(10, 232, 94, 28);
			contentPanel.add(lblPassword);
		}
		
		JButton btnLogin = new JButton("Log In");
		btnLogin.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogin.setBounds(54, 301, 103, 33);
		contentPanel.add(btnLogin);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(199, 301, 103, 33);
		contentPanel.add(btnClear);
		
		pwdPassword = new JPasswordField(8);
		pwdPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pwdPassword.setMargin(new Insets(2, 10, 2, 2));
		pwdPassword.setBounds(114, 232, 234, 28);
		PlainDocument document = (PlainDocument)pwdPassword.getDocument();
		document.setDocumentFilter(new DocumentFilter() {
			@Override
			public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String string = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;

                if (string.length() <= 8) {
                    super.replace(fb, offset, length, text, attrs); //To change body of generated methods, choose Tools | Templates.
                }
            }
		});
		contentPanel.add(pwdPassword);
	}
}
