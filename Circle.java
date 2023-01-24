/**
* The Circle class is a simple object used to
* represent a circle by radius and area.
*
* @author Andrew Ross-Sermons
* @version 0.1
* CS131; Lab 0.1
* Spring 2023
*/

public class Circle {
	double radius; //Used to calculate the area of the Circle.
	
	/**
	 * Default constructor to initialize the instance variable radius.
	 */
	public Circle() {
		radius = 0;
	}//end constructor
	
	/**
	 * Preferred constructor to initialize the instance variable radius.
	 * 
	 * @param circleRadius
	 */
	public Circle(double circleRadius) {
		radius = circleRadius;
	}//end constructor
	
	/**
	 * Calculates the area of the circle.
	 *
	 * @return the calculated circle area.
	 */
	public double area() {
		return(Math.PI * Math.pow(radius, 2.0));
	}//end area
	
	/**
	 * @return the current value of radius.
	 */
	public double getRadius() {
		return(radius);
	}//end getRadius
	
	/**
	 * @paramcircleRadius the value of radius to be set.
	 */
	public void setRadius(double circleRadius) {
		radius = circleRadius;
	}//end setRadius
}//end Circle.java
