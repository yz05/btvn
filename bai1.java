package btvn;

import java.util.Scanner;

public class bai1 {
	public static boolean hamChan (int n ) {
		if (n == 0 ) {
		return true ; 
		}else if (n==1 ){
			return false ;
		}else {
			return hamLe (n-1);
		}
		}
	public static boolean hamLe (int n) {
		if (n==0) {
			return false ; 
		} else if (n==1) {
			return true;
		}
			else {
				return hamChan (n-1);
			}
	}
	public static void main (String[] args) {
		  System.out.println("hamChan(5) = " + hamChan(5)); // false
	}
	
	}
