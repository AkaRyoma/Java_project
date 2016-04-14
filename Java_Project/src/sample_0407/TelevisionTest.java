package sample_0407;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television mytv= new Television(7,10,true);
		/*mytv.channel = 18;
		mytv.volume = 12;
		mytv.onOff = true;*/
		
		Television testtv = new Television();
		//testtv= mytv;
		//testtv.channel = 536;
		
		
		mytv.pr();
		testtv.pr();
		
		Television yourtv= new Television(11,20,true);
		/*yourtv.channel = 18;
		yourtv.volume = 12;
		yourtv.onOff = true;*/
		
		System.out.println("cuurent channel :"+yourtv.changechannel(24));
		
		yourtv.pr();
	
	
	}

}
