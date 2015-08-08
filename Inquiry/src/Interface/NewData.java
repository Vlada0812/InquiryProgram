package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class NewData extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewData frame = new NewData();
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
	public NewData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 703, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelContect = new JPanel();
		panelContect.setBounds(10, 42, 567, 77);
		contentPane.add(panelContect);
		panelContect.setLayout(null);
		
		JLabel label = new JLabel("\u05E9\u05DD \u05E4\u05E8\u05D8\u05D9 :");
		label.setBounds(492, 11, 65, 14);
		panelContect.add(label);
		
		textField = new JTextField();
		textField.setBounds(396, 8, 86, 20);
		panelContect.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u05E9\u05DD \u05DE\u05E9\u05E4\u05D7\u05D4 :");
		label_1.setBounds(291, 11, 78, 14);
		panelContect.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(195, 8, 86, 20);
		panelContect.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(195, 39, 86, 20);
		panelContect.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(396, 39, 86, 20);
		panelContect.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_2 = new JLabel("\u05EA\u05E4\u05E7\u05D9\u05D3 :");
		label_2.setBounds(113, 11, 46, 14);
		panelContect.add(label_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(17, 8, 86, 20);
		panelContect.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_3 = new JLabel("\u05D8\u05DC\u05E4\u05D5\u05DF :");
		label_3.setBounds(502, 42, 46, 14);
		panelContect.add(label_3);
		
		JLabel label_4 = new JLabel("\u05E0\u05D9\u05D9\u05D3 :");
		label_4.setBounds(301, 42, 46, 14);
		panelContect.add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(17, 39, 86, 20);
		panelContect.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_5 = new JLabel("\u05D9\u05D7\u05D9\u05D3\u05D4 :");
		label_5.setBounds(113, 42, 46, 14);
		panelContect.add(label_5);
		
		JButton button = new JButton("\u05DE\u05E6\u05D1 \u05E8\u05E4\u05D5\u05D0\u05D9");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Pic pic = new Pic();
				pic.setVisible(true);
			}
		});
		button.setBounds(319, 168, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u05E6\u05D9\u05D5\u05D3 \u05DE\u05D9\u05D2\u05D5\u05DF");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Equipment equipment = new Equipment();
				equipment.setVisible(true);
			}
		});
		button_1.setBounds(188, 168, 89, 23);
		contentPane.add(button_1);
		
	}
}
