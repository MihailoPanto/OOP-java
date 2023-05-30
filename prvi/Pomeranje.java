package banditi;

public class Pomeranje extends Akcija {

	private Smer smer;
	
	public Pomeranje(Kompozicija k, Smer s) {
		super(k);
		smer=s;
	}

	@Override
	public void izvrsi(Bandit b) {
		try {
		Vagon v_stari=kompozicija.dohvatiVagon(b);
		Vagon v_novi=kompozicija.dohvatiSusedniVagon(v_stari,smer);
		Bandit tmp=b;
		v_stari.ukloniBandita(b);
		v_novi.dodajBandita(tmp);
		
		}
		catch(GNepostojeciVagon v) {}
	}
	

	@Override
	public String toString() {
		return "Pomeranje: "+smer;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
