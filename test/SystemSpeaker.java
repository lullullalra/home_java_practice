package pjh.test;

import java.util.Objects;

public class SystemSpeaker {
	static private SystemSpeaker instance;
	private int volume;
	
	private SystemSpeaker() {
		volume = 5;
	}
	
	public static SystemSpeaker getInstance() {
		if(instance == null) {
			//시스템 스피커 
			instance = new SystemSpeaker();
		}
		return instance;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

//	public boolean hashCode(SystemSpeaker speaker2) {
//		boolean flag = false;
//		return flag;
//	}

	
}
