
public class AbstractClassDemo {
	public static void main(String[] args) {
		Mammal m = new Dog("포유류",20); //다형성 부모가 추상클래스로 new를 사용할 수없기때문에 
		m.saySomething();
		
	}
}