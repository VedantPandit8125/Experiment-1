//Problem Statement
/*Design a base class shape with two double type values and member functions to input
the data and compute_area() for calculating area of figure. Derive two classes’ triangle and rectangle. Make
compute_area() as abstract function and redefine this function in the derived class to suit their requirements.
Write a program that accepts dimensions of triangle/rectangle and display calculated area. Implement
dynamic binding for given case study.*/
import java.util.Scanner;
abstract class shape {
	double base;
	double height;
	public
	abstract void accept();
	abstract void compute_area();
}
class triangle extends shape
{
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base of triangle");
		base=sc.nextDouble();
		System.out.println("Enter height of triangle");
		height=sc.nextDouble();
	}
	public void compute_area()
	{
		System.out.println("Area of triangle is:"+(0.5*base*height));
	}
}
class rectangle extends shape
{
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		base=sc.nextDouble();
		System.out.println("Enter breadth of rectangle");
		height=sc.nextDouble();
	}
	public void compute_area() {
		System.out.println("Area of rectangle is:"+(base*height));
	}
}
public class practical_4{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Calculate area of triangle");
		System.out.println("2.Calculate area of rectangle");
		System.out.println("Enter your Choice");
		int choice =sc.nextInt();
		switch(choice) {
		case 1:shape t=new triangle();//dynamic binding
		t.accept();
		t.compute_area();
		break;
		case 2:shape r=new rectangle();//dynamic binding
		r.accept();
		r.compute_area();
		break;
		}
	}
}

