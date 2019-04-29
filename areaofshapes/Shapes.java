package areaofshapes;

public class Shapes {
	float rad;
	float len, bre;
	float side;
	float result;

	void c_area(float rad) {
		result = 3.14f * rad * rad;
		print();
	}

	void r_area(float length, float breadth) {
		result = length * breadth;
		print();
	}
	
	void s_area(float side) {
		result = side * side;
		print();
	}
	
	void print() {
		System.out.println("Result is " + result);
	}

}
