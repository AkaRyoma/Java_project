package homework;

public class work {

	int value;
	void inc(int a){
		a= a+1;
	}
	
	int value2 = 0;
	void inc2(work ctr){
		ctr.value2=ctr.value2 +1;
	}
	
	void inc3(int[] array){
		for(int i=0; i<array.length;i++)
			array[i]=array[i] +1;
	}
}
