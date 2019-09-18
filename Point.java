package ipi;
import java.lang.Math;

/**
 * Point is a point in space that contains a X and Y coordinate. 
 * @author williamgusmanov
 * 
 */
public class Point {

double XCoordinate;
double YCoordinate;

public Point(double xCoordinate, double yCoordinate) {
	super();
	XCoordinate = xCoordinate;
	YCoordinate = yCoordinate;
}
public double getXCoordinate() {
	return XCoordinate;
}
public void setXCoordinate(int xCoordinate) {
	XCoordinate = xCoordinate;
}
public double getYCoordinate() {
	return YCoordinate;
}
public void setYCoordinate(int yCoordinate) {
	YCoordinate = yCoordinate;
}
/**
 //distance between Current Point and point 
 * @param point, 2nd point to compare to
 * @return distance via distance formula: square root of (x2 - x1)^2 + (y2-y1)^2) 
 */
public double distance(Point point) {
	double differenceX = this.getXCoordinate() - point.getXCoordinate();
	double differenceY = this.getYCoordinate() - point.getYCoordinate();
	return Math.sqrt(Math.pow(differenceX, 2) + Math.pow(differenceY, 2));
	
}
@Override
public String toString() {
	String string = "x_coordinate: " + this.getXCoordinate() + "\ny_coordinate: " + this.getYCoordinate(); 
	return string;
}
}
