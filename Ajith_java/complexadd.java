import java.util.Scanner;
class complex{
    int a,b;
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part of complex number: ");
        a=sc.nextInt();
        System.out.println("Enter the imaginary part of complex number: ");
        b=sc.nextInt();
    }
    void display()
    {
        System.out.print(""+a+" + "+b+"i");
    }
    void add(complex x,complex y)
    {
        a=x.a+y.a;
        b=x.b+y.b;

    }
}
public class complexadd {
    public static void main (String[] args) 
	{    
        complex c1 =new complex(),c2=new complex(),c3=new complex();
        System.out.println("\n First Complex Number ");
        c1.read();
        System.out.println("\n Second Complex Number ");
        c2.read();
        System.out.println("\nFirst Complex Number is :");
        c1.display();
        
        System.out.println("\nSecond Complex Number is :");
        c2.display();
        
        System.out.println("\nSum of both numbers is :");
        c3.add(c1,c2);
        c3.display();
    }
}
