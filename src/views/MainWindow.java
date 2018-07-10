package views;

import java.awt.BorderLayout;
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

public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int panelSpace = 20;
	private final Color windowBackground = new Color(100,100,100);
	
	private JPanel contentPane;

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
		this.contentPane.add(hPanel, BorderLayout.NORTH);
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
	}
	
	private void NavigationPanel() {
			JPanel panel = new JPanel();
			panel.setPreferredSize(new Dimension(400,0));
			panel.setBorder(new CompoundBorder(
					new LineBorder(Color.GRAY, 5),
					new EmptyBorder(5,5,5,5)));
			contentPane.add(panel, BorderLayout.WEST);
			panel.setLayout(new GridLayout(4, 2, 5, 5));
			
			{
				JButton btnNewButton = new JButton("New button");
				panel.add(btnNewButton);
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
	}
	
	private void MainPanel() {
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.GRAY, 5));
		contentPane.add(panel, BorderLayout.CENTER);
		
	}
}
