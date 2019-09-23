package ipi;

public abstract class GeometricObject implements GeometricObjectInterface {
	Point location; 
	//Area()
	public abstract double Area();

	//Perimeter()
	public abstract double Perimeter();

	//toString()
	public abstract String toString();
}
