import java.util.Scanner;

public class DemoOne {
	public int calculate(int orders)
	{int sum = 0; 
    
  while (orders != 0) 
  { 
      sum = sum + orders % 10; 
      orders = orders/10; 
  } 

return sum;
		
	}

	public static void main(String[] args) {
		DemoOne d=new DemoOne();

Scanner s1= new Scanner(System.in);
System.out.print("Enter the number of products" );

int n=s1.nextInt();



System.out.println(d.calculate(n));
	}

}
