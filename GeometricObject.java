package ipi;

<<<<<<< Updated upstream
<<<<<<< Updated upstream
public abstract class GeometricObject implements GeometricObjectInterface {
	Point location = new Point(); 
=======
=======
>>>>>>> Stashed changes
public abstract class GeometricObject implements GeometricObjectInterface,Comparable <GeometricObject> {
	Point location; 
>>>>>>> Stashed changes
	//Area()
	abstract double Area();

	//Perimeter()
	abstract double Perimeter();

	//toString()
<<<<<<< Updated upstream
	abstract String toString();
}
=======
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
<<<<<<< Updated upstream
}
>>>>>>> Stashed changes
=======
}
>>>>>>> Stashed changes
