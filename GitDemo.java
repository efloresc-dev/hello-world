/*****
*Student: Erik Flores Cayetano
*****/
public class GitDemo {
	private double previousNumber;
	private double reverseNum;
	
	public GitDemo() {
		previousNumber = 1;
	}
	
	/*****
	 * This function should add 'num' to 'previousNumber' and return the sum.
	 *****/
	public double addNumber(double num) {
		double sum = 0;
		System.out.print("Add num to previousNumber");
		sum = num + previousNumber;
		return sum;
	}
	
	/*****
	 * This function should set 'everseNumber' equal to newNumber.
	 *****/
	public double reverseNumber(double newNumber) {
		reverseNum = newNumber;
		return 0;
	}
	

	
}
