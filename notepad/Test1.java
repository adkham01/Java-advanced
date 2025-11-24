import java.io.*;

public class Test1{
	public static void main (String[] args) throws Exception{
		String fileName = args[0];
		FileInputStream fis = new FileInputStream(fileName);
		String data = "";
		int val = fis.read();
		while (val != -1)
		{
			data += (char)val;
			val = fis.read();
		}
		fis.close();
		System.out.println(data);
	}
}