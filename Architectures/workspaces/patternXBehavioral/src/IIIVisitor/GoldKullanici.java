package IIIVisitor;

public class GoldKullanici implements IMesajHabercisi {

	@Override
	public void kisiBul(String kisi) {

		System.out.println("Gold kullanici icin " + kisi + " ki�isi bulundu..");
	}

	@Override
	public void mesajAl() {

		System.out.println("Gold kullanici icin mesaj al�n�yor...");
	}

	@Override
	public void mesajGonder(String msj) {

		System.out.println("Gold kullanici icin " + msj + " mesaj� g�nderiliyor...");
	}

	@Override
	public void accept(IVisitor visitor) {

		visitor.visit(this);
	}
}
