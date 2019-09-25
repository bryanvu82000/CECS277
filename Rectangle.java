package ipi;

/**
rectangles are defined by 1 point, all other parts can be determined by width and height
Width (must be > 0) /
Length (must be > 0) //take absolute value 
**/
public class Rectangle extends GeometricObject{
private double Width;
private double Length; //height 
/**
 * constructor
 * @param Width
 * @param Length
 * @param xCoordinate
 * @param yCoordinate
 */
public Rectangle(double Width, double Length, double xCoordinate, double yCoordinate) {
	this.Width = Width;
	this.Length = Length;
	this.location = new Point (xCoordinate, yCoordinate);
	
}

public void setWidth(double width){
	this.Width = width; 
}
public double getWidth(){
	return this.Width;
}
public void setLength(double length){
	this.Length = length;
}
public double getLength(){
	return this.Length;
}
/**
 * calculate width via formula A = xy 
 */
public double Area(){
	return this.getWidth() * this.getLength();
}
/**
 * Calculate the Perimeter by taking the sum of the length of sides
 */
public double Perimeter(){
	return 2*this.getWidth() + 2*this.getLength(); 
}
/**
 * toString that returns the width, height and the upper left point
 */
public String toString(){
	return "Width: " + this.getWidth() + "\nLength: " + this.getLength()
	+ "\nUpperLeft point:" + this.location.toString();
}
}
