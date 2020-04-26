package Notes;
import static net.mindview.util.Print.*;
public class StringComparison {
	static void compare(String a, String b) {
		print("a: " + a + " b: " + b);
		print("a == b: " + (a == b));
		print("a != b: " + (a != b));
		print("a.equals(b): " + a.equals(b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compare("first", "second");
		compare("third", "forth");
		compare("fifth", "FIFTH");
	}

}
