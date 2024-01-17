package IIIVisitor;

public class HikayeGonderme implements IVisitor {

	@Override
	public void visit(NormalKullanici normalKullanici) {

		System.out.println("Normal kullanici icin hikaye gonderiliyor..");
	}

	@Override
	public void visit(GoldKullanici goldKullanici) {

		System.out.println("Gold kullanici icin hikaye gonderiliyor..");
	}

	@Override
	public void visit(PremiumKullanici premiumKullanici) {

		System.out.println("Premium kullanici icin hikaye gonderiliyor..");
	}

}
