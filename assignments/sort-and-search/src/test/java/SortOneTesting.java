import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class SortOneTesting {
	
	private static ArrayList<Double> list = new ArrayList<>();
	
	@Before
	public void initialize() {
		list.clear();
		
		list.add(5.3);
		list.add(12.0);
		list.add(9.26);
		list.add(3.1);
		list.add(24.35);
	}
	
	//////////////////////////////////////
	
	@Test
	public void sortOneTest_orderingD() {
		SortSearch.SortOne(list, "descending");
		assertEquals(new Double(24.35), list.get(0));
		//Expect to run
	}
	
	@Test(expected= OrderError.class)
	public void sortOneTest_invalidOrder() {
		SortSearch.SortOne(list, "crab");
		assertEquals(new Double(24.35), list.get(0));
		//Expect to run
	}
	
	@Test
	public void sortOneTest_orderingAs() {
		SortSearch.SortOne(list, "ascending");
		assertEquals(new Double(3.1), list.get(0));
		//Expect to run
	}
	
	////////////////////////////////////////////////////
	
	
	

}
