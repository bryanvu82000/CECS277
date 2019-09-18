package ipi;

public interface GeometricObjectInterface {
	/*
	Geometric objects have a number of features in common about them, but also a
	number of things about them that are distinct. For instance, each object has a
	location, but a square might be located by the coordinates of its upper left hand
	corner, while a circle’s location is its center. All geometric objects have a an area
	and a perimeter, but a circle and a square will have different way to calculate such
	values. You need to develop and test a set of classes that implement the following
	business rules. Your test program will need to demonstrate all of these methods
	(including the constructors) work properly in practice.
	*/
	
	//location
	//square is about upper left corner
	//circle is the center
	
	
	//METHODS
	//Area()
	public void Area();
	
	//Perimeter()
	public void Perimeter();
	
	//toString()
	public String toString(); 
	
	
}
