package realworld.examples.interfaces;

public class Manager {
	public static void main(String[] args) {
		//HavellsAppliances havellsAppliances = new HavellsAppliances();
		SwitchListener switchListener = new GEAppliances();
				//new HavellsAppliances();
		switchListener.switchOne();
		switchListener.switchTwo();
		switchListener.switchThree();
		switchListener.switchFour();
		
	}

}
