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
import javax.swing.JTextField;

import java.sql.*;

public class NewData extends JFrame {

	private JPanel contentPane;
	private JTextField textIncidentDate;
	private JTextField textField;
	

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
		setBounds(100, 100, 537, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u05D4\u05DB\u05E0\u05E1\u05EA \u05DE\u05D9\u05D3\u05E2 \u05DE\u05EA\u05D7\u05E7\u05D9\u05E8 \u05D7\u05D3\u05E9");
		label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label.setBounds(168, 22, 208, 32);
		contentPane.add(label);
		
		JLabel label_IncidentDate = new JLabel("\u05EA\u05D0\u05E8\u05D9\u05DA \u05D4\u05D0\u05D9\u05E8\u05D5\u05E2 :");
		label_IncidentDate.setBounds(397, 67, 89, 14);
		contentPane.add(label_IncidentDate);
		
		JLabel JImage = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Atal.jpg")).getImage();
		JImage.setIcon(new ImageIcon(img));
		JImage.setBounds(10, 28, 148, 159);
		contentPane.add(JImage);
		
		JLabel label_InquiryDate = new JLabel("\u05EA\u05D0\u05E8\u05D9\u05DA \u05D4\u05EA\u05D7\u05E7\u05D9\u05E8 :");
		label_InquiryDate.setBounds(397, 97, 89, 19);
		contentPane.add(label_InquiryDate);
		
		textIncidentDate = new JTextField();
		textIncidentDate.setBounds(301, 65, 86, 20);
		contentPane.add(textIncidentDate);
		textIncidentDate.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(301, 96, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u05E9\u05DD \u05D4\u05D7\u05D9\u05D9\u05DC");
		lblNewLabel.setBounds(355, 179, 115, 14);
		contentPane.add(lblNewLabel);
	}
}
