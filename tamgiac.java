package chipi;
import java.util.Scanner;
public class tamgiac {
		public static void main (String[] args) {
			Scanner sc = new Scanner (System.in);
			int a ; //a : chieu cao 
			System.out.println("\n Nhap chieu cao tam giac :");
			a = sc.nextInt();
			for (int i = 1 ; i<=a ; ++i) {
				for (int j=1 ; j<=i; ++j) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();
		}
	}


