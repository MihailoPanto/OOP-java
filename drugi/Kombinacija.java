package revija;

public class Kombinacija {

	private Nosivo[] kombinacija;
	private int num;
	
	public Kombinacija(int num) {
		kombinacija= new Nosivo[num];
	}
	
	public void dodaj(Nosivo stvar) throws GDodavanje{
		if(num<kombinacija.length)kombinacija[num++]=stvar;
		else throw new GDodavanje();
	}
	
	public int dohvBrStvari() {
		return num;
	}
	
	public int dohvMaxBrStvari() {
		return kombinacija.length;
	}
	public Nosivo dohvStvar(int index) throws GIndeks{
		if(index<0 || index>=kombinacija.length || kombinacija[index]==null) {
			throw new GIndeks();
		}
		else return kombinacija[index];
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		sb.append('[');
		if(kombinacija[0]!=null)sb.append(kombinacija[0]);
		for(int i=1;i<kombinacija.length;++i) {
			
			if(kombinacija[i]!=null) sb.append(',').append(kombinacija[i]);
		}
		sb.append(']');
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
