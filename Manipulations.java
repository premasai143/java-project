package bank;

public class Manipulations {
	static int bal1=465000,bal2=309600,bal3=201300,bal4=150000;
	
	public static int balance(int val) {
		if(val==1) 
			return bal1;
		else if(val==2)
			return bal2;
		else if(val==3)
			return bal3;
		else
			return bal4;
	}
	public static String enter(String str,char ch,int val) {
		switch(ch) {
		case 'W':{
			if(str.equals("\n\n\n\n\tHi Sreenivasulu")) {
				if(bal1-val >= 500)
					if(val>=0 && val <= 10000)
						if(val % 10 == 0)
							bal1=bal1-val;
						else {
							return ("Sorry only 10's,100's and 500's are available");
						}
					else {
						return ("Withdraw amount less than or equal to\n10,000");	
					}
				else {
					return ("Sorry your Account will reach overlimit");
				}	
				return ("\n\n   Withdrawl Amount  :\t"+val+"\n   Remaining Balance  :\t"+bal1+"\n =======================\t\n      please collect your cash");
			}
			else if(str.equals("\n\n\n\n\tHi Latha")) {
				if(bal2-val >= 500)
					if(val>=0 && val <= 10000)
						if(val % 10 == 0)
							bal2=bal2-val;
						else {
							return ("Sorry only 10's,100's and 500's are available");
						}
					else {
						return ("Withdraw amount less than or equal to\n10,000");
					}
				else {
					return ("Sorry your Account will reach overlimit");
				}
				return ("\n\n   Withdrawl Amount  :\t"+val+"\n   Remaining Balance  :\t"+bal2+"\n =======================\t\n      please collect your cash");
			}
			else if(str.equals("\n\n\n\n\tHi Kaushik")) {
				if(bal3-val >= 500)
					if(val>=0 && val <= 10000)
						if(val % 10 == 0)
							bal3=bal3-val;
						else {
							return ("Sorry only 10's,100's and 500's are available");
						}
					else {
						return ("Withdraw amount less than or equal to\n10,000");
					}
				else {
					return ("Sorry your Account will reach overlimit");
				}
				return ("\n\n   Withdrawl Amount  :\t"+val+"\n   Remaining Balance  :\t"+bal3+"\n =======================\t\n      please collect your cash");
			}
			else if(str.equals("\n\n\n\n\tHi Prema Sai")) {
				if(bal4-val >= 500)
					if(val>=0 && val <= 10000)
						if(val % 10 == 0)
							bal4=bal4-val;
						else {
							return ("Sorry only 10's,100's and 500's are available");
						}
					else {
						return ("Withdraw amount less than or equal to\n10,000");	
					}
				else {
					return ("Sorry your Account will reach overlimit");
				}
				return ("\n\n   Withdrawl Amount  :\t"+val+"\n   Remaining Balance  :\t"+bal4+"\n =======================\t\n      please collect your cash");
			}
			break;
		}
		case 'D':{
			if(str.equals("\n\n\n\n\tHi Sreenivasulu")) {
				bal1=465200+val;
			}
			else if(str.equals("\n\n\n\n\tHi Latha")) {
				bal2+=val;
			}
			else if(str.equals("\n\n\n\n\tHi Kaushik")) {
				bal3+=val;
			}
			else if(str.equals("\n\n\n\n\tHi Prema Sai")) {
				bal4+=val;
			}
			return ("\n\n\n\n         Amount deposited successful");
		}
		}
		return null;
	}
}