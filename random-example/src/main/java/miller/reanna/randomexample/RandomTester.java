package miller.reanna.randomexample;

import java.io.IOException;

public class RandomTester {

	public static void main(String[] args) throws IOException {
		//new RandomAccessFileExample().writeToFile("Hello fuckers", 4);
		RandomAccessFileExample file = new RandomAccessFileExample();
		file.writeToFile(255, 4);
		
		int value = file.readFromFile(4);
		System.out.println(value);

	}

}
