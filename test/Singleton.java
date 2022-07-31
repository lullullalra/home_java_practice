package pjh.test;

public class Singleton {
	private static Singleton singleObject;  //정적 필드
	private Singleton() {
		singleObject = new Singleton(); 
	}
	
	public static Singleton getInstance() { //정적 메소드
		if(singleObject == null) {
			singleObject = new Singleton();
		}
		
		return singleObject;
	}
	
}
