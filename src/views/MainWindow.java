package views;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import views.components.ImagePanel;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int panelSpace = 20;
	private final Color windowBackground = new Color(100,100,100);
	
	private JPanel contentPane;
	
	/* 
	 * -1 -> no one logged
	 *  1 -> faculty of Engineering logged
	 *  2 -> faculty of Computer Science logged
	 *  3 -> faculty of Business Management logged
	 */
	private static int loggedUser = -1;
	
	public static int getLoggedUser() {
		return loggedUser;
	}

	public static void setLoggedUser(int loggedUser) {
		MainWindow.loggedUser = loggedUser;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
					frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
					
					if(loggedUser == -1) {
						LoginDialog dialog = new LoginDialog();
						dialog.runLoginDialog();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(this.panelSpace, this.panelSpace, this.panelSpace, this.panelSpace));
		contentPane.setLayout(new BorderLayout(this.panelSpace, this.panelSpace));
		contentPane.setBackground(this.windowBackground);
		setContentPane(contentPane);
		
		HeaderPanel();
		NavigationPanel();
		MainPanel();
	}
	
	private void HeaderPanel() {
		JPanel hPanel = new JPanel();
		hPanel.setBorder(new LineBorder(Color.GRAY, 5));
		hPanel.setPreferredSize(new Dimension(0,150));
		hPanel.setLayout(new BoxLayout(hPanel, BoxLayout.X_AXIS));
		
		{
			ImagePanel TitlePanel = new ImagePanel(
					new ImageIcon("assets/TitleImg.jpg").getImage());
			hPanel.add(TitlePanel);
		}
		{
			ImagePanel LogoPanel = new ImagePanel(
					new ImageIcon("assets/LogoImg.jpg").getImage());
			LogoPanel.setPreferredSize(new Dimension(0,0));
			LogoPanel.setBorder(new MatteBorder(0,5,0,0,Color.GRAY));
			hPanel.add(LogoPanel);
		}
		
		this.contentPane.add(hPanel, BorderLayout.NORTH);
	}
	
	private void NavigationPanel() {
			JPanel panel = new JPanel();
			panel.setPreferredSize(new Dimension(400,0));
			panel.setBorder(new CompoundBorder(
					new LineBorder(Color.GRAY, 5),
					new EmptyBorder(5,5,5,5)));
			panel.setLayout(new GridLayout(4, 2, 5, 5));
			
			{
				JButton btnStudents = new JButton("Student Details");
				btnStudents.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						StudentRegistrationWindow studentReg = new StudentRegistrationWindow();
						studentReg.setVisible(true);
					}
				});
				panel.add(btnStudents);
			}
			{
				JButton btnNewButton_2 = new JButton("New button");
				panel.add(btnNewButton_2);
			}
			{
				JButton btnNewButton_4 = new JButton("New button");
				panel.add(btnNewButton_4);
			}
			{
				JButton btnNewButton_5 = new JButton("New button");
				panel.add(btnNewButton_5);
			}
			{
				JButton btnNewButton_3 = new JButton("New button");
				panel.add(btnNewButton_3);
			}
			{
				JButton btnNewButton_1 = new JButton("New button");
				panel.add(btnNewButton_1);
			}
			{
				JButton btnNewButton_6 = new JButton("New button");
				panel.add(btnNewButton_6);
			}
			{
				JButton btnNewButton_7 = new JButton("New button");
				panel.add(btnNewButton_7);
			}
			
			this.contentPane.add(panel, BorderLayout.WEST);
	}
	
	private void MainPanel() {
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.GRAY, 5));
		panel.setLayout(new BorderLayout(0, 0));
		
		{
			JLabel lblLoggedUser = new JLabel("No one Logged");
			/*
			switch(MainWindow.loggedUser) {
			case -1:
				lblLoggedUser.setText("No one Logged");
				break;
			case 1:
				lblLoggedUser.setText("Faculty of Engineering Logged");
				break;
			case 2:
				lblLoggedUser.setText("Faculty of Computer Science Logged");
				break;
			case 3:
				lblLoggedUser.setText("Faculty of Business Management Logged");
				break;
			}
			*/
			lblLoggedUser.setBorder(new EmptyBorder(0, 0, 0, 20));
			lblLoggedUser.setPreferredSize(new Dimension(72, 40));
			lblLoggedUser.setOpaque(true);
			lblLoggedUser.setBackground(new Color(210, 180, 140));
			lblLoggedUser.setHorizontalAlignment(SwingConstants.RIGHT);
			lblLoggedUser.setFont(new Font("Tahoma", Font.ITALIC, 20));
			panel.add(lblLoggedUser, BorderLayout.NORTH);
		}
		
		{
			JPanel cardPanel = new JPanel();
			cardPanel.setBorder(new EmptyBorder(5,5,5,5));
			cardPanel.setLayout(new CardLayout());
			
			panel.add(cardPanel,BorderLayout.CENTER);
		}
		
		this.contentPane.add(panel, BorderLayout.CENTER);
	}
}
