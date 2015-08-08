package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class Intro {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Intro window = new Intro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Intro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.setBounds(100, 100, 734, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(335, 38, 46, 14);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("\u05EA\u05D7\u05E7\u05D9\u05E8 \u05D7\u05D3\u05E9");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				NewData newdata = new NewData();
				newdata.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("New Times Roman", Font.BOLD, 25));
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(508, 112, 162, 291);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\u05D7\u05D9\u05E4\u05DF\u05E9 \u05EA\u05D7\u05E7\u05D9\u05E8\u05D9\u05DD");
		button.setBackground(new Color(189, 183, 107));
		button.setFont(new Font("New Times Roman", Font.BOLD, 25));
		button.setForeground(new Color(255, 255, 255));
		button.setBounds(275, 120, 199, 120);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u05E4\u05D9\u05DC\u05D5\u05D7 \u05E1\u05D8\u05D8\u05D9\u05E1\u05D8\u05D9");
		button_1.setBackground(new Color(222, 184, 135));
		button_1.setFont(new Font("New Times Roman", Font.BOLD, 25));
		button_1.setForeground(new Color(255, 255, 255));
		button_1.setBounds(275, 272, 199, 120);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\u05DE\u05D4\u05E2\u05D9\u05EA\u05D5\u05E0\u05D5\u05EA");
		button_2.setBackground(new Color(218, 165, 32));
		button_2.setFont(new Font("New Times Roman", Font.BOLD, 25));
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setBounds(44, 120, 199, 120);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("\u05EA\u05D5\u05DB\u05E0\u05EA \u05EA\u05D7\u05E7\u05D9\u05E8\u05D9\u05DD \u05DE\u05D3\u05D5\u05E8 \u05DE\u05D9\u05D2\u05D5\u05DF \u05D0\u05D9\u05E9\u05D9");
		button_3.setBackground(SystemColor.textHighlight);
		button_3.setFont(new Font("New Times Roman", Font.BOLD, 25));
		button_3.setForeground(new Color(255, 255, 255));
		button_3.setBounds(45, 38, 635, 39);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("\u05DE\u05D9\u05D3\u05E2 \u05E9\u05D9\u05DE\u05D5\u05E9\u05D9");
		button_4.setBackground(new Color(128, 128, 128));
		button_4.setFont(new Font("New Times Roman", Font.BOLD, 25));
		button_4.setForeground(new Color(255, 255, 255));
		button_4.setBounds(44, 272, 199, 120);
		frame.getContentPane().add(button_4);
	}
}
