package inbuilt.functional.interfaces.functions;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierTest {
	
	public static void main(String[] args) {
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
		
		Supplier<String> otpSupplier = () -> {
			String otp = "";
			for(int i=0;i<6;i++) {
				otp = otp+(int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(otpSupplier.get());
		System.out.println(otpSupplier.get());
		System.out.println(otpSupplier.get());

	}

}
