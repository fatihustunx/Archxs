package IIIVisitor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IVisitor v;
		IMesajHabercisi k;
		
		k= new NormalKullanici();
		
		v= new HikayeGonderme();
		k.accept(v);
		v= new MesajKaydetme();
		k.accept(v);
		
		k= new PremiumKullanici();
		
		v= new HikayeGonderme();
		k.accept(v);
		v= new MesajKaydetme();
		k.accept(v);
	}

}
