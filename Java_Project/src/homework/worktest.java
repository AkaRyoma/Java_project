package homework;

public class worktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		work obj = new work();
		int x= 10;
		obj.inc(x);
		System.out.println("x= " +x);
		
		work obj2 = new work();
		System.out.println("obj2.value2 = " + obj2.value2);
		obj2.inc2(obj2);
		System.out.println("obj2.value2 = "+ obj2.value2);
		
		int[] list = {1,2,3,4,5};
		work obj3= new work();
		
		obj3.inc3(list);
		
		for(int i=0; i< list.length;i++)
			System.out.print(list[i]+ " ");
	}
	

}
