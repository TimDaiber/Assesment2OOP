package ie.gmit.sw;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ringable r = new AlarmClock();
		r.ring(10);
		
		// laptop
		Task t = new Task();
		Computable cl = new Laptop(t);
		cl.compute(t);
		cl.setLocation(98765);
		cl.getlocation();
		
		
		// MobilePhone
		Phone m =  new MoblinePhone();
		m.setLocation(001);
		m.getlocation();
		m.dial(123456);
		
		// Wired Phone
		Phone w = new WiredPhone();
		w.dial(12345);
		w.connect();
		w.isConnected(true);
		
		
		
	}

}
