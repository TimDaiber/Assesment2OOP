package ie.gmit.sw;

public abstract class Ringable implements Device {

	
	private long time;
	public void ring(int seconds) {
		System.out.println("Ring Ring for "+ seconds);
	}
	
	

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
}
