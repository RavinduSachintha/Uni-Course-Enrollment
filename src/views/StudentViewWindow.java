package views;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class StudentViewWindow extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentViewWindow frame = new StudentViewWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentViewWindow() {
		setResizable(false);
		setBounds(100, 100, 844, 465);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
