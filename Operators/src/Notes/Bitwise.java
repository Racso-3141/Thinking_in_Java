package Notes;
import static net.mindview.util.Print.*;
public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1 + 4 + 16 + 64;
		int b = 2 + 8 + 32 + 128;
		print("$: " + Integer.toBinaryString(a & b));
		print("|: " + Integer.toBinaryString(a | b));
		print("^: " + Integer.toBinaryString(a ^ b));
		print("~: " + Integer.toBinaryString(~a) + Integer.toBinaryString(~b));
	}

}
