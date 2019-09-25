package ipi;

public abstract class GeometricObject implements GeometricObjectInterface,Comparable <GeometricObject> {
	Point location; 
	//Area()
	public abstract double Area();

	//Perimeter()
	public abstract double Perimeter();

	//toString()
	public abstract String toString();
	/**
	 * @param compare, the 2nd object
	 * compareTo method that takes in another object and returns 1 if this object has a larger area
	 * else returns -1 if 2nd object has a larger area
	 */
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
	/**
	 * 
	 * @param one, object one (this.<shape>)
	 * @param two, object two (<shape> of second object)
	 * @return: returns the larger of the two objects
	 */
	public GeometricObject compareBiggerObject (GeometricObject one, GeometricObject two) {
			if (one.compareTo(two) < 0) {
				return one;
			} else {
				return two;
			}
	}
}