
public abstract class Mammal {
	private String name;
	private int age;

	public Mammal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public abstract void saySomething(); // abstract(나는 이 메소드를 추상메소드로하겠다)
	// 추상메소드를 한개라도 가지고있는 클래스는 추상클래스가 된다.(클래스에도 abstract 키워드를 붙혀주어야한다.)
	// 메소드를 정의하지않겠다. 메소드의 바디는 나의 자식이 구현해줄것이다(강제적 재정의해줄것이다). 나는 선언만 할것이다.
	// 추상클래스는 실제로 존재하지않아서 new 연산자를 사용해서 만들수없다.

	@Override
	public String toString() {
		return String.format("Mammal [name=%s, age=%s]", name, age);
	}

}
