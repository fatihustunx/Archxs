package IIIVisitor;

public interface IMesajHabercisi {

	void kisiBul(String kisi);
	void mesajAl();
	void mesajGonder(String msj);
	void accept(IVisitor visitor);
}
