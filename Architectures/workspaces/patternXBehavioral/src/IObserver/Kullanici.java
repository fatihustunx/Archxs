package IObserver;

public class Kullanici extends TakipEdilen implements Takipci{
	
	private String mail;
	
	public Kullanici(String isim,String mail) {
		super(isim);	
		this.mail=mail;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	@Override
	public void paylas(Post post) {
		System.out.println(getIsim() + " kullan�c�s� " + post.getBaslik() + " payla�t�.");
		tumunuBilgilendir(post);
	}
	
	@Override
	public void bilgilendir(Post post) {
		// TODO Auto-generated method stub
		
		System.out.println(getIsim() + " kullan�c�s�na " + post.getTakipEdilen().getIsim() + "'in yapt��� payla��m mesaj olarak g�nderildi.");
	}

}
