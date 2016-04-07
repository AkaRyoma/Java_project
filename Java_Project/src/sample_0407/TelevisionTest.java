package sample_0407;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television mytv= new Television();
		mytv.channel = 18;
		mytv.volume = 12;
		mytv.onOff = true;
		
		Television testtv = new Television();
		testtv= mytv;
		testtv.channel = 536;
		
		mytv.pr();
		
		Television yourtv= new Television();
		yourtv.channel = 18;
		yourtv.volume = 12;
		yourtv.onOff = true;
		
		System.out.println("cuurent channel :"+yourtv.changechannel(24));
		
		yourtv.pr();
	
	
	}

}
