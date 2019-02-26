
public class VowelAction {

	static final String VOWELS = "aoieuAOIEU";
	
	public static boolean checkVowelString(char letter){
		
		boolean flag = false;
		
		if ((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')){
			if(VOWELS.indexOf(letter) != -1){
				flag = true;
			}
		}
		
		return flag;
		
	}
	

	static final char[] LOWER_VOWELS = {'a', 'o', 'i', 'e', 'u'}, UPPER_VOWELS = {'A', 'O', 'I', 'E', 'U'};
	
	public static boolean checkVowelArray(char letter){

		boolean flag = false;
		
		if ((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')){
			int count = 0;
			while (flag == false && count < LOWER_VOWELS.length){
				if (letter == LOWER_VOWELS[count] || letter == UPPER_VOWELS[count]){
					flag = true;
				}
				count++;
			}
		}
		
		return flag;
	}
	
	
	static final char A = 'a', O = 'o', I = 'i', E = 'e', U = 'u';
	
	public static boolean checkVowelChar(char letter){

		boolean flag = false;
		
		if ((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')){
			if (letter == A || letter == A - 32 ||
				letter == O || letter == O - 32 ||	
				letter == I || letter == I - 32 ||
				letter == E || letter == E - 32 ||
				letter == U || letter == U - 32){
					flag = true;
			}
		}
		
		return flag;
	}
	
}
