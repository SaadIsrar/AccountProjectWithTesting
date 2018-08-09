package APP;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Service serviceObj = new Service();
		ApplicationProjectJSON jj = new ApplicationProjectJSON();
		
		serviceObj.addAnItem("saad", "israr", 786 );
		serviceObj.getAccounts();
		
		System.out.println(serviceObj.getAccounts().get(0).toString());
		serviceObj.getAccounts().get(0).setAccountNumber(7866);
		System.out.println(serviceObj.getAccounts().get(0).toString());
		try {
			jj.run();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
