
public class Test {

	public static void main(String[] args){
		
		int N = 358;
		System.out.println("1. Dragon has " + DragonAction.getNumberHeads(N) + " heads and " + DragonAction.getNumberEyes(N) + " eyes");
		
		double x1 = 1.5, y1 = 1.5, x2 = 2.2, y2 = 3.5, x3 = 2.9, y3 = 1.5;
		System.out.println("\n2. " + (TriangleAction.checkTriangle(x1, y1, x2, y2, x3, y3) ? "Is a triangle" : "Is not a triangle"));
		System.out.println(TriangleAction.checkRightTriangle(x1, y1, x2, y2, x3, y3) ? "Is a right-angled triangle" : "Is not a right-angled triangle ");
		
		char symbol = 'a';
		System.out.println("\n3. " + (VowelAction.checkVowelString(symbol) ? "Is a vowel" : "Is not a vowel"));
		System.out.println(VowelAction.checkVowelArray(symbol) ? "Is a vowel" : "Is not a vowel");
		System.out.println(VowelAction.checkVowelChar(symbol) ? "Is a vowel" : "Is not a vowel");
		
		int randomNumber = 1 + (int) (Math.random() * 3);
		System.out.println("\n4. Your number: " + randomNumber + ", your mood: " + MoodSensor.getMood(randomNumber));

		int day = 2, month = 11, year = 2017;
		System.out.print("\n5. ");
		System.out.println(((GregorianCalendarAction.getNextDate(day, month, year) > 0) ? "": "Incorrect input!"));
		
	}
	
}
