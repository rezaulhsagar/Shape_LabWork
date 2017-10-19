public class Main {
	public static void doSomething(Shape S) {
		try {
			if(S instanceof Shape2D) {
				S.getType();
			}
			else if(S instanceof Shape3D) {
				S.getType();
			}
			else if(S instanceof Quadrilateral) {
				S.getType();
			}
			else if(S instanceof Triangle) {
				S.getType();
			}
			else if(S instanceof Sphere) {
				S.getType();
			}
			else if(S instanceof Cube) {
				S.getType();
			}
			else if(S instanceof Rectangle) {
				S.getType();
			}
			else if(S instanceof Square) {
				S.getType();
			}
			else if(S instanceof RightTriangle) {
				S.getType();
			}
			else{
				throw new Throwable();
			}
		}
		catch(Throwable t) {
			System.out.println("Not a valid shape!");
		}
	}
	
	public static void main(String args[]) {
		Shape rect = new Rectangle(2,5);
		doSomething(rect);
		Shape right = new RightTriangle(1,2,3);
		doSomething(right);
	}
	
}