package IIIVisitor;

public class NormalKullanici implements IMesajHabercisi {

	@Override
	public void kisiBul(String kisi) {

		System.out.println("Normal kullanici icin " + kisi + " kiþisi bulundu..");
	}

	@Override
	public void mesajAl() {

		System.out.println("Normal kullanici icin mesaj alýnýyor...");
	}

	@Override
	public void mesajGonder(String msj) {

		System.out.println("Normal kullanici icin " + msj + " mesajý gönderiliyor...");
	}

	@Override
	public void accept(IVisitor visitor) {

		visitor.visit(this);
	}

}
