package sample_0512;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape r1 = new Rectangle();
		Shape c1 = new Circle();
		
		r1.move(111, 111);
		c1.move(999, 999);
		infor(r1);
		infor(c1);
		
		r1.info();
		
	}
	

	static void infor(Shape s){
		s.info(); s.iii();
	}

}
