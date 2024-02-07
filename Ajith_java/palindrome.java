import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int n = str.length();
        boolean flag = true;
        for (int i=0;i<n/2;i++) {
            if (str.charAt(i) != str.charAt(n-1-i)) {
                flag = false;
                break;
            }
        }
        if (flag == true)  
            System.out.println("The given string ("+str+") is a palindrome"); 
        else
            System.out.println("The given string ("+str+") is not a palindrome");  
    }

}
