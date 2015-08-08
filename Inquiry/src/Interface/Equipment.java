package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Equipment extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Equipment frame = new Equipment();
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
	public Equipment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(128, 23, 243, 47);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u05E6\u05D9\u05D5\u05D3 \u05E7\u05E8\u05D1 \u05D0\u05D9\u05E9\u05D9");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(58, 11, 138, 25);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(264, 92, 254, 135);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_1 = new JLabel("1. \u05E1\u05DE\u05DF \u05D0\u05EA \u05D4\u05E6\u05D9\u05D5\u05D3 \u05E9\u05D4\u05D9\u05D4 \u05E2\u05DC \u05D4\u05D7\u05D9\u05D9\u05DC \u05D1\u05E2\u05EA \u05D4\u05D0\u05D9\u05E8\u05D5\u05E2");
		label_1.setBounds(10, 11, 234, 14);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("2. \u05D1\u05D7\u05E8 \u05D0\u05EA \u05E1\u05D5\u05D2 \u05D4\u05E6\u05D9\u05D5\u05D3 ");
		label_2.setBounds(130, 36, 124, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("3. \u05E1\u05DE\u05DF \u05D0\u05DD \u05D4\u05E6\u05D9\u05D5\u05D3 \u05E0\u05E4\u05D2\u05E2 ");
		label_3.setBounds(126, 61, 124, 14);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("4. \u05D1\u05D7\u05E8 \u05D0\u05EA \u05E1\u05D5\u05D2 \u05D4\u05D0\u05D9\u05D5\u05DD");
		label_4.setBounds(129, 86, 138, 14);
		panel_1.add(label_4);
		
		JLabel lblNewLabel = new JLabel("5. \u05E1\u05DE\u05DF \u05D0\u05DD \u05D4\u05D9\u05D9\u05EA\u05D4 \u05D7\u05D3\u05D9\u05E8\u05D4");
		lblNewLabel.setBounds(116, 110, 138, 14);
		panel_1.add(lblNewLabel);
	}
}
