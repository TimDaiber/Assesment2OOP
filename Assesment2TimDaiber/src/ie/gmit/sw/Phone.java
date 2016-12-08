package ie.gmit.sw;


// implements device interface that contains nothing at the minute
// implements locatable class for use of location methods
// the implementation of Loacatable class allows reuse of location method
// in any sub class and other classes
public abstract class Phone extends Locatable implements Device {

	public Phone(){
		
	}
	public abstract void phone();
	
	
	public void dial(int number) {
		System.out.println("Dialing number " + number);
	}
	
	public void recieve() {
		
	}


	public void connect(){
		System.out.println("Connecting ");
	}
	
	public boolean isConnected(Boolean t){
		System.out.println("Connected? " + t);
		return t;
		
	}
}
