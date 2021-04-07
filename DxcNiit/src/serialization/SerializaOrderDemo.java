package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * The order in which i serialize the object
 * i have to de serialize it in the same order
 * @author Admin
 *
 */
public class SerializaOrderDemo {
	
	public static void main(String[] args) throws Exception{
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Rat r1 = new Rat();
		
		FileOutputStream fos = new FileOutputStream("animals.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(d1);
		oos.writeObject(c1);
		oos.writeObject(r1);
		
		
		FileInputStream fis = new FileInputStream("animals.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		Cat c2 = (Cat)ois.readObject();
		Rat r2 = (Rat)ois.readObject();
		
		System.out.printf(" Dogs variables are %d %d",d2.i,d2.j);
		System.out.printf("\n Cats variables are %d",c2.k);
		System.out.printf("\n Rats variables are %d",r2.l);




	}

}
