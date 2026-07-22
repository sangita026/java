import java.util.Scanner;
public class pro3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name = sc.nextLine();
		System.out.println("Enter your Address:");
		String add = sc.nextLine();
		System.out.println("Enter your state:");
		String sta = sc.nextLine();
		System.out.println("Enter your Age:");
		int age = sc.nextInt();

		System.out.println("Name:"+name);	
		System.out.println("Address:"+add);
		System.out.println("State:"+sta);
		System.out.println("Age:"+age);


		sc.close();	
	
	}

}


