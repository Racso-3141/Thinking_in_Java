package Notes;
import static net.mindview.util.Print.*;
class F {
	float f;
}
public class Aliasing {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F f1 = new F();
		F f2 = new F();
		f1.f = 1.0f;
		f2.f = 2.0f;
		print("1: f1 is: " + f1.f +
				"f2 is: " + f2.f);
		f1.f = f2.f;
		print("2: f1 is: " + f1.f +
				"f2 is: " + f2.f);
		f1.f = 3.0f;
		print("3: f1 is: " + f1.f +
				"f2 is: " + f2.f);
		f1 = f2;
		print("4: f1 is: " + f1.f +
				"f2 is: " + f2.f);
		f2.f = 4.0f;
		print("5: f1 is: " + f1.f +
				"f2 is: " + f2.f);
	}

}
