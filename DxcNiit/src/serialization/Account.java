package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable{
	String userName = "abdul";
	transient String password = "ansari";

	private void writeObject(ObjectOutputStream oos) throws ClassNotFoundException,IOException{
		
		oos.writeUTF("123"+password);
	}
	
	private void readObject(ObjectInputStream ois) throws IOException {
		this.password = ois.readUTF().substring(3);
	}
	
	
}
