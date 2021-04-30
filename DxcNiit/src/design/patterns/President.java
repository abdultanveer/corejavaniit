package design.patterns;

public class President {
	static President president;
	private President() {}
	
	public static President getInstance() {
		return president;
	}

}
