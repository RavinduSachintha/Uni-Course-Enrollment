package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.GridLayout;

public class StudentRegistrationWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFname;
	private JTextField txtLname;
	private JTextField txtMname;
	private JTextField txtStdID;
	private JTextField txtNIC;
	private JTextField txtAddLine1;
	private JTextField txtAddLine2;
	private JTextField txtCity;
	private JTextField txtPemail;
	private JTextField txtUemail;
	private JTextField txtPhone;
	private JTextField txtGurName;
	private JTextField txtGurNIC;
	private JTextField txtGurPhone;

	/**
	 * Create the frame.
	 */
	public StudentRegistrationWindow() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 100, 500, 600);
		setResizable(false);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("STUDENT REGISTRATION");
		lblTitle.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblTitle.setOpaque(true);
		lblTitle.setBackground(SystemColor.activeCaption);
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 11, 474, 46);
		contentPane.add(lblTitle);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 68, 474, 446);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name ");
		lblNewLabel.setBounds(10, 42, 86, 20);
		panel.add(lblNewLabel);
		lblNewLabel.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		
		txtFname = new JTextField();
		txtFname.setBounds(106, 42, 120, 20);
		panel.add(txtFname);
		txtFname.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(10, 104, 86, 20);
		panel.add(lblLastName);
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLastName.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblLastName.setBackground(Color.LIGHT_GRAY);
		
		txtLname = new JTextField();
		txtLname.setBounds(106, 104, 120, 20);
		panel.add(txtLname);
		txtLname.setColumns(10);
		
		JLabel lblMiddleName = new JLabel("Middle Name");
		lblMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMiddleName.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblMiddleName.setBackground(Color.LIGHT_GRAY);
		lblMiddleName.setBounds(10, 73, 86, 20);
		panel.add(lblMiddleName);
		
		txtMname = new JTextField();
		txtMname.setColumns(10);
		txtMname.setBounds(106, 73, 120, 20);
		panel.add(txtMname);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStudentId.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblStudentId.setBackground(Color.LIGHT_GRAY);
		lblStudentId.setBounds(248, 42, 86, 20);
		panel.add(lblStudentId);
		
		txtStdID = new JTextField();
		txtStdID.setColumns(10);
		txtStdID.setBounds(344, 42, 120, 20);
		panel.add(txtStdID);
		
		JLabel lblNicNo = new JLabel("NIC No");
		lblNicNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNicNo.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblNicNo.setBackground(Color.LIGHT_GRAY);
		lblNicNo.setBounds(248, 73, 86, 20);
		panel.add(lblNicNo);
		
		txtNIC = new JTextField();
		txtNIC.setColumns(10);
		txtNIC.setBounds(344, 73, 120, 20);
		panel.add(txtNIC);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGender.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblGender.setBackground(Color.LIGHT_GRAY);
		lblGender.setBounds(10, 135, 86, 20);
		panel.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(106, 136, 59, 20);
		panel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(167, 136, 59, 20);
		panel.add(rdbtnFemale);
		
		JLabel lblAddressLine = new JLabel("Address Line 01");
		lblAddressLine.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddressLine.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblAddressLine.setBackground(Color.LIGHT_GRAY);
		lblAddressLine.setBounds(10, 166, 120, 20);
		panel.add(lblAddressLine);
		
		JLabel lblAddressLine_1 = new JLabel("Address Line 02");
		lblAddressLine_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddressLine_1.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblAddressLine_1.setBackground(Color.LIGHT_GRAY);
		lblAddressLine_1.setBounds(10, 197, 120, 20);
		panel.add(lblAddressLine_1);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCity.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblCity.setBackground(Color.LIGHT_GRAY);
		lblCity.setBounds(10, 228, 120, 20);
		panel.add(lblCity);
		
		txtAddLine1 = new JTextField();
		txtAddLine1.setColumns(10);
		txtAddLine1.setBounds(140, 166, 324, 20);
		panel.add(txtAddLine1);
		
		txtAddLine2 = new JTextField();
		txtAddLine2.setColumns(10);
		txtAddLine2.setBounds(140, 197, 324, 20);
		panel.add(txtAddLine2);
		
		txtCity = new JTextField();
		txtCity.setColumns(10);
		txtCity.setBounds(140, 228, 174, 20);
		panel.add(txtCity);
		
		JLabel lblPersonalEmail = new JLabel("Personal Email");
		lblPersonalEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPersonalEmail.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblPersonalEmail.setBackground(Color.LIGHT_GRAY);
		lblPersonalEmail.setBounds(10, 259, 120, 20);
		panel.add(lblPersonalEmail);
		
		JLabel lblUniversityEmail = new JLabel("University Email");
		lblUniversityEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUniversityEmail.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblUniversityEmail.setBackground(Color.LIGHT_GRAY);
		lblUniversityEmail.setBounds(10, 290, 120, 20);
		panel.add(lblUniversityEmail);
		
		JLabel lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhoneNo.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblPhoneNo.setBackground(Color.LIGHT_GRAY);
		lblPhoneNo.setBounds(10, 321, 120, 20);
		panel.add(lblPhoneNo);
		
		txtPemail = new JTextField();
		txtPemail.setColumns(10);
		txtPemail.setBounds(140, 259, 324, 20);
		panel.add(txtPemail);
		
		txtUemail = new JTextField();
		txtUemail.setColumns(10);
		txtUemail.setBounds(140, 290, 324, 20);
		panel.add(txtUemail);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(140, 321, 174, 20);
		panel.add(txtPhone);
		
		JLabel lblName = new JLabel("Full Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblName.setBackground(Color.LIGHT_GRAY);
		lblName.setBounds(10, 383, 86, 20);
		panel.add(lblName);
		
		txtGurName = new JTextField();
		txtGurName.setColumns(10);
		txtGurName.setBounds(106, 383, 358, 20);
		panel.add(txtGurName);
		
		JLabel label = new JLabel("NIC No");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBorder(new EmptyBorder(0, 5, 0, 0));
		label.setBackground(Color.LIGHT_GRAY);
		label.setBounds(10, 414, 86, 20);
		panel.add(label);
		
		txtGurNIC = new JTextField();
		txtGurNIC.setColumns(10);
		txtGurNIC.setBounds(106, 414, 120, 20);
		panel.add(txtGurNIC);
		
		JLabel lblPhoneNo_1 = new JLabel("Phone No");
		lblPhoneNo_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhoneNo_1.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblPhoneNo_1.setBackground(Color.LIGHT_GRAY);
		lblPhoneNo_1.setBounds(262, 414, 72, 20);
		panel.add(lblPhoneNo_1);
		
		txtGurPhone = new JTextField();
		txtGurPhone.setColumns(10);
		txtGurPhone.setBounds(344, 414, 120, 20);
		panel.add(txtGurPhone);
		
		JLabel lblParentGuardian = new JLabel("Parent / Guardian Details");
		lblParentGuardian.setHorizontalAlignment(SwingConstants.CENTER);
		lblParentGuardian.setOpaque(true);
		lblParentGuardian.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblParentGuardian.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblParentGuardian.setBackground(Color.LIGHT_GRAY);
		lblParentGuardian.setBounds(10, 352, 454, 20);
		panel.add(lblParentGuardian);
		
		JLabel lblStudentBasicDetails = new JLabel("Student Basic Details");
		lblStudentBasicDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentBasicDetails.setOpaque(true);
		lblStudentBasicDetails.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStudentBasicDetails.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblStudentBasicDetails.setBackground(Color.LIGHT_GRAY);
		lblStudentBasicDetails.setBounds(10, 11, 454, 20);
		panel.add(lblStudentBasicDetails);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 525, 474, 35);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnClear = new JButton("Clear");
		panel_1.add(btnClear);
		
		JButton btnRegister = new JButton("Register");
		panel_1.add(btnRegister);
	}
}
