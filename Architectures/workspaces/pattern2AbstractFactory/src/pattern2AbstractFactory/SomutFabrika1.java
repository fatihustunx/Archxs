package pattern2AbstractFactory;

public class SomutFabrika1 implements ISoyutFabrika {

	@Override
	public ISoyutUrunKumas kumasGetir() {

		return new KadifeKumas();
	}

	@Override
	public ISoyutUrunIskelet iskeletGetir() {

		return new AhsapIskelet();
	}

}
