package banditi;

public class Bandit {

	public enum Tim{A,B};
	private Tim tim;
	private int zlatnici=50;
	
	public Bandit(Tim t) {
		this.tim=t;
	}
	
	public Tim dohvatiTim() {
		return tim;
	}

	public int dohvatiBrojZlatnika() {
		return zlatnici;
	}
	
	public void promeniBrojZlatnika(int kolicina) {
		if(zlatnici<-kolicina) zlatnici=0;
		else zlatnici+=kolicina;
	}
	
	@Override
	public String toString() {
		return ""+tim+zlatnici;
	}

	public static void main(String[] args) {
		Bandit b=new Bandit(Bandit.Tim.A);
		System.out.println(b);
		//System.out.println(b.getTim());
		//System.out.println(b.getZlatnici());
		b.promeniBrojZlatnika(65);
		System.out.println(b);
		b.promeniBrojZlatnika(-120);
		System.out.println(b);
	}

}
