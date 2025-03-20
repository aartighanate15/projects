package Obj_Cre_Logic;

import Imp_Logic.CreditCard;
import Imp_Logic.DebitCard;
import Imp_Logic.IPayment;
import Imp_Logic.UPI;

public class Payment_Mode {
	public static IPayment payment(String in) {
		if(in.equalsIgnoreCase("UPI")) {
			return new UPI();
		}
		else if(in.equalsIgnoreCase("CreditCard")) {
			return new CreditCard();
		}
		else if(in.equalsIgnoreCase("DebitCard")) {
			return new DebitCard();
		}
		else {
			System.out.println("No such payment Available");
			return null;
		}
	}
		
	
}
