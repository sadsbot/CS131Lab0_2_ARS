/**
* Application class with main method used to instantiate and call the area
* method of two objects; a Square and a Circle.
*
* @author Andrew Ross-Sermons
* @version 0.1
* CS131; Lab 0.2
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
		System.out.println("\nDefault constructed ArrayFun object");
		ArrayFun squareArray = new ArrayFun();
		System.out.println("\nforward method:");
		squareArray.forward();
		System.out.println("\n\nbackward method:");
		squareArray.backward();
		
		System.out.println("\n\nPreferred constructed ArrayFun object with length 8:");
		ArrayFun squareArray2 = new ArrayFun(8);
		System.out.println("\nforward method:");
		squareArray2.forward();
		System.out.println("\n\nsetArrayItem method using parameters (3, new Square(16))");
		squareArray2.setArrayItem(3, new Square(16));
		System.out.println("\nforward method:");
		squareArray2.forward();
		System.out.println("\n\nsum method:");
		squareArray2.sum();
		
		
	}//end main

}//end Application.java
