package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sender {
	public static void main(String[] args) throws Exception{
		Tiger tiger = new Tiger();
		FileOutputStream fos = new FileOutputStream("zoo.txt");
		ObjectOutputStream oos  = new ObjectOutputStream(fos);
		oos.writeObject(tiger);;
	}

}
