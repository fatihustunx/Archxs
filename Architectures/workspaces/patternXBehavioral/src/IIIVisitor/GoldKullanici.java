package IIIVisitor;

public class GoldKullanici implements IMesajHabercisi {

	@Override
	public void kisiBul(String kisi) {

		System.out.println("Gold kullanici icin " + kisi + " kiþisi bulundu..");
	}

	@Override
	public void mesajAl() {

		System.out.println("Gold kullanici icin mesaj alýnýyor...");
	}

	@Override
	public void mesajGonder(String msj) {

		System.out.println("Gold kullanici icin " + msj + " mesajý gönderiliyor...");
	}

	@Override
	public void accept(IVisitor visitor) {

		visitor.visit(this);
	}
}
