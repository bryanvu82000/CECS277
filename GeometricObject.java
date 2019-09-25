package ipi;

public abstract class GeometricObject implements GeometricObjectInterface,Comparable <GeometricObject> {
	Point location; 
	//Area()
	public abstract double Area();

	//Perimeter()
	public abstract double Perimeter();

	//toString()
	public abstract String toString();
	
	@Override
	public int compareTo(GeometricObject compare) {
		double firstArea = this.Area();
		double secondArea = compare.Area();
		if (firstArea > secondArea) {
			return 1;
		} else {
			return -1;
		}
	}
	public GeometricObject compareBiggerObject (GeometricObject one, GeometricObject two) {
			if (one.compareTo(two) < 0) {
				return one;
			} else {
				return two;
			}
	}
}