package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

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
		
	}
	
	private void HeaderPanel() {
		JPanel hPanel = new JPanel();
		hPanel.setBorder(new LineBorder(Color.GRAY, 5));
		hPanel.setPreferredSize(new Dimension(0,150));
		
		this.contentPane.add(hPanel, BorderLayout.NORTH);
	}

}
