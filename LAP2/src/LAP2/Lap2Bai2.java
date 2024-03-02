package LAP2;

import java.util.Scanner;

public class Lap2Bai2 {



	private static Object Scanner;
	private static java.util.Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double a,b,c,x1,x2, delta ; 
      Scanner = scanner = new Scanner (System.in);
      do 
      {
    	  System.out.print("Nhập a :");
    	  a = scanner.nextDouble();
    	  
      }
      while (a == 0);
      System.out.print("Nhập b: ");
      b = scanner.nextDouble();
      System.out.print("Nhập c: ");
      c = scanner.nextDouble();
      delta = Math.pow(b, 2) - 4 * a * c;
      if (delta < 0) {
          System.out.println("Phương trình vô nghiệm!");
      } else if (delta == 0) {
          x1 = -b/(2*a);
          System.out.println("Phương trinh có nghiệm kép là x1 = x2 = "+x1);
      } else {
          x1 = (-b + Math.sqrt(delta)) / (2 * a);
          x2 = (-b - Math.sqrt(delta)) / (2 * a);
          System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2);
      
	}

	}
}
