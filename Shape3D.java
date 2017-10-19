
public class Shape3D extends Shape{
	Shape3D(){
		System.out.println("Shape3D object instantiated");
	}
	public static double volume(int ...a) {
		double ret = 1;
		for(int i : a) {
			ret *= i;
		}
		return ret;
	}
}
