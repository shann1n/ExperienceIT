import java.io.*;
import java.io.FileOutputStream;

public class ByteWriter {
	public static void main (String[] args) {
		int[] data = { 71, 73, 50, 56, 57, 97, 13, 0, 12, 0, 145, 0};
		try(FileOutputStream file = new FileOutputStream("/Users/Shannon/Desktop/greg@gslaidlaw.com - icons/save.gif")) {
			for (int i=0; i < data.length; i++) {
				file.write(data[i]);
			}
			file.close();
		}catch (IOException e) {
			System.out.println("Error -- " + e.toString());
			}
		}
	}
