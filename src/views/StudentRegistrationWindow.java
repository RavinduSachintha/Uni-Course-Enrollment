package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.GridLayout;
import com.toedter.calendar.JDateChooser;

import controllers.StudentController;

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
	
	private StudentController studentController;
	private String stdID;
	private String nic;
	private String fname;
	private String mname;
	private String lname;
	private String gender;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String pemail;
	private String uemail;
	private String phone;

	/**
	 * Create the frame.
	 */
	public StudentRegistrationWindow() {
		
		studentController = new StudentController();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 100, 500, 600);
		setResizable(false);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		JLabel lblTitle = new JLabel("STUDENT REGISTRATION");
		lblTitle.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblTitle.setOpaque(true);
		lblTitle.setBackground(SystemColor.activeCaption);
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 11, 474, 46);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 68, 474, 446);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name ");
		lblNewLabel.setBounds(10, 42, 86, 20);
		lblNewLabel.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		
		txtFname = new JTextField();
		txtFname.setBounds(106, 42, 120, 20);
		txtFname.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(10, 104, 86, 20);
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLastName.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblLastName.setBackground(Color.LIGHT_GRAY);
		
		txtLname = new JTextField();
		txtLname.setBounds(106, 104, 120, 20);
		txtLname.setColumns(10);
		
		JLabel lblMiddleName = new JLabel("Middle Name");
		lblMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMiddleName.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblMiddleName.setBackground(Color.LIGHT_GRAY);
		lblMiddleName.setBounds(10, 73, 86, 20);
		
		txtMname = new JTextField();
		txtMname.setColumns(10);
		txtMname.setBounds(106, 73, 120, 20);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStudentId.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblStudentId.setBackground(Color.LIGHT_GRAY);
		lblStudentId.setBounds(248, 42, 86, 20);
		
		txtStdID = new JTextField();
		txtStdID.setColumns(10);
		txtStdID.setBounds(344, 42, 120, 20);
		
		JLabel lblNicNo = new JLabel("NIC No");
		lblNicNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNicNo.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblNicNo.setBackground(Color.LIGHT_GRAY);
		lblNicNo.setBounds(248, 73, 86, 20);		
		
		txtNIC = new JTextField();
		txtNIC.setColumns(10);
		txtNIC.setBounds(344, 73, 120, 20);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGender.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblGender.setBackground(Color.LIGHT_GRAY);
		lblGender.setBounds(10, 135, 86, 20);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(106, 136, 59, 20);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(167, 136, 59, 20);
		
		JLabel lblAddressLine = new JLabel("Address Line 01");
		lblAddressLine.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddressLine.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblAddressLine.setBackground(Color.LIGHT_GRAY);
		lblAddressLine.setBounds(10, 166, 120, 20);
		
		JLabel lblAddressLine_1 = new JLabel("Address Line 02");
		lblAddressLine_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddressLine_1.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblAddressLine_1.setBackground(Color.LIGHT_GRAY);
		lblAddressLine_1.setBounds(10, 197, 120, 20);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCity.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblCity.setBackground(Color.LIGHT_GRAY);
		lblCity.setBounds(10, 228, 120, 20);
		
		txtAddLine1 = new JTextField();
		txtAddLine1.setColumns(10);
		txtAddLine1.setBounds(140, 166, 324, 20);
		
		txtAddLine2 = new JTextField();
		txtAddLine2.setColumns(10);
		txtAddLine2.setBounds(140, 197, 324, 20);
		
		txtCity = new JTextField();
		txtCity.setColumns(10);
		txtCity.setBounds(140, 228, 174, 20);
		
		JLabel lblPersonalEmail = new JLabel("Personal Email");
		lblPersonalEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPersonalEmail.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblPersonalEmail.setBackground(Color.LIGHT_GRAY);
		lblPersonalEmail.setBounds(10, 259, 120, 20);
		
		JLabel lblUniversityEmail = new JLabel("University Email");
		lblUniversityEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUniversityEmail.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblUniversityEmail.setBackground(Color.LIGHT_GRAY);
		lblUniversityEmail.setBounds(10, 290, 120, 20);
		
		JLabel lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhoneNo.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblPhoneNo.setBackground(Color.LIGHT_GRAY);
		lblPhoneNo.setBounds(10, 321, 120, 20);
		
		txtPemail = new JTextField();
		txtPemail.setColumns(10);
		txtPemail.setBounds(140, 259, 324, 20);
		
		txtUemail = new JTextField();
		txtUemail.setColumns(10);
		txtUemail.setBounds(140, 290, 324, 20);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(140, 321, 174, 20);
		
		JLabel lblName = new JLabel("Full Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblName.setBackground(Color.LIGHT_GRAY);
		lblName.setBounds(10, 383, 86, 20);
		
		txtGurName = new JTextField();
		txtGurName.setColumns(10);
		txtGurName.setBounds(106, 383, 358, 20);
		
		JLabel label = new JLabel("NIC No");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBorder(new EmptyBorder(0, 5, 0, 0));
		label.setBackground(Color.LIGHT_GRAY);
		label.setBounds(10, 414, 86, 20);
		
		txtGurNIC = new JTextField();
		txtGurNIC.setColumns(10);
		txtGurNIC.setBounds(106, 414, 120, 20);
		
		JLabel lblPhoneNo_1 = new JLabel("Phone No");
		lblPhoneNo_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhoneNo_1.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblPhoneNo_1.setBackground(Color.LIGHT_GRAY);
		lblPhoneNo_1.setBounds(262, 414, 72, 20);
		
		txtGurPhone = new JTextField();
		txtGurPhone.setColumns(10);
		txtGurPhone.setBounds(344, 414, 120, 20);
		
		JLabel lblParentGuardian = new JLabel("Parent / Guardian Details");
		lblParentGuardian.setHorizontalAlignment(SwingConstants.CENTER);
		lblParentGuardian.setOpaque(true);
		lblParentGuardian.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblParentGuardian.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblParentGuardian.setBackground(Color.LIGHT_GRAY);
		lblParentGuardian.setBounds(10, 352, 454, 20);
		
		JLabel lblStudentBasicDetails = new JLabel("Student Basic Details");
		lblStudentBasicDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentBasicDetails.setOpaque(true);
		lblStudentBasicDetails.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStudentBasicDetails.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblStudentBasicDetails.setBackground(Color.LIGHT_GRAY);
		lblStudentBasicDetails.setBounds(10, 11, 454, 20);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(344, 104, 120, 20);
		
		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBirthday.setBorder(new EmptyBorder(0, 5, 0, 0));
		lblBirthday.setBackground(Color.LIGHT_GRAY);
		lblBirthday.setBounds(248, 104, 86, 20);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 525, 474, 35);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnClear = new JButton("Clear");
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/*
				stdID = txtStdID.getText();
				nic = txtNIC.getText();
				fname = txtFname.getText();
				mname = txtMname.getText();
				lname = txtLname.getText();
				gender = "m"; // ####
				addressLine1 = txtAddLine1.getText();
				addressLine2 = txtAddLine2.getText();
				city = txtCity.getText();
				pemail = txtPemail.getText();
				uemail = txtUemail.getText();
				phone = txtPhone.getText();
				
				studentController.initaliseViewStudent(stdID, nic, fname, mname, lname, gender, addressLine1, addressLine2, city, pemail, uemail, phone);
				try {
					studentController.registerStudent();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				*/
				
			}
		});
		
		
		// Components Adding
		panel.add(lblNewLabel);
		panel.add(txtFname);
		panel.add(lblLastName);
		panel.add(txtLname);
		panel.add(lblMiddleName);
		panel.add(txtMname);
		panel.add(lblStudentId);
		panel.add(txtStdID);
		panel.add(lblNicNo);
		panel.add(txtNIC);
		panel.add(lblGender);
		panel.add(rdbtnMale);
		panel.add(rdbtnFemale);
		panel.add(lblAddressLine);
		panel.add(lblAddressLine_1);
		panel.add(lblCity);
		panel.add(txtAddLine1);
		panel.add(txtAddLine2);
		panel.add(txtCity);
		panel.add(lblPersonalEmail);
		panel.add(lblUniversityEmail);
		panel.add(lblPhoneNo);
		panel.add(txtPemail);
		panel.add(txtUemail);
		panel.add(txtPhone);
		panel.add(lblName);
		panel.add(txtGurName);
		panel.add(label);
		panel.add(txtGurNIC);
		panel.add(lblPhoneNo_1);
		panel.add(txtGurPhone);
		panel.add(lblParentGuardian);
		panel.add(lblStudentBasicDetails);
		panel.add(dateChooser);
		panel.add(dateChooser);
		panel_1.add(btnClear);
		panel_1.add(btnRegister);
		contentPane.add(lblTitle);
		contentPane.add(panel);
		contentPane.add(panel_1);
		
	}
}
