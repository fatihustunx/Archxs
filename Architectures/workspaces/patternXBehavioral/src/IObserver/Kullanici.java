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
		System.out.println(getIsim() + " kullanýcýsý " + post.getBaslik() + " paylaþtý.");
		tumunuBilgilendir(post);
	}
	
	@Override
	public void bilgilendir(Post post) {
		// TODO Auto-generated method stub
		
		System.out.println(getIsim() + " kullanýcýsýna " + post.getTakipEdilen().getIsim() + "'in yaptýðý paylaþým mesaj olarak gönderildi.");
	}

}
