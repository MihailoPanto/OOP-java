package banditi;

public abstract class Akcija {
	
	protected Kompozicija kompozicija;
	
	public Akcija(Kompozicija k) {
		kompozicija=k;
	}

	abstract public void izvrsi(Bandit b);
	
}
