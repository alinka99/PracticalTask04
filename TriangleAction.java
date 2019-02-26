
public class TriangleAction {

	public static double getDistance(double x1, double y1, double x2, double y2){
		
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		
	}
	
	public static boolean checkTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
		
		double a, b, c;
		a = getDistance(x1, y1, x2, y2);
		b = getDistance(x1, y1, x3, y3);
		c = getDistance(x2, y2, x3, y3);
		
		boolean flag = true;
		
		if (a + b <= c) {
			flag = false;
		}
		if (a + c <= b) {
			flag = false;
		}
		if (b + c <= a) {
			flag = false;
		}
		
		return flag;
	}
	
	public static boolean checkRightTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
		
		boolean flag = false; 
		
		if (checkTriangle(x1, y1, x2, y2, x3, y3)){
		
			double a, b, c, hypotenuse;
			a = getDistance(x1, y1, x2, y2);
			b = getDistance(x1, y1, x3, y3);
			c = getDistance(x2, y2, x3, y3);
			
			if (c > b && c > a){
				hypotenuse = c;
			}
			else if (a >= b){
				hypotenuse = a;
				a = c;
			}
			else {
				hypotenuse = b;
				b = c;
			}
			
			if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(hypotenuse, 2))
				flag = true;
		}
		
		return flag;
	}
	
}
