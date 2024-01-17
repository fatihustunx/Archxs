package IIIVisitor;

public interface IVisitor {

	void visit(NormalKullanici normalKullanici);
	void visit(GoldKullanici goldKullanici);
	void visit(PremiumKullanici premiumKullanici);
}
