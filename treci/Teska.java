package skijanje;

public class Teska extends Deonica {

	private char oznaka;
	private static final double g=9.81;
	
	public Teska(double duzina, double nagib) {
		super(duzina, nagib);
		oznaka='T';
	}

	@Override
	public char oznaka() {
		return oznaka;
	}

	@Override
	public double ubrzanje() {
		// TODO Auto-generated method stub
		return g*Math.sin(Math.toRadians(nagib));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
