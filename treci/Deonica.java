package skijanje;

public abstract class Deonica {
	
	protected double s;
	protected double nagib;

	public Deonica(double duzina, double nagib) {
		this.s = duzina;
		this.nagib = nagib;
	}

	public double duzina() {
		return s;
	}
	
	public double nagib() {
		return nagib;
	}
	
	abstract public char oznaka();
	
	abstract public double ubrzanje();
	
	public double brzina(double Vp) {
		return Math.sqrt(2*ubrzanje()*s+Math.pow(Vp, 2));
	}
	
	public double vreme(double Vp) {
		return (brzina(Vp)-Vp)/ubrzanje();
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(oznaka()).append('(').append(s);
		sb.append(',').append(nagib).append(')');
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
