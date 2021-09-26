package chap_3phanso;

public class Main {
	
	public static void main(String[] args) {
		phan_so ps1 =new phan_so(8,10);
		phan_so ps2 =new phan_so(3,9);
		System.out.println(ps1.print());
		ps1.phansotoigian();
		System.out.println(ps1.print());
		System.out.println(ps2.print());
		ps2.phansotoigian();
		System.out.println(ps2.print());
		ps1.add(ps1, ps2);
		
		
		
		
	}

}
