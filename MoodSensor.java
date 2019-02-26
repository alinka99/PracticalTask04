
public class MoodSensor {

	static final int HAPPY = 1, NORMAL = 2, SAD = 3;
	
	public static String getMood(int n){
		
		String mood = ";)";
		
		switch(n){
			case HAPPY: mood = "=D"; break;
			case NORMAL: mood = "=)"; break;
			case SAD: mood = "=("; break;
		}
		
		return mood;
	}
	
}
