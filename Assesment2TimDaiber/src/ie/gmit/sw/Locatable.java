package ie.gmit.sw;

// I have created this class since a MobilePhone is able to be located as well
// as a laptop.
// creating this class and with the propper use of extends I am able to reuse this code in 
// these classes but do not have to
public abstract class Locatable {

	private int location;
	public Locatable() {
		// TODO Auto-generated constructor stub
	}

	public void setLocation(int location) {
		this.location = location;
	}
	public int getlocation(){
		System.out.println("my location is ... ");
		return location;
	}
}
