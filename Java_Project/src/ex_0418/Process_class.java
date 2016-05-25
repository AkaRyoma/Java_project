package ex_0418;

import java.util.Scanner;

public class Process_class {
	
	Print_class Ptc= new Print_class();
	Scanner input = new Scanner(System.in);
	
	void f1(){
		int x,y,result=0;
		String op;
		System.out.print("input x : ");
		x=input.nextInt();
		System.out.print("input y : ");
		y=input.nextInt();
		System.out.print("input op : ");
		op=input.next();
		if(op.equals("+"))
			result = x+y;
		else if(op.equals("-"))
			result = x-y;
		else if(op.equals("*"))
			result = x*y;
		else if(op.equals("/"))
			result = x/y;
		else if(op.equals("%"))
			result = x%y;
		Ptc.f3(x, y, result, op);
	}
	void f2(){
		String s1,s2;
		System.out.print("String s1 : ");
		s1=input.next();
		System.out.print("String s2 : ");
		s2=input.next();
		Ptc.f3(s1,s2);
	}
	
	
}
