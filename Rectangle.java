package ipi;

/**
rectangles are defined by 1 point, all other parts can be determined by width and height
Width (must be > 0) /
Length (must be > 0) //take absolute value 
**/
public class Rectangle extends GeometricObject{
private double Width;
private double Length; //height 

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
public double Area(){
	return this.getWidth() * this.getLength();
}
public double Perimeter(){
	return 2*this.getWidth() + 2*this.getLength(); 
}
public String toString(){
	return "Width: " + this.getWidth() + "\nLength: " + this.getLength()
	+ "\nUpperLeft point: (" + this.location.toString();
}
}
