package IIChainOfResponsibility;

public class Istek {

	enum Tip {
		GET,SET,DELETE
	}
	
	private String ip;
	private Tip tip;
	
	public Istek(String ip, Tip tip) {
		super();
		this.ip = ip;
		this.tip = tip;
	}
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Tip getTip() {
		return tip;
	}
	public void setTip(Tip tip) {
		this.tip = tip;
	}
	
}
