package oops.methodOverloading;

public class Calculator {
	int square(int num) {
		return num*num;
	}
	double square(double num) {
		return num*num;
	}
	int sum(int num1,int num2) {
		return num1+num2;
	}
	int sum(int num1,int num2, int num3) {
		return num1+num2+num3;
	}
}
