package ex_0418;

import java.util.Scanner;

public class User_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Process_class Prc = new Process_class();
		int number;
		do
		{
		System.out.println("Menu");
		System.out.println("1. Arithmetic op");
		System.out.println("2. Append Strings");
		System.out.println("3. Quit");
		System.out.println("Select number");
		
		number=input.nextInt();
		if(number==1)
			Prc.f1();
		else if(number==2)
			Prc.f2();
		}while(number != 3);
		
	}

}
