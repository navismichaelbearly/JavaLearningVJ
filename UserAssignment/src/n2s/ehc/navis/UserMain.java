package n2s.ehc.navis;

import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class UserMain {
	public static Scanner scn = new Scanner(System.in);
	public static UserBean ub = new UserBean();
	//public static boolean done = false;
	public Hashtable<Integer, UserBean> ht = new Hashtable<Integer, UserBean>();
	//public static UserMain um = new UserMain();
	
	public static void main(String[] args) {
		//userOptions();
	}
	
	public static void userOptions() {
		int error = 0;
		System.out.println("Choose the below option");
		System.out.println("1 - Insert");
		System.out.println("2 - Update");
		System.out.println("3 - Delete");
		System.out.println("4 - View");
		System.out.println("5 - Exit");
		try {
			ub.setOptionValue(scn.nextInt());
		}
		catch(InputMismatchException ime) {
			ime.printStackTrace();
			error = 1;
			//ub.setOptionValue(0);
		}
		
		if(error == 1) {
			//userOptions();
			System.out.println("error enabled");
		}
		else {
			System.out.println(ub.getOptionValue());
		}
	}
	
	private static void inputMain() {
		
		
			System.out.println("Choose the below option");
			System.out.println("1 - Insert");
			System.out.println("2 - Update");
			System.out.println("3 - Delete");
			System.out.println("4 - View");
			System.out.println("5 - Exit");
//		     if(scn.hasNextInt()) {
//		    	// try {
//		    		 	System.out.println("test");
//		    		 	//um.inputEntry(scn.nextInt());
//				////	} catch (InvalidEntry e) {
//						//System.out.println(e.getMessage());
//				//	}
//		     }
//		     else {
//		    	 System.out.println("please enter an integer value");
//		    	 inputMain();
//		     }
			ub.setOptionValue(scn.nextInt());
		//}
		
	}
	/*
	private void inputEntry(int scanInput) throws InvalidEntry, InvalidUserId {
		switch(scanInput) {
			case 1:
				um.insertEntry();
				done = true;
			break;
			case 2:
				ub.setOptionValue(2);
				System.out.println("Option 2 is selected");
				done = true;
			break;
			case 3:
				ub.setOptionValue(3);
				System.out.println("Option 3 is selected");
				done = true;
			break;
			case 4:
				ub.setOptionValue(4);
				System.out.println("Option 4 is selected");
				done = true;
			break;
			case 5:
				ub.setOptionValue(5);
				scn.close();
				System.out.println("Execution is done");
				done = true;
				System.exit(0);
				
			break;
			default:
				throw new InvalidEntry("Invalid Option Selected");
		}
	}
	
	public void insertEntry()  {
		System.out.println("Enter UserId");
		boolean userIdToggle = false;
		boolean userNameToggle = false;
		UserBean ub = new UserBean();
		int insertId = 0;
		String insertName = null;
		
		do {
			if(scn.hasNextInt()) {
				insertId = scn.nextInt();
				if(!um.insertValidate(insertId)) {
					userIdToggle = true;
					//throw new InvalidUserId("User Id already exist. Try different");
				}
			}
			else {
		    	 System.out.println("please enter an integer value");
		    	 continue;
		     }
		 }
		 while(!userIdToggle);
		 do {
			System.out.println("Enter Name");
			if(scn.hasNext()) {
				insertName = scn.next();
				userNameToggle = true;
			}
			else {
		    	 System.out.println("please enter string value");
		    	 continue;
		     }
		}
		while(!userNameToggle);
		ub.setOptionValue(1);
		ub.setUserId(insertId);
		ub.setUserName(insertName);
		ht.put(ub.getUserId(), ub);
		for(Map.Entry<Integer, UserBean> me: ht.entrySet() ) {
			System.out.println(me.getKey() + " " + me.toString());
		}
	}
	
	public boolean insertValidate(int inputValue)  {
		return ht.containsKey(inputValue);
	}
	*/
}
