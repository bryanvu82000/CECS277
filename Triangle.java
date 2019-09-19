package ipi;
import java.lang.Math;

public class Triangle extends GeometricObject{
Point location2;
Point location3;

private double lengthAB = this.location.distance(location2);
private double lengthBC = this.location2.distance(location3);
private double lengthCA = this.location3.distance(location);

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
