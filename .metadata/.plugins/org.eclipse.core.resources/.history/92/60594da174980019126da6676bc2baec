import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class LinearTesting {
	
	private static ArrayList<Double> list = new ArrayList<>();
	private ArrayList<Double> list1 = new ArrayList<>();
	
	@Before
	public void initialize() {
		list.clear();
		
		list.add(5.3);
		list.add(12.0);
		list.add(9.26);
		list.add(3.1);
		list.add(24.35);
	}
	
	/////////////////////////////////////

	@Test
	public void searchLinTest1_easy(){
		assertEquals(2, SortSearch.LinearSearch(list, 9.26));
		//Expect to run
	}
	
	@Test
	public void searchLinTest2_empty(){
		assertEquals(-1, SortSearch.LinearSearch(list1, 9.2));
		//Expect to run
	}
	
	@Test
	public void searchLinTest_neg(){
		assertEquals(-1, SortSearch.LinearSearch(list, -6.0));
		//Expect to run
	}
	
	
	//////////////////////////////////////////////
	

	
}
