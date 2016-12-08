package ie.gmit.sw;

// class that categorises everything that can compute
public abstract class Computable extends Locatable implements Device {

	
	
	public Computable() {
		// TODO Auto-generated constructor stub
	}
	public void compute(Task t){
		System.out.println("Computing task ..." + t);
	}

	
	
	
	
	
	

}
