package LAP2;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Lab2Bai1 {

	private static NumberFormat decimalFormat;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nghiem ; 
		DecimalFormat decomalFormat = new DecimalFormat("#.##");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số a:");
		int a = scanner.nextInt();
		System.out.println("Nhạp vào số b:");
		int b = scanner.nextInt();
		System.out.println("Phương trình bạn vừa nhập vào là:"+ a + "x + " + b + " = 0.");
		 if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình này có vô số nghiệm.");
	            } else {
	                System.out.println("Phương trình vô nghiệm.");
	            }
	        } else {
	            nghiem = (double) -b / a;
	            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
	}

	}
}
