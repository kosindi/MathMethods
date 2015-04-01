import java.util.Scanner;
import java.text.DecimalFormat;

public class MathMethods2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number and it will be converted to the power of 10.");
		DecimalFormat A = new DecimalFormat("0.00");//to round the decimal to 2 decimal places
		double x = keyboard.nextDouble();
		output(A.format(powerOfTen((x))));
		System.out.println("Enter two numbers and they will be added.");
		double y, z;
		z = keyboard.nextDouble();
		y = keyboard.nextDouble();
		output(A.format(zplusy(z, y)));
		System.out.println("Enter 3 numbers and this formula will be applied: squrt(x) + absolute(y) + z to the power of y");
		double q, u, w;
		q = keyboard.nextDouble();
		u = keyboard.nextDouble();
		w = keyboard.nextDouble();
		output(A.format(mathProblem(q, u, w)));
		keyboard.close();

	}
	public static void output (String string) {
		System.out.println(string);
	}
	public static void output1 (double x) {
		System.out.println(x);
	}
	
	public static double powerOfTen(double x) {
	
		return x*x*x*x*x*x*x*x*x*x;
		
	}

	
	public static double zplusy(double z, double y) {
	
		return z + y;
		
	}
	
	public static double mathProblem(double q, double u, double w) {
		
		return sqrt(q) + abs(u) + pow(w, u);
	}
	
	public static double sqrt(double number) {
		double t;
	 
		double squareRoot = number / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}
	
	public static double abs (double x) {
		return sqrt(x*x);
	}
	
	public static double pow (double z, double y) {
		double result =z;
		while (y!=1) {
			result = result*z;
			y--;
		}
		return result;
	}
	


}

