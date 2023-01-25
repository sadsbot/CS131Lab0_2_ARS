/**
* Class Description
*
* @author Andrew Ross-Sermons
* @version 0.1
* CS131; Lab 0.2
* Spring 2023
*/

public class ArrayFun {
	Square[] myArray;
	
	/**
	 * Default constructor to fill myArray with 6 square objects.
	 */
	public ArrayFun() {
		myArray = new Square[6];
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = new Square(i);
		}//end for
	}//end ArrayFun (Default Constructor)
	
	/**
	 * Preferred constructor to fill myArray with specified number of square objects.
	 * 
	 * @param length the length of the array.
	 */
	public ArrayFun(int length) {
		myArray = new Square[length];
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = new Square(i);
		}//end for
	}//end ArrayFun (Preferred Constructor);
	
	/**
	 * Prints the area of every Square in myArray[] from front to back.
	 */
	public void forward() {
		for(int index = 0; index < myArray.length; index++) {
			System.out.printf("\nSquare area at myArray[%d]: %.2f", index, myArray[index].area());
		}
	}//end forward
	
	/**
	 * Prints the area of ever Square in myArray[] from back to front.
	 */
	public void backward() {
		for(int index = myArray.length-1; index > -1; index--) {
			System.out.printf("\nSquare area at myArray[%d]: %.2f", index, myArray[index].area());
		}
	}//end backward
	
	/**
	 * Prints the sum of all Square areas in myArray.
	 */
	public void sum() {
		double areaSum = 0;
		for(Square s : myArray) {
			areaSum += s.area();
		}
		System.out.printf("\nSum of all Square areas: %.2f", areaSum);
	}//end sum
	
	/**
	 * Sets the square at the given index of myArray to the square s.
	 *
	 * @param index
	 * @param s
	 */
	public void setArrayItem(int index, Square s) {
		myArray[index] = s;
	}//end setArrayItem
	
	/**
	 * @param index to be accessed.
	 * @return Square at index of myArray.
	 */
	public Square getArrayItem(int index) {
		return(myArray[index]);
	}//end getArrayIndex
}//end ArrayFun.java
