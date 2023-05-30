package banditi;

import java.util.ArrayList;

public class Vagon {

	private ArrayList<Bandit> banditi;
	
	public Vagon() {
		banditi=new ArrayList<>();
	}
	
	public Vagon dodajBandita(Bandit b) {
		banditi.add(b);
		return this;
	}
	
	//proveri ovde za bacanje izuzetka
	public Bandit dohvatiBandita(int index) {
		return banditi.get(index);
	}
	
	public boolean sadrziBandita(Bandit b) {
		return banditi.contains(b);
	}
	
	public Vagon ukloniBandita(Bandit b) {
		banditi.remove(b);
		return this;
	}
	
	public int dohvatiBrojBandita() {
		return banditi.size();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		sb.append('[');
		sb.append(dohvatiBandita(0));
		for(int i=1;i<banditi.size();++i) {
			sb.append(',').append(dohvatiBandita(i));
		}
		sb.append(']');
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vagon v=new Vagon();
		Bandit b1=new Bandit(Bandit.Tim.A);
		b1.promeniBrojZlatnika(100);
		Bandit b2=new Bandit(Bandit.Tim.B);
		b2.promeniBrojZlatnika(-100);
		v.dodajBandita(b2);
		v.dodajBandita(b1);
		System.out.println(v);
		System.out.println(v.dohvatiBrojBandita());
		System.out.println(v.dohvatiBandita(1));
		System.out.println(v.sadrziBandita(b1));
		v.ukloniBandita(b1);
		System.out.println(v);
		System.out.println(v.sadrziBandita(b1));

	}

}
