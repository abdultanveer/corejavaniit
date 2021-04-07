package serialization;

import java.io.Serializable;

public class Rabbit extends Animal implements Serializable{

	int j = 20;
	int k = 30;
	
	public Rabbit() {
		System.out.println("Rabbits no arg constructor called");
	}
}
