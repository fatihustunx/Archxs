package IIIVisitor;

public class NormalKullanici implements IMesajHabercisi {

	@Override
	public void kisiBul(String kisi) {

		System.out.println("Normal kullanici icin " + kisi + " ki�isi bulundu..");
	}

	@Override
	public void mesajAl() {

		System.out.println("Normal kullanici icin mesaj al�n�yor...");
	}

	@Override
	public void mesajGonder(String msj) {

		System.out.println("Normal kullanici icin " + msj + " mesaj� g�nderiliyor...");
	}

	@Override
	public void accept(IVisitor visitor) {

		visitor.visit(this);
	}

}
