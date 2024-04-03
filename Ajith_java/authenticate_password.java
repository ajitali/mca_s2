import java.util.Scanner;

class usernameException extends RuntimeException {
   usernameException(String s)
   {
    super(s);
   } 
}

class usernamepassword
{
    String uname;
    String passwd;
    usernamepassword(String u, String p) 
    {
        uname=u;
        passwd=p;
    }

}
public class authenticate_password {
    public static void main(String[] args)
     {
        String un,ps;
        usernamepassword unps[]=new usernamepassword[3];
        unps[0]= new usernamepassword("admin","admin" );
        unps[1]= new usernamepassword("faculty","faculty" );
        unps[2]= new usernamepassword("student","student" );
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        un = sc.next();
        System.out.println("\nEnter Password :");
        ps = sc.next();
        for(int i=0 ;i<3 ;i++)
        {
            if(un.equals(unps[i].uname))
            {
                if(ps.equals(unps[i].passwd))
                {
                    System.out.println("Successful login");
                }
            else 
                throw new usernameException("Invalid username or password ");
            }
            
        }
    }
}