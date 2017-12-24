package guvi2;
import java.util.*;
public class EvenOod {

	public static void main(String[] args) {
		Scanner g=new Scanner(System.in);
		  System.out.println("enter the number");
		  int a=g.nextInt();
		  
		  if(1<=a && a<=100000)
		  {
			  if(a%2==0) {
				  System.out.println("the given num is even");
			  }
			  else
			  {
				  System.out.println("the given is odd");
			  }
		  }
		  else
		  {
			  System.out.println("Invalid inout");
		  }

	}

}
