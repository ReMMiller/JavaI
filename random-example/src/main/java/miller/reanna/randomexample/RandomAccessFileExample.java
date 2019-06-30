package miller.reanna.randomexample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

	private RandomAccessFile file = null;
	
//	public void writeToFile(String msg, int index) throws IOException {
//		initFile();
//		file.seek(index);
//		file.write(msg.getBytes());
//	}
	
	public void writeToFile(int data, int index) throws IOException {
		initFile();
		file.seek(index);
//		byte[] dataBuffer = new byte[4];
//		dataBuffer[0] = (byte)(data >> 24);//(00000000)stored 00000000 00000000 00000001 = 1
//		dataBuffer[1] = (byte)(data >> 16);//00000000 (00000000)stored 00000000 00000001 = 1
//		dataBuffer[2] = (byte)(data >> 8);//00000000 00000000 (00000000)stored 00000001 = 1
//		dataBuffer[3] = (byte)(data);//00000000 00000000 00000000 (00000001)stored = 1
//		file.write(dataBuffer);
		
		file.writeInt(data);
	}
	
	public int readFromFile(int offset) throws IOException {
		initFile();
		file.seek(offset);//goes to offset index in the file
//		byte[] buffer = new byte[4]; ///4 bytes = 1 int
//		file.read(buffer);
		
		int value = 0;
		
//		int resultOfShift = (buffer[0] << 24) ;
//		value = resultOfShift;
//		resultOfShift = (buffer[1] << 16);
//		value = value | resultOfShift;
//		resultOfShift = (buffer[2] << 8);
//		value = value | resultOfShift;
//		resultOfShift = (buffer[3]);
//		value = value | resultOfShift; // shorthand is (value |= resultofshift)
		
		value = file.readInt();
		return value;
	}
	
	private void initFile() throws FileNotFoundException {
		if(file == null) {
			file = new RandomAccessFile("random.rmm", "rw");
			//my initials as file type
		}
	}
}
