import java.util.*;
interface Vehicle{
	void accept();
	void Gear_change();
	void Speed_up();
	void Breaks();
	void display();
}
class Bicylce implements Vehicle{
	int speed;
	int gear;
	String name;
	Scanner sc=new Scanner(System.in);
	public void accept() {
		System.out.println("Enter name of Bicycle");
		name=sc.nextLine();
	}
	public void display() {
		System.out.println("Name of bicycle:"+name);
	}
	public void Gear_change() {
		System.out.println("Current gear of Bicycle:");
		gear=sc.nextInt();
		gear=gear+1;
		System.out.println("Gear of bicycle change by:"+gear);
	}
	public void Speed_up() {
		System.out.println("Current Speed of Bicycle:");
		speed=sc.nextInt();
		System.out.println("Speed of bicycle change by:"+(speed+5)+"km/hr");
	}
	public void Breaks() {
		speed=0;
		System.out.println("speed and gear is:"+speed);
	}
}
class Bike implements Vehicle{
	int speed;
	int gear;
	String name;
	Scanner sc=new Scanner(System.in);
	public void accept() {
		System.out.println("Enter name of Bike");
		name=sc.nextLine();
	}
	public void display() {
		System.out.println("Name of bike:"+name);
	}
	public void Gear_change() {
		System.out.println("Current gear of Bike:");
		gear=sc.nextInt();
		gear=gear+1;
		System.out.println("Gear of bike change by:"+gear);
	}
	public void Speed_up() {
		System.out.println("Current Speed of Bike:");
		speed=sc.nextInt();
		System.out.println("Speed of bike change by:"+(speed+5)+"km/hr");
	}
	public void Breaks() {
		speed=0;
		System.out.println("speed and gear is:"+speed);
	}
}
class car implements Vehicle{
	int speed;
	int gear;
	String name;
	Scanner sc=new Scanner(System.in);
	public void accept() {
		System.out.println("Enter name of car");
		name=sc.nextLine();
	}
	public void display() {
		System.out.println("Name of car:"+name);
	}
	public void Gear_change() {
		System.out.println("Current gear of Car:");
		gear=sc.nextInt();
		gear=gear+1;
		System.out.println("Gear of car change by:"+gear);
	}
	public void Speed_up() {
		System.out.println("Current Speed of Car:");
		speed=sc.nextInt();
		System.out.println("Speed of Car change by:"+(speed+5)+"km/hr");
	}
	public void Breaks() {
		speed=0;
		System.out.println("speed and gear is"+speed);
	}
}
class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Bicylce b=new Bicylce();
		Bike bi=new Bike();
		car c=new car();
		while(true) {
		System.out.println("1.vehical name\n2.gear change\t3.speed up\n4.Apply brakes");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			b.accept();
			bi.accept();
			c.accept();
			b.display();
			bi.display();
			c.display();
			break;
		case 2:
			b.Gear_change();
			bi.Gear_change();
			c.Gear_change();
			break;
		case 3:
			b.Speed_up();
			bi.Speed_up();
			c.Speed_up();
			break;
		case 4:
			b.Breaks();
			bi.Breaks();
			c.Breaks();
			break;
		default:
			System.out.println("Invalid Input");
		}
		}
	}

}
