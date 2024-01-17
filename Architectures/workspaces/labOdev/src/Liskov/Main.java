package Liskov;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICokgen sekil;
		
		sekil=new Kare(5);
		System.out.println("Karenin alani : "+ sekil.alanHesapala());
		
		sekil=new Dikdortgen(4,8);
		System.out.println("Dikdortgenin alani : "+sekil.alanHesapala());
	}

}
