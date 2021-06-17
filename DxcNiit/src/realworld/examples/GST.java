package realworld.examples;

public class GST extends IncomeTax{
	
	
	
	


	@Override
	int calculateTax(int income) {
		// TODO Auto-generated method stub
		int oldTax = super.calculateTax(income);
		int newTax = 5;
		return oldTax+newTax;
	}

	
	public static void main(String[] args) {
		GST gst = new GST();
		System.out.println(gst.calculateTax(100));
	}
}
