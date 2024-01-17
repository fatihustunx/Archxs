package pattern5Bridge;

public abstract class UI {
	
	IRenk renk;
	
	public UI(IRenk rnk) {
		renk=rnk;
	}
	
	
	public abstract void uiOlustur();
}
