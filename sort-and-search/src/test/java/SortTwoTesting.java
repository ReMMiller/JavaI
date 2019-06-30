import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import miller.reanna.sortandsearch.OrderError;
import miller.reanna.sortandsearch.SortSearch;

public class SortTwoTesting {
	
	
	private static ArrayList<Double> list = new ArrayList<Double>();
	
	@Before
	public void initialize() {
		list.clear();
		
		list.add(5.3);
		list.add(12.0);
		list.add(9.26);
		list.add(3.1);
		list.add(24.35);
	}
	
	///////////////////////////////////////////
	
	@Test
	public void sortTwoTest_orderingD() {
		SortSearch.SortTwo(list, "descending");
		Assert.assertEquals(new Double(24.35), list.get(0));
		//Expect to run
	}
	
	@Test(expected= OrderError.class)
	public void sortTwoTest_invalidOrder() {
		SortSearch.SortTwo(list, "crab");
		Assert.assertEquals(new Double(24.35), list.get(0));
		//Expect to run
	}
	
	@Test
	public void sortTwoTest_orderingAs() {
		SortSearch.SortTwo(list, "ascending");
		Assert.assertEquals(new Double(3.1), list.get(0));
		//Expect to run
	}
	
	
	
	

}
