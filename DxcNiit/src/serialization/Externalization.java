package serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Externalization implements Externalizable {
	String s;
	int i,j;

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject("ansari");
		out.writeInt(30);
	}
	

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.s = (String) in.readObject();
		this.i = in.readInt();
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Externalization externalization = new Externalization();
		FileOutputStream fos = new FileOutputStream("externalizationdemo");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(externalization);
		
		FileInputStream fis = new FileInputStream("externalizationdemo");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Externalization externalization2 = (Externalization) ois.readObject();
		
		System.out.println("i="+externalization2.i+" j="+ externalization2.j+" s="+externalization2.s);
		
	}

}
