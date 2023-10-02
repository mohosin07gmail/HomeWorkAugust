package hw11Abstraction;

public interface University extends College, Hospital {
	/*
	 * only one keyword extends
	 * interface can inherit only interface with extends keyword
	 * interface can inherit more than one interface*/

	public void classSize();

	public void playGround();

	public void teacher();
	
	public default void hw9Abstraction() {
		
	}
	
	public static void library() {
		
	}

//	public void University() { 
//	an interface can not have a constructor. interface can only have abstract or non-implemented method. 	
//	}

}
