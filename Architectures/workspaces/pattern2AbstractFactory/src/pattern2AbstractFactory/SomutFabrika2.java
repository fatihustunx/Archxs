package pattern2AbstractFactory;

public class SomutFabrika2 implements ISoyutFabrika {

	@Override
	public ISoyutUrunKumas kumasGetir() {

		return new KetenKumas();
	}

	@Override
	public ISoyutUrunIskelet iskeletGetir() {

		return new MetalIskelet();
	}

}
