package ipi;
import java.lang.Math;

public class Triangle extends GeometricObject{

Point location2;
Point location3;

private double lengthAB;
private double lengthBC;
private double lengthCA;

public Triangle(double XA, double YA, double XB, double YB, double XC, double YC) {
	this.location = new Point (XA,YA);
	this.location2 = new Point (XB,YB);
	this.location3 = new Point (XC, YC);
	
	lengthAB = this.location.distance(location2);
	lengthBC = this.location2.distance(location3);
	lengthCA = this.location3.distance(location);
//this.location = new Point (xCoordinate, yCoordinate);
}

public double getLengthAB() {
	return lengthAB;
}
public void setLengthAB(double lengthAB) {
	this.lengthAB = lengthAB;
}
public double getLengthBC() {
	return lengthBC;
}
public void setLengthBC(double lengthBC) {
	this.lengthBC = lengthBC;
}
public double getLengthCA() {
	return lengthCA;
}
public void setLengthCA(double lengthCA) {
	this.lengthCA = lengthCA;
}
public double Area(){
	double s = (this.getLengthAB() + this.getLengthBC() + this.getLengthCA())/2;
	return Math.sqrt(s*(s - this.getLengthAB())*(s-this.getLengthBC())*(s-this.getLengthCA()));
	
} 
public double Perimeter(){
	return this.getLengthAB() + this.getLengthBC() + this.getLengthCA();

}
public String toString(){
	return "Area: " + this.Area() + "\nPerimeter: " + this.Perimeter() + "\nat (" + this.location.toString() + "," + this.location2.toString() + ","+this.location3.toString()+")"; 
}
}
