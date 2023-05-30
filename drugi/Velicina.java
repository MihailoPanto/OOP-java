package revija;

public class Velicina {

	public enum Oznaka{S,M,L};
	private Oznaka oznaka;
	
	public Velicina(Oznaka o) {
		oznaka=o;
	}
	
	public Oznaka dohvOznaku() {
		return oznaka;
	}

	public boolean manja(Velicina v) {
		if(((oznaka==Velicina.Oznaka.S || oznaka==Velicina.Oznaka.M)
				&&v.dohvOznaku()==Velicina.Oznaka.L )
				||(oznaka==Velicina.Oznaka.S && v.dohvOznaku()==Velicina.Oznaka.M))return true;
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+oznaka;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Velicina v1=new Velicina(Velicina.Oznaka.S);
		System.out.println(v1);
		Velicina v2=new Velicina(Velicina.Oznaka.M);
		Velicina v3=new Velicina(Velicina.Oznaka.L);
		
		System.out.println(v1.manja(v2));
		System.out.println(v1.manja(v3));
		System.out.println(v2.manja(v1));
		System.out.println(v2.manja(v3));
		System.out.println(v3.manja(v1));
		System.out.println(v3.manja(v2));
	}

}
