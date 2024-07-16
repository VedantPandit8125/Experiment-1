package experiments;
import java.util.*;

public class addition_of_complex_numbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("The first complex number is:" + a + "+i" +x);
        System.out.println("The Second complex number is:" + b + "+i" +y);
        int real=a+b;
        int img=x+y;
        System.out.println("The addition of 2 complex numbers are:" + real + "+i" +img);
    }
}
