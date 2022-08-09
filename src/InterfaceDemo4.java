
public class InterfaceDemo4 {
	public static void main(String[] args) {
		Product ballpen = new Product("Ballpen",200,"모나미");
		//Product another = ballpen; //주소복사
		
		Product another = (Product)(ballpen.copy()); //값복사
		System.out.println("Before Change");
		System.out.println(ballpen);
		System.out.println(another);
		System.out.println("After Change");
		ballpen.setPrice(50000);
		System.out.println(ballpen);
		System.out.println(another);
	}

}
