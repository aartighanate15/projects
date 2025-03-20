package Cust_Uti_Logic;

import java.util.Scanner;

import Imp_Logic.IPayment;
import Obj_Cre_Logic.Payment_Mode;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Payment mode");
		String mode = sc.next();
		IPayment ip = Payment_Mode.payment(mode);
		if(ip!=null) {
			ip.doPayment();
		}
	}
}
