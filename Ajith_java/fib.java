class fib
{
public static void main(String args[]) 
{
 int  n1=0,n2=1,c;
 System.out.println(n1+"");
 System.out.println(n2+"");
 for(int i=2;i<10;i++)
 {
    c=n1+n2;
    System.out.println(c+"");
    n1=n2;
    n2=c;
 }
}

}