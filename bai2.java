package btvn;

import java.util.Scanner;

public class bai2 {
	
	 public static double tinhS(int n){
	        if(n<=0)
	            return 0;
	        return Math.pow(-1,(n+1))*n + tinhS(n-1);
	    }

	    public static int tong(int n){
	        if (n<1){
	            return n;
	        }
	        return n+ tong(n-1);
	    }
	    public static void main(String[] args) {
	    	int n ; int S = 0 ; 
	    	Scanner sc = new Scanner (System.in);
	    	do {
	            System.out.println("Mời bạn nhập vào số n: ");
	            n = sc.nextInt();
	        } while (n < 1);
	        System.out.println(tong(n));
	    }
}
//	 public static void main(String[] args) {
//	        int n, S = 0;
//	 	   Scanner sc = new Scanner(System.in);
//	        // n còn nhỏ hơn 1 thì còn nhập lại
//	        do {
//	            System.out.println("Mời bạn nhập vào số n: ");
//	            n = sc.nextInt();
//	        } while (n < 1);
//	        for (int i = 1; i <= n; i++) {
//	            // Kiểm tra nếu số i là số chẵn thì thực hiện phép trừ
//	            if (i % 2 == 0) {
//	                S -= i;    
//	            } else {
//	                // Ngược lại nếu số i là số lẻ thì thực hiện phép cộng
//	               S += i;   
//	            }
//	        }
//	         
//	        System.out.println("Kết quả = " + result);
//	    }
//	 
//	}
//
