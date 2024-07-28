
import java.util.Scanner;
class publication
{
    int copies;
    String title;
    float prize;
    int sale;
    void accept () {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a title of book");
        title=sc.nextLine();
        System.out.println("Enter a price ");
        prize=sc.nextFloat();
        System.out.println("Enter a number of copies");
        copies=sc.nextInt();
        System.out.println("Enter a number of sale");
        sale=sc.nextInt();
    
    }

    void display() {
	    System.out.println("Enter a title of book"+title);
	
	    System.out.println("Enter a price "+prize);
	 
	    System.out.println("Enter a number of copies"+copies);
	    
	    System.out.println("Enter a number of sale"+sale);
	
	    System.out.println("Enter a number of totle sale="+(copies-sale));
    }
    
}

class Book extends publication {
	private  String author; 
	int total;
	int sale;
	void ordercopies (){
		 Scanner sr =new Scanner(System.in);
		 System.out.println("Enter a name of author");
		 author=sr.nextLine();
		 	
	}
	
	void print() {
		 System.out.println("Enter a total sale "+total);
	}
	
}

class Magzine extends Book{
	int quantity;
	void orderquantity() {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter a number of quantity");
		 quantity=sc.nextInt();
		 
	}
	
	void currentissue(){
		System.out.println(" number of currenissued book"+super.title);
			
	}
	
	void recieveissue(){
		System.out.println("recieveissued book"+super.title);
		System.out.println(" number of copies ordered are"+this.quantity);
		
	}

}
    
public class Assignment2 {

	public static void main(String[] args) {
		
		publication p= new  publication();
		System.out.println("Enter a  deatail of publication");
		p.accept();
		System.out.println("Display a  deatail of publication");
		p.display();
		
		Book b=new Book();
		System.out.println("Enter a  deatail of book");
		b.accept();
		b.ordercopies();
		System.out.println("Dispaly a  deatail of book");
		b.display();
		
		Magzine m=new Magzine();
		System.out.println("Enter a  deatail of Magzine");
		m.accept();
		m.ordercopies();
		m.orderquantity();
		System.out.println("Display a  deatail of book");
		m.display();
		
		System.out.println("Display the current issue");
		m.currentissue();
		
		System.out.println("Display the recieved issue");
		m.recieveissue();
		
		
		System.out.println("Display the total sale=");
		
	}

}
