package calculator;

public class Calculator {
	float num1, num2, result;
	//methods...
	void add() {
		result = num1 + num2;
		print();
	}

	void sub() {
		if (num1 > num2)
			result = num1 - num2;
		print();
	}

	void mul() {
		result = num1 * num2;
		print();
	}

	void div() {
		if (num1 > num2 && num2 != 0)
			result = num1 / num2;
		print();
	}

	void print() {
		System.out.println("Result is " + result);
	}
}
