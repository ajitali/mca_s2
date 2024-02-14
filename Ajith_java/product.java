import java.util.Scanner;
class prod {
    int p_code;
    String p_name;
    double price;
    void read_data()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Product code:");
        this.p_code=sc.nextInt();
        System.out.println("Enter the Product name:");
        this.p_name=sc.next();
        System.out.println("Enter the Price of the product:");
        this.price=sc.nextDouble();
    }
 void display()
    {
        System.out.println("The Product Code is : "+this.p_code);
        System.out.println("The Product Name is : "+this.p_name);
        System.out.println("The Price of the Product is : Rs."+this.price+"/--");
    }
void lowestprice(prod p1,prod p2,prod p3)
    {   if (p1.price<p2.price && p1.price<p3.price)    
        {   
            this.p_code=p1.p_code;
            this.p_name=p1.p_name;
            this.price=p1.price; 
        }  
        else if (p2.price < p3.price)   
        {     
            this.p_code=p2.p_code;
            this.p_name=p2.p_name;
            this.price=p2.price;   
        }    
        else    
        {      
            this.p_code=p3.p_code;
            this.p_name=p3.p_name;
            this.price=p3.price; ;    
        }    
    }
}


 class product{
    public static void main(String[] args) {
        prod p1 = new prod();
        prod p2 = new prod();
        prod p3 = new prod();

        
        System.out.println("Enter data for first object : ");
        p1.read_data();
        System.out.println("Enter data for second object : ");
        p2.read_data();
        System.out.println("Enter data for third object : ");
        p3.read_data();
        System.out.println("Details of object with lowest price is : \n");
        prod low_price = new prod();
        low_price.lowestprice(p1,p2,p3);
        low_price.display();
    
    }
}

