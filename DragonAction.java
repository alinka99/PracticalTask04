
public class DragonAction {

	static final int FIRST_PERIOD = 200, SECOND_PERIOD = 300; 
													
	public static int getNumberHeads(int age){    
		                                           
		if (age < 0){
			return -1;                   
		}                               
		                                
		int heads = 3;                
		                             
		if (age < FIRST_PERIOD){               
			heads += age * 3;       
		} else if (age < SECOND_PERIOD){
			heads += FIRST_PERIOD * 3 + (age - FIRST_PERIOD) * 2; 
		} else {                        
			heads += FIRST_PERIOD * 3 + (SECOND_PERIOD - FIRST_PERIOD) * 2 - SECOND_PERIOD + age;
		}                           
		                             
		return heads;
	}
	
	public static int getNumberEyes(int age){
		
		int heads = getNumberHeads(age);
		return heads * 2;
		
	}
	
}
