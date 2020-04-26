package Notes_Controlling_Execution;
import static net.mindview.util.Print.*;
public class Vampire {
	static int come(int x, int y) {
		return (10 * x + y);
	}
	static void testVamp(int i, int m, int n) {
		if ((m * n) == i) {
			print(i + " = " + m + " * " + n);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1000; i <= 9999; i++) {
			int a = i % 10, b = (i / 10) % 10, c = (i / 100) % 10, d = (i / 1000) % 10;
			testVamp(i, come(a, b), come(c, d));
			testVamp(i, come(a, b), come(d, c));
			testVamp(i, come(a, c), come(b, d));
			testVamp(i, come(a, c), come(d, b));
			testVamp(i, come(a, d), come(b, c));
			testVamp(i, come(a, d), come(c, b));
			testVamp(i, come(b, a), come(c, d));
			testVamp(i, come(b, a), come(d, c));
			testVamp(i, come(b, c), come(d, a));
			testVamp(i, come(b, d), come(c, a));
			testVamp(i, come(c, a), come(d, b));
			testVamp(i, come(c, b), come(d, a));
		}
	}

}
