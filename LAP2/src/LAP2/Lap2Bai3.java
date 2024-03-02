package LAP2;

import java.util.Scanner;

class Lap2Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   float soDien;
		    float tienDien;
		    
		    Scanner scanner = new Scanner(System.in);
		    System.out.print("Nhập số điện:");
		    soDien= scanner.nextFloat();
		    
		    if(soDien<=50)
		        tienDien = soDien*1000;
		    else
		        tienDien = 50*1000+(soDien-50)*1200;
		    System.out.printf("Tiền điện là: "+tienDien+" VNĐ");
	}

}
