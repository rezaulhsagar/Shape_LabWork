
public class Quadrilateral extends Shape2D{
	int aa, bb, cc, dd;
	Quadrilateral(){
		setType("Quadrilateral");
	}
	Quadrilateral(int a, int b, int c, int d){
		System.out.println("Quadrilateral object instantiated.");
		setType("Quadrilateral");
		aa = a;
		bb = b;
		cc = c;
		dd = d;
	}
}
