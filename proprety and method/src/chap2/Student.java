package chap2;


public class Student extends person{
		
		public int day;
		//setter
		
		public void setDay(int day) {
			this.day = day;
		}
		//getter
		
		public int getDay() {
			return day;
		}
		public void inra()
		{
			super.inra(); tu khoa super lay thong tin tu class person
			System.out.println(this.getDay());
			
		}
		
	
	
		

}
