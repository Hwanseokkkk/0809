
public class AbstractClassDemo2 {
	public static void main(String[] args) {
		String str = Human.getInstance();
		//Human jimin = new Human("010-123-1234", "부산시 해운대구 센텀아파트");
		
		//System.out.println(jimin);
		

	}
}

abstract class Human{
	private String tel;
	private String address;
	private static String str = "Hello, World";
	
	public Human(String tel, String address) {
		this.tel = tel;
		this.address = address;
	}
	
	public static String getInstance() {
		return str;
	}

	@Override
	public String toString() {
		return String.format("Human [tel=%s, address=%s]", tel, address);
	}
	
	
}