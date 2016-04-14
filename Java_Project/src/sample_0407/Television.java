package sample_0407;

public class Television {
	private int channel;
	private int volume;
	private boolean onOff;

	Television(int c, int v, boolean o) {
		this.channel = c;
		this.volume = v;
		this.onOff = o;
	}
	void pr() {
		System.out.println(channel+" "+volume+" "+onOff);		
	}
	int changechannel(int ch){
		channel = ch;
		return channel;
	}
	public Television() {
		this(10,20,false);
		/*this.channel = 10;
		this.volume = 10;
		this.onOff = true;*/
	}
}
