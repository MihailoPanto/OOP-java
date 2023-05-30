package revija;

public class Odeca implements Nosivo {

	private String naziv;
	private Velicina velicina;
	
	public Odeca(String naziv, Velicina velicina) {
		super();
		this.naziv = naziv;
		this.velicina = velicina;
	}

	public String dohvNaziv() {
		return naziv;
	}

	public Velicina dohvVelicinu() {
		return velicina;
	}

	@Override
	public boolean odgovara(Model m) {
		return (!velicina.manja(m.velicina));
	}
	
	@Override
	public String toString() {
		return "odeća "+naziv+" "+velicina;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Velicina v1=new Velicina(Velicina.Oznaka.S);
		Velicina v2=new Velicina(Velicina.Oznaka.M);
		Velicina v3=new Velicina(Velicina.Oznaka.L);
		Model m=new Model(v2);
		System.out.println(m);
		Odeca majica=new Odeca("Majica",v3);
		System.out.println(majica.odgovara(m));
		System.out.println(majica);
	}

}
