package Notes;
import static net.mindview.util.Print.*;
public class Precedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1, y = 2, z = 3;
		int a = x + y - 2/2 + z;          // (1)
		int b = x + (y - 2) / (2 + z);    // (2)
		print("a = " + a + " b = " + b);
	}

}
