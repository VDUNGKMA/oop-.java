package chap2;

public class Teacher extends person{

	public int score;
	//setter
	
	public void setScore(int score) {
		this.score = score;
	}
	//getter
	
	public int getScore() {
		return score;
	}
	public void inra()
	{
		super.inra();// tu khoa super lap thong tin tu class cha la person 
		System.out.println(this.getScore());
	}
	
	
	
	
	

}
