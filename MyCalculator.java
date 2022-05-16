package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc= new Calculator();
		System.out.println("Sum of three numbers is "+ calc.add(10, 20, 30));
		System.out.println("Subraction of two numbers is "+ calc.subtract(10, 5));
		System.out.println("Multiplication of two numbers is "+ calc.multiply(2.5, 3.5));
		System.out.println("Division of two numbers is "+ calc.divide(10.1f, 20.2f));

	}

}
