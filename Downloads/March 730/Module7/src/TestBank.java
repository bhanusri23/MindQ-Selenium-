
public class TestBank {

	public static void main(String[] args) {
		//Bank obj = new Bank();//is not possible
		
		/*ICICIBank obj1 = new ICICIBank();
		obj1.login();
		obj1.balTF();
		obj1.login();
		
		HDFCBank obj2 = new HDFCBank();
		obj2.login();
		obj2.balTF();
		obj2.logOut();*/
		
		Bank obj=null;//interface reference
		
		String bankname = "icici";
		
		if (bankname.equalsIgnoreCase("icici"))
			obj = new ICICIBank();
		else if (bankname.equalsIgnoreCase("hdfc"))
			obj = new HDFCBank();
		else if (bankname.equalsIgnoreCase("sbi"))
			obj = new SBIBank();
		
		obj.login();
		obj.balTF();
		obj.logOut();
		
				
	}

}
