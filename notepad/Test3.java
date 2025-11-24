import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Bank implements Serializable{
	String bid = "B-111";
	String branch = "Mitan";
}
class Account implements Serializable{
	String accNo = "Abc -123";
	String accName = "Pekao";
	Bank bank = new Bank();
}
class Employee implements Serializable {
	String eid = "I-2384";
	String ename = "Adham";
	float esal = 348.0f;
	Account account = new Account();
}
public class Test3 {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("D:/Java workplaces/FileOutputStream/acc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee emp = new Employee();
		oos.writeObject(emp);
		System.out.println("Serialization Succes!");
		fos.close();
		oos.close();
		
	}

}