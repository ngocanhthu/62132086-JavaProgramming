package NAT;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texTenDangNhap;
	private JTextField textMatKhau;
	private Object textTenDangNhap;

	public LoginFrame() {
		setTitle("Đăng Nhập Hệ Thống Quản Lý Bán Hàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDangNhap = new JLabel("Đăng Nhập");
		lblDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDangNhap.setBounds(77, 51, 118, 52);
		contentPane.add(lblDangNhap);
		
		JLabel lblMatKhau = new JLabel("Mật Khẩu");
		lblMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMatKhau.setBounds(77, 136, 118, 52);
		contentPane.add(lblMatKhau);
		
		texTenDangNhap = new JTextField();
		texTenDangNhap.setBounds(229, 70, 170, 33);
		contentPane.add(texTenDangNhap);
		texTenDangNhap.setColumns(10);
		
		textMatKhau = new JTextField();
		textMatKhau.setColumns(10);
		textMatKhau.setBounds(229, 148, 170, 33);
		contentPane.add(textMatKhau);
		
		JButton btnDangNhap = new JButton("Đăng Nhập");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
				
			}
		});
		btnDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDangNhap.setBounds(213, 217, 146, 39);
		contentPane.add(btnDangNhap);
	}
	void XuLyDangNhap() {
		String str_Ten = texTenDangNhap.getText();
		String str_MatKhau = textMatKhau.getText();
		 
		
		if  (str_Ten.equals("63CNTT") && str_MatKhau.equals("123"))
		{
			HomeFrame homePage =new HomeFrame();
			homePage.setVisible(true);
			this.setVisible(false);
		}
		else { 
		
		texTenDangNhap.setText("");
		textMatKhau.setText("");
	
		JOptionPane hopThoai  = new JOptionPane();
		hopThoai.showMessageDialog (this,"Đăng nhập thất bại");
		
	}
	}

}
