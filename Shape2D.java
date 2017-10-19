
public class Shape2D extends Shape{
	Shape2D(){
		System.out.println("Shape2D instantiated.");
	}
	public static double area(int ...a) {
		double ret = 1;
		for(int i : a) {
			ret *= i;
		}
		return ret;
	}
}
