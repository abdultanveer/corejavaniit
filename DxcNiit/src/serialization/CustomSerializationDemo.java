package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomSerializationDemo {
	public static void main(String[] args) throws Exception{
		Account account = new Account();
		
		FileOutputStream fos = new FileOutputStream("account.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(account);
		
		FileInputStream fis = new FileInputStream("account.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account account2 = (Account) ois.readObject();
		System.out.println("username = "+account2.userName+" password= "+account2.password);
		
	}

}
