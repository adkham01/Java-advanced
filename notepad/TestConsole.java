import java.io.*;
class TestConsole{
	public static void main(String[] args) throws Exception{
		Console c = System.console();
		String uname = c.readLine("User Name : ");
	}
}