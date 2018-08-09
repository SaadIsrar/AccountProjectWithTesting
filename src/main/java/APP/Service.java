package APP;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Service {
	private HashMap<Integer, Account> accountsMap = new HashMap<>();
	private int nextID = 0;
	
	public void addAnItem(String fnam,String lnam, int acc) {
		Account accountObject = new Account(fnam, lnam, acc);
		accountsMap.put(nextID, accountObject);
		nextID++;
	}
	public void removeItem(int removeID) {
		accountsMap.remove(removeID);
	}
	public HashMap<Integer, Account> getAccounts(){
		return accountsMap;	
	}
	
	public int findfName() {
	int count = 0;
	Iterator<Entry<Integer, Account>> it= accountsMap.entrySet().iterator();
	while (it.hasNext()) {
	Entry<Integer, Account> entry = it.next();
	System.out.println(entry.getValue().getfName());
	String name = "saadi";
	if (name == entry.getValue().getfName()) {
	count++;
	}
	}
	return count;
	}
	}
