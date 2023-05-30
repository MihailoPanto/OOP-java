package banditi;

import java.util.ArrayList;

public class Kompozicija {

	private ArrayList<Vagon> vagoni;
	
	public Kompozicija() {
		vagoni=new ArrayList<>();
	}
	
	public Kompozicija dodajVagon(Vagon v) {
		vagoni.add(v);
		return this;
	}
	
	public Vagon dohvatiVagon(Bandit b)throws GNepostojeciVagon {
		for(Vagon v:vagoni) {
			if(v.sadrziBandita(b)) return v;
		}
		throw new GNepostojeciVagon();
	}
	
	public Vagon dohvatiSusedniVagon(Vagon v,Smer s)throws GNepostojeciVagon {
		if(v==null)throw new GNepostojeciVagon();
		int index = vagoni.indexOf(v);
		if(s==Smer.IZA) {
			if(vagoni.size()-1==index) throw new GNepostojeciVagon();
			else return vagoni.get(index+1);
		}
		else {
			if(index ==0) throw new GNepostojeciVagon();
			else return vagoni.get(index-1);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		if(vagoni.get(0)!=null)sb.append(vagoni.get(0));
		for(int i=1;i<vagoni.size();++i) {
			sb.append('_').append(vagoni.get(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vagon v1=new Vagon();
		Bandit b1=new Bandit(Bandit.Tim.A);
		b1.promeniBrojZlatnika(100);
		Bandit b2=new Bandit(Bandit.Tim.B);
		b2.promeniBrojZlatnika(-100);
		v1.dodajBandita(b2);
		v1.dodajBandita(b1);
		Vagon v2=new Vagon();
		Bandit a1=new Bandit(Bandit.Tim.B);
		a1.promeniBrojZlatnika(500);
		Bandit a2=new Bandit(Bandit.Tim.A);
		a2.promeniBrojZlatnika(-200);
		v2.dodajBandita(a2);
		v2.dodajBandita(a1);
		Kompozicija k=new Kompozicija();
		k.dodajVagon(v2);
		k.dodajVagon(v1);
		//System.out.println(k);
		/*
		try {
			System.out.println(k.dohvatiSusedniVagon(v2, Smer.ISPRED));
		} catch (GNepostojeciVagon e) {
			e.printStackTrace();
		}
		*/
		/*
		try {
			System.out.println(k.dohvatiSusedniVagon(v1, Smer.IZA));
		} catch (GNepostojeciVagon e) {
			e.printStackTrace();
		}
		*/
		try {
			System.out.println(k.dohvatiVagon(b2));
		} catch (GNepostojeciVagon e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
