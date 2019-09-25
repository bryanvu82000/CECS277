package ipi;
import java.lang.Math;
/**
 * Circles are defined by a center point and a radius
 * @author williamgusmanov, Bryan Vu
 *
 */
public class Circle extends GeometricObject{
	double radius;
	/**
	 * Constructor
	 * @param x, x coordinate for center
	 * @param y, y coordinate for center
	 * @param Radius, radius of circle
	 */
	Circle(double x, double y, double Radius){
		//this.location.XCoordinate = x; 
		//this.location.YCoordinate = y;
		if (Radius > 0){
		this.radius = Radius;
		} 
		this.location = new Point (x,y);
	}
	/**
	 * returns radius
	 * @return
	 */
	public double getRadius() {
		return radius;
	}
	/**
	 * set a value to Radius
	 * @param radius
	 */
	public void setRadius(double radius) {
		if (radius > 0) {
		this.radius = radius;
		}
	}
	/**
	 * Calculate Area of Circle using formula: PI * Radius ^ squared
	 */
	public double Area() {
		return Math.PI*this.getRadius()*this.getRadius();
	}
	/**
	 *  Return the perimeter of a circle using formula: 2 * pi * radius
	 */
	public double Perimeter() {
		return 2 * Math.PI * this.getRadius(); 
	}
	/**
	 * To string method that displays the center, the radius, area and perimeter 
	 */
	public String toString() {
		return "center at: " + this.location.toString() + "Radius: " + this.getRadius() +
				"\nArea: " + this.Area() + "\nPerimeter: " + this.Perimeter();
	}

}
