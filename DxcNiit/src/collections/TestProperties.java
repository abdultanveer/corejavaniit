package collections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class TestProperties {
	
	public static void main(String[] args) {
		
	      
		    Scanner scanner = new Scanner(System.in);
		    
		    while(true) {
		    	System.out.println("please enter");
		    	String line = scanner.nextLine();
		    	
		    	
		    	Properties p = null;
				try {
					FileReader	reader = new FileReader("C:\\Users\\Admin\\git\\localcorejavaniit\\DxcNiit\\src\\collections\\db.properties");
					  p=new Properties();  
					    p.load(reader); 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
		    	 System.out.println(p.getProperty("user"));  
				  System.out.println(p.getProperty("password"));
		    }
		      
		     
		}  
	
	

}
