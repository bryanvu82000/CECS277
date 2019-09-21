package ipi;
import java.lang.Math;
/**
 * Strings are defined by a center point and a radius
 * @author williamgusmanov
 *
 */
public class Circle extends GeometricObject{
	double radius;
	
	Circle(double x, double y){
		this.location.XCoordinate = x; 
		this.location.YCoordinate = y;
	}
	Circle(double x, double y, double Radius){
		this.location.XCoordinate = x; 
		this.location.YCoordinate = y;
		if (Radius > 0){
		this.radius = Radius;
		} 
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if (radius > 0) {
		this.radius = radius;
		}
	}
	/**
	 * PI * Radius ^ squared
	 */
	public double Area() {
		return Math.PI*this.getRadius()*this.getRadius();
	}
	/**
	 *  2 * pi * radius
	 */
	public double Perimeter() {
		return 2 * Math.PI * this.getRadius(); 
	}
	public String toString() {
		return this.location.toString() + "Radius: " + this.getRadius() +
				"\nArea: " + this.Area() + "\nPerimeter: " + this.Perimeter();
	}

}
