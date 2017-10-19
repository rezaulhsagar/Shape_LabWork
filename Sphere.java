
public class Sphere extends Shape3D{
	int radius;
	Sphere(int r){
		System.out.println("Sphere object instantiated.");
		radius = r;
		setType("Sphere");
	}
	double area() {
		return 4/3*3.141592*radius*radius*radius;
	}
}
