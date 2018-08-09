package APP;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.Map.Entry;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class AccountTesting {
	Service servtestclass = new Service();
	
	@Test	
	public void testAccount() {
		servtestclass.addAnItem("saadi","21", 7865);
		servtestclass.addAnItem("chris", "perrins", 5565);
		servtestclass.addAnItem("fozia", "khan", 2345);
		Assert.assertEquals(0, servtestclass.findfName());
		}
	
	
	@Test
	public void testRemove() {
		servtestclass.removeItem(0);
		assertEquals("account is not removed", null, servtestclass.getAccounts().get(0));
	}
	
	@Test
	public void testLastName() {
		servtestclass.addAnItem("saadi", "21", 7865);
		servtestclass.addAnItem("chris", "perrins", 5565);
		servtestclass.addAnItem("fozia", "khan", 2345);
		assertEquals("does not return last name", "21", servtestclass.getAccounts().get(0).getsName());
		assertEquals("does not return last name", "perrins", servtestclass.getAccounts().get(1).getsName());
		assertEquals("does not return last name", "khan", servtestclass.getAccounts().get(2).getsName());
	}
}
