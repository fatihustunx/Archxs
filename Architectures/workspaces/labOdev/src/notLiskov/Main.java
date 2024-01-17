package notLiskov;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dikdortgen kare=new Dikdortgen();
		kare.kenarSet(5, 5);  // karenin tek bir kenarý olmalýdýr
		System.out.println(kare.alanHesapla());
		
		Dikdortgen dikdortgen=new  Dikdortgen();
		dikdortgen.kenarSet(10, 5);
		System.out.println(dikdortgen.alanHesapla());
		
	}

}
