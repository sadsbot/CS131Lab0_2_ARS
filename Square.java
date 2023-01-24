/**
* The Square class is a simple object used to
* represent a square by side length and area.
*
* @author Andrew Ross-Sermons
* @version 0.1
* CS131; Lab 0.1
* Spring 2023
*/


public class Square {
	double side; //Used to calculate square area.
	
	/**
	 * Default constructor to initialize instance variable side.
	 */
	public Square() {
		side = 0;
	}//end constructor
	
	/**
	 * Preferred constructor to initialize instance variable side.
	 * 
	 * @param squareSide
	 */
	public Square(double squareSide) {
		side = squareSide;
	}//end constructor
	
	/**
	 * Calculates the area of the square.
	 *
	 * @return calculated square area.
	 */
	public double area() {
		return(side*side);
	}//end area
	
	/**
	 * @return the current value of side.
	 */
	public double getSide() {
		return(side);
	}//end getSide
	
	/**
	 * @param squareSide the value of side to be set.
	 */
	public void setSide(double squareSide) {
		side = squareSide;
	}//end setSide
}//end Square.java
