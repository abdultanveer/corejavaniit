package method.reference.constructor;

public class PlayConstructorReference {
	public static void main(String[] args) {
		ISample iSample = Sample::new;
		Sample s1 = iSample.get();
	}

}
