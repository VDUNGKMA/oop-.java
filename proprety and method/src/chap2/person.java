package chap2;
 public class person {
	public String name;
	public String masv;
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	//getter
	public String getName() {
		return name;
	}
	public String getMasv() {
		return masv;
	}
	
	public void inra()
	{
		System.out.println(this.getName());
		System.out.println(this.getMasv());
		
	}
	
}
