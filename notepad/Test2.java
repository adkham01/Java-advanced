import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A1 implements Serializable {
	int i = 10;
	String str1 = "ABC";
}
class B extends A1 {
	int j = 20;
	String str2 = "DEF";	
}
public class Test2 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("D:/Java workplaces/FileOutputStream/abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		B b = new B();
		oos.writeObject(b);
		System.out.println("Serialization Success!");
		fos.close();
		oos.close();
	}

}