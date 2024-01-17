package pattern5Bridge;

public class LinuxUI extends UI {

	public LinuxUI(IRenk rnk) {
		super(rnk);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void uiOlustur() {
		
		String renkParametresi=renk.renkOlustur();
		System.out.println(renkParametresi + " ile LinuxUI oluþturuldu.");
	}

}
