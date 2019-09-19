package ipi;

public abstract class GeometricObject implements GeometricObjectInterface {
	Point location = new Point(); 
	//Area()
	abstract double Area();

	//Perimeter()
	abstract double Perimeter();

	//toString()
	abstract String toString();
}
