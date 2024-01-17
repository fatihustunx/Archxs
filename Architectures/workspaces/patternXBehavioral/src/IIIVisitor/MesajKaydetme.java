package IIIVisitor;

public class MesajKaydetme implements IVisitor {

	@Override
	public void visit(NormalKullanici normalKullanici) {
		
		System.out.println("Normal kullanici icin mesaj kaydetme özelliði desteklenmemektedir !");
	}

	@Override
	public void visit(GoldKullanici goldKullanici) {

		System.out.println("Gold kullanici icin mesaj kaydediliyor..");
	}

	@Override
	public void visit(PremiumKullanici premiumKullanici) {

		System.out.println("Premium kullanici icin mesaj kaydediliyor..");
	}

}
