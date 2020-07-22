class Calculator {

	double addition(double num1, double num2) {
	
		return num1 + num2;
	}
	double substraction(double num1, double num2) {
	
		return num1 - num2;
	}
	double multiplication(double num1, double num2) {
	
		return num1 * num2;
	}
	double division(double num1, double num2) {
	
		return num1 / num2;
	}
	double modulus(double num1, double num2) {
	
		return num1 % num2;
	}

	public static void main(String []args) {
	
		double num1 = 10.3;
		double num2 = 49.9;

		Calculator cal = new Calculator();

		System.out.println("Addition = "+ cal.addition(num1, num2));
		System.out.println("Substraction = "+ cal.substraction(num1, num2));
		System.out.println("Multiplication = "+ cal.multiplication(num1, num2));
		System.out.println("Division = "+ cal.division(num1, num2));
		System.out.println("Modulus = "+ cal.modulus(num1, num2));
	}
}
