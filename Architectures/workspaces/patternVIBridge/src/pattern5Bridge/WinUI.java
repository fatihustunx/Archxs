package pattern5Bridge;

public class WinUI extends UI{
	
	public WinUI(IRenk rnk) {
		super(rnk);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void uiOlustur() {
	
		String renkParametresi=renk.renkOlustur();
		System.out.println(renkParametresi + " ile WinUI oluþturuldu.");
	}

}
