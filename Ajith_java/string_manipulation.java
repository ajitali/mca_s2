//2. Write a program to perform string manipulation
import java.util.*;
class strings{
    Scanner sc=new Scanner(System.in);
    String s;
    strings()
    {
        System.out.print("Enter a string: ");
        s=sc.nextLine();
    }
    void string_functions()
    {
        System.out.println("Lower case: "+s.toLowerCase());
        System.out.println("Upper case: "+s.toUpperCase());
        System.out.println("Length: "+s.length());
        System.out.println("substring(2): "+s.substring(2));
        System.out.println("substring(2,6): "+s.substring(2,6));
        System.out.println("trim: "+s.trim());
        System.out.println("indexof('y'): "+s.indexOf('y'));
        System.out.println("indexof('y',10): "+s.indexOf('y',10));
        System.out.println("concatenate ('Abhi'): "+s.concat("Abhi"));
    }

}
class string_manipulation{
    public static void main(String[] args) {
        strings m=new strings();
        m.string_functions();

    }
}
