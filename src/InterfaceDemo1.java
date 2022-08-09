import java.security.DomainCombiner;

public class InterfaceDemo1 extends Object implements Father, Mother {
		

	@Override
	public void grandFather() {
		System.out.println("Called by grandFather");
	}
	@Override
	public void grandMother() {
		System.out.println("Called by grandMother");
	}
	@Override
	public void Father() {
		System.out.println("Called by Father");
	}
	@Override
	public void mother() {
		System.out.println("Called by Mother");
	}
		
		public static void main(String[] args) {
//			GrandFather gFather = new InterfaceDemo1();
//			gFather.grandFather();
//			Father father = new InterfaceDemo1();
//			father.grandFather();
//			father.grandMother();
//			father.Father();
			Mother [] array = new Mother[3];
			array[0] = new InterfaceDemo1();
			array[0].mother();
			
			System.out.println("Father's MAX = " +Father.MAX);
			System.out.println("Mother's MAX = " +Mother.MAX);
			
		}
	}

