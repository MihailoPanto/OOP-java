package skijanje;

import java.util.ArrayList;

public class Staza {

	private ArrayList<Deonica> deonice;
	private String naziv;
	
	public Staza(String n) {
		this.naziv=n;
		deonice=new ArrayList<>();
	}
	
	public void dodaj(Deonica d) {
		deonice.add(d);
	}
	
	public int broj() {
		return deonice.size();
	}
	
	public double duzina() {
		double duz=0;
		for(Deonica d:deonice) {
			duz+=d.duzina();
		}
		return duz;
	}
	
	public double nagib() {
		double max=-Double.MAX_VALUE;
		for(Deonica d:deonice) {
			if(d.nagib()>max)max=d.nagib();
		}
		return max;
	}
	
	public char oznaka()throws GOznaka {
		return 'M';
	}
	
	public double brzina(double Vp) {
		for(Deonica d:deonice) {
			Vp=d.brzina(Vp);
		}
		return Vp;
	}
	
	public double vreme(double Vp) {
		double t=0;
		for(Deonica d:deonice) {
			t+=d.vreme(Vp);
			Vp=d.brzina(Vp);
		}
		return t;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(naziv).append('|').append(this.broj()).append('|');
		sb.append(this.duzina()).append('|').append("maks nagib :(").append('\n');
		sb.append('[');
		for(int i=0;i<deonice.size();++i) {
			
			sb.append(deonice.get(i));
			if(i!=deonice.size()-1) sb.append(',');
		}
		sb.append(']');
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teska t1 =new Teska(155., 45.);
		Teska t2=new Teska(644., 60.);
		Teska t3=new Teska(888., 90.);
		
		Staza s=new Staza("Stazica");
		s.dodaj(t1);
		s.dodaj(t2);
		s.dodaj(t3);
		System.out.println(s);

	}
	
	
	
}
