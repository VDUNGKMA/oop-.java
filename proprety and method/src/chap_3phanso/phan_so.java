package chap_3phanso;

public class phan_so {
	private int tuso;
	private int mauso;
	//tao phan so
	public phan_so (int tuso,int mauso)
	{
		this.tuso=tuso;
		this.mauso=mauso;
	}
	public phan_so(phan_so A,phan_so B,String C)
	{
		
	}
		//tao phan hien thi cho phan so
		public String print()
		{
			return tuso + "/" + mauso;
		}
	public void phansotoigian()

	{
		int ucln=this.UCLN(getTuso(),getMauso());
		this.tuso=this.tuso/ucln;
		this.mauso=this.mauso/ucln;
	}
	//Tong 2 phanso 
	public  void add(phan_so A,phan_so B)
	{	
		this.tuso=A.tuso*B.mauso;
		this.mauso=B.tuso*A.mauso;
	}
	public int  UCLN(int a,int b)
	{
		if(a==0||b==0)
		{
			return 0;
		}
		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
			}
			else if(a<b) 
			{
				b=b-a;
			}
		}
		return a;
	}
	public boolean checktoigian()
	{
		
		return false;
	}
	//tao setter cho tuso va mauso
	public void setTuso(int tuso) {
		this.tuso = tuso;
	}
	public void setMauso(int mauso) {
		this.mauso = mauso;
	}
	//tao getter cho tuso va mauso
	public int getTuso() {
		return tuso;
	}
	public int getMauso() {
		return mauso;
	}
}
	
	
	
