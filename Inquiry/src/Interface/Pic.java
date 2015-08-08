package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Pic extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pic frame = new Pic();
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
	public Pic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/h.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(56, 102, 476, 527);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 240));
		panel.setBackground(new Color(0, 0, 205));
		panel.setBounds(189, 24, 231, 39);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u05DE\u05E6\u05D1 \u05E8\u05E4\u05D5\u05D0\u05D9");
		label.setForeground(new Color(230, 230, 250));
		label.setBounds(70, 11, 117, 21);
		panel.add(label);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u05D7\u05DC\u05DC", "\u05E4\u05E6\u05D5\u05E2 \u05E7\u05E9\u05D4", "\u05E4\u05E6\u05D5\u05E2 \u05D1\u05D9\u05E0\u05D5\u05E0\u05D9", "\u05E4\u05E6\u05D5\u05E2 \u05E7\u05DC", "\u05DC\u05D0 \u05E0\u05E4\u05D2\u05E2"}));
		comboBox.setBounds(240, 74, 89, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();

		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 248, 255));
		panel_2.setBounds(535, 94, 99, 90);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JRadioButton radioButton = new JRadioButton("\u05D4\u05D3\u05E3");
		radioButton.setBackground(new Color(240, 248, 255));
		radioButton.setBounds(40, 25, 57, 23);
		panel_2.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u05E8\u05E1\u05D9\u05E1\u05D9\u05DD");
		radioButton_1.setBackground(new Color(240, 255, 240));
		radioButton_1.setBounds(30, 47, 64, 23);
		panel_2.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\u05E7\u05DC\u05D9\u05E2\u05D9\u05DD");
		radioButton_2.setBackground(new Color(240, 248, 255));
		radioButton_2.setBounds(30, 67, 69, 23);
		panel_2.add(radioButton_2);
		
		
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(5, 67, 29, 20);
		panel_2.add(spinner_2);
		
		JButton button = new JButton("\u05E8\u05D0\u05E9");
		button.setBounds(5, 0, 89, 23);
		panel_2.add(button);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(5, 48, 29, 20);
		panel_2.add(spinner);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 255, 255));
		panel_3.setLayout(null);
		panel_3.setBounds(535, 195, 99, 90);
		contentPane.add(panel_3);
		
		JRadioButton radioButton_3 = new JRadioButton("\u05D4\u05D3\u05E3");
		radioButton_3.setBounds(40, 25, 57, 23);
		panel_3.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("\u05E8\u05E1\u05D9\u05E1\u05D9\u05DD");
		radioButton_4.setBounds(30, 47, 64, 23);
		panel_3.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("\u05E7\u05DC\u05D9\u05E2\u05D9\u05DD");
		radioButton_5.setBounds(30, 67, 69, 23);
		panel_3.add(radioButton_5);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(5, 67, 29, 20);
		panel_3.add(spinner_1);
		
		JButton button_1 = new JButton("\u05E6\u05D5\u05D5\u05D0\u05E8");
		button_1.setBounds(5, 0, 89, 23);
		panel_3.add(button_1);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(5, 48, 29, 20);
		panel_3.add(spinner_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 240));
		panel_1.setLayout(null);
		panel_1.setBounds(535, 296, 99, 90);
		contentPane.add(panel_1);
		
		JRadioButton radioButton_6 = new JRadioButton("\u05D4\u05D3\u05E3");
		radioButton_6.setBounds(40, 25, 57, 23);
		panel_1.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("\u05E8\u05E1\u05D9\u05E1\u05D9\u05DD");
		radioButton_7.setBounds(30, 47, 64, 23);
		panel_1.add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("\u05E7\u05DC\u05D9\u05E2\u05D9\u05DD");
		radioButton_8.setBounds(30, 67, 69, 23);
		panel_1.add(radioButton_8);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(5, 67, 29, 20);
		panel_1.add(spinner_4);
		
		JButton button_2 = new JButton("\u05D8\u05D5\u05E8\u05E1\u05D5");
		button_2.setBounds(5, 0, 89, 23);
		panel_1.add(button_2);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(5, 48, 29, 20);
		panel_1.add(spinner_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(240, 248, 255));
		panel_4.setLayout(null);
		panel_4.setBounds(535, 397, 99, 90);
		contentPane.add(panel_4);
		
		JRadioButton radioButton_9 = new JRadioButton("\u05D4\u05D3\u05E3");
		radioButton_9.setBounds(40, 25, 57, 23);
		panel_4.add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("\u05E8\u05E1\u05D9\u05E1\u05D9\u05DD");
		radioButton_10.setBounds(30, 47, 64, 23);
		panel_4.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("\u05E7\u05DC\u05D9\u05E2\u05D9\u05DD");
		radioButton_11.setBounds(30, 67, 69, 23);
		panel_4.add(radioButton_11);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(5, 67, 29, 20);
		panel_4.add(spinner_6);
		
		JButton button_3 = new JButton("\u05D0\u05D2\u05DF");
		button_3.setBounds(5, 0, 89, 23);
		panel_4.add(button_3);
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setBounds(5, 48, 29, 20);
		panel_4.add(spinner_7);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(240, 255, 255));
		panel_5.setLayout(null);
		panel_5.setBounds(535, 499, 99, 90);
		contentPane.add(panel_5);
		
		JRadioButton radioButton_12 = new JRadioButton("\u05D4\u05D3\u05E3");
		radioButton_12.setBounds(40, 25, 57, 23);
		panel_5.add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("\u05E8\u05E1\u05D9\u05E1\u05D9\u05DD");
		radioButton_13.setBounds(30, 47, 64, 23);
		panel_5.add(radioButton_13);
		
		JRadioButton radioButton_14 = new JRadioButton("\u05E7\u05DC\u05D9\u05E2\u05D9\u05DD");
		radioButton_14.setBounds(30, 67, 69, 23);
		panel_5.add(radioButton_14);
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setBounds(5, 67, 29, 20);
		panel_5.add(spinner_8);
		
		JButton button_4 = new JButton("\u05D2\u05E4\u05D9\u05D9\u05DD");
		button_4.setBounds(5, 0, 89, 23);
		panel_5.add(button_4);
		
		JSpinner spinner_9 = new JSpinner();
		spinner_9.setBounds(5, 48, 29, 20);
		panel_5.add(spinner_9);
		
		JButton button_5 = new JButton("\u05E9\u05DE\u05D5\u05E8");
		button_5.setBounds(292, 606, 89, 23);
		contentPane.add(button_5);
	}
}
