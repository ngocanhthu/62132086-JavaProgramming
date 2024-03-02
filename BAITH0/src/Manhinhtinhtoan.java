

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Manhinhtinhtoan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel textA;
	private JLabel textB;
	private JLabel textketqua;
	public Manhinhtinhtoan() {
		setTitle("Chương Trình Tính Toán ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textA = new JLabel("Nhập vào số thứ nhất (a)");
		textA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textA.setBounds(33, 90, 199, 26);
		contentPane.add(textA);
		
		JLabel textB = new JLabel("Nhập vào số thứ hai (b)");
		textB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textB.setBounds(33, 142, 199, 26);
		contentPane.add(textB);
		
		textField = new JTextField();
		textField.setBounds(226, 78, 159, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(226, 126, 159, 41);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(226, 319, 159, 37);
		contentPane.add(textField_2);
		
		JLabel textketqua = new JLabel("Kết Quả Tính Toán");
		textketqua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textketqua.setBounds(33, 319, 145, 26);
		contentPane.add(textketqua);
		
		JButton btnCong = new JButton("CỘNG ");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLiCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(33, 221, 85, 37);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuliTru();
				
				
			}

			private void HamXuliTru() {
				// TODO Auto-generated method stub
				
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(151, 221, 85, 37);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN ");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLiNhan();
				
			}

			private void HamXuLiNhan() {
				// TODO Auto-generated method stub
				
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(281, 221, 85, 37);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLiChia();
			}

			private void HamXuLiChia() {
				// TODO Auto-generated method stub
				
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(411, 221, 85, 37);
		contentPane.add(btnChia);
		
		
	}
		void HamXuLiCong () {
			String str_A =textA.getText();
			String str_B =textB.getText();
			double A = Double.parseDouble(str_A);
			double B= Double.parseDouble(str_B);
			Double Tong = A + B ;
			textketqua.setText(String.valueOf(Tong));
			
			
			
		}
		void HamXuLiTru() {
		    String str_A = textA.getText();
		    String str_B = textB.getText();
		    double A = Double.parseDouble(str_A);
		    double B = Double.parseDouble(str_B);
		    double Hieu = A - B;
		    textketqua.setText(String.valueOf(Hieu));
		}
		void HamHamXuLiNhan() {
		    String str_A = textA.getText();
		    String str_B = textB.getText();
		    double A = Double.parseDouble(str_A);
		    double B = Double.parseDouble(str_B);
		    double Tich = A * B;
		    textketqua.setText(String.valueOf(Tich));
		}
		void HamXuLyChia() {
		    String str_A = textA.getText();
		    String str_B = textB.getText();
		    double A = Double.parseDouble(str_A);
		    double B = Double.parseDouble(str_B);
		    double Thuong = A / B;
		    textketqua.setText(String.valueOf(Thuong));
		}
}
