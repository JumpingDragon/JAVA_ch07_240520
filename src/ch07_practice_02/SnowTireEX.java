package ch07_practice_02;

public class SnowTireEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnowTire snowtire = new SnowTire();
		Tire tire = snowtire;
		snowtire.run();
		tire.run();
		
	}

}
