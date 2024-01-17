package pattern5Bridge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IRenk renk= new Acik();
		UI winUI= new WinUI(renk);
		winUI.uiOlustur();
		
		renk= new Koyu();
		UI linuxUI= new LinuxUI(renk);
		linuxUI.uiOlustur();
		
		renk= new HighContrast();
		winUI= new WinUI(renk);
		winUI.uiOlustur();
	}

}
