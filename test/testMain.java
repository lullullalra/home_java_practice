package pjh.test;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testMain main = new testMain();
		main.testSingleton();
//		main.testPoint();
	}
	
	public void testPoint() {
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		
		if(p1.equals(p2)) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
	}
	
	public void testSingleton() {
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		speaker1.setVolume(11);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		if(speaker1.equals(speaker2)) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
	}
}
