package IObserver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kullanici k1= new Kullanici("Fatih","abc@gmail.com");
		Kullanici k2= new Kullanici("Dilru","abcd@gmail.com");
		Kullanici k3= new Kullanici("Meri","abcde@gmail.com");
		Grup grup= new Grup("Yazýlým");
		Sayfa sayfa= new Sayfa("Teknoloji");
		
		k1.takipciEkle(k2);
		k1.takipciEkle(k3);
		k1.takipciEkle(grup);
		sayfa.takipciEkle(k1);
		sayfa.takipciEkle(k2);
		sayfa.takipciEkle(k3);
		sayfa.takipciEkle(grup);
		sayfa.takipciSil(k2);
		
		k1.paylas(new Post(k1,"asldmmdgsdg","Tweet"));
		sayfa.paylas(new Post(sayfa,"msdgmdfh","Flood"));
	}

}
