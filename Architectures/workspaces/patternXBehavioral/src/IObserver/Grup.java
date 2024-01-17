package IObserver;

public class Grup implements Takipci {
	
	private String isim;
	
	public Grup(String isim) {
		this.isim=isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Override
	public void bilgilendir(Post post) {
		// TODO Auto-generated method stub
		
		System.out.println(getIsim() + " grubuna " + post.getTakipEdilen().getIsim() + "'in yaptýðý paylaþým mesaj olarak gönderildi.");
	}
	
	
}
