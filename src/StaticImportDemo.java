import java.util.Scanner;
import static java.lang.System.out;  //호칭은 static ~~, 입력은 ~~ static
//import static java.lang.Math.random; //System, Math 다 생략하게 할 수 있다.
//import static java.lang.Math.PI;
import static java.lang.Math.*; // Math의 모든 것을 생략하게 할 수있다.

public class StaticImportDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rand = (int)(random()*6+1);
		out.println("rand = " +rand);
		out.println("PI = " + PI);
	}

}
