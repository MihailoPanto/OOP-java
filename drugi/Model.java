package revija;

public class Model {

	private static int staticID=0;
	private int id=++staticID;
	
	Velicina velicina;
	
	public Model(Velicina v) {
		velicina=v;
	}
	
	public int dohvId() {
		return id;
	}

	public Velicina dohvVelicinu() {
		return velicina;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Model ").append(id).append('(').append(velicina).append(')');
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Velicina v=new Velicina(Velicina.Oznaka.L);
		Model m=new Model(v);
		System.out.println(m);
	}

}
