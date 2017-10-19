
public class Triangle extends Shape2D{
	int aa, bb, cc;
	Triangle(){
		setType("Triangle");
	}
	Triangle(int a, int b, int c){
		System.out.println("Triangle object instantiated.");
		setType("Triangle");
		aa = a;
		bb = b;
		cc = c;
	}
}
