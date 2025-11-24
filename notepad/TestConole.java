import java.io.*;
class TestConsole{
	public static void main(String[] args) throws Exception{
		Console c = System.console();
		String uname = c.readLine("User Name : ");
		char[] pwd c.readPassword("Password  : ")
		String upwd = new String(pwd);
		
		if(uname.equals(Adham) && upwd.equals(12345678)){
			System.out.println("Login Succes!");
		}
		else {
			System.out.println("Login Failed");
		}
	}
}