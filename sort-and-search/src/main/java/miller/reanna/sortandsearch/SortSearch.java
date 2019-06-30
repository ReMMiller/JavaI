package miller.reanna.sortandsearch;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortSearch {

	public static ArrayList<Double> SortOne(ArrayList<Double> arr, String ord) {

		Collections.sort(arr);
		if (ord == "ascending" || ord == "a" || ord == "asc") {
			Collections.sort(arr);
		} else if (ord == "descending" || ord == "d" || ord == "desc") {
			Collections.sort(arr, Collections.reverseOrder());
		} else {
			throw new OrderError("Invalid value entered for sorting order. (ascending/asc/a /// descending/desc/d)");
		}

		return arr;

	}

	public static ArrayList<Double> SortTwo(ArrayList<Double> arr, String ord) {
		
		int n = arr.size();
		
		
		if(ord == "ascending" || ord == "a" || ord == "asc") {
			for (int i = 0; i < n-1; i++)
            	for (int j = 0; j < n-i-1; j++)
                	if (arr.get(j) > arr.get(j+1)){
                    	double temp = arr.get(j);
                    	arr.set(j, arr.get(j+1));
                    	arr.set(j+1, temp);
                	}else {}
                    	
                }else if(ord == "descending" || ord == "d" || ord == "desc") {
                	
                	int a = arr.size();
            		double temp = 0;
            		
            		for(int i=0; i < a; i++){
            			for(int j=1; j < (a-i); j++){
            				
            				if(arr.get(j-1) < arr.get(j)){
            					temp = arr.get(j-1);
            					arr.set(j-1, arr.get(j));
            					arr.set(j, temp);
            				}else {}
            				
            			}
            		}
                	
                }else{
		throw new OrderError("Invalid value entered for sorting order. (ascending/asc/a /// descending/desc/d)");
	}

	return arr;

	}

	public static int LinearSearch(ArrayList<Double> arr, double value) {
		
		int x = -1;
		
		for (int i = 0; i < arr.size(); i++)
        {
            if ((arr.get(i)) == value) {
                x = i;
            }else if(i > arr.size()) {
            	x = -1;
            }
            
        }
  
		return x;
		
	}

	public static int BinarySearch(List list, double value) {

		int l = 0, r = list.size() - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			if (Double.parseDouble((String) list.get(m)) == value)
				return m;

			if (Integer.parseInt((String) list.get(m)) < value)
				l = m + 1;

			else
				r = m - 1;
		}

		return -1;

	}

}
