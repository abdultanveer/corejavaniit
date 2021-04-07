package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Receiver will deserialize the object
 * @author Admin
 *
 */
public class Receiver {
	
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("zoo.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Tiger tiger = (Tiger)ois.readObject();
		System.out.println("Tiger variables are"+tiger.a);
		
		
	}

}
