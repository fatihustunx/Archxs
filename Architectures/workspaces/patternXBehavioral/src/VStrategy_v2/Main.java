package VStrategy_v2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eleman eleman;
		
		eleman= new Eleman(new YoneticiMaasHesap(), new DepartmanAIzýnHesap());
		eleman.maasHesapla();
		eleman.izinHesapla();
		
		System.out.println();
		
		eleman= new Eleman(new MuhendisMaasHesap(), new DepartmanBIzinHesap());
		eleman.maasHesapla();
		eleman.izinHesapla();
	}

}
