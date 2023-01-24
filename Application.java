/**
* Class Description
*
* @author Andrew Ross-Sermons
* @version 0.1
* CS131; Lab 0.1
* Spring 2023
*/

public class Application {

	/**
	 * Main method for Application of Lab 0.1.
	 * This method instantiates a square and circle object with simple parameters.
	 * It then prints the area of both objects using the area() method of those objects.
	 *
	 * @param args not used.
	 */
	public static void main(String[] args) {
		Square coolSquare = new Square(2); //Declare and instantiate Square object with parameter 2.
		Circle lameCircle = new Circle(1); //Declare and instantiate Circle object with parameter 1.
		System.out.printf("\nSquare Area: %.2f\nCircle Area: %.2f", coolSquare.area(), lameCircle.area());
		
		ArrayFun squareArray = new ArrayFun();
		squareArray.forward();
		squareArray.backward();
	}//end main

}//end Application.java
