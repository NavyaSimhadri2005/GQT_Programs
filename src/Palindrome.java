import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
         String s2="";
         String s1=s.toLowerCase();
         for(int i=s1.length()-1;i>=0;i--)
         {
        	   s2=s2+s1.charAt(i);
         }
         System.out.println("Reversed String: "+s2);
         if(s1.equals(s2))
         {
        	 System.out.println("Palindrome");
         }
         else
         {
        	 System.out.println("Not Palindrome");
         }
         sc.close();
         
	}

}
