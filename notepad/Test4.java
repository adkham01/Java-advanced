import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Student implements Externalizable {
	String sid;
	String sname;
	String semail;
	String smobile;
	public Student(String sid, String sname, String semail, String smobile) {
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
		this.smobile = smobile;
	}
	
	public Student() {
		
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		try {
			String[] str1 = sid.split("-");
			int rollNo = Integer.parseInt(str1[1]);
			
			String[] str2 = semail.split("@");
			String email = str2[0];
			
			String[] str3 = smobile.split("-");
			long mobile = Long.parseLong(str3[1]);
		
			out.writeInt(rollNo);
			out.writeUTF(sname);
			out.writeUTF(email);
			out.writeLong(mobile);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		sid = "DSS-"+in.readInt();
		sname = in.readUTF();
		semail = in.readUTF()+"dss.com";
		smobile = "+99-"+in.readLong();
		
	}
	public void getStudentDetails() {
		System.out.println("\nStudent Details");
		System.out.println("----------------------");
		System.out.println("Student ID     : "+sid);
		System.out.println("Student Name   : "+sname);
		System.out.println("Student Email  : "+semail);
		System.out.println("Student Mobile : "+smobile);
	}
}
public class Test4 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("D:/Java workplaces/FileOutputStream/studentnp.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student std1 = new Student("DSS-111", "Anil","abc@dss.com","+99-223948787");
		System.out.println("Student Details before Serialization");
		std1.getStudentDetails();
		oos.writeObject(std1);
		fos.close();
		oos.close();
		
		FileInputStream fis = new FileInputStream("D:/Java workplaces/FileOutputStream/studentnp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student std2 = (Student) ois.readObject();
		System.out.println("Student details after Deserialization");
		std2.getStudentDetails();
		fis.close();
		ois.close();
		

	}

}